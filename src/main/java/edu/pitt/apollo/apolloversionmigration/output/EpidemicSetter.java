package edu.pitt.apollo.apolloversionmigration.output;

import edu.pitt.apollo.types.v4_0.Epidemic;

public class EpidemicSetter extends ApolloIndexableItemSetter<Epidemic,edu.pitt.apollo.types.v3_1_0.Epidemic> {

	public EpidemicSetter(Class<edu.pitt.apollo.types.v4_0.Epidemic> newTypeClass, edu.pitt.apollo.types.v3_1_0.Epidemic oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setCausalPathogens() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.ApolloPathogenCode oldObj : oldTypeInstance.getCausalPathogens()) {
			ApolloPathogenCodeSetter setter = new ApolloPathogenCodeSetter(edu.pitt.apollo.types.v4_0.ApolloPathogenCode.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.ApolloPathogenCode newObj = setter.getNewTypeInstance();
			newTypeInstance.getCausalPathogens().add(newObj);
		}

	}

	private void setEpidemicPeriod() throws MigrationException {
		EpidemicPeriodSetter setter = new EpidemicPeriodSetter(edu.pitt.apollo.types.v4_0.EpidemicPeriod.class,oldTypeInstance.getEpidemicPeriod());
		setter.set();
		newTypeInstance.setEpidemicPeriod(setter.getNewTypeInstance());
	}

	private void setAdministrativeLocations() throws MigrationException {
		for (String oldObj : oldTypeInstance.getAdministrativeLocations()) {
			newTypeInstance.getAdministrativeLocations().add(oldObj);
		}

	}

	private void setEpidemicZones() throws MigrationException {
		for (String oldObj : oldTypeInstance.getEpidemicZones()) {
			newTypeInstance.getEpidemicZones().add(oldObj);
		}

	}

	private void setInfections() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.Infection oldObj : oldTypeInstance.getInfections()) {
			InfectionSetter setter = new InfectionSetter(edu.pitt.apollo.types.v4_0.Infection.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.Infection newObj = setter.getNewTypeInstance();
			newTypeInstance.getInfections().add(newObj);
		}

	}

	private void setPreEpidemicCensus() throws MigrationException {
		PreEpidemicEcosystemCensusSetter setter = new PreEpidemicEcosystemCensusSetter(edu.pitt.apollo.types.v4_0.PreEpidemicEcosystemCensus.class,oldTypeInstance.getPreEpidemicCensus());
		setter.set();
		newTypeInstance.setPreEpidemicCensus(setter.getNewTypeInstance());
	}

	private void setPopulationSerologySurveys() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.PopulationSerologySurvey oldObj : oldTypeInstance.getPopulationSerologySurveys()) {
			PopulationSerologySurveySetter setter = new PopulationSerologySurveySetter(edu.pitt.apollo.types.v4_0.PopulationSerologySurvey.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.PopulationSerologySurvey newObj = setter.getNewTypeInstance();
			newTypeInstance.getPopulationSerologySurveys().add(newObj);
		}

	}

	private void setPopulationInfectionSurveys() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.PopulationInfectionSurvey oldObj : oldTypeInstance.getPopulationInfectionSurveys()) {
			PopulationInfectionSurveySetter setter = new PopulationInfectionSurveySetter(edu.pitt.apollo.types.v4_0.PopulationInfectionSurvey.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.PopulationInfectionSurvey newObj = setter.getNewTypeInstance();
			newTypeInstance.getPopulationInfectionSurveys().add(newObj);
		}

	}

	private void setInfectiousDiseaseControlStrategies() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.InfectiousDiseaseControlMeasure oldObj : oldTypeInstance.getInfectiousDiseaseControlStrategies()) {
			InfectiousDiseaseControlMeasureSetter setter = new InfectiousDiseaseControlMeasureSetter(edu.pitt.apollo.types.v4_0.InfectiousDiseaseControlMeasure.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.InfectiousDiseaseControlMeasure newObj = setter.getNewTypeInstance();
			newTypeInstance.getInfectiousDiseaseControlStrategies().add(newObj);
		}

	}

	private void setCaseDefinitions() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.CaseDefinition oldObj : oldTypeInstance.getCaseDefinitions()) {
			CaseDefinitionSetter setter = new CaseDefinitionSetter(edu.pitt.apollo.types.v4_0.CaseDefinition.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.CaseDefinition newObj = setter.getNewTypeInstance();
			newTypeInstance.getCaseDefinitions().add(newObj);
		}

	}

	private void setContactDefinitions() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.ContactDefinition oldObj : oldTypeInstance.getContactDefinitions()) {
			ContactDefinitionSetter setter = new ContactDefinitionSetter(edu.pitt.apollo.types.v4_0.ContactDefinition.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.ContactDefinition newObj = setter.getNewTypeInstance();
			newTypeInstance.getContactDefinitions().add(newObj);
		}

	}

	private void setCaseLists() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.CaseList oldObj : oldTypeInstance.getCaseLists()) {
			CaseListSetter setter = new CaseListSetter(edu.pitt.apollo.types.v4_0.CaseList.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.CaseList newObj = setter.getNewTypeInstance();
			newTypeInstance.getCaseLists().add(newObj);
		}

	}

	private void setEpidemicCaseCounts() throws MigrationException {
		edu.pitt.apollo.types.v3_1_0.EpidemicCaseCounts oldObj = oldTypeInstance.getEpidemicCaseCounts();
		EpidemicCaseCountsSetter setter = new EpidemicCaseCountsSetter(edu.pitt.apollo.types.v4_0.EpidemicCaseCounts.class, oldObj);
		setter.set();
		edu.pitt.apollo.types.v4_0.EpidemicCaseCounts newObj = setter.getNewTypeInstance();
		newTypeInstance.getEpidemicCaseCounts().add(newObj);

	}

	private void setTransmissionTrees() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.TransmissionTree oldObj : oldTypeInstance.getTransmissionTrees()) {
			TransmissionTreeSetter setter = new TransmissionTreeSetter(edu.pitt.apollo.types.v4_0.TransmissionTree.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.TransmissionTree newObj = setter.getNewTypeInstance();
			newTypeInstance.getTransmissionTrees().add(newObj);
		}

	}

	private void setRelativeRiskDataSets() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.RelativeRiskDataSet oldObj : oldTypeInstance.getRelativeRiskDataSets()) {
			RelativeRiskDataSetSetter setter = new RelativeRiskDataSetSetter(edu.pitt.apollo.types.v4_0.RelativeRiskDataSet.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.RelativeRiskDataSet newObj = setter.getNewTypeInstance();
			newTypeInstance.getRelativeRiskDataSets().add(newObj);
		}

	}

	private void setCausalPathogenIsolates() throws MigrationException {
		for (String oldObj : oldTypeInstance.getCausalPathogenIsolates()) {
			newTypeInstance.getCausalPathogenIsolates().add(oldObj);
		}

	}

	private void setReferences() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.Reference oldObj : oldTypeInstance.getReferences()) {
			ReferenceSetter setter = new ReferenceSetter(edu.pitt.apollo.types.v4_0.Reference.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.Reference newObj = setter.getNewTypeInstance();
			newTypeInstance.getReferences().add(newObj);
		}

	}

	private void setCurator() throws MigrationException {
		newTypeInstance.setCurator(oldTypeInstance.getCurator());
	}

	private void setEditHistory() throws MigrationException {
		for (String oldObj : oldTypeInstance.getEditHistory()) {
			newTypeInstance.getEditHistory().add(oldObj);
		}

	}

	private void setReviewedBy() throws MigrationException {
		for (String oldObj : oldTypeInstance.getReviewedBy()) {
			newTypeInstance.getReviewedBy().add(oldObj);
		}

	}

	private void setAcknowledgements() throws MigrationException {
		for (String oldObj : oldTypeInstance.getAcknowledgements()) {
			newTypeInstance.getAcknowledgements().add(oldObj);
		}

	}

	@Override
	public void set() throws MigrationException {
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