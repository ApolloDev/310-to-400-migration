package edu.pitt.apollo.apolloversionmigration.output;

public class LocationCategoryDefinitionSetter extends CategoryDefinitionSetter<edu.pitt.apollo.types.v4_0.LocationCategoryDefinition,edu.pitt.apollo.types.v3_1_0.LocationCategoryDefinition> {

	public LocationCategoryDefinitionSetter(Class<edu.pitt.apollo.types.v4_0.LocationCategoryDefinition> newTypeClass, edu.pitt.apollo.types.v3_1_0.LocationCategoryDefinition oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setSpatialGranularity() throws MigrationException {
		newTypeInstance.setSpatialGranularity(edu.pitt.apollo.types.v4_0.SpatialGranularityEnum.fromValue(oldTypeInstance.getSpatialGranularity().toString()));
	}

	private void setApolloLocationCode() throws MigrationException {
		newTypeInstance.setApolloLocationCode(oldTypeInstance.getApolloLocationCode());
	}

	@Override
	public void set() throws MigrationException {
		super.set();
		setSpatialGranularity();
		setApolloLocationCode();
	}

}