package edu.pitt.apollo.apolloversionmigration.output;

public class PlaceCategoryDefinitionSetter extends CategoryDefinitionSetter<edu.pitt.apollo.types.v4_0.PlaceCategoryDefinition,edu.pitt.apollo.types.v3_1_0.PlaceCategoryDefinition> {

	public PlaceCategoryDefinitionSetter(Class<edu.pitt.apollo.types.v4_0.PlaceCategoryDefinition> newTypeClass, edu.pitt.apollo.types.v3_1_0.PlaceCategoryDefinition oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setPlace() throws MigrationException {
		newTypeInstance.setPlace(edu.pitt.apollo.types.v4_0.PlaceEnum.fromValue(oldTypeInstance.getPlace().toString()));
	}

	@Override
	public void set() throws MigrationException {
		super.set();
		setPlace();
	}

}