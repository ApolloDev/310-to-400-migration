package edu.pitt.apollo.apolloversionmigration.output;

public class ScenarioCartesianOriginSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.ScenarioCartesianOrigin,edu.pitt.apollo.types.v3_1_0.ScenarioCartesianOrigin> {

	public ScenarioCartesianOriginSetter(Class<edu.pitt.apollo.types.v4_0.ScenarioCartesianOrigin> newTypeClass, edu.pitt.apollo.types.v3_1_0.ScenarioCartesianOrigin oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setCartesianReferenceLongitude() throws MigrationException {
		newTypeInstance.setCartesianReferenceLongitude(oldTypeInstance.getCartesianReferenceLongitude());
	}

	private void setCartesianReferenceLatitude() throws MigrationException {
		newTypeInstance.setCartesianReferenceLatitude(oldTypeInstance.getCartesianReferenceLatitude());
	}

	private void setCartesianReferenceAltitude() throws MigrationException {
		DistanceSetter setter = new DistanceSetter(edu.pitt.apollo.types.v4_0.Distance.class,oldTypeInstance.getCartesianReferenceAltitude());
		setter.set();
		newTypeInstance.setCartesianReferenceAltitude(setter.getNewTypeInstance());
	}

	@Override
	public void set() throws MigrationException {
		setCartesianReferenceLongitude();
		setCartesianReferenceLatitude();
		setCartesianReferenceAltitude();
	}

}