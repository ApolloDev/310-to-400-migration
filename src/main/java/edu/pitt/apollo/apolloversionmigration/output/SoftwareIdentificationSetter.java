package edu.pitt.apollo.apolloversionmigration.output;

public class SoftwareIdentificationSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.SoftwareIdentification> {

	public SoftwareIdentificationSetter(Class<edu.pitt.apollo.types.v4_0.SoftwareIdentification> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setSoftwareDeveloper() throws MigrationException {
		newTypeInstance.setSoftwareDeveloper(((edu.pitt.apollo.types.v3_1_0.SoftwareIdentification) oldTypeInstance).getSoftwareDeveloper());
	}

	protected void setSoftwareName() throws MigrationException {
		newTypeInstance.setSoftwareName(((edu.pitt.apollo.types.v3_1_0.SoftwareIdentification) oldTypeInstance).getSoftwareName());
	}

	protected void setSoftwareVersion() throws MigrationException {
		newTypeInstance.setSoftwareVersion(((edu.pitt.apollo.types.v3_1_0.SoftwareIdentification) oldTypeInstance).getSoftwareVersion());
	}

	protected void setSoftwareType() throws MigrationException {
		newTypeInstance.setSoftwareType(edu.pitt.apollo.types.v4_0.ApolloSoftwareTypeEnum.valueOf(((edu.pitt.apollo.types.v3_1_0.SoftwareIdentification) oldTypeInstance).getSoftwareType().toString()));
	}

	protected void setSoftwareLicenseIdentification() throws MigrationException {
		SoftwareLicenseIdentificationSetter setter = new SoftwareLicenseIdentificationSetter(edu.pitt.apollo.types.v4_0.SoftwareLicenseIdentification.class,((edu.pitt.apollo.types.v3_1_0.SoftwareIdentification) oldTypeInstance).getSoftwareLicenseIdentification());
		setter.set();
		newTypeInstance.setSoftwareLicenseIdentification(setter.getNewTypeInstance());
	}

	protected void setCustomIdentifier() throws MigrationException {
		newTypeInstance.setCustomIdentifier(((edu.pitt.apollo.types.v3_1_0.SoftwareIdentification) oldTypeInstance).getCustomIdentifier());
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			setSoftwareDeveloper();
			setSoftwareName();
			setSoftwareVersion();
			setSoftwareType();
			setSoftwareLicenseIdentification();
			setCustomIdentifier();
		}
	}

}