package edu.pitt.apollo.apolloversionmigration.output;

public class GenderCategoryDefinitionSetter extends CategoryDefinitionSetter<edu.pitt.apollo.types.v4_0.GenderCategoryDefinition,edu.pitt.apollo.types.v3_1_0.GenderCategoryDefinition> {

	public GenderCategoryDefinitionSetter(Class<edu.pitt.apollo.types.v4_0.GenderCategoryDefinition> newTypeClass, edu.pitt.apollo.types.v3_1_0.GenderCategoryDefinition oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setSex() throws MigrationException {
		newTypeInstance.setSex(edu.pitt.apollo.types.v4_0.GenderEnum.fromValue(oldTypeInstance.getSex().toString()));
	}

	@Override
	public void set() throws MigrationException {
		super.set();
		setSex();
	}

}