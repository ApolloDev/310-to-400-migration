package edu.pitt.apollo.apolloversionmigration.output;

public class ConditionalIndividualBehaviorSetter extends BehaviorSetter<edu.pitt.apollo.types.v4_0.ConditionalIndividualBehavior,edu.pitt.apollo.types.v3_1_0.ConditionalIndividualBehavior> {

	public ConditionalIndividualBehaviorSetter(Class<edu.pitt.apollo.types.v4_0.ConditionalIndividualBehavior> newTypeClass, edu.pitt.apollo.types.v3_1_0.ConditionalIndividualBehavior oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setBehavior() throws MigrationException {
		newTypeInstance.setBehavior(edu.pitt.apollo.types.v4_0.BehaviorEnum.fromValue(oldTypeInstance.getBehavior().toString()));
	}

	private void setConditionalProbability() throws MigrationException {
		ConditionalProbabilityDistributionSetter setter = new ConditionalProbabilityDistributionSetter(edu.pitt.apollo.types.v4_0.ConditionalProbabilityDistribution.class,oldTypeInstance.getConditionalProbability());
		setter.set();
		newTypeInstance.setConditionalProbability(setter.getNewTypeInstance());
	}

	@Override
	public void set() throws MigrationException {
		super.set();
		setBehavior();
		setConditionalProbability();
	}

}