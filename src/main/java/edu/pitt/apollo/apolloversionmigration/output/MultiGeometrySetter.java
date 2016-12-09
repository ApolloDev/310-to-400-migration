package edu.pitt.apollo.apolloversionmigration.output;

public class MultiGeometrySetter extends AbstractSetter<edu.pitt.apollo.types.v4_0_1.MultiGeometry> {

	public MultiGeometrySetter(Class<edu.pitt.apollo.types.v4_0_1.MultiGeometry> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setPolygons() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.LocationPolygon oldObj : ((edu.pitt.apollo.types.v3_1_0.MultiGeometry) oldTypeInstance).getPolygons()) {
			LocationPolygonSetter setter = new LocationPolygonSetter(edu.pitt.apollo.types.v4_0_1.LocationPolygon.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0_1.LocationPolygon newObj = setter.getNewTypeInstance();
			newTypeInstance.getPolygons().add(newObj);
		}

	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			setPolygons();
		}
	}

}