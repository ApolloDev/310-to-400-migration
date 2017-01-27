package edu.pitt.apollo.apolloversionmigration.output;

public class CaseSeriesSetter extends ApolloIndexableItemSetter<edu.pitt.apollo.types.v4_0_1.CaseSeries> {

	public CaseSeriesSetter(Class<edu.pitt.apollo.types.v4_0_1.CaseSeries> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setSpeciesOfCases() throws MigrationException {
		newTypeInstance.setSpeciesOfCases(((edu.pitt.apollo.types.v3_1_0.CaseSeries) oldTypeInstance).getSpeciesOfCases());
	}

	protected void setCaseSeriesDescription() throws MigrationException {
		newTypeInstance.setCaseSeriesDescription(((edu.pitt.apollo.types.v3_1_0.CaseSeries) oldTypeInstance).getCaseSeriesDescription());
	}

	protected void setCaseRecords() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.CaseRecord oldObj : ((edu.pitt.apollo.types.v3_1_0.CaseSeries) oldTypeInstance).getCaseRecords()) {
			CaseRecordSetter setter = new CaseRecordSetter(edu.pitt.apollo.types.v4_0_1.CaseRecord.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0_1.CaseRecord newObj = setter.getNewTypeInstance();
			newTypeInstance.getCaseRecords().add(newObj);
		}

	}

	protected void setCaseDefinitions() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.CaseDefinition oldObj : ((edu.pitt.apollo.types.v3_1_0.CaseSeries) oldTypeInstance).getCaseDefinitions()) {
			CaseDefinitionSetter setter = new CaseDefinitionSetter(edu.pitt.apollo.types.v4_0_1.CaseDefinition.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0_1.CaseDefinition newObj = setter.getNewTypeInstance();
			newTypeInstance.getCaseDefinitions().add(newObj);
		}

	}

	protected void setCaseSeriesStartDate() throws MigrationException {
		newTypeInstance.setCaseSeriesStartDate(((edu.pitt.apollo.types.v3_1_0.CaseSeries) oldTypeInstance).getCaseSeriesStartDate());
	}

	protected void setCaseSeriesEndDate() throws MigrationException {
		newTypeInstance.setCaseSeriesEndDate(((edu.pitt.apollo.types.v3_1_0.CaseSeries) oldTypeInstance).getCaseSeriesEndDate());
	}

	protected void setLocation() throws MigrationException {
		newTypeInstance.setLocation(((edu.pitt.apollo.types.v3_1_0.CaseSeries) oldTypeInstance).getLocation());
	}

	protected void setCausalPathogen() throws MigrationException {
		ApolloPathogenCodeSetter setter = new ApolloPathogenCodeSetter(edu.pitt.apollo.types.v4_0_1.ApolloPathogenCode.class,((edu.pitt.apollo.types.v3_1_0.CaseSeries) oldTypeInstance).getCausalPathogen());
		setter.set();
		newTypeInstance.setCausalPathogen(setter.getNewTypeInstance());
	}

	protected void setCurator() throws MigrationException {
		newTypeInstance.setCurator(((edu.pitt.apollo.types.v3_1_0.CaseSeries) oldTypeInstance).getCurator());
	}

	protected void setEditHistory() throws MigrationException {
		for (java.lang.String oldObj : ((edu.pitt.apollo.types.v3_1_0.CaseSeries) oldTypeInstance).getEditHistory()) {
			newTypeInstance.getEditHistory().add(oldObj);
		}

	}

	protected void setReviewedBy() throws MigrationException {
		for (java.lang.String oldObj : ((edu.pitt.apollo.types.v3_1_0.CaseSeries) oldTypeInstance).getReviewedBy()) {
			newTypeInstance.getReviewedBy().add(oldObj);
		}

	}

	protected void setAcknowledgements() throws MigrationException {
		for (java.lang.String oldObj : ((edu.pitt.apollo.types.v3_1_0.CaseSeries) oldTypeInstance).getAcknowledgements()) {
			newTypeInstance.getAcknowledgements().add(oldObj);
		}

	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
			setSpeciesOfCases();
			setCaseSeriesDescription();
			setCaseRecords();
			setCaseDefinitions();
			setCaseSeriesStartDate();
			setCaseSeriesEndDate();
			setLocation();
			setCausalPathogen();
			setCurator();
			setEditHistory();
			setReviewedBy();
			setAcknowledgements();
		}
	}

}