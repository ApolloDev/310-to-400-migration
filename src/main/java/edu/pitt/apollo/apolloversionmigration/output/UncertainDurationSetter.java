package edu.pitt.apollo.apolloversionmigration.output;

public class UncertainDurationSetter extends DurationSetter<edu.pitt.apollo.types.v4_0.UncertainDuration,edu.pitt.apollo.types.v3_1_0.UncertainDuration> {

	public UncertainDurationSetter(Class<edu.pitt.apollo.types.v4_0.UncertainDuration> newTypeClass, edu.pitt.apollo.types.v3_1_0.UncertainDuration oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setProbabilityDistribution() throws MigrationException {
		ProbabilityDistributionSetter setter = ProbabilityDistributionSetterFactory.getSetter(oldTypeInstance.getProbabilityDistribution());
		setter.set();
		newTypeInstance.setProbabilityDistribution(setter.getNewTypeInstance());
	}

	@Override
	public void set() throws MigrationException {
		super.set();
		setProbabilityDistribution();
	}

}