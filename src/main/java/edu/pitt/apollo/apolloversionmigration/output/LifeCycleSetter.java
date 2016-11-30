package edu.pitt.apollo.apolloversionmigration.output;

public class LifeCycleSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.LifeCycle,edu.pitt.apollo.types.v3_1_0.LifeCycle> {

	public LifeCycleSetter(Class<edu.pitt.apollo.types.v4_0.LifeCycle> newTypeClass, edu.pitt.apollo.types.v3_1_0.LifeCycle oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setLifeStagesWithDurationsAndMortalities() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.LifeStageWithDurationAndMortality oldObj : oldTypeInstance.getLifeStagesWithDurationsAndMortalities()) {
			LifeStageWithDurationAndMortalitySetter setter = new LifeStageWithDurationAndMortalitySetter(edu.pitt.apollo.types.v4_0.LifeStageWithDurationAndMortality.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.LifeStageWithDurationAndMortality newObj = setter.getNewTypeInstance();
			newTypeInstance.getLifeStagesWithDurationsAndMortalities().add(newObj);
		}

	}

	@Override
	public void set() throws MigrationException {
		setLifeStagesWithDurationsAndMortalities();
	}

}