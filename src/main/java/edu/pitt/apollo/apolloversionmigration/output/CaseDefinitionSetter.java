package edu.pitt.apollo.apolloversionmigration.output;

public class CaseDefinitionSetter extends CategoryDefinitionSetter<edu.pitt.apollo.types.v4_0.CaseDefinition,edu.pitt.apollo.types.v3_1_0.CaseDefinition> {

	public CaseDefinitionSetter(Class<edu.pitt.apollo.types.v4_0.CaseDefinition> newTypeClass, edu.pitt.apollo.types.v3_1_0.CaseDefinition oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setApolloLabel() throws MigrationException {
		newTypeInstance.setApolloLabel(edu.pitt.apollo.types.v4_0.CaseDefinitionEnum.fromValue(oldTypeInstance.getApolloLabel().toString()));
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
		super.set();
		setApolloLabel();
		setInvestigationLabel();
		setInvestigationDefinition();
		setReferenceId();
	}

}