package edu.pitt.apollo.apolloversionmigration.output;

public class TargetPopulationDefinitionSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0_1.TargetPopulationDefinition> {

	public TargetPopulationDefinitionSetter(Class<edu.pitt.apollo.types.v4_0_1.TargetPopulationDefinition> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setAgeRange() throws MigrationException {
		AgeRangeCategoryDefinitionSetter setter = new AgeRangeCategoryDefinitionSetterImpl(edu.pitt.apollo.types.v4_0_1.AgeRangeCategoryDefinition.class,((edu.pitt.apollo.types.v3_1_0.TargetPopulationDefinition) oldTypeInstance).getAgeRange());
		setter.set();
		newTypeInstance.setAgeRange(setter.getNewTypeInstance());
	}

	protected void setSex() throws MigrationException {
		if (((edu.pitt.apollo.types.v3_1_0.TargetPopulationDefinition) oldTypeInstance).getSex() != null) {
			newTypeInstance.setSex(edu.pitt.apollo.types.v4_0_1.GenderEnum.valueOf(((edu.pitt.apollo.types.v3_1_0.TargetPopulationDefinition) oldTypeInstance).getSex().toString()));
		}
	}

	protected void setDiseaseOutcome() throws MigrationException {
		if (((edu.pitt.apollo.types.v3_1_0.TargetPopulationDefinition) oldTypeInstance).getDiseaseOutcome() != null) {
			newTypeInstance.setDiseaseOutcome(edu.pitt.apollo.types.v4_0_1.DiseaseOutcomeEnum.valueOf(((edu.pitt.apollo.types.v3_1_0.TargetPopulationDefinition) oldTypeInstance).getDiseaseOutcome().toString()));
		}
	}

	protected void setOtherStratification() throws MigrationException {
		if (((edu.pitt.apollo.types.v3_1_0.TargetPopulationDefinition) oldTypeInstance).getOtherStratification() != null) {
			newTypeInstance.setOtherStratification(edu.pitt.apollo.types.v4_0_1.PopulationStratificationEnum.valueOf(((edu.pitt.apollo.types.v3_1_0.TargetPopulationDefinition) oldTypeInstance).getOtherStratification().toString()));
		}
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			setAgeRange();
			setSex();
			setDiseaseOutcome();
			setOtherStratification();
		}
	}

}