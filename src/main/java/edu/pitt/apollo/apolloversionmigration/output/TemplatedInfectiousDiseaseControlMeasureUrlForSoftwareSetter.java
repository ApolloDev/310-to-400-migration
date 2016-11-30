package edu.pitt.apollo.apolloversionmigration.output;

public class TemplatedInfectiousDiseaseControlMeasureUrlForSoftwareSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.TemplatedInfectiousDiseaseControlMeasureUrlForSoftware,edu.pitt.apollo.types.v3_1_0.TemplatedInfectiousDiseaseControlMeasureUrlForSoftware> {

	public TemplatedInfectiousDiseaseControlMeasureUrlForSoftwareSetter(Class<edu.pitt.apollo.types.v4_0.TemplatedInfectiousDiseaseControlMeasureUrlForSoftware> newTypeClass, edu.pitt.apollo.types.v3_1_0.TemplatedInfectiousDiseaseControlMeasureUrlForSoftware oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setSoftwareIdentification() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.SoftwareIdentification oldObj : oldTypeInstance.getSoftwareIdentification()) {
			SoftwareIdentificationSetter setter = new SoftwareIdentificationSetter(edu.pitt.apollo.types.v4_0.SoftwareIdentification.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.SoftwareIdentification newObj = setter.getNewTypeInstance();
			newTypeInstance.getSoftwareIdentification().add(newObj);
		}

	}

	private void setControlMeasureTemplateUrl() throws MigrationException {
		newTypeInstance.setControlMeasureTemplateUrl(oldTypeInstance.getControlMeasureTemplateUrl());
	}

	@Override
	public void set() throws MigrationException {
		setSoftwareIdentification();
		setControlMeasureTemplateUrl();
	}

}