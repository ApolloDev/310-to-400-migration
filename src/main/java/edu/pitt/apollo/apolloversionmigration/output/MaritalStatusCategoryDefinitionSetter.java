package edu.pitt.apollo.apolloversionmigration.output;

public class MaritalStatusCategoryDefinitionSetter extends CategoryDefinitionSetter<edu.pitt.apollo.types.v4_0.MaritalStatusCategoryDefinition> {

	public MaritalStatusCategoryDefinitionSetter(Class<edu.pitt.apollo.types.v4_0.MaritalStatusCategoryDefinition> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setMaritalStatus() throws MigrationException {
		newTypeInstance.setMaritalStatus(edu.pitt.apollo.types.v4_0.MaritalStatusEnum.valueOf(((edu.pitt.apollo.types.v3_1_0.MaritalStatusCategoryDefinition) oldTypeInstance).getMaritalStatus().toString()));
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
			setMaritalStatus();
		}
	}

}