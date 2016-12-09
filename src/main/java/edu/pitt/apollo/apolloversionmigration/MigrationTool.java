package edu.pitt.apollo.apolloversionmigration;

import edu.pitt.apollo.apolloversionmigration.output.EpidemicSetter;
import edu.pitt.apollo.apolloversionmigration.output.MigrationException;
import edu.pitt.apollo.db.LibraryDbUtils;
import edu.pitt.apollo.db.exceptions.ApolloDatabaseException;
import edu.pitt.apollo.library_service_types.v3_1_0.AddLibraryItemContainerResult;
import edu.pitt.apollo.library_service_types.v3_1_0.GetLibraryItemContainerResult;
import edu.pitt.apollo.library_service_types.v3_1_0.RevisionAndComments;
import edu.pitt.apollo.library_service_types.v4_0_1.CatalogEntry;
import edu.pitt.apollo.library_service_types.v4_0_1.LibraryItemContainer;
import edu.pitt.apollo.types.v3_1_0.ApolloIndexableItem;
import edu.pitt.apollo.types.v3_1_0.Epidemic;
import edu.pitt.isg.objectserializer.JsonDeserializer;

import java.util.Arrays;
import java.util.List;

/**
 * Created by mas400 on 12/7/16.
 */
public class MigrationTool {
    public static void main(String[] args) {
        getOldLibraryItems();
    }

    private static void getOldLibraryItems() {
        try {
            LibraryDbUtils dbUtils = new LibraryDbUtils();
            List<Integer> urns = dbUtils.getURNs("Epidemic");

            edu.pitt.apollo.database.LibraryDbUtils newDBUtils = new edu.pitt.apollo.database.LibraryDbUtils();

            for (Integer urn : urns) {
                Integer version = dbUtils.getReleaseVersion(urn);
                GetLibraryItemContainerResult getLibraryItemContainerResult = dbUtils.getLibraryItemContainer(urn, version);
                if (getLibraryItemContainerResult != null) {
                    migrateEpidemic(getLibraryItemContainerResult, newDBUtils, true);
                } else {
                    List<RevisionAndComments> revisionAndCommentses = dbUtils.getRevisionsAndComments(urn);
                    int revisionVersion = -1;
                    for (RevisionAndComments revisionAndComments : revisionAndCommentses) {
                        if (revisionAndComments.getRevision() > revisionVersion) {
                            revisionVersion = revisionAndComments.getRevision();
                        }
                    }

                    if (revisionVersion > -1) {
                        getLibraryItemContainerResult = dbUtils.getLibraryItemContainer(urn, revisionVersion);
                        migrateEpidemic(getLibraryItemContainerResult, newDBUtils, false);
                    }

                }
            }
        } catch (ApolloDatabaseException e) {
            e.printStackTrace();
        }
    }

    private static void migrateEpidemic (GetLibraryItemContainerResult getLibraryItemContainerResult, edu.pitt.apollo.database.LibraryDbUtils newDBUtils, Boolean release) {
        ApolloIndexableItem item = getLibraryItemContainerResult.getLibraryItemContainer().getLibraryItem();
        edu.pitt.apollo.types.v3_1_0.Epidemic oldEpidemic = (edu.pitt.apollo.types.v3_1_0.Epidemic) item;

        try {
            EpidemicSetter setter = new EpidemicSetter(edu.pitt.apollo.types.v4_0_1.Epidemic.class, oldEpidemic);
            setter.set();
            edu.pitt.apollo.types.v4_0_1.Epidemic newEpidemic = setter.getNewTypeInstance();
            LibraryItemContainer itemContainer = new LibraryItemContainer();
            itemContainer.setLibraryItem(newEpidemic);

            CatalogEntry newEntry = new CatalogEntry();
            newEntry.setDisplayName(getLibraryItemContainerResult.getLibraryItemContainer().getCatalogEntry().getDisplayName());
            newEntry.setJavaClassName(getLibraryItemContainerResult.getLibraryItemContainer().getCatalogEntry().getJavaClassName());
            newEntry.setTextualIdentifier(getLibraryItemContainerResult.getLibraryItemContainer().getCatalogEntry().getTextualIdentifier());
            itemContainer.setCatalogEntry(newEntry);
            edu.pitt.apollo.library_service_types.v4_0_1.AddLibraryItemContainerResult result= newDBUtils.addLibraryItem(itemContainer, "Frieza", "Imported from 3.1.0 DB");

            if(release)
                newDBUtils.setReleaseVersion(result.getUrn(), result.getVersion(), "Frieza", "Release import from 3.1.0 DB");
        } catch (MigrationException me) {
            me.printStackTrace();
        } catch (ApolloDatabaseException ex) {
            ex.printStackTrace();
        }
    }

//    private static edu.pitt.apollo.types.v4_0_1.Epidemic deserializeEpidemic(String epidemicItem) {
//        try {
//            Epidemic oldEpidemic = new JsonDeserializer(Arrays.asList(ClassList.classList)).getObjectFromMessage(epidemicItem, edu.pitt.apollo.types.v3_1_0.Epidemic.class);
//            EpidemicSetter setter = new EpidemicSetter(edu.pitt.apollo.types.v4_0_1.Epidemic.class, oldEpidemic);
//            setter.set();
//            return setter.getNewTypeInstance();
//        } catch (Exception e) {
//            e.printStackTrace();
//            return null;
//        }
//    }
}
