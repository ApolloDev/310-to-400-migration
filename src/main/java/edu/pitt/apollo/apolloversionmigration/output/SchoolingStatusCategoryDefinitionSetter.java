package edu.pitt.apollo.apolloversionmigration.output;

public class SchoolingStatusCategoryDefinitionSetter extends CategoryDefinitionSetter<edu.pitt.apollo.types.v4_0_1.SchoolingStatusCategoryDefinition> {

	public SchoolingStatusCategoryDefinitionSetter(Class<edu.pitt.apollo.types.v4_0_1.SchoolingStatusCategoryDefinition> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setSchoolingStatus() throws MigrationException {
		if (((edu.pitt.apollo.types.v3_1_0.SchoolingStatusCategoryDefinition) oldTypeInstance).getSchoolingStatus() != null) {
			newTypeInstance.setSchoolingStatus(edu.pitt.apollo.types.v4_0_1.SchoolingStatusEnum.valueOf(((edu.pitt.apollo.types.v3_1_0.SchoolingStatusCategoryDefinition) oldTypeInstance).getSchoolingStatus().toString()));
		}
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
			setSchoolingStatus();
		}
	}

}