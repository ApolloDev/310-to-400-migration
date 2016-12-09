package edu.pitt.apollo.apolloversionmigration.output;

public class NamedMultiGeometrySetter extends AbstractSetter<edu.pitt.apollo.types.v4_0_1.NamedMultiGeometry> {

	public NamedMultiGeometrySetter(Class<edu.pitt.apollo.types.v4_0_1.NamedMultiGeometry> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setPolygons() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.LocationPolygon oldObj : ((edu.pitt.apollo.types.v3_1_0.NamedMultiGeometry) oldTypeInstance).getPolygons()) {
			LocationPolygonSetter setter = new LocationPolygonSetter(edu.pitt.apollo.types.v4_0_1.LocationPolygon.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0_1.LocationPolygon newObj = setter.getNewTypeInstance();
			newTypeInstance.getPolygons().add(newObj);
		}

	}

	protected void setApolloLocationCode() throws MigrationException {
		newTypeInstance.setApolloLocationCode(((edu.pitt.apollo.types.v3_1_0.NamedMultiGeometry) oldTypeInstance).getApolloLocationCode());
	}

	protected void setTextualDescription() throws MigrationException {
		newTypeInstance.setTextualDescription(((edu.pitt.apollo.types.v3_1_0.NamedMultiGeometry) oldTypeInstance).getTextualDescription());
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			setPolygons();
			setApolloLocationCode();
			setTextualDescription();
		}
	}

}