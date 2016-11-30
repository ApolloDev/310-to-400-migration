package edu.pitt.apollo.apolloversionmigration.output;

public class HealthcareFacilityCategoryDefinitionSetter extends CategoryDefinitionSetter<edu.pitt.apollo.types.v4_0.HealthcareFacilityCategoryDefinition,edu.pitt.apollo.types.v3_1_0.HealthcareFacilityCategoryDefinition> {

	public HealthcareFacilityCategoryDefinitionSetter(Class<edu.pitt.apollo.types.v4_0.HealthcareFacilityCategoryDefinition> newTypeClass, edu.pitt.apollo.types.v3_1_0.HealthcareFacilityCategoryDefinition oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setHealthcareFacilityId() throws MigrationException {
		newTypeInstance.setHealthcareFacilityId(edu.pitt.apollo.types.v4_0.RheaHealthcareFacilityEnum.fromValue(oldTypeInstance.getHealthcareFacilityId().toString()));
	}

	@Override
	public void set() throws MigrationException {
		super.set();
		setHealthcareFacilityId();
	}

}