package edu.pitt.apollo.apolloversionmigration.output;

public class VaccinationEfficacyStudySetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.VaccinationEfficacyStudy,edu.pitt.apollo.types.v3_1_0.VaccinationEfficacyStudy> {

	public VaccinationEfficacyStudySetter(Class<edu.pitt.apollo.types.v4_0.VaccinationEfficacyStudy> newTypeClass, edu.pitt.apollo.types.v3_1_0.VaccinationEfficacyStudy oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setDescription() throws MigrationException {
		newTypeInstance.setDescription(oldTypeInstance.getDescription());
	}

	private void setVaccinationPreventableOutcome() throws MigrationException {
		newTypeInstance.setVaccinationPreventableOutcome(edu.pitt.apollo.types.v4_0.TreatmentPreventableOutcomeEnum.fromValue(oldTypeInstance.getVaccinationPreventableOutcome().toString()));
	}

	private void setVaccinationEfficacyMeasured() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.VaccinationEfficacyMeasured oldObj : oldTypeInstance.getVaccinationEfficacyMeasured()) {
			VaccinationEfficacyMeasuredSetter setter = new VaccinationEfficacyMeasuredSetter(edu.pitt.apollo.types.v4_0.VaccinationEfficacyMeasured.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.VaccinationEfficacyMeasured newObj = setter.getNewTypeInstance();
			newTypeInstance.getVaccinationEfficacyMeasured().add(newObj);
		}

	}

	private void setDataSets() throws MigrationException {
		for (java.lang.String oldObj : oldTypeInstance.getDataSets()) {
			newTypeInstance.getDataSets().add(oldObj);
		}

	}

	private void setReferences() throws MigrationException {
		for (java.lang.String oldObj : oldTypeInstance.getReferences()) {
			newTypeInstance.getReferences().add(oldObj);
		}

	}

	@Override
	public void set() throws MigrationException {
		setDescription();
		setVaccinationPreventableOutcome();
		setVaccinationEfficacyMeasured();
		setDataSets();
		setReferences();
	}

}