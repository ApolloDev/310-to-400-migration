package edu.pitt.apollo.apolloversionmigration.output;

public class CensusDataSetter<T extends edu.pitt.apollo.types.v4_0.CensusData, O extends edu.pitt.apollo.types.v3_1_0.CensusData> extends ApolloIndexableItemSetter<T,O> {

	public CensusDataSetter(Class<T> newTypeClass, O oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setDate() throws MigrationException {
		newTypeInstance.setDate(oldTypeInstance.getDate());
	}

	private void setLocation() throws MigrationException {
		LocationSetter setter = new LocationSetter(edu.pitt.apollo.types.v4_0.Location.class,oldTypeInstance.getLocation());
		setter.set();
		newTypeInstance.setLocation(setter.getNewTypeInstance());
	}

	@Override
	public void set() throws MigrationException {
		super.set();
		setDate();
		setLocation();
	}

	@Override
	public T getNewTypeInstance() {
		return newTypeInstance;
	}

}