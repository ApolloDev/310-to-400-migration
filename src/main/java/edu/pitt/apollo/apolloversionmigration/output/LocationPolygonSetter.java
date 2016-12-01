package edu.pitt.apollo.apolloversionmigration.output;

public class LocationPolygonSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.LocationPolygon> {

	public LocationPolygonSetter(Class<edu.pitt.apollo.types.v4_0.LocationPolygon> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setLinearRing() throws MigrationException {
		newTypeInstance.setLinearRing(((edu.pitt.apollo.types.v3_1_0.LocationPolygon) oldTypeInstance).getLinearRing());
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			setLinearRing();
		}
	}

}