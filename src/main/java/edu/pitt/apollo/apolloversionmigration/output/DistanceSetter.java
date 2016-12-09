package edu.pitt.apollo.apolloversionmigration.output;

public class DistanceSetter extends ParameterValueSetter<edu.pitt.apollo.types.v4_0_1.Distance> {

	public DistanceSetter(Class<edu.pitt.apollo.types.v4_0_1.Distance> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setUnitOfDistance() throws MigrationException {
		if (((edu.pitt.apollo.types.v3_1_0.Distance) oldTypeInstance).getUnitOfDistance() != null) {
			newTypeInstance.setUnitOfDistance(edu.pitt.apollo.types.v4_0_1.UnitOfDistanceEnum.valueOf(((edu.pitt.apollo.types.v3_1_0.Distance) oldTypeInstance).getUnitOfDistance().toString()));
		}
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