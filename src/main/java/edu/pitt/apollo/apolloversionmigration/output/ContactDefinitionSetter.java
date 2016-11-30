package edu.pitt.apollo.apolloversionmigration.output;

public class ContactDefinitionSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.ContactDefinition,edu.pitt.apollo.types.v3_1_0.ContactDefinition> {

	public ContactDefinitionSetter(Class<edu.pitt.apollo.types.v4_0.ContactDefinition> newTypeClass, edu.pitt.apollo.types.v3_1_0.ContactDefinition oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setApolloLabel() throws MigrationException {
		newTypeInstance.setApolloLabel(edu.pitt.apollo.types.v4_0.ContactDefinitionEnum.fromValue(oldTypeInstance.getApolloLabel().toString()));
	}

	private void setInvestigationLabel() throws MigrationException {
		newTypeInstance.setInvestigationLabel(oldTypeInstance.getInvestigationLabel());
	}

	private void setInvestigationDefinition() throws MigrationException {
		newTypeInstance.setInvestigationDefinition(oldTypeInstance.getInvestigationDefinition());
	}

	private void setReferenceId() throws MigrationException {
		newTypeInstance.setReferenceId(oldTypeInstance.getReferenceId());
	}

	@Override
	public void set() throws MigrationException {
		setApolloLabel();
		setInvestigationLabel();
		setInvestigationDefinition();
		setReferenceId();
	}

}