package edu.pitt.apollo.apolloversionmigration.output;

public abstract class LibrarySubCollectionSetter extends ApolloIndexableItemSetter<edu.pitt.apollo.library_service_types.v4_0_1.LibrarySubCollection> {

	public LibrarySubCollectionSetter(Class<edu.pitt.apollo.library_service_types.v4_0_1.LibrarySubCollection> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected abstract void setName() throws MigrationException;
	protected abstract void setDescription() throws MigrationException;
	protected abstract void setMembersOfCollection() throws MigrationException;
	protected abstract void setSubCollection() throws MigrationException;
	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
			setName();
			setDescription();
			setMembersOfCollection();
			setSubCollection();
		}
	}

}