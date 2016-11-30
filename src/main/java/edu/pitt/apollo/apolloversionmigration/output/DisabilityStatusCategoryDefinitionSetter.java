package edu.pitt.apollo.apolloversionmigration.output;

public class DisabilityStatusCategoryDefinitionSetter extends CategoryDefinitionSetter<edu.pitt.apollo.types.v4_0.DisabilityStatusCategoryDefinition,edu.pitt.apollo.types.v3_1_0.DisabilityStatusCategoryDefinition> {

	public DisabilityStatusCategoryDefinitionSetter(Class<edu.pitt.apollo.types.v4_0.DisabilityStatusCategoryDefinition> newTypeClass, edu.pitt.apollo.types.v3_1_0.DisabilityStatusCategoryDefinition oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setDisabilityStatus() throws MigrationException {
		newTypeInstance.setDisabilityStatus(edu.pitt.apollo.types.v4_0.DisabilityStatusEnum.fromValue(oldTypeInstance.getDisabilityStatus().toString()));
	}

	@Override
	public void set() throws MigrationException {
		super.set();
		setDisabilityStatus();
	}

}