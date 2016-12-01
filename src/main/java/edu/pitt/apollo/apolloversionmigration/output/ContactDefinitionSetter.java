package edu.pitt.apollo.apolloversionmigration.output;

public class ContactDefinitionSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.ContactDefinition> {

	public ContactDefinitionSetter(Class<edu.pitt.apollo.types.v4_0.ContactDefinition> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setApolloLabel() throws MigrationException {
		newTypeInstance.setApolloLabel(edu.pitt.apollo.types.v4_0.ContactDefinitionEnum.valueOf(((edu.pitt.apollo.types.v3_1_0.ContactDefinition) oldTypeInstance).getApolloLabel().toString()));
	}

	protected void setInvestigationLabel() throws MigrationException {
		newTypeInstance.setInvestigationLabel(((edu.pitt.apollo.types.v3_1_0.ContactDefinition) oldTypeInstance).getInvestigationLabel());
	}

	protected void setInvestigationDefinition() throws MigrationException {
		newTypeInstance.setInvestigationDefinition(((edu.pitt.apollo.types.v3_1_0.ContactDefinition) oldTypeInstance).getInvestigationDefinition());
	}

	protected void setReferenceId() throws MigrationException {
		newTypeInstance.setReferenceId(((edu.pitt.apollo.types.v3_1_0.ContactDefinition) oldTypeInstance).getReferenceId());
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			setApolloLabel();
			setInvestigationLabel();
			setInvestigationDefinition();
			setReferenceId();
		}
	}

}