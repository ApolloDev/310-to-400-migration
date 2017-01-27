package edu.pitt.apollo.apolloversionmigration.output;

import edu.pitt.apollo.library_service_types.v3_1_0.MemberOfCollection;

import java.lang.reflect.Member;

public class LibraryCollectionSetter extends ApolloIndexableItemSetter<edu.pitt.apollo.library_service_types.v4_0_1.LibraryCollection> {

	public LibraryCollectionSetter(Class<edu.pitt.apollo.library_service_types.v4_0_1.LibraryCollection> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setName() throws MigrationException {
		newTypeInstance.setName(((edu.pitt.apollo.library_service_types.v3_1_0.LibraryCollection) oldTypeInstance).getName());
	}

	protected void setDescription() throws MigrationException {
		newTypeInstance.setDescription(((edu.pitt.apollo.library_service_types.v3_1_0.LibraryCollection) oldTypeInstance).getDescription());
	}

	protected void setMembersOfCollection() throws MigrationException {
		for (MemberOfCollection oldObj : ((edu.pitt.apollo.library_service_types.v3_1_0.LibraryCollection) oldTypeInstance).getMembersOfCollection()) {
			newTypeInstance.getMembersOfCollection().add(oldObj.getUrn());
		}

	}

	protected void setJavaClassNameOfMembers() throws MigrationException {
		newTypeInstance.setJavaClassNameOfMembers((((edu.pitt.apollo.library_service_types.v3_1_0.LibraryCollection) oldTypeInstance).getJavaClassNameOfMembers()).replace("v3_1_0", "v4_0_1"));
	}

//	protected void setSubCollection() throws MigrationException {
//		LibrarySubCollectionSetter setter = new LibrarySubCollectionSetterImpl(edu.pitt.apollo.library_service_types.v4_0_1.LibrarySubCollection.class,((edu.pitt.apollo.library_service_types.v3_1_0.LibraryCollection) oldTypeInstance).getSubCollection());
//		setter.set();
//		newTypeInstance.setSubCollection(setter.getNewTypeInstance());
//	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
			setName();
			setDescription();
			setMembersOfCollection();
			setJavaClassNameOfMembers();
//			setSubCollection();
		}
	}

}