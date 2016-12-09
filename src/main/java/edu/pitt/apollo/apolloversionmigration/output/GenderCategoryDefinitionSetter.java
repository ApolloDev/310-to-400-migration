package edu.pitt.apollo.apolloversionmigration.output;

public class GenderCategoryDefinitionSetter extends CategoryDefinitionSetter<edu.pitt.apollo.types.v4_0_1.GenderCategoryDefinition> {

	public GenderCategoryDefinitionSetter(Class<edu.pitt.apollo.types.v4_0_1.GenderCategoryDefinition> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setSex() throws MigrationException {
		if (((edu.pitt.apollo.types.v3_1_0.GenderCategoryDefinition) oldTypeInstance).getSex() != null) {
			newTypeInstance.setSex(edu.pitt.apollo.types.v4_0_1.GenderEnum.valueOf(((edu.pitt.apollo.types.v3_1_0.GenderCategoryDefinition) oldTypeInstance).getSex().toString()));
		}
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
			setSex();
		}
	}

}