package edu.pitt.apollo.apolloversionmigration.output;

public class EmploymentStatusCategoryDefinitionSetter extends CategoryDefinitionSetter<edu.pitt.apollo.types.v4_0_1.EmploymentStatusCategoryDefinition> {

	public EmploymentStatusCategoryDefinitionSetter(Class<edu.pitt.apollo.types.v4_0_1.EmploymentStatusCategoryDefinition> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setEmploymentStatus() throws MigrationException {
		if (((edu.pitt.apollo.types.v3_1_0.EmploymentStatusCategoryDefinition) oldTypeInstance).getEmploymentStatus() != null) {
			newTypeInstance.setEmploymentStatus(edu.pitt.apollo.types.v4_0_1.EmploymentStatusEnum.valueOf(((edu.pitt.apollo.types.v3_1_0.EmploymentStatusCategoryDefinition) oldTypeInstance).getEmploymentStatus().toString()));
		}
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
			setEmploymentStatus();
		}
	}

}