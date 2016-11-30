package edu.pitt.apollo.apolloversionmigration.output;

public class CartesianCircleLocationDefinitionSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.CartesianCircleLocationDefinition,edu.pitt.apollo.types.v3_1_0.CartesianCircleLocationDefinition> {

	public CartesianCircleLocationDefinitionSetter(Class<edu.pitt.apollo.types.v4_0.CartesianCircleLocationDefinition> newTypeClass, edu.pitt.apollo.types.v3_1_0.CartesianCircleLocationDefinition oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setEastWestOffsetFromCartesianCenter() throws MigrationException {
		DistanceSetter setter = new DistanceSetter(edu.pitt.apollo.types.v4_0.Distance.class,oldTypeInstance.getEastWestOffsetFromCartesianCenter());
		setter.set();
		newTypeInstance.setEastWestOffsetFromCartesianCenter(setter.getNewTypeInstance());
	}

	private void setNorthSouthOffsetFromCartesianCenter() throws MigrationException {
		DistanceSetter setter = new DistanceSetter(edu.pitt.apollo.types.v4_0.Distance.class,oldTypeInstance.getNorthSouthOffsetFromCartesianCenter());
		setter.set();
		newTypeInstance.setNorthSouthOffsetFromCartesianCenter(setter.getNewTypeInstance());
	}

	private void setAltitudeRelativeToCartesianCenter() throws MigrationException {
		DistanceSetter setter = new DistanceSetter(edu.pitt.apollo.types.v4_0.Distance.class,oldTypeInstance.getAltitudeRelativeToCartesianCenter());
		setter.set();
		newTypeInstance.setAltitudeRelativeToCartesianCenter(setter.getNewTypeInstance());
	}

	private void setRadius() throws MigrationException {
		DistanceSetter setter = new DistanceSetter(edu.pitt.apollo.types.v4_0.Distance.class,oldTypeInstance.getRadius());
		setter.set();
		newTypeInstance.setRadius(setter.getNewTypeInstance());
	}

	@Override
	public void set() throws MigrationException {
		setEastWestOffsetFromCartesianCenter();
		setNorthSouthOffsetFromCartesianCenter();
		setAltitudeRelativeToCartesianCenter();
		setRadius();
	}

}