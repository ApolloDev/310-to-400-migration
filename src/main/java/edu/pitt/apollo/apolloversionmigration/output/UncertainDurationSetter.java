package edu.pitt.apollo.apolloversionmigration.output;

public class UncertainDurationSetter extends DurationSetter<edu.pitt.apollo.types.v4_0_1.UncertainDuration> {

	public UncertainDurationSetter(Class<edu.pitt.apollo.types.v4_0_1.UncertainDuration> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setUncertainValue() throws MigrationException {
		if (((edu.pitt.apollo.types.v3_1_0.UncertainDuration) oldTypeInstance).getProbabilityDistribution() != null) {
			UncertainValueSetter setter = UncertainValueSetterFactory.getSetter(((edu.pitt.apollo.types.v3_1_0.UncertainDuration) oldTypeInstance).getProbabilityDistribution());
			setter.set();
			newTypeInstance.setUncertainValue(setter.getNewTypeInstance());
		}

	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
			setUncertainValue();
		}
	}

}