package edu.pitt.apollo.apolloversionmigration.output;

public class DiseaseOutcomeCategoryDefinitionSetter extends CategoryDefinitionSetter<edu.pitt.apollo.types.v4_0.DiseaseOutcomeCategoryDefinition,edu.pitt.apollo.types.v3_1_0.DiseaseOutcomeCategoryDefinition> {

	public DiseaseOutcomeCategoryDefinitionSetter(Class<edu.pitt.apollo.types.v4_0.DiseaseOutcomeCategoryDefinition> newTypeClass, edu.pitt.apollo.types.v3_1_0.DiseaseOutcomeCategoryDefinition oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setDiseaseOutcome() throws MigrationException {
		newTypeInstance.setDiseaseOutcome(edu.pitt.apollo.types.v4_0.DiseaseOutcomeEnum.fromValue(oldTypeInstance.getDiseaseOutcome().toString()));
	}

	@Override
	public void set() throws MigrationException {
		super.set();
		setDiseaseOutcome();
	}

}