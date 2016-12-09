package edu.pitt.apollo.apolloversionmigration.output;

public class HumanBehaviorSetter extends BehaviorSetter<edu.pitt.apollo.types.v4_0_1.HumanBehavior> {

	public HumanBehaviorSetter(Class<edu.pitt.apollo.types.v4_0_1.HumanBehavior> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setSpeedOfMovement() throws MigrationException {
		RateSetter setter = new RateSetter(edu.pitt.apollo.types.v4_0_1.Rate.class,((edu.pitt.apollo.types.v3_1_0.HumanBehavior) oldTypeInstance).getSpeedOfMovement());
		setter.set();
		newTypeInstance.setSpeedOfMovement(setter.getNewTypeInstance());
	}

	protected void setBuildingAffinity() throws MigrationException {
		newTypeInstance.setBuildingAffinity(((edu.pitt.apollo.types.v3_1_0.HumanBehavior) oldTypeInstance).getBuildingAffinity());
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
			setSpeedOfMovement();
			setBuildingAffinity();
		}
	}

}