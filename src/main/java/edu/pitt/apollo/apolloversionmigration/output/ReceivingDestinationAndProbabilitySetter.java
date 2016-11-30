package edu.pitt.apollo.apolloversionmigration.output;

public class ReceivingDestinationAndProbabilitySetter extends BehaviorSetter<edu.pitt.apollo.types.v4_0.ReceivingDestinationAndProbability,edu.pitt.apollo.types.v3_1_0.ReceivingDestinationAndProbability> {

	public ReceivingDestinationAndProbabilitySetter(Class<edu.pitt.apollo.types.v4_0.ReceivingDestinationAndProbability> newTypeClass, edu.pitt.apollo.types.v3_1_0.ReceivingDestinationAndProbability oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setReceivingDestination() throws MigrationException {
		newTypeInstance.setReceivingDestination(edu.pitt.apollo.types.v4_0.PlaceEnum.fromValue(oldTypeInstance.getReceivingDestination().toString()));
	}

	private void setProbability() throws MigrationException {
		newTypeInstance.setProbability(oldTypeInstance.getProbability());
	}

	private void setTransitTime() throws MigrationException {
		DurationSetter setter = DurationSetterFactory.getSetter(oldTypeInstance.getTransitTime());
		setter.set();
		newTypeInstance.setTransitTime(setter.getNewTypeInstance());
	}

	@Override
	public void set() throws MigrationException {
		super.set();
		setReceivingDestination();
		setProbability();
		setTransitTime();
	}

}