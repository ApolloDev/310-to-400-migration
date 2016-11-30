package edu.pitt.apollo.apolloversionmigration.output;

public class ConditionalProbabilityDistributionSetter extends ProbabilityDistributionSetter<edu.pitt.apollo.types.v4_0.ConditionalProbabilityDistribution,edu.pitt.apollo.types.v3_1_0.ConditionalProbabilityDistribution> {

	public ConditionalProbabilityDistributionSetter(Class<edu.pitt.apollo.types.v4_0.ConditionalProbabilityDistribution> newTypeClass, edu.pitt.apollo.types.v3_1_0.ConditionalProbabilityDistribution oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setFirstConditioningVariable() throws MigrationException {
		ConditioningVariableSetter setter = new ConditioningVariableSetter(edu.pitt.apollo.types.v4_0.ConditioningVariable.class,oldTypeInstance.getFirstConditioningVariable());
		setter.set();
		newTypeInstance.setFirstConditioningVariable(setter.getNewTypeInstance());
	}

	@Override
	public void set() throws MigrationException {
		super.set();
		setFirstConditioningVariable();
	}

}