package edu.pitt.apollo.apolloversionmigration.output;

public class SoftwareIdentificationSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.SoftwareIdentification,edu.pitt.apollo.types.v3_1_0.SoftwareIdentification> {

	public SoftwareIdentificationSetter(Class<edu.pitt.apollo.types.v4_0.SoftwareIdentification> newTypeClass, edu.pitt.apollo.types.v3_1_0.SoftwareIdentification oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setSoftwareDeveloper() throws MigrationException {
		newTypeInstance.setSoftwareDeveloper(oldTypeInstance.getSoftwareDeveloper());
	}

	private void setSoftwareName() throws MigrationException {
		newTypeInstance.setSoftwareName(oldTypeInstance.getSoftwareName());
	}

	private void setSoftwareVersion() throws MigrationException {
		newTypeInstance.setSoftwareVersion(oldTypeInstance.getSoftwareVersion());
	}

	private void setSoftwareType() throws MigrationException {
		newTypeInstance.setSoftwareType(edu.pitt.apollo.types.v4_0.ApolloSoftwareTypeEnum.fromValue(oldTypeInstance.getSoftwareType().toString()));
	}

	private void setSoftwareLicenseIdentification() throws MigrationException {
		SoftwareLicenseIdentificationSetter setter = new SoftwareLicenseIdentificationSetter(edu.pitt.apollo.types.v4_0.SoftwareLicenseIdentification.class,oldTypeInstance.getSoftwareLicenseIdentification());
		setter.set();
		newTypeInstance.setSoftwareLicenseIdentification(setter.getNewTypeInstance());
	}

	private void setCustomIdentifier() throws MigrationException {
		newTypeInstance.setCustomIdentifier(oldTypeInstance.getCustomIdentifier());
	}

	@Override
	public void set() throws MigrationException {
		setSoftwareDeveloper();
		setSoftwareName();
		setSoftwareVersion();
		setSoftwareType();
		setSoftwareLicenseIdentification();
		setCustomIdentifier();
	}

}