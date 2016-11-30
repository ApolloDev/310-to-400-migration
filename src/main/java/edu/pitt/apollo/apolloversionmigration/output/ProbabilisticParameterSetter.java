package edu.pitt.apollo.apolloversionmigration.output;

public class ProbabilisticParameterSetter extends ParameterValueSetter<edu.pitt.apollo.types.v4_0.ProbabilisticParameter,edu.pitt.apollo.types.v3_1_0.ProbabilisticParameter> {

	public ProbabilisticParameterSetter(Class<edu.pitt.apollo.types.v4_0.ProbabilisticParameter> newTypeClass, edu.pitt.apollo.types.v3_1_0.ProbabilisticParameter oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setProbability() throws MigrationException {
		newTypeInstance.setProbability(oldTypeInstance.getProbability());
	}

	private void setProbabilityDistribution() throws MigrationException {
		ProbabilityDistributionSetter setter = ProbabilityDistributionSetterFactory.getSetter(oldTypeInstance.getProbabilityDistribution());
		setter.set();
		newTypeInstance.setProbabilityDistribution(setter.getNewTypeInstance());
	}

	@Override
	public void set() throws MigrationException {
		super.set();
		setProbability();
		setProbabilityDistribution();
	}

}