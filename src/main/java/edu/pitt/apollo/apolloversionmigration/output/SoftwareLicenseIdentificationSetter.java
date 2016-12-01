package edu.pitt.apollo.apolloversionmigration.output;

public class SoftwareLicenseIdentificationSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.SoftwareLicenseIdentification> {

	public SoftwareLicenseIdentificationSetter(Class<edu.pitt.apollo.types.v4_0.SoftwareLicenseIdentification> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setLicenseLocation() throws MigrationException {
		newTypeInstance.setLicenseLocation(((edu.pitt.apollo.types.v3_1_0.SoftwareLicenseIdentification) oldTypeInstance).getLicenseLocation());
	}

	protected void setLicenseVersion() throws MigrationException {
		newTypeInstance.setLicenseVersion(((edu.pitt.apollo.types.v3_1_0.SoftwareLicenseIdentification) oldTypeInstance).getLicenseVersion());
	}

	protected void setLicenseName() throws MigrationException {
		newTypeInstance.setLicenseName(((edu.pitt.apollo.types.v3_1_0.SoftwareLicenseIdentification) oldTypeInstance).getLicenseName());
	}

	protected void setAttributionNotice() throws MigrationException {
		newTypeInstance.setAttributionNotice(((edu.pitt.apollo.types.v3_1_0.SoftwareLicenseIdentification) oldTypeInstance).getAttributionNotice());
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			setLicenseLocation();
			setLicenseVersion();
			setLicenseName();
			setAttributionNotice();
		}
	}

}