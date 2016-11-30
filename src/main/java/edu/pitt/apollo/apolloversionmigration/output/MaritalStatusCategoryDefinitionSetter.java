package edu.pitt.apollo.apolloversionmigration.output;

public class MaritalStatusCategoryDefinitionSetter extends CategoryDefinitionSetter<edu.pitt.apollo.types.v4_0.MaritalStatusCategoryDefinition,edu.pitt.apollo.types.v3_1_0.MaritalStatusCategoryDefinition> {

	public MaritalStatusCategoryDefinitionSetter(Class<edu.pitt.apollo.types.v4_0.MaritalStatusCategoryDefinition> newTypeClass, edu.pitt.apollo.types.v3_1_0.MaritalStatusCategoryDefinition oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setMaritalStatus() throws MigrationException {
		newTypeInstance.setMaritalStatus(edu.pitt.apollo.types.v4_0.MaritalStatusEnum.fromValue(oldTypeInstance.getMaritalStatus().toString()));
	}

	@Override
	public void set() throws MigrationException {
		super.set();
		setMaritalStatus();
	}

}