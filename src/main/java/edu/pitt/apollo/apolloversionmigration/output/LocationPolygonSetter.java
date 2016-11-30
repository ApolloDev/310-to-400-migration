package edu.pitt.apollo.apolloversionmigration.output;

public class LocationPolygonSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.LocationPolygon,edu.pitt.apollo.types.v3_1_0.LocationPolygon> {

	public LocationPolygonSetter(Class<edu.pitt.apollo.types.v4_0.LocationPolygon> newTypeClass, edu.pitt.apollo.types.v3_1_0.LocationPolygon oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setLinearRing() throws MigrationException {
		newTypeInstance.setLinearRing(oldTypeInstance.getLinearRing());
	}

	@Override
	public void set() throws MigrationException {
		setLinearRing();
	}

}