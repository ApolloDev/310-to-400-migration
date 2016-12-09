package edu.pitt.apollo.apolloversionmigration.output;

public class DisabilityStatusCategoryDefinitionSetter extends CategoryDefinitionSetter<edu.pitt.apollo.types.v4_0_1.DisabilityStatusCategoryDefinition> {

	public DisabilityStatusCategoryDefinitionSetter(Class<edu.pitt.apollo.types.v4_0_1.DisabilityStatusCategoryDefinition> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setDisabilityStatus() throws MigrationException {
		if (((edu.pitt.apollo.types.v3_1_0.DisabilityStatusCategoryDefinition) oldTypeInstance).getDisabilityStatus() != null) {
			newTypeInstance.setDisabilityStatus(edu.pitt.apollo.types.v4_0_1.DisabilityStatusEnum.valueOf(((edu.pitt.apollo.types.v3_1_0.DisabilityStatusCategoryDefinition) oldTypeInstance).getDisabilityStatus().toString()));
		}
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
			setDisabilityStatus();
		}
	}

}