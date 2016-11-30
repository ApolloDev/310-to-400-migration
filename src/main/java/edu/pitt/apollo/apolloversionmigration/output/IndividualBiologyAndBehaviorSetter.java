package edu.pitt.apollo.apolloversionmigration.output;

public class IndividualBiologyAndBehaviorSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.IndividualBiologyAndBehavior,edu.pitt.apollo.types.v3_1_0.IndividualBiologyAndBehavior> {

	public IndividualBiologyAndBehaviorSetter(Class<edu.pitt.apollo.types.v4_0.IndividualBiologyAndBehavior> newTypeClass, edu.pitt.apollo.types.v3_1_0.IndividualBiologyAndBehavior oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setLifeCycle() throws MigrationException {
		LifeCycleSetter setter = new LifeCycleSetter(edu.pitt.apollo.types.v4_0.LifeCycle.class,oldTypeInstance.getLifeCycle());
		setter.set();
		newTypeInstance.setLifeCycle(setter.getNewTypeInstance());
	}

	private void setReproduction() throws MigrationException {
		ReproductionSetter setter = ReproductionSetterFactory.getSetter(oldTypeInstance.getReproduction());
		setter.set();
		newTypeInstance.setReproduction(setter.getNewTypeInstance());
	}

	private void setBehavior() throws MigrationException {
		BehaviorSetter setter = BehaviorSetterFactory.getSetter(oldTypeInstance.getBehavior());
		setter.set();
		newTypeInstance.setBehavior(setter.getNewTypeInstance());
	}

	@Override
	public void set() throws MigrationException {
		setLifeCycle();
		setReproduction();
		setBehavior();
	}

}