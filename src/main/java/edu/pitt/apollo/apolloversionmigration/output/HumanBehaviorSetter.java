package edu.pitt.apollo.apolloversionmigration.output;

public class HumanBehaviorSetter extends BehaviorSetter<edu.pitt.apollo.types.v4_0.HumanBehavior,edu.pitt.apollo.types.v3_1_0.HumanBehavior> {

	public HumanBehaviorSetter(Class<edu.pitt.apollo.types.v4_0.HumanBehavior> newTypeClass, edu.pitt.apollo.types.v3_1_0.HumanBehavior oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setSpeedOfMovement() throws MigrationException {
		RateSetter setter = new RateSetter(edu.pitt.apollo.types.v4_0.Rate.class,oldTypeInstance.getSpeedOfMovement());
		setter.set();
		newTypeInstance.setSpeedOfMovement(setter.getNewTypeInstance());
	}

	private void setBuildingAffinity() throws MigrationException {
		newTypeInstance.setBuildingAffinity(oldTypeInstance.getBuildingAffinity());
	}

	@Override
	public void set() throws MigrationException {
		super.set();
		setSpeedOfMovement();
		setBuildingAffinity();
	}

}