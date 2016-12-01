package edu.pitt.apollo.apolloversionmigration.output;

public class PlaceCategoryDefinitionSetter extends CategoryDefinitionSetter<edu.pitt.apollo.types.v4_0.PlaceCategoryDefinition> {

	public PlaceCategoryDefinitionSetter(Class<edu.pitt.apollo.types.v4_0.PlaceCategoryDefinition> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setPlace() throws MigrationException {
		newTypeInstance.setPlace(edu.pitt.apollo.types.v4_0.PlaceEnum.valueOf(((edu.pitt.apollo.types.v3_1_0.PlaceCategoryDefinition) oldTypeInstance).getPlace().toString()));
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
			setPlace();
		}
	}

}