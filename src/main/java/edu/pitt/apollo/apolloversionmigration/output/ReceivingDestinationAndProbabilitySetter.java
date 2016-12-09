package edu.pitt.apollo.apolloversionmigration.output;

public class ReceivingDestinationAndProbabilitySetter extends BehaviorSetter<edu.pitt.apollo.types.v4_0_1.ReceivingDestinationAndProbability> {

	public ReceivingDestinationAndProbabilitySetter(Class<edu.pitt.apollo.types.v4_0_1.ReceivingDestinationAndProbability> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setReceivingDestination() throws MigrationException {
		if (((edu.pitt.apollo.types.v3_1_0.ReceivingDestinationAndProbability) oldTypeInstance).getReceivingDestination() != null) {
			newTypeInstance.setReceivingDestination(edu.pitt.apollo.types.v4_0_1.PlaceEnum.valueOf(((edu.pitt.apollo.types.v3_1_0.ReceivingDestinationAndProbability) oldTypeInstance).getReceivingDestination().toString()));
		}
	}

	protected void setProbability() throws MigrationException {
		newTypeInstance.setProbability(((edu.pitt.apollo.types.v3_1_0.ReceivingDestinationAndProbability) oldTypeInstance).getProbability());
	}

	protected void setTransitTime() throws MigrationException {
		if (((edu.pitt.apollo.types.v3_1_0.ReceivingDestinationAndProbability) oldTypeInstance).getTransitTime() != null) {
			DurationSetter setter = DurationSetterFactory.getSetter(((edu.pitt.apollo.types.v3_1_0.ReceivingDestinationAndProbability) oldTypeInstance).getTransitTime());
			setter.set();
			newTypeInstance.setTransitTime(setter.getNewTypeInstance());
		}

	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
			setReceivingDestination();
			setProbability();
			setTransitTime();
		}
	}

}