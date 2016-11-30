package edu.pitt.apollo.apolloversionmigration.output;

public class DiscreteNonparametricProbabilityDistributionSetter extends NonparametricProbabilityDistributionSetter<edu.pitt.apollo.types.v4_0.DiscreteNonparametricProbabilityDistribution,edu.pitt.apollo.types.v3_1_0.DiscreteNonparametricProbabilityDistribution> {

	public DiscreteNonparametricProbabilityDistributionSetter(Class<edu.pitt.apollo.types.v4_0.DiscreteNonparametricProbabilityDistribution> newTypeClass, edu.pitt.apollo.types.v3_1_0.DiscreteNonparametricProbabilityDistribution oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setProbabilityValuePairs() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.ProbabilityValuePair oldObj : oldTypeInstance.getProbabilityValuePairs()) {
			ProbabilityValuePairSetter setter = new ProbabilityValuePairSetter(edu.pitt.apollo.types.v4_0.ProbabilityValuePair.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.ProbabilityValuePair newObj = setter.getNewTypeInstance();
			newTypeInstance.getProbabilityValuePairs().add(newObj);
		}

	}

	@Override
	public void set() throws MigrationException {
		super.set();
		setProbabilityValuePairs();
	}

}