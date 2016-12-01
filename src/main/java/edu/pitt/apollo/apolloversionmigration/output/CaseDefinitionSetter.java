package edu.pitt.apollo.apolloversionmigration.output;

public class CaseDefinitionSetter extends CategoryDefinitionSetter<edu.pitt.apollo.types.v4_0.CaseDefinition> {

	public CaseDefinitionSetter(Class<edu.pitt.apollo.types.v4_0.CaseDefinition> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setApolloLabel() throws MigrationException {
		newTypeInstance.setApolloLabel(edu.pitt.apollo.types.v4_0.CaseDefinitionEnum.valueOf(((edu.pitt.apollo.types.v3_1_0.CaseDefinition) oldTypeInstance).getApolloLabel().toString()));
	}

	protected void setInvestigationLabel() throws MigrationException {
		newTypeInstance.setInvestigationLabel(((edu.pitt.apollo.types.v3_1_0.CaseDefinition) oldTypeInstance).getInvestigationLabel());
	}

	protected void setInvestigationDefinition() throws MigrationException {
		newTypeInstance.setInvestigationDefinition(((edu.pitt.apollo.types.v3_1_0.CaseDefinition) oldTypeInstance).getInvestigationDefinition());
	}

	protected void setReferenceId() throws MigrationException {
		newTypeInstance.setReferenceId(((edu.pitt.apollo.types.v3_1_0.CaseDefinition) oldTypeInstance).getReferenceId());
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
			setApolloLabel();
			setInvestigationLabel();
			setInvestigationDefinition();
			setReferenceId();
		}
	}

}