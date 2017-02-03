package edu.pitt.apollo.apolloversionmigration;

import edu.pitt.apollo.apolloversionmigration.output.CaseSeriesSetter;
import edu.pitt.apollo.apolloversionmigration.output.EpidemicSetter;
import edu.pitt.apollo.apolloversionmigration.output.LibraryCollectionSetter;
import edu.pitt.apollo.apolloversionmigration.output.MigrationException;
import edu.pitt.apollo.db.LibraryDbUtils;
import edu.pitt.apollo.db.exceptions.ApolloDatabaseException;
import edu.pitt.apollo.db.exceptions.ApolloDatabaseExplicitException;
import edu.pitt.apollo.db.exceptions.library.NoLibraryItemException;
import edu.pitt.apollo.exception.UserNotAuthorizedException;
import edu.pitt.apollo.library_service_types.v3_1_0.AddLibraryItemContainerResult;
import edu.pitt.apollo.library_service_types.v3_1_0.GetLibraryItemContainerResult;
import edu.pitt.apollo.library_service_types.v3_1_0.MemberOfCollection;
import edu.pitt.apollo.library_service_types.v3_1_0.RevisionAndComments;
import edu.pitt.apollo.library_service_types.v4_0_1.CatalogEntry;
import edu.pitt.apollo.library_service_types.v4_0_1.LibraryCollection;
import edu.pitt.apollo.library_service_types.v4_0_1.LibraryItemContainer;
import edu.pitt.apollo.types.v3_1_0.ApolloIndexableItem;
import edu.pitt.apollo.types.v3_1_0.Epidemic;
import edu.pitt.apollo.types.v4_0_1.EpidemicPeriodEndDefinitionEnum;
import edu.pitt.isg.objectserializer.JsonDeserializer;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by mas400 on 12/7/16.
 */
public class MigrationTool {
    private static String classType;
    private static int role = 2;

    public static void main(String[] args) {
        getOldLibraryItems();
    }

    private static void getOldLibraryItems() {
        try {
            LibraryDbUtils libDBUtils = new LibraryDbUtils();
            List<Integer> libUrns = libDBUtils.getURNs("LibraryCollection");
            edu.pitt.apollo.database.LibraryDbUtils newLibDBUtils = new edu.pitt.apollo.database.LibraryDbUtils();

            LibraryDbUtils dbUtils = new LibraryDbUtils();
            edu.pitt.apollo.database.LibraryDbUtils newDBUtils = new edu.pitt.apollo.database.LibraryDbUtils();
            //iterates over library collections
            for (Integer libUrn : libUrns) {
                Integer libVersion = libDBUtils.getReleaseVersion(libUrn);
                GetLibraryItemContainerResult getLibraryItemContainerResult = dbUtils.getLibraryItemContainer(libUrn, libVersion);

                List<Integer> newMemberOfCollections = new ArrayList<>();
                if (getLibraryItemContainerResult != null) {
                    List<MemberOfCollection> oldMemberOfCollections = ((edu.pitt.apollo.library_service_types.v3_1_0.LibraryCollection) getLibraryItemContainerResult.getLibraryItemContainer().getLibraryItem()).getMembersOfCollection();

                    //migrates epidemics
                    processMembersOfCollection(oldMemberOfCollections, newMemberOfCollections, dbUtils, newDBUtils);

                    //migrate library collection
                    if (((edu.pitt.apollo.library_service_types.v3_1_0.LibraryCollection) getLibraryItemContainerResult.getLibraryItemContainer().getLibraryItem()).getJavaClassNameOfMembers().contains("Epidemic") || ((edu.pitt.apollo.library_service_types.v3_1_0.LibraryCollection) getLibraryItemContainerResult.getLibraryItemContainer().getLibraryItem()).getJavaClassNameOfMembers().contains("CaseSeries")) {
                        String name = ((edu.pitt.apollo.library_service_types.v3_1_0.LibraryCollection) getLibraryItemContainerResult.getLibraryItemContainer().getLibraryItem()).getName();
                        String description = ((edu.pitt.apollo.library_service_types.v3_1_0.LibraryCollection) getLibraryItemContainerResult.getLibraryItemContainer().getLibraryItem()).getDescription();

                        edu.pitt.apollo.library_service_types.v4_0_1.LibraryCollection newLibraryCollection = new LibraryCollection();
                        for (Integer newLibUrn : newMemberOfCollections) {
                            newLibraryCollection.getMembersOfCollection().add(newLibUrn);
                        }
                        newLibraryCollection.setName(name);
                        newLibraryCollection.setDescription(description);
                        if(classType.equals("Epidemic"))
                            newLibraryCollection.setJavaClassNameOfMembers("edu.pitt.apollo.types.v4_0_1.Epidemic");
                        else
                            newLibraryCollection.setJavaClassNameOfMembers("edu.pitt.apollo.types.v4_0_1.CaseSeries");

                        migrateLibraryCollection(getLibraryItemContainerResult, newLibDBUtils, newLibraryCollection, true);
                    }
                } else {
                    List<RevisionAndComments> revisionAndCommentses = libDBUtils.getRevisionsAndComments(libUrn);
                    int revisionVersion = -1;
                    for (RevisionAndComments revisionAndComments : revisionAndCommentses) {
                        if (revisionAndComments.getRevision() > revisionVersion) {
                            revisionVersion = revisionAndComments.getRevision();
                        }
                    }

                    if (revisionVersion > -1) {
                        getLibraryItemContainerResult = dbUtils.getLibraryItemContainer(libUrn, revisionVersion);
                        List<MemberOfCollection> oldMemberOfCollections = ((edu.pitt.apollo.library_service_types.v3_1_0.LibraryCollection) getLibraryItemContainerResult.getLibraryItemContainer().getLibraryItem()).getMembersOfCollection();
                        processMembersOfCollection(oldMemberOfCollections, newMemberOfCollections, dbUtils, newDBUtils);
                        if (((edu.pitt.apollo.library_service_types.v3_1_0.LibraryCollection) getLibraryItemContainerResult.getLibraryItemContainer().getLibraryItem()).getJavaClassNameOfMembers().contains("Epidemic")) {

                            migrateLibraryCollection(getLibraryItemContainerResult, newDBUtils, new LibraryCollection(), false);
                        }
                    }
                }
            }
        } catch (MigrationException me) {
            me.printStackTrace();
        } catch (ApolloDatabaseException e) {
            e.printStackTrace();
        }
    }

    private static Integer migrateEpidemic(GetLibraryItemContainerResult getLibraryItemContainerResult, edu.pitt.apollo.database.LibraryDbUtils newDBUtils, Boolean release) {
        ApolloIndexableItem item = getLibraryItemContainerResult.getLibraryItemContainer().getLibraryItem();
        edu.pitt.apollo.types.v3_1_0.Epidemic oldEpidemic = (edu.pitt.apollo.types.v3_1_0.Epidemic) item;
        try {
            EpidemicSetter setter = new EpidemicSetter(edu.pitt.apollo.types.v4_0_1.Epidemic.class, oldEpidemic);
            setter.set();
            edu.pitt.apollo.types.v4_0_1.Epidemic newEpidemic = setter.getNewTypeInstance();
            if(newEpidemic.getAdministrativeLocations().get(0).equals("11")) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-yyyy-dd");
                try {
                    Date date = simpleDateFormat.parse("03-2017-17");
                    GregorianCalendar c = new GregorianCalendar();
                    c.setTime(date);
                    XMLGregorianCalendar date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
                    newEpidemic.getEpidemicPeriod().setEndDate(date2);
                    newEpidemic.getEpidemicPeriod().setEndDateDefinition(EpidemicPeriodEndDefinitionEnum.FORTY_TWO_DAYS_AFTER_LAST_CONFIRMED_CASE_TESTED_NEGATIVE_TWICE);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            LibraryItemContainer itemContainer = new LibraryItemContainer();
            itemContainer.setLibraryItem(newEpidemic);

            CatalogEntry newEntry = new CatalogEntry();
            newEntry.setDisplayName(getLibraryItemContainerResult.getLibraryItemContainer().getCatalogEntry().getDisplayName());
            newEntry.setJavaClassName(getLibraryItemContainerResult.getLibraryItemContainer().getCatalogEntry().getJavaClassName());
            newEntry.setTextualIdentifier(getLibraryItemContainerResult.getLibraryItemContainer().getCatalogEntry().getTextualIdentifier());
            itemContainer.setCatalogEntry(newEntry);

            edu.pitt.apollo.library_service_types.v4_0_1.AddLibraryItemContainerResult result = newDBUtils.addLibraryItem(itemContainer, "Frieza", "Imported from 3.1.0 DB", role);
            if (release)
                newDBUtils.setReleaseVersion(result.getUrn(), result.getVersion(), role, "Frieza", "Release import from 3.1.0 DB");
            return result.getUrn();
        } catch (MigrationException me) {
            me.printStackTrace();
            return null;
        } catch (ApolloDatabaseException ex) {
            ex.printStackTrace();
            return null;
        } catch (UserNotAuthorizedException e) {
            e.printStackTrace();
            return null;
        } catch (ApolloDatabaseExplicitException e) {
            e.printStackTrace();
            return null;
        } catch (NoLibraryItemException e) {
            e.printStackTrace();
            return null;
        }
    }


    private static Integer migrateCaseSeries(GetLibraryItemContainerResult getLibraryItemContainerResult, edu.pitt.apollo.database.LibraryDbUtils newDBUtils, Boolean release) {
        ApolloIndexableItem item = getLibraryItemContainerResult.getLibraryItemContainer().getLibraryItem();
        edu.pitt.apollo.types.v3_1_0.CaseSeries oldCaseSeries = (edu.pitt.apollo.types.v3_1_0.CaseSeries) item;
        try {
            CaseSeriesSetter setter = new CaseSeriesSetter(edu.pitt.apollo.types.v4_0_1.CaseSeries.class, oldCaseSeries);
            setter.set();
            edu.pitt.apollo.types.v4_0_1.CaseSeries newCaseSeries = setter.getNewTypeInstance();
            LibraryItemContainer itemContainer = new LibraryItemContainer();
            itemContainer.setLibraryItem(newCaseSeries);

            CatalogEntry newEntry = new CatalogEntry();
            newEntry.setDisplayName(getLibraryItemContainerResult.getLibraryItemContainer().getCatalogEntry().getDisplayName());
            newEntry.setJavaClassName(getLibraryItemContainerResult.getLibraryItemContainer().getCatalogEntry().getJavaClassName());
            newEntry.setTextualIdentifier(getLibraryItemContainerResult.getLibraryItemContainer().getCatalogEntry().getTextualIdentifier());
            itemContainer.setCatalogEntry(newEntry);

            edu.pitt.apollo.library_service_types.v4_0_1.AddLibraryItemContainerResult result = newDBUtils.addLibraryItem(itemContainer, "Frieza", "Imported from 3.1.0 DB", role);
            if (release)
                newDBUtils.setReleaseVersion(result.getUrn(), result.getVersion(),  role, "Frieza", "Release import from 3.1.0 DB");

            return result.getUrn();
        } catch (MigrationException me) {
            me.printStackTrace();
            return null;
        } catch (ApolloDatabaseException ex) {
            ex.printStackTrace();
            return null;
        } catch (UserNotAuthorizedException e) {
            e.printStackTrace();
            return null;
        } catch (ApolloDatabaseExplicitException e) {
            e.printStackTrace();
            return null;

        } catch (NoLibraryItemException e) {
            e.printStackTrace();
            return null;

        }
    }

    private static void migrateLibraryCollection(GetLibraryItemContainerResult getLibraryItemContainerResult, edu.pitt.apollo.database.LibraryDbUtils newDBUtils, edu.pitt.apollo.library_service_types.v4_0_1.LibraryCollection newLibraryCollection, Boolean release) {
        try {
            //create new library collection
            edu.pitt.apollo.library_service_types.v4_0_1.CatalogEntry newCatalogEntry = new CatalogEntry();

            //set new catalog entry from old entry
            newCatalogEntry.setDisplayName(getLibraryItemContainerResult.getLibraryItemContainer().getCatalogEntry().getDisplayName());
            newCatalogEntry.setTextualIdentifier(getLibraryItemContainerResult.getLibraryItemContainer().getCatalogEntry().getTextualIdentifier());
            newCatalogEntry.setJavaClassName("edu.pitt.apollo.library_service_types.v4_0_1.LibraryCollection");

            LibraryItemContainer itemContainer = new LibraryItemContainer();
            itemContainer.setLibraryItem(newLibraryCollection);
            itemContainer.setCatalogEntry(newCatalogEntry);

            edu.pitt.apollo.library_service_types.v4_0_1.AddLibraryItemContainerResult result = newDBUtils.addLibraryItem(itemContainer, "Frieza", "Imported from 3.1.0 DB", role);

            if (release)
                newDBUtils.setReleaseVersion(result.getUrn(), result.getVersion(), role, "Frieza", "Release import from 3.1.0 DB");
        } catch (ApolloDatabaseException | UserNotAuthorizedException | ApolloDatabaseExplicitException | NoLibraryItemException ex) {
            ex.printStackTrace();
        }
    }

    private static void processMembersOfCollection(List<MemberOfCollection> oldMemberOfCollections, List<Integer> newMemberOfCollections, LibraryDbUtils dbUtils, edu.pitt.apollo.database.LibraryDbUtils newDBUtils) throws MigrationException, ApolloDatabaseException {
        for (edu.pitt.apollo.library_service_types.v3_1_0.MemberOfCollection oldMemberOfCollection : oldMemberOfCollections) {
            //migrate epidemic
            Integer oldUrn = oldMemberOfCollection.getUrn();
            Integer newUrn = null;
            Integer version = dbUtils.getReleaseVersion(oldUrn);
            GetLibraryItemContainerResult libraryItemContainerResult = dbUtils.getLibraryItemContainer(oldUrn, version);
            if (libraryItemContainerResult != null) {
                if (libraryItemContainerResult.getLibraryItemContainer().getCatalogEntry().getJavaClassName().contains("Epidemic")) {
                    newUrn = migrateEpidemic(libraryItemContainerResult, newDBUtils, true);
                    classType = "Epidemic";
                }
                if (libraryItemContainerResult.getLibraryItemContainer().getCatalogEntry().getJavaClassName().contains("CaseSeries")) {
                    newUrn = migrateCaseSeries(libraryItemContainerResult, newDBUtils, true);
                    classType = "CaseSeries";
                }
            } else {
                List<RevisionAndComments> revisionAndCommentses = dbUtils.getRevisionsAndComments(oldUrn);
                int revisionVersion = -1;
                for (RevisionAndComments revisionAndComments : revisionAndCommentses) {
                    if (revisionAndComments.getRevision() > revisionVersion) {
                        revisionVersion = revisionAndComments.getRevision();
                    }
                }

                if (revisionVersion > -1) {
                    libraryItemContainerResult = dbUtils.getLibraryItemContainer(oldUrn, revisionVersion);
                    if (libraryItemContainerResult.getLibraryItemContainer().getCatalogEntry().getJavaClassName().contains("Epidemic"))
                        newUrn = migrateEpidemic(libraryItemContainerResult, newDBUtils, false);
                    if (libraryItemContainerResult.getLibraryItemContainer().getCatalogEntry().getJavaClassName().contains("CaseSeries"))
                        newUrn = migrateCaseSeries(libraryItemContainerResult, newDBUtils, false);
                }

            }
            newMemberOfCollections.add(newUrn);
        }
    }
}

