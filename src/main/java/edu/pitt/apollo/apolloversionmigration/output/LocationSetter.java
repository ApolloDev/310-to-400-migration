package edu.pitt.apollo.apolloversionmigration.output;

public class LocationSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.Location,edu.pitt.apollo.types.v3_1_0.Location> {

	public LocationSetter(Class<edu.pitt.apollo.types.v4_0.Location> newTypeClass, edu.pitt.apollo.types.v3_1_0.Location oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setApolloLocationCode() throws MigrationException {
		newTypeInstance.setApolloLocationCode(oldTypeInstance.getApolloLocationCode());
	}

	private void setLocationDefinition() throws MigrationException {
		LocationDefinitionSetter setter = new LocationDefinitionSetter(edu.pitt.apollo.types.v4_0.LocationDefinition.class,oldTypeInstance.getLocationDefinition());
		setter.set();
		newTypeInstance.setLocationDefinition(setter.getNewTypeInstance());
	}

	private void setCartesianCircleLocationDefinition() throws MigrationException {
		CartesianCircleLocationDefinitionSetter setter = new CartesianCircleLocationDefinitionSetter(edu.pitt.apollo.types.v4_0.CartesianCircleLocationDefinition.class,oldTypeInstance.getCartesianCircleLocationDefinition());
		setter.set();
		newTypeInstance.setCartesianCircleLocationDefinition(setter.getNewTypeInstance());
	}

	private void setTextualDescription() throws MigrationException {
		newTypeInstance.setTextualDescription(oldTypeInstance.getTextualDescription());
	}

	@Override
	public void set() throws MigrationException {
		setApolloLocationCode();
		setLocationDefinition();
		setCartesianCircleLocationDefinition();
		setTextualDescription();
	}

}