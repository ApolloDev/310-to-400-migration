package edu.pitt.apollo.apolloversionmigration.output;

public class SoftwareLicenseIdentificationSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.SoftwareLicenseIdentification,edu.pitt.apollo.types.v3_1_0.SoftwareLicenseIdentification> {

	public SoftwareLicenseIdentificationSetter(Class<edu.pitt.apollo.types.v4_0.SoftwareLicenseIdentification> newTypeClass, edu.pitt.apollo.types.v3_1_0.SoftwareLicenseIdentification oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setLicenseLocation() throws MigrationException {
		newTypeInstance.setLicenseLocation(oldTypeInstance.getLicenseLocation());
	}

	private void setLicenseVersion() throws MigrationException {
		newTypeInstance.setLicenseVersion(oldTypeInstance.getLicenseVersion());
	}

	private void setLicenseName() throws MigrationException {
		newTypeInstance.setLicenseName(oldTypeInstance.getLicenseName());
	}

	private void setAttributionNotice() throws MigrationException {
		newTypeInstance.setAttributionNotice(oldTypeInstance.getAttributionNotice());
	}

	@Override
	public void set() throws MigrationException {
		setLicenseLocation();
		setLicenseVersion();
		setLicenseName();
		setAttributionNotice();
	}

}