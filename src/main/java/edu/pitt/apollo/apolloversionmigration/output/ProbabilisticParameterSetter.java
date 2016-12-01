package edu.pitt.apollo.apolloversionmigration.output;

public class ProbabilisticParameterSetter extends ParameterValueSetter<edu.pitt.apollo.types.v4_0.ProbabilisticParameter> {

	public ProbabilisticParameterSetter(Class<edu.pitt.apollo.types.v4_0.ProbabilisticParameter> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setProbability() throws MigrationException {
		newTypeInstance.setProbability(((edu.pitt.apollo.types.v3_1_0.ProbabilisticParameter) oldTypeInstance).getProbability());
	}

	protected void setProbabilityDistribution() throws MigrationException {
		if (((edu.pitt.apollo.types.v3_1_0.ProbabilisticParameter) oldTypeInstance).getProbabilityDistribution() != null) {
			ProbabilityDistributionSetter setter = ProbabilityDistributionSetterFactory.getSetter(((edu.pitt.apollo.types.v3_1_0.ProbabilisticParameter) oldTypeInstance).getProbabilityDistribution());
			setter.set();
			newTypeInstance.setProbabilityDistribution(setter.getNewTypeInstance());
		}

	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
			setProbability();
			setProbabilityDistribution();
		}
	}

}