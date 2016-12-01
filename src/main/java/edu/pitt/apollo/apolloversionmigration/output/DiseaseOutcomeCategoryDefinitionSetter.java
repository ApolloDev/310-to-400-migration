package edu.pitt.apollo.apolloversionmigration.output;

public class DiseaseOutcomeCategoryDefinitionSetter extends CategoryDefinitionSetter<edu.pitt.apollo.types.v4_0.DiseaseOutcomeCategoryDefinition> {

	public DiseaseOutcomeCategoryDefinitionSetter(Class<edu.pitt.apollo.types.v4_0.DiseaseOutcomeCategoryDefinition> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setDiseaseOutcome() throws MigrationException {
		newTypeInstance.setDiseaseOutcome(edu.pitt.apollo.types.v4_0.DiseaseOutcomeEnum.valueOf(((edu.pitt.apollo.types.v3_1_0.DiseaseOutcomeCategoryDefinition) oldTypeInstance).getDiseaseOutcome().toString()));
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
			setDiseaseOutcome();
		}
	}

}