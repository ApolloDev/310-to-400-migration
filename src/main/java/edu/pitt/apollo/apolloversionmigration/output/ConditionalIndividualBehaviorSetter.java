package edu.pitt.apollo.apolloversionmigration.output;

public class ConditionalIndividualBehaviorSetter extends BehaviorSetter<edu.pitt.apollo.types.v4_0.ConditionalIndividualBehavior> {

	public ConditionalIndividualBehaviorSetter(Class<edu.pitt.apollo.types.v4_0.ConditionalIndividualBehavior> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setBehavior() throws MigrationException {
		newTypeInstance.setBehavior(edu.pitt.apollo.types.v4_0.BehaviorEnum.valueOf(((edu.pitt.apollo.types.v3_1_0.ConditionalIndividualBehavior) oldTypeInstance).getBehavior().toString()));
	}

	protected void setConditionalProbability() throws MigrationException {
		ConditionalProbabilityDistributionSetter setter = new ConditionalProbabilityDistributionSetter(edu.pitt.apollo.types.v4_0.ConditionalProbabilityDistribution.class,((edu.pitt.apollo.types.v3_1_0.ConditionalIndividualBehavior) oldTypeInstance).getConditionalProbability());
		setter.set();
		newTypeInstance.setConditionalProbability(setter.getNewTypeInstance());
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
			setBehavior();
			setConditionalProbability();
		}
	}

}