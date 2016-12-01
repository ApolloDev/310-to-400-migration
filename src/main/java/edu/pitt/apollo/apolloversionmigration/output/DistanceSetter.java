package edu.pitt.apollo.apolloversionmigration.output;

public class DistanceSetter extends ParameterValueSetter<edu.pitt.apollo.types.v4_0.Distance> {

	public DistanceSetter(Class<edu.pitt.apollo.types.v4_0.Distance> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setUnitOfDistance() throws MigrationException {
		newTypeInstance.setUnitOfDistance(edu.pitt.apollo.types.v4_0.UnitOfDistanceEnum.valueOf(((edu.pitt.apollo.types.v3_1_0.Distance) oldTypeInstance).getUnitOfDistance().toString()));
	}

	protected void setValue() throws MigrationException {
		newTypeInstance.setValue(((edu.pitt.apollo.types.v3_1_0.Distance) oldTypeInstance).getValue());
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
			setUnitOfDistance();
			setValue();
		}
	}

}