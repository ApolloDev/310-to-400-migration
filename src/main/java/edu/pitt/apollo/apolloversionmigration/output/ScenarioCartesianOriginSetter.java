package edu.pitt.apollo.apolloversionmigration.output;

public class ScenarioCartesianOriginSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0_1.ScenarioCartesianOrigin> {

	public ScenarioCartesianOriginSetter(Class<edu.pitt.apollo.types.v4_0_1.ScenarioCartesianOrigin> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setCartesianReferenceLongitude() throws MigrationException {
		newTypeInstance.setCartesianReferenceLongitude(((edu.pitt.apollo.types.v3_1_0.ScenarioCartesianOrigin) oldTypeInstance).getCartesianReferenceLongitude());
	}

	protected void setCartesianReferenceLatitude() throws MigrationException {
		newTypeInstance.setCartesianReferenceLatitude(((edu.pitt.apollo.types.v3_1_0.ScenarioCartesianOrigin) oldTypeInstance).getCartesianReferenceLatitude());
	}

	protected void setCartesianReferenceAltitude() throws MigrationException {
		DistanceSetter setter = new DistanceSetter(edu.pitt.apollo.types.v4_0_1.Distance.class,((edu.pitt.apollo.types.v3_1_0.ScenarioCartesianOrigin) oldTypeInstance).getCartesianReferenceAltitude());
		setter.set();
		newTypeInstance.setCartesianReferenceAltitude(setter.getNewTypeInstance());
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			setCartesianReferenceLongitude();
			setCartesianReferenceLatitude();
			setCartesianReferenceAltitude();
		}
	}

}