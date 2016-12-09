package edu.pitt.apollo.apolloversionmigration.output;

public class ConditionalProbabilityDistributionSetter extends ProbabilityDistributionSetter<edu.pitt.apollo.types.v4_0_1.ConditionalProbabilityDistribution> {

	public ConditionalProbabilityDistributionSetter(Class<edu.pitt.apollo.types.v4_0_1.ConditionalProbabilityDistribution> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setFirstConditioningVariable() throws MigrationException {
		ConditioningVariableSetter setter = new ConditioningVariableSetter(edu.pitt.apollo.types.v4_0_1.ConditioningVariable.class,((edu.pitt.apollo.types.v3_1_0.ConditionalProbabilityDistribution) oldTypeInstance).getFirstConditioningVariable());
		setter.set();
		newTypeInstance.setFirstConditioningVariable(setter.getNewTypeInstance());
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
			setFirstConditioningVariable();
		}
	}

}