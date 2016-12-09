package edu.pitt.apollo.apolloversionmigration.output;

public class LocationDefinitionSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0_1.LocationDefinition> {

	public LocationDefinitionSetter(Class<edu.pitt.apollo.types.v4_0_1.LocationDefinition> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setLocationsIncluded() throws MigrationException {
		for (java.lang.String oldObj : ((edu.pitt.apollo.types.v3_1_0.LocationDefinition) oldTypeInstance).getLocationsIncluded()) {
			newTypeInstance.getLocationsIncluded().add(oldObj);
		}

	}

	protected void setLocationsExcluded() throws MigrationException {
		for (java.lang.String oldObj : ((edu.pitt.apollo.types.v3_1_0.LocationDefinition) oldTypeInstance).getLocationsExcluded()) {
			newTypeInstance.getLocationsExcluded().add(oldObj);
		}

	}

	protected void setMultiGeometries() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.MultiGeometry oldObj : ((edu.pitt.apollo.types.v3_1_0.LocationDefinition) oldTypeInstance).getMultiGeometries()) {
			MultiGeometrySetter setter = new MultiGeometrySetter(edu.pitt.apollo.types.v4_0_1.MultiGeometry.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0_1.MultiGeometry newObj = setter.getNewTypeInstance();
			newTypeInstance.getMultiGeometries().add(newObj);
		}

	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			setLocationsIncluded();
			setLocationsExcluded();
			setMultiGeometries();
		}
	}

}