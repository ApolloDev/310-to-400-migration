package edu.pitt.apollo.apolloversionmigration.output;

public class UncertainDurationSetter extends DurationSetter<edu.pitt.apollo.types.v4_0.UncertainDuration> {

	public UncertainDurationSetter(Class<edu.pitt.apollo.types.v4_0.UncertainDuration> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setProbabilityDistribution() throws MigrationException {
		if (((edu.pitt.apollo.types.v3_1_0.UncertainDuration) oldTypeInstance).getProbabilityDistribution() != null) {
			ProbabilityDistributionSetter setter = ProbabilityDistributionSetterFactory.getSetter(((edu.pitt.apollo.types.v3_1_0.UncertainDuration) oldTypeInstance).getProbabilityDistribution());
			setter.set();
			newTypeInstance.setProbabilityDistribution(setter.getNewTypeInstance());
		}

	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
			setProbabilityDistribution();
		}
	}

}