package edu.pitt.apollo.apolloversionmigration.output;

public class DurationSetter<T extends edu.pitt.apollo.types.v4_0.Duration, O extends edu.pitt.apollo.types.v3_1_0.Duration> extends ParameterValueSetter<T,O> {

	public DurationSetter(Class<T> newTypeClass, O oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setUnitOfTime() throws MigrationException {
		newTypeInstance.setUnitOfTime(edu.pitt.apollo.types.v4_0.UnitOfTimeEnum.fromValue(oldTypeInstance.getUnitOfTime().toString()));
	}

	private void setReferenceId() throws MigrationException {
		newTypeInstance.setReferenceId(oldTypeInstance.getReferenceId());
	}

	@Override
	public void set() throws MigrationException {
		super.set();
		setUnitOfTime();
		setReferenceId();
	}

	@Override
	public T getNewTypeInstance() {
		return newTypeInstance;
	}

}