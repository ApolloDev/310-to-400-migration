package edu.pitt.apollo.apolloversionmigration.output;

public class CensusDataSetter<T extends edu.pitt.apollo.types.v4_0_1.CensusData> extends ApolloIndexableItemSetter<T> {

	public CensusDataSetter(Class<T> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setDate() throws MigrationException {
		newTypeInstance.setDate(((edu.pitt.apollo.types.v3_1_0.CensusData) oldTypeInstance).getDate());
	}

	protected void setLocation() throws MigrationException {
		LocationSetter setter = new LocationSetter(edu.pitt.apollo.types.v4_0_1.Location.class,((edu.pitt.apollo.types.v3_1_0.CensusData) oldTypeInstance).getLocation());
		setter.set();
		newTypeInstance.setLocation(setter.getNewTypeInstance());
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
			setDate();
			setLocation();
		}
	}

	@Override
	public T getNewTypeInstance() {
		return newTypeInstance;
	}

}