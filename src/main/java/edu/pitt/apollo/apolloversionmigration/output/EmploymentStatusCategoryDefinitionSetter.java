package edu.pitt.apollo.apolloversionmigration.output;

public class EmploymentStatusCategoryDefinitionSetter extends CategoryDefinitionSetter<edu.pitt.apollo.types.v4_0.EmploymentStatusCategoryDefinition,edu.pitt.apollo.types.v3_1_0.EmploymentStatusCategoryDefinition> {

	public EmploymentStatusCategoryDefinitionSetter(Class<edu.pitt.apollo.types.v4_0.EmploymentStatusCategoryDefinition> newTypeClass, edu.pitt.apollo.types.v3_1_0.EmploymentStatusCategoryDefinition oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setEmploymentStatus() throws MigrationException {
		newTypeInstance.setEmploymentStatus(edu.pitt.apollo.types.v4_0.EmploymentStatusEnum.fromValue(oldTypeInstance.getEmploymentStatus().toString()));
	}

	@Override
	public void set() throws MigrationException {
		super.set();
		setEmploymentStatus();
	}

}