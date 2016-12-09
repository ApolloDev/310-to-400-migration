package edu.pitt.apollo.apolloversionmigration.output;

public class CartesianCircleLocationDefinitionSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0_1.CartesianCircleLocationDefinition> {

	public CartesianCircleLocationDefinitionSetter(Class<edu.pitt.apollo.types.v4_0_1.CartesianCircleLocationDefinition> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setEastWestOffsetFromCartesianCenter() throws MigrationException {
		DistanceSetter setter = new DistanceSetter(edu.pitt.apollo.types.v4_0_1.Distance.class,((edu.pitt.apollo.types.v3_1_0.CartesianCircleLocationDefinition) oldTypeInstance).getEastWestOffsetFromCartesianCenter());
		setter.set();
		newTypeInstance.setEastWestOffsetFromCartesianCenter(setter.getNewTypeInstance());
	}

	protected void setNorthSouthOffsetFromCartesianCenter() throws MigrationException {
		DistanceSetter setter = new DistanceSetter(edu.pitt.apollo.types.v4_0_1.Distance.class,((edu.pitt.apollo.types.v3_1_0.CartesianCircleLocationDefinition) oldTypeInstance).getNorthSouthOffsetFromCartesianCenter());
		setter.set();
		newTypeInstance.setNorthSouthOffsetFromCartesianCenter(setter.getNewTypeInstance());
	}

	protected void setAltitudeRelativeToCartesianCenter() throws MigrationException {
		DistanceSetter setter = new DistanceSetter(edu.pitt.apollo.types.v4_0_1.Distance.class,((edu.pitt.apollo.types.v3_1_0.CartesianCircleLocationDefinition) oldTypeInstance).getAltitudeRelativeToCartesianCenter());
		setter.set();
		newTypeInstance.setAltitudeRelativeToCartesianCenter(setter.getNewTypeInstance());
	}

	protected void setRadius() throws MigrationException {
		DistanceSetter setter = new DistanceSetter(edu.pitt.apollo.types.v4_0_1.Distance.class,((edu.pitt.apollo.types.v3_1_0.CartesianCircleLocationDefinition) oldTypeInstance).getRadius());
		setter.set();
		newTypeInstance.setRadius(setter.getNewTypeInstance());
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			setEastWestOffsetFromCartesianCenter();
			setNorthSouthOffsetFromCartesianCenter();
			setAltitudeRelativeToCartesianCenter();
			setRadius();
		}
	}

}