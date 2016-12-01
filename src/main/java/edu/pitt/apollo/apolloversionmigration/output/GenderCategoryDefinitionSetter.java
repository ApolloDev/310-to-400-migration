package edu.pitt.apollo.apolloversionmigration.output;

public class GenderCategoryDefinitionSetter extends CategoryDefinitionSetter<edu.pitt.apollo.types.v4_0.GenderCategoryDefinition> {

	public GenderCategoryDefinitionSetter(Class<edu.pitt.apollo.types.v4_0.GenderCategoryDefinition> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setSex() throws MigrationException {
		newTypeInstance.setSex(edu.pitt.apollo.types.v4_0.GenderEnum.valueOf(((edu.pitt.apollo.types.v3_1_0.GenderCategoryDefinition) oldTypeInstance).getSex().toString()));
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
			setSex();
		}
	}

}