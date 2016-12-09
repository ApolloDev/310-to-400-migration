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

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			setCaseId();
			setAgeInYears();
			setOccupations();
			setPlacesVisitedWhileSusceptibleOrInfectious();
			setInfectionAcquiredFromCaseId();
			setDiseaseOutcomesWithLocationDateTime();
			setLabTestsAndResults();
			setPathogenGeneSequence();
		}
	}

}