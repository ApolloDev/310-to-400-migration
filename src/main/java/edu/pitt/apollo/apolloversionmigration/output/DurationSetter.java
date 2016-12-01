package edu.pitt.apollo.apolloversionmigration.output;

public class DurationSetter<T extends edu.pitt.apollo.types.v4_0.Duration> extends ParameterValueSetter<T> {

	public DurationSetter(Class<T> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setUnitOfTime() throws MigrationException {
		newTypeInstance.setUnitOfTime(edu.pitt.apollo.types.v4_0.UnitOfTimeEnum.valueOf(((edu.pitt.apollo.types.v3_1_0.Duration) oldTypeInstance).getUnitOfTime().toString()));
	}

	protected void setReferenceId() throws MigrationException {
		newTypeInstance.setReferenceId(((edu.pitt.apollo.types.v3_1_0.Duration) oldTypeInstance).getReferenceId());
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
			setUnitOfTime();
			setReferenceId();
		}
	}

	@Override
	public T getNewTypeInstance() {
		return newTypeInstance;
	}

}