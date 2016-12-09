package edu.pitt.apollo.apolloversionmigration.output;

public class FixedDurationSetter extends DurationSetter<edu.pitt.apollo.types.v4_0_1.FixedDuration> {

	public FixedDurationSetter(Class<edu.pitt.apollo.types.v4_0_1.FixedDuration> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setValue() throws MigrationException {
		newTypeInstance.setValue(((edu.pitt.apollo.types.v3_1_0.FixedDuration) oldTypeInstance).getValue());
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
			setValue();
		}
	}

}