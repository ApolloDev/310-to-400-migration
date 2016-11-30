package edu.pitt.apollo.apolloversionmigration.output;

public class SchoolingStatusCategoryDefinitionSetter extends CategoryDefinitionSetter<edu.pitt.apollo.types.v4_0.SchoolingStatusCategoryDefinition,edu.pitt.apollo.types.v3_1_0.SchoolingStatusCategoryDefinition> {

	public SchoolingStatusCategoryDefinitionSetter(Class<edu.pitt.apollo.types.v4_0.SchoolingStatusCategoryDefinition> newTypeClass, edu.pitt.apollo.types.v3_1_0.SchoolingStatusCategoryDefinition oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setSchoolingStatus() throws MigrationException {
		newTypeInstance.setSchoolingStatus(edu.pitt.apollo.types.v4_0.SchoolingStatusEnum.fromValue(oldTypeInstance.getSchoolingStatus().toString()));
	}

	@Override
	public void set() throws MigrationException {
		super.set();
		setSchoolingStatus();
	}

}