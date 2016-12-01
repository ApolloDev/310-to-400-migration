package edu.pitt.apollo.apolloversionmigration.output;

public class LocationSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.Location> {

	public LocationSetter(Class<edu.pitt.apollo.types.v4_0.Location> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setApolloLocationCode() throws MigrationException {
		newTypeInstance.setApolloLocationCode(((edu.pitt.apollo.types.v3_1_0.Location) oldTypeInstance).getApolloLocationCode());
	}

	protected void setLocationDefinition() throws MigrationException {
		LocationDefinitionSetter setter = new LocationDefinitionSetter(edu.pitt.apollo.types.v4_0.LocationDefinition.class,((edu.pitt.apollo.types.v3_1_0.Location) oldTypeInstance).getLocationDefinition());
		setter.set();
		newTypeInstance.setLocationDefinition(setter.getNewTypeInstance());
	}

	protected void setCartesianCircleLocationDefinition() throws MigrationException {
		CartesianCircleLocationDefinitionSetter setter = new CartesianCircleLocationDefinitionSetter(edu.pitt.apollo.types.v4_0.CartesianCircleLocationDefinition.class,((edu.pitt.apollo.types.v3_1_0.Location) oldTypeInstance).getCartesianCircleLocationDefinition());
		setter.set();
		newTypeInstance.setCartesianCircleLocationDefinition(setter.getNewTypeInstance());
	}

	protected void setTextualDescription() throws MigrationException {
		newTypeInstance.setTextualDescription(((edu.pitt.apollo.types.v3_1_0.Location) oldTypeInstance).getTextualDescription());
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			setApolloLocationCode();
			setLocationDefinition();
			setCartesianCircleLocationDefinition();
			setTextualDescription();
		}
	}

}