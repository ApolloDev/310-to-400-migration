package edu.pitt.apollo.apolloversionmigration.output;

public class LocationDefinitionSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.LocationDefinition,edu.pitt.apollo.types.v3_1_0.LocationDefinition> {

	public LocationDefinitionSetter(Class<edu.pitt.apollo.types.v4_0.LocationDefinition> newTypeClass, edu.pitt.apollo.types.v3_1_0.LocationDefinition oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setLocationsIncluded() throws MigrationException {
		for (java.lang.String oldObj : oldTypeInstance.getLocationsIncluded()) {
			newTypeInstance.getLocationsIncluded().add(oldObj);
		}

	}

	private void setLocationsExcluded() throws MigrationException {
		for (java.lang.String oldObj : oldTypeInstance.getLocationsExcluded()) {
			newTypeInstance.getLocationsExcluded().add(oldObj);
		}

	}

	private void setMultiGeometries() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.MultiGeometry oldObj : oldTypeInstance.getMultiGeometries()) {
			MultiGeometrySetter setter = new MultiGeometrySetter(edu.pitt.apollo.types.v4_0.MultiGeometry.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.MultiGeometry newObj = setter.getNewTypeInstance();
			newTypeInstance.getMultiGeometries().add(newObj);
		}

	}

	@Override
	public void set() throws MigrationException {
		setLocationsIncluded();
		setLocationsExcluded();
		setMultiGeometries();
	}

}