package edu.pitt.apollo.apolloversionmigration.output;

public class TransmissionProbabilitySetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.TransmissionProbability> {

	public TransmissionProbabilitySetter(Class<edu.pitt.apollo.types.v4_0.TransmissionProbability> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setContactDefinition() throws MigrationException {
		newTypeInstance.setContactDefinition(edu.pitt.apollo.types.v4_0.ContactDefinitionEnum.valueOf(((edu.pitt.apollo.types.v3_1_0.TransmissionProbability) oldTypeInstance).getContactDefinition().toString()));
	}

	protected void setContactDefinitionText() throws MigrationException {
		newTypeInstance.setContactDefinitionText(((edu.pitt.apollo.types.v3_1_0.TransmissionProbability) oldTypeInstance).getContactDefinitionText());
	}

	protected void setProbability() throws MigrationException {
		newTypeInstance.setProbability(((edu.pitt.apollo.types.v3_1_0.TransmissionProbability) oldTypeInstance).getProbability());
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			setContactDefinition();
			setContactDefinitionText();
			setProbability();
		}
	}

}