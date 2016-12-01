package edu.pitt.apollo.apolloversionmigration.output;

public class HealthcareFacilityCategoryDefinitionSetter extends CategoryDefinitionSetter<edu.pitt.apollo.types.v4_0.HealthcareFacilityCategoryDefinition> {

	public HealthcareFacilityCategoryDefinitionSetter(Class<edu.pitt.apollo.types.v4_0.HealthcareFacilityCategoryDefinition> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setHealthcareFacilityId() throws MigrationException {
		newTypeInstance.setHealthcareFacilityId(edu.pitt.apollo.types.v4_0.RheaHealthcareFacilityEnum.valueOf(((edu.pitt.apollo.types.v3_1_0.HealthcareFacilityCategoryDefinition) oldTypeInstance).getHealthcareFacilityId().toString()));
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
			setHealthcareFacilityId();
		}
	}

}