package edu.pitt.apollo.apolloversionmigration.output;

public class DiscreteNonparametricProbabilityDistributionSetter extends NonparametricProbabilityDistributionSetter<edu.pitt.apollo.types.v4_0.DiscreteNonparametricProbabilityDistribution> {

	public DiscreteNonparametricProbabilityDistributionSetter(Class<edu.pitt.apollo.types.v4_0.DiscreteNonparametricProbabilityDistribution> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setProbabilityValuePairs() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.ProbabilityValuePair oldObj : ((edu.pitt.apollo.types.v3_1_0.DiscreteNonparametricProbabilityDistribution) oldTypeInstance).getProbabilityValuePairs()) {
			ProbabilityValuePairSetter setter = new ProbabilityValuePairSetter(edu.pitt.apollo.types.v4_0.ProbabilityValuePair.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.ProbabilityValuePair newObj = setter.getNewTypeInstance();
			newTypeInstance.getProbabilityValuePairs().add(newObj);
		}

	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
			setProbabilityValuePairs();
		}
	}

}