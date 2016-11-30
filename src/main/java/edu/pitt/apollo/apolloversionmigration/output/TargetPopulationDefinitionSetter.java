package edu.pitt.apollo.apolloversionmigration.output;

public class TargetPopulationDefinitionSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.TargetPopulationDefinition,edu.pitt.apollo.types.v3_1_0.TargetPopulationDefinition> {

	public TargetPopulationDefinitionSetter(Class<edu.pitt.apollo.types.v4_0.TargetPopulationDefinition> newTypeClass, edu.pitt.apollo.types.v3_1_0.TargetPopulationDefinition oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setAgeRange() throws MigrationException {
		AgeRangeCategoryDefinitionSetter setter = new AgeRangeCategoryDefinitionSetter(edu.pitt.apollo.types.v4_0.AgeRangeCategoryDefinition.class,oldTypeInstance.getAgeRange());
		setter.set();
		newTypeInstance.setAgeRange(setter.getNewTypeInstance());
	}

	private void setSex() throws MigrationException {
		newTypeInstance.setSex(edu.pitt.apollo.types.v4_0.GenderEnum.fromValue(oldTypeInstance.getSex().toString()));
	}

	private void setDiseaseOutcome() throws MigrationException {
		newTypeInstance.setDiseaseOutcome(edu.pitt.apollo.types.v4_0.DiseaseOutcomeEnum.fromValue(oldTypeInstance.getDiseaseOutcome().toString()));
	}

	private void setOtherStratification() throws MigrationException {
		newTypeInstance.setOtherStratification(edu.pitt.apollo.types.v4_0.PopulationStratificationEnum.fromValue(oldTypeInstance.getOtherStratification().toString()));
	}

	@Override
	public void set() throws MigrationException {
		setAgeRange();
		setSex();
		setDiseaseOutcome();
		setOtherStratification();
	}

}