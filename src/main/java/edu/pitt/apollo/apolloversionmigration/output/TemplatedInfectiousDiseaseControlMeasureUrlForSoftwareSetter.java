package edu.pitt.apollo.apolloversionmigration.output;

public class TemplatedInfectiousDiseaseControlMeasureUrlForSoftwareSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0_1.TemplatedInfectiousDiseaseControlMeasureUrlForSoftware> {

	public TemplatedInfectiousDiseaseControlMeasureUrlForSoftwareSetter(Class<edu.pitt.apollo.types.v4_0_1.TemplatedInfectiousDiseaseControlMeasureUrlForSoftware> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setSoftwareIdentification() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.SoftwareIdentification oldObj : ((edu.pitt.apollo.types.v3_1_0.TemplatedInfectiousDiseaseControlMeasureUrlForSoftware) oldTypeInstance).getSoftwareIdentification()) {
			SoftwareIdentificationSetter setter = new SoftwareIdentificationSetter(edu.pitt.apollo.types.v4_0_1.SoftwareIdentification.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0_1.SoftwareIdentification newObj = setter.getNewTypeInstance();
			newTypeInstance.getSoftwareIdentification().add(newObj);
		}

	}

	protected void setControlMeasureTemplateUrl() throws MigrationException {
		newTypeInstance.setControlMeasureTemplateUrl(((edu.pitt.apollo.types.v3_1_0.TemplatedInfectiousDiseaseControlMeasureUrlForSoftware) oldTypeInstance).getControlMeasureTemplateUrl());
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			setSoftwareIdentification();
			setControlMeasureTemplateUrl();
		}
	}

}