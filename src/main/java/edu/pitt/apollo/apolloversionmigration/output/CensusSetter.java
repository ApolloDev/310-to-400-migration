package edu.pitt.apollo.apolloversionmigration.output;

public class CensusSetter<T extends edu.pitt.apollo.types.v4_0.Census, O extends edu.pitt.apollo.types.v3_1_0.Census> extends ApolloIndexableItemSetter<T,O> {

	public CensusSetter(Class<T> newTypeClass, O oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setDescription() throws MigrationException {
		newTypeInstance.setDescription(oldTypeInstance.getDescription());
	}

	private void setLocation() throws MigrationException {
		LocationSetter setter = new LocationSetter(edu.pitt.apollo.types.v4_0.Location.class,oldTypeInstance.getLocation());
		setter.set();
		newTypeInstance.setLocation(setter.getNewTypeInstance());
	}

	private void setSimulatorTime() throws MigrationException {
		newTypeInstance.setSimulatorTime(oldTypeInstance.getSimulatorTime());
	}

	private void setReferenceDate() throws MigrationException {
		newTypeInstance.setReferenceDate(oldTypeInstance.getReferenceDate());
	}

	@Override
	public void set() throws MigrationException {
		super.set();
		setDescription();
		setLocation();
		setSimulatorTime();
		setReferenceDate();
	}

	@Override
	public T getNewTypeInstance() {
		return newTypeInstance;
	}

}