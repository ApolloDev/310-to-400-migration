package edu.pitt.apollo.apolloversionmigration.output;

public class CaseRecordSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0_1.CaseRecord> {

	public CaseRecordSetter(Class<edu.pitt.apollo.types.v4_0_1.CaseRecord> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setCaseId() throws MigrationException {
		newTypeInstance.setCaseId(((edu.pitt.apollo.types.v3_1_0.CaseRecord) oldTypeInstance).getCaseId());
	}

	protected void setAgeInYears() throws MigrationException {
		newTypeInstance.setAgeInYears(((edu.pitt.apollo.types.v3_1_0.CaseRecord) oldTypeInstance).getAgeInYears());
	}

	protected void setSex() throws MigrationException {
		if (((edu.pitt.apollo.types.v3_1_0.CaseRecord) oldTypeInstance).getSex() != null) {
			newTypeInstance.setSex(edu.pitt.apollo.types.v4_0_1.GenderEnum.valueOf(((edu.pitt.apollo.types.v3_1_0.CaseRecord) oldTypeInstance).getSex().toString()));
		}
	}

	protected void setRace() throws MigrationException {
		for (java.lang.String oldObj : ((edu.pitt.apollo.types.v3_1_0.CaseRecord) oldTypeInstance).getRace()) {
			newTypeInstance.getRace().add(oldObj);
		}

	}

	protected void setOccupations() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.OccupationEnum oldObj : ((edu.pitt.apollo.types.v3_1_0.CaseRecord) oldTypeInstance).getOccupations()) {
			newTypeInstance.getOccupations().add(edu.pitt.apollo.types.v4_0_1.OccupationEnum.valueOf(oldObj.toString()));
		}

	}

	protected void setPlacesVisitedWhileSusceptibleOrInfectious() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.PlaceVisited oldObj : ((edu.pitt.apollo.types.v3_1_0.CaseRecord) oldTypeInstance).getPlacesVisitedWhileSusceptibleOrInfectious()) {
			PlaceVisitedSetter setter = new PlaceVisitedSetter(edu.pitt.apollo.types.v4_0_1.PlaceVisited.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0_1.PlaceVisited newObj = setter.getNewTypeInstance();
			newTypeInstance.getPlacesVisitedWhileSusceptibleOrInfectious().add(newObj);
		}

	}

	protected void setInfectionAcquiredFromCaseId() throws MigrationException {
		newTypeInstance.setInfectionAcquiredFromCaseId(((edu.pitt.apollo.types.v3_1_0.CaseRecord) oldTypeInstance).getInfectionAcquiredFromCaseId());
	}

	protected void setDiseaseOutcomesWithLocationDateTime() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.DiseaseOutcomeWithLocationDateTime oldObj : ((edu.pitt.apollo.types.v3_1_0.CaseRecord) oldTypeInstance).getDiseaseOutcomesWithLocationDateTime()) {
			DiseaseOutcomeWithLocationDateTimeSetter setter = new DiseaseOutcomeWithLocationDateTimeSetter(edu.pitt.apollo.types.v4_0_1.DiseaseOutcomeWithLocationDateTime.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0_1.DiseaseOutcomeWithLocationDateTime newObj = setter.getNewTypeInstance();
			newTypeInstance.getDiseaseOutcomesWithLocationDateTime().add(newObj);
		}

	}

	protected void setLabTestsAndResults() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.LabTestAndResult oldObj : ((edu.pitt.apollo.types.v3_1_0.CaseRecord) oldTypeInstance).getLabTestsAndResults()) {
			LabTestAndResultSetter setter = new LabTestAndResultSetter(edu.pitt.apollo.types.v4_0_1.LabTestAndResult.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0_1.LabTestAndResult newObj = setter.getNewTypeInstance();
			newTypeInstance.getLabTestsAndResults().add(newObj);
		}

	}

	protected void setPathogenGeneSequence() throws MigrationException {
		newTypeInstance.setPathogenGeneSequence(((edu.pitt.apollo.types.v3_1_0.CaseRecord) oldTypeInstance).getPathogenGeneSequence());
	}

	protected void setReferences() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.Reference oldObj : ((edu.pitt.apollo.types.v3_1_0.CaseRecord) oldTypeInstance).getReferences()) {
			ReferenceSetter setter = new ReferenceSetter(edu.pitt.apollo.types.v4_0_1.Reference.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0_1.Reference newObj = setter.getNewTypeInstance();
			newTypeInstance.getReferences().add(newObj);
		}

	}

	protected void setLocation() throws MigrationException {
		for (java.lang.String oldObj : ((edu.pitt.apollo.types.v3_1_0.CaseRecord) oldTypeInstance).getLocation()) {
			newTypeInstance.getLocation().add(oldObj);
		}

	}

	protected void setCaseDefinition() throws MigrationException {
		CaseDefinitionSetter setter = new CaseDefinitionSetter(edu.pitt.apollo.types.v4_0_1.CaseDefinition.class,((edu.pitt.apollo.types.v3_1_0.CaseRecord) oldTypeInstance).getCaseDefinition());
		setter.set();
		newTypeInstance.setCaseDefinition(setter.getNewTypeInstance());
	}

	protected void setCausalPathogen() throws MigrationException {
		ApolloPathogenCodeSetter setter = new ApolloPathogenCodeSetter(edu.pitt.apollo.types.v4_0_1.ApolloPathogenCode.class,((edu.pitt.apollo.types.v3_1_0.CaseRecord) oldTypeInstance).getCausalPathogen());
		setter.set();
		newTypeInstance.setCausalPathogen(setter.getNewTypeInstance());
	}

	protected void setTreatment() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.Treatment oldObj : ((edu.pitt.apollo.types.v3_1_0.CaseRecord) oldTypeInstance).getTreatment()) {
			TreatmentSetter setter = TreatmentSetterFactory.getSetter(oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0_1.Treatment newObj = setter.getNewTypeInstance();
			newTypeInstance.getTreatment().add(newObj);
		}

	}

	protected void setInfectionSource() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.InfectionSource oldObj : ((edu.pitt.apollo.types.v3_1_0.CaseRecord) oldTypeInstance).getInfectionSource()) {
			InfectionSourceSetter setter = new InfectionSourceSetter(edu.pitt.apollo.types.v4_0_1.InfectionSource.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0_1.InfectionSource newObj = setter.getNewTypeInstance();
			newTypeInstance.getInfectionSource().add(newObj);
		}

	}

	protected void setControlMeasures() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.InfectiousDiseaseControlMeasure oldObj : ((edu.pitt.apollo.types.v3_1_0.CaseRecord) oldTypeInstance).getControlMeasures()) {
			InfectiousDiseaseControlMeasureSetter setter = InfectiousDiseaseControlMeasureSetterFactory.getSetter(oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0_1.InfectiousDiseaseControlMeasure newObj = setter.getNewTypeInstance();
			newTypeInstance.getControlMeasures().add(newObj);
		}

	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			setCaseId();
			setAgeInYears();
			setSex();
			setRace();
			setOccupations();
			setPlacesVisitedWhileSusceptibleOrInfectious();
			setInfectionAcquiredFromCaseId();
			setDiseaseOutcomesWithLocationDateTime();
			setLabTestsAndResults();
			setPathogenGeneSequence();
			setReferences();
			setLocation();
			setCaseDefinition();
			setCausalPathogen();
			setTreatment();
			setInfectionSource();
			setControlMeasures();
		}
	}

}