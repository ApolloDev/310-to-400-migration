package edu.pitt.apollo.apolloversionmigration.output;

public class MaritalStatusCategoryDefinitionSetter extends CategoryDefinitionSetter<edu.pitt.apollo.types.v4_0_1.MaritalStatusCategoryDefinition> {

	public MaritalStatusCategoryDefinitionSetter(Class<edu.pitt.apollo.types.v4_0_1.MaritalStatusCategoryDefinition> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setMaritalStatus() throws MigrationException {
		if (((edu.pitt.apollo.types.v3_1_0.MaritalStatusCategoryDefinition) oldTypeInstance).getMaritalStatus() != null) {
			newTypeInstance.setMaritalStatus(edu.pitt.apollo.types.v4_0_1.MaritalStatusEnum.valueOf(((edu.pitt.apollo.types.v3_1_0.MaritalStatusCategoryDefinition) oldTypeInstance).getMaritalStatus().toString()));
		}
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
			setMaritalStatus();
		}
	}

}