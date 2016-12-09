package edu.pitt.apollo.apolloversionmigration.output;

public class SourceOfInfectionCategoryDefinitionSetter extends CategoryDefinitionSetter<edu.pitt.apollo.types.v4_0_1.SourceOfInfectionCategoryDefinition> {

	public SourceOfInfectionCategoryDefinitionSetter(Class<edu.pitt.apollo.types.v4_0_1.SourceOfInfectionCategoryDefinition> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setSourceOfInfection() throws MigrationException {
		if (((edu.pitt.apollo.types.v3_1_0.SourceOfInfectionCategoryDefinition) oldTypeInstance).getSourceOfInfection() != null) {
			newTypeInstance.setSourceOfInfection(edu.pitt.apollo.types.v4_0_1.SourceOfInfectionEnum.valueOf(((edu.pitt.apollo.types.v3_1_0.SourceOfInfectionCategoryDefinition) oldTypeInstance).getSourceOfInfection().toString()));
		}
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
			setSourceOfInfection();
		}
	}

}