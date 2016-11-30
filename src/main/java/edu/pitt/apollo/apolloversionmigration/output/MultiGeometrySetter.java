package edu.pitt.apollo.apolloversionmigration.output;

public class MultiGeometrySetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.MultiGeometry,edu.pitt.apollo.types.v3_1_0.MultiGeometry> {

	public MultiGeometrySetter(Class<edu.pitt.apollo.types.v4_0.MultiGeometry> newTypeClass, edu.pitt.apollo.types.v3_1_0.MultiGeometry oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setPolygons() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.LocationPolygon oldObj : oldTypeInstance.getPolygons()) {
			LocationPolygonSetter setter = new LocationPolygonSetter(edu.pitt.apollo.types.v4_0.LocationPolygon.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.LocationPolygon newObj = setter.getNewTypeInstance();
			newTypeInstance.getPolygons().add(newObj);
		}

	}

	@Override
	public void set() throws MigrationException {
		setPolygons();
	}

}