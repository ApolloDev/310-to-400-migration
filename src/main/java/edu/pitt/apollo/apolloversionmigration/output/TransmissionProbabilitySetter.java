package edu.pitt.apollo.apolloversionmigration.output;

public class TransmissionProbabilitySetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.TransmissionProbability,edu.pitt.apollo.types.v3_1_0.TransmissionProbability> {

	public TransmissionProbabilitySetter(Class<edu.pitt.apollo.types.v4_0.TransmissionProbability> newTypeClass, edu.pitt.apollo.types.v3_1_0.TransmissionProbability oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setContactDefinition() throws MigrationException {
		newTypeInstance.setContactDefinition(edu.pitt.apollo.types.v4_0.ContactDefinitionEnum.fromValue(oldTypeInstance.getContactDefinition().toString()));
	}

	private void setContactDefinitionText() throws MigrationException {
		newTypeInstance.setContactDefinitionText(oldTypeInstance.getContactDefinitionText());
	}

	private void setProbability() throws MigrationException {
		newTypeInstance.setProbability(oldTypeInstance.getProbability());
	}

	@Override
	public void set() throws MigrationException {
		setContactDefinition();
		setContactDefinitionText();
		setProbability();
	}

}