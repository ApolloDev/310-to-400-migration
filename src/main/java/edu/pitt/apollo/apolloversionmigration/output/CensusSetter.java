package edu.pitt.apollo.apolloversionmigration.output;

public class CensusSetter<T extends edu.pitt.apollo.types.v4_0_1.Census> extends ApolloIndexableItemSetter<T> {

	public CensusSetter(Class<T> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setDescription() throws MigrationException {
		newTypeInstance.setDescription(((edu.pitt.apollo.types.v3_1_0.Census) oldTypeInstance).getDescription());
	}

	protected void setLocation() throws MigrationException {
		LocationSetter setter = new LocationSetter(edu.pitt.apollo.types.v4_0_1.Location.class,((edu.pitt.apollo.types.v3_1_0.Census) oldTypeInstance).getLocation());
		setter.set();
		newTypeInstance.setLocation(setter.getNewTypeInstance());
	}

	protected void setSimulatorTime() throws MigrationException {
		newTypeInstance.setSimulatorTime(((edu.pitt.apollo.types.v3_1_0.Census) oldTypeInstance).getSimulatorTime());
	}

	protected void setReferenceDate() throws MigrationException {
		newTypeInstance.setReferenceDate(((edu.pitt.apollo.types.v3_1_0.Census) oldTypeInstance).getReferenceDate());
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
			setDescription();
			setLocation();
			setSimulatorTime();
			setReferenceDate();
		}
	}

	@Override
	public T getNewTypeInstance() {
		return newTypeInstance;
	}

}