package edu.pitt.apollo.apolloversionmigration.output;

public class SourceOfInfectionCategoryDefinitionSetter extends CategoryDefinitionSetter<edu.pitt.apollo.types.v4_0.SourceOfInfectionCategoryDefinition,edu.pitt.apollo.types.v3_1_0.SourceOfInfectionCategoryDefinition> {

	public SourceOfInfectionCategoryDefinitionSetter(Class<edu.pitt.apollo.types.v4_0.SourceOfInfectionCategoryDefinition> newTypeClass, edu.pitt.apollo.types.v3_1_0.SourceOfInfectionCategoryDefinition oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setSourceOfInfection() throws MigrationException {
		newTypeInstance.setSourceOfInfection(edu.pitt.apollo.types.v4_0.SourceOfInfectionEnum.fromValue(oldTypeInstance.getSourceOfInfection().toString()));
	}

	@Override
	public void set() throws MigrationException {
		super.set();
		setSourceOfInfection();
	}

}