package edu.pitt.apollo.apolloversionmigration.output;

public class IndividualBiologyAndBehaviorSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0_1.IndividualBiologyAndBehavior> {

	public IndividualBiologyAndBehaviorSetter(Class<edu.pitt.apollo.types.v4_0_1.IndividualBiologyAndBehavior> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setLifeCycle() throws MigrationException {
		LifeCycleSetter setter = new LifeCycleSetter(edu.pitt.apollo.types.v4_0_1.LifeCycle.class,((edu.pitt.apollo.types.v3_1_0.IndividualBiologyAndBehavior) oldTypeInstance).getLifeCycle());
		setter.set();
		newTypeInstance.setLifeCycle(setter.getNewTypeInstance());
	}

	protected void setReproduction() throws MigrationException {
		if (((edu.pitt.apollo.types.v3_1_0.IndividualBiologyAndBehavior) oldTypeInstance).getReproduction() != null) {
			ReproductionSetter setter = ReproductionSetterFactory.getSetter(((edu.pitt.apollo.types.v3_1_0.IndividualBiologyAndBehavior) oldTypeInstance).getReproduction());
			setter.set();
			newTypeInstance.setReproduction(setter.getNewTypeInstance());
		}

	}

	protected void setBehavior() throws MigrationException {
		if (((edu.pitt.apollo.types.v3_1_0.IndividualBiologyAndBehavior) oldTypeInstance).getBehavior() != null) {
			BehaviorSetter setter = BehaviorSetterFactory.getSetter(((edu.pitt.apollo.types.v3_1_0.IndividualBiologyAndBehavior) oldTypeInstance).getBehavior());
			setter.set();
			newTypeInstance.setBehavior(setter.getNewTypeInstance());
		}

	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			setLifeCycle();
			setReproduction();
			setBehavior();
		}
	}

}