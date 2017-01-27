package edu.pitt.apollo.apolloversionmigration.output;

public class EpidemicSetter extends ApolloIndexableItemSetter<edu.pitt.apollo.types.v4_0_1.Epidemic> {

	public EpidemicSetter(Class<edu.pitt.apollo.types.v4_0_1.Epidemic> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setCausalPathogens() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.ApolloPathogenCode oldObj : ((edu.pitt.apollo.types.v3_1_0.Epidemic) oldTypeInstance).getCausalPathogens()) {
			ApolloPathogenCodeSetter setter = new ApolloPathogenCodeSetter(edu.pitt.apollo.types.v4_0_1.ApolloPathogenCode.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0_1.ApolloPathogenCode newObj = setter.getNewTypeInstance();
			newTypeInstance.getCausalPathogens().add(newObj);
		}

	}

	protected void setEpidemicPeriod() throws MigrationException {
		EpidemicPeriodSetter setter = new EpidemicPeriodSetter(edu.pitt.apollo.types.v4_0_1.EpidemicPeriod.class,((edu.pitt.apollo.types.v3_1_0.Epidemic) oldTypeInstance).getEpidemicPeriod());
		setter.set();
		newTypeInstance.setEpidemicPeriod(setter.getNewTypeInstance());
	}

	protected void setAdministrativeLocations() throws MigrationException {
		for (java.lang.String oldObj : ((edu.pitt.apollo.types.v3_1_0.Epidemic) oldTypeInstance).getAdministrativeLocations()) {
			newTypeInstance.getAdministrativeLocations().add(oldObj);
		}

	}

	protected void setEpidemicZones() throws MigrationException {
		for (java.lang.String oldObj : ((edu.pitt.apollo.types.v3_1_0.Epidemic) oldTypeInstance).getEpidemicZones()) {
			newTypeInstance.getEpidemicZones().add(oldObj);
		}

	}

	protected void setInfections() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.Infection oldObj : ((edu.pitt.apollo.types.v3_1_0.Epidemic) oldTypeInstance).getInfections()) {
			InfectionSetter setter = InfectionSetterFactory.getSetter(oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0_1.Infection newObj = setter.getNewTypeInstance();
			newTypeInstance.getInfections().add(newObj);
		}

	}

	protected void setPreEpidemicCensus() throws MigrationException {
		PreEpidemicEcosystemCensusSetter setter = new PreEpidemicEcosystemCensusSetter(edu.pitt.apollo.types.v4_0_1.PreEpidemicEcosystemCensus.class,((edu.pitt.apollo.types.v3_1_0.Epidemic) oldTypeInstance).getPreEpidemicCensus());
		setter.set();
		newTypeInstance.setPreEpidemicCensus(setter.getNewTypeInstance());
	}

	protected void setPopulationSerologySurveys() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.PopulationSerologySurvey oldObj : ((edu.pitt.apollo.types.v3_1_0.Epidemic) oldTypeInstance).getPopulationSerologySurveys()) {
			PopulationSerologySurveySetter setter = new PopulationSerologySurveySetter(edu.pitt.apollo.types.v4_0_1.PopulationSerologySurvey.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0_1.PopulationSerologySurvey newObj = setter.getNewTypeInstance();
			newTypeInstance.getPopulationSerologySurveys().add(newObj);
		}

	}

	protected void setPopulationInfectionSurveys() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.PopulationInfectionSurvey oldObj : ((edu.pitt.apollo.types.v3_1_0.Epidemic) oldTypeInstance).getPopulationInfectionSurveys()) {
			PopulationInfectionSurveySetter setter = new PopulationInfectionSurveySetter(edu.pitt.apollo.types.v4_0_1.PopulationInfectionSurvey.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0_1.PopulationInfectionSurvey newObj = setter.getNewTypeInstance();
			newTypeInstance.getPopulationInfectionSurveys().add(newObj);
		}

	}

	protected void setInfectiousDiseaseControlStrategies() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.InfectiousDiseaseControlMeasure oldObj : ((edu.pitt.apollo.types.v3_1_0.Epidemic) oldTypeInstance).getInfectiousDiseaseControlStrategies()) {
			InfectiousDiseaseControlMeasureSetter setter = InfectiousDiseaseControlMeasureSetterFactory.getSetter(oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0_1.InfectiousDiseaseControlMeasure newObj = setter.getNewTypeInstance();
			newTypeInstance.getInfectiousDiseaseControlStrategies().add(newObj);
		}

	}

	protected void setCaseDefinitions() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.CaseDefinition oldObj : ((edu.pitt.apollo.types.v3_1_0.Epidemic) oldTypeInstance).getCaseDefinitions()) {
			CaseDefinitionSetter setter = new CaseDefinitionSetter(edu.pitt.apollo.types.v4_0_1.CaseDefinition.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0_1.CaseDefinition newObj = setter.getNewTypeInstance();
			newTypeInstance.getCaseDefinitions().add(newObj);
		}

	}

	protected void setContactDefinitions() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.ContactDefinition oldObj : ((edu.pitt.apollo.types.v3_1_0.Epidemic) oldTypeInstance).getContactDefinitions()) {
			ContactDefinitionSetter setter = new ContactDefinitionSetter(edu.pitt.apollo.types.v4_0_1.ContactDefinition.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0_1.ContactDefinition newObj = setter.getNewTypeInstance();
			newTypeInstance.getContactDefinitions().add(newObj);
		}

	}

	protected void setCaseLists() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.CaseList oldObj : ((edu.pitt.apollo.types.v3_1_0.Epidemic) oldTypeInstance).getCaseLists()) {
			CaseListSetter setter = new CaseListSetter(edu.pitt.apollo.types.v4_0_1.CaseList.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0_1.CaseList newObj = setter.getNewTypeInstance();
			newTypeInstance.getCaseLists().add(newObj);
		}

	}

	protected void setEpidemicCaseCounts() throws MigrationException {
			EpidemicCaseCountsSetter setter = new EpidemicCaseCountsSetter(edu.pitt.apollo.types.v4_0_1.EpidemicCaseCounts.class,((edu.pitt.apollo.types.v3_1_0.Epidemic) oldTypeInstance).getEpidemicCaseCounts());
			setter.set();
			edu.pitt.apollo.types.v4_0_1.EpidemicCaseCounts newObj = setter.getNewTypeInstance();
			newTypeInstance.getEpidemicCaseCounts().add(newObj);

	}

	protected void setTransmissionTrees() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.TransmissionTree oldObj : ((edu.pitt.apollo.types.v3_1_0.Epidemic) oldTypeInstance).getTransmissionTrees()) {
			TransmissionTreeSetter setter = new TransmissionTreeSetter(edu.pitt.apollo.types.v4_0_1.TransmissionTree.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0_1.TransmissionTree newObj = setter.getNewTypeInstance();
			newTypeInstance.getTransmissionTrees().add(newObj);
		}

	}

	protected void setRelativeRiskDataSets() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.RelativeRiskDataSet oldObj : ((edu.pitt.apollo.types.v3_1_0.Epidemic) oldTypeInstance).getRelativeRiskDataSets()) {
			RelativeRiskDataSetSetter setter = new RelativeRiskDataSetSetter(edu.pitt.apollo.types.v4_0_1.RelativeRiskDataSet.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0_1.RelativeRiskDataSet newObj = setter.getNewTypeInstance();
			newTypeInstance.getRelativeRiskDataSets().add(newObj);
		}

	}

	protected void setCausalPathogenIsolates() throws MigrationException {
		for (java.lang.String oldObj : ((edu.pitt.apollo.types.v3_1_0.Epidemic) oldTypeInstance).getCausalPathogenIsolates()) {
			newTypeInstance.getCausalPathogenIsolates().add(oldObj);
		}

	}

	protected void setReferences() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.Reference oldObj : ((edu.pitt.apollo.types.v3_1_0.Epidemic) oldTypeInstance).getReferences()) {
			ReferenceSetter setter = new ReferenceSetter(edu.pitt.apollo.types.v4_0_1.Reference.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0_1.Reference newObj = setter.getNewTypeInstance();
			newTypeInstance.getReferences().add(newObj);
		}

	}

	protected void setCurator() throws MigrationException {
		newTypeInstance.setCurator(((edu.pitt.apollo.types.v3_1_0.Epidemic) oldTypeInstance).getCurator());
	}

	protected void setEditHistory() throws MigrationException {
		for (java.lang.String oldObj : ((edu.pitt.apollo.types.v3_1_0.Epidemic) oldTypeInstance).getEditHistory()) {
			newTypeInstance.getEditHistory().add(oldObj);
		}

	}

	protected void setReviewedBy() throws MigrationException {
		for (java.lang.String oldObj : ((edu.pitt.apollo.types.v3_1_0.Epidemic) oldTypeInstance).getReviewedBy()) {
			newTypeInstance.getReviewedBy().add(oldObj);
		}

	}

	protected void setAcknowledgements() throws MigrationException {
		for (java.lang.String oldObj : ((edu.pitt.apollo.types.v3_1_0.Epidemic) oldTypeInstance).getAcknowledgements()) {
			newTypeInstance.getAcknowledgements().add(oldObj);
		}

	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
			setCausalPathogens();
			setEpidemicPeriod();
			setAdministrativeLocations();
			setEpidemicZones();
			setInfections();
			setPreEpidemicCensus();
			setPopulationSerologySurveys();
			setPopulationInfectionSurveys();
			setInfectiousDiseaseControlStrategies();
			setCaseDefinitions();
			setContactDefinitions();
			setCaseLists();
			setEpidemicCaseCounts();
			setTransmissionTrees();
			setRelativeRiskDataSets();
			setCausalPathogenIsolates();
			setReferences();
			setCurator();
			setEditHistory();
			setReviewedBy();
			setAcknowledgements();
		}
	}

}