package edu.pitt.apollo.apolloversionmigration.output;

public class LocationCategoryDefinitionSetter extends CategoryDefinitionSetter<edu.pitt.apollo.types.v4_0_1.LocationCategoryDefinition> {

	public LocationCategoryDefinitionSetter(Class<edu.pitt.apollo.types.v4_0_1.LocationCategoryDefinition> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setSpatialGranularity() throws MigrationException {
		if (((edu.pitt.apollo.types.v3_1_0.LocationCategoryDefinition) oldTypeInstance).getSpatialGranularity() != null) {
			newTypeInstance.setSpatialGranularity(edu.pitt.apollo.types.v4_0_1.SpatialGranularityEnum.valueOf(((edu.pitt.apollo.types.v3_1_0.LocationCategoryDefinition) oldTypeInstance).getSpatialGranularity().toString()));
		}
	}

	protected void setApolloLocationCode() throws MigrationException {
		newTypeInstance.setApolloLocationCode(((edu.pitt.apollo.types.v3_1_0.LocationCategoryDefinition) oldTypeInstance).getApolloLocationCode());
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
			setSpatialGranularity();
			setApolloLocationCode();
		}
	}

}