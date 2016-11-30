package edu.pitt.apollo.apolloversionmigration.output;

public class NamedMultiGeometrySetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.NamedMultiGeometry,edu.pitt.apollo.types.v3_1_0.NamedMultiGeometry> {

	public NamedMultiGeometrySetter(Class<edu.pitt.apollo.types.v4_0.NamedMultiGeometry> newTypeClass, edu.pitt.apollo.types.v3_1_0.NamedMultiGeometry oldTypeInstance) throws MigrationException {
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

	private void setApolloLocationCode() throws MigrationException {
		newTypeInstance.setApolloLocationCode(oldTypeInstance.getApolloLocationCode());
	}

	private void setTextualDescription() throws MigrationException {
		newTypeInstance.setTextualDescription(oldTypeInstance.getTextualDescription());
	}

	@Override
	public void set() throws MigrationException {
		setPolygons();
		setApolloLocationCode();
		setTextualDescription();
	}

}