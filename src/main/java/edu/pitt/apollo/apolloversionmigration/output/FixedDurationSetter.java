package edu.pitt.apollo.apolloversionmigration.output;

public class FixedDurationSetter extends DurationSetter<edu.pitt.apollo.types.v4_0.FixedDuration,edu.pitt.apollo.types.v3_1_0.FixedDuration> {

	public FixedDurationSetter(Class<edu.pitt.apollo.types.v4_0.FixedDuration> newTypeClass, edu.pitt.apollo.types.v3_1_0.FixedDuration oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setValue() throws MigrationException {
		newTypeInstance.setValue(oldTypeInstance.getValue());
	}

	@Override
	public void set() throws MigrationException {
		super.set();
		setValue();
	}

}