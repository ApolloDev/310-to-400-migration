package edu.pitt.apollo.apolloversionmigration.output;

public class DistanceSetter extends ParameterValueSetter<edu.pitt.apollo.types.v4_0.Distance,edu.pitt.apollo.types.v3_1_0.Distance> {

	public DistanceSetter(Class<edu.pitt.apollo.types.v4_0.Distance> newTypeClass, edu.pitt.apollo.types.v3_1_0.Distance oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setUnitOfDistance() throws MigrationException {
		newTypeInstance.setUnitOfDistance(edu.pitt.apollo.types.v4_0.UnitOfDistanceEnum.fromValue(oldTypeInstance.getUnitOfDistance().toString()));
	}

	private void setValue() throws MigrationException {
		newTypeInstance.setValue(oldTypeInstance.getValue());
	}

	@Override
	public void set() throws MigrationException {
		super.set();
		setUnitOfDistance();
		setValue();
	}

}