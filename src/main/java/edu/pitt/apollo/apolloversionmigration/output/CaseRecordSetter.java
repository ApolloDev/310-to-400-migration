package edu.pitt.apollo.apolloversionmigration.output;

public class CaseRecordSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.CaseRecord,edu.pitt.apollo.types.v3_1_0.CaseRecord> {

	public CaseRecordSetter(Class<edu.pitt.apollo.types.v4_0.CaseRecord> newTypeClass, edu.pitt.apollo.types.v3_1_0.CaseRecord oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setCaseId() throws MigrationException {
		newTypeInstance.setCaseId(oldTypeInstance.getCaseId());
	}

	private void setAgeInYears() throws MigrationException {
		newTypeInstance.setAgeInYears(oldTypeInstance.getAgeInYears());
	}

	private void setOccupations() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.OccupationEnum oldObj : oldTypeInstance.getOccupations()) {
			newTypeInstance.getOccupations().add(edu.pitt.apollo.types.v4_0.OccupationEnum.fromValue(oldObj.toString()));
		}

	}

	private void setPlacesVisitedWhileSusceptibleOrInfectious() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.PlaceVisited oldObj : oldTypeInstance.getPlacesVisitedWhileSusceptibleOrInfectious()) {
			PlaceVisitedSetter setter = new PlaceVisitedSetter(edu.pitt.apollo.types.v4_0.PlaceVisited.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.PlaceVisited newObj = setter.getNewTypeInstance();
			newTypeInstance.getPlacesVisitedWhileSusceptibleOrInfectious().add(newObj);
		}

	}

	private void setInfectionAcquiredFromCaseId() throws MigrationException {
		newTypeInstance.setInfectionAcquiredFromCaseId(oldTypeInstance.getInfectionAcquiredFromCaseId());
	}

	private void setDiseaseOutcomesWithLocationDateTime() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.DiseaseOutcomeWithLocationDateTime oldObj : oldTypeInstance.getDiseaseOutcomesWithLocationDateTime()) {
			DiseaseOutcomeWithLocationDateTimeSetter setter = new DiseaseOutcomeWithLocationDateTimeSetter(edu.pitt.apollo.types.v4_0.DiseaseOutcomeWithLocationDateTime.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.DiseaseOutcomeWithLocationDateTime newObj = setter.getNewTypeInstance();
			newTypeInstance.getDiseaseOutcomesWithLocationDateTime().add(newObj);
		}

	}

	private void setLabTestsAndResults() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.LabTestAndResult oldObj : oldTypeInstance.getLabTestsAndResults()) {
			LabTestAndResultSetter setter = new LabTestAndResultSetter(edu.pitt.apollo.types.v4_0.LabTestAndResult.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.LabTestAndResult newObj = setter.getNewTypeInstance();
			newTypeInstance.getLabTestsAndResults().add(newObj);
		}

	}

	private void setPathogenGeneSequence() throws MigrationException {
		newTypeInstance.setPathogenGeneSequence(oldTypeInstance.getPathogenGeneSequence());
	}

	@Override
	public void set() throws MigrationException {
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