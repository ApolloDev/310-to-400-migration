package edu.pitt.apollo.apolloversionmigration.output;

public class VaccinationEfficacyStudySetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.VaccinationEfficacyStudy> {

	public VaccinationEfficacyStudySetter(Class<edu.pitt.apollo.types.v4_0.VaccinationEfficacyStudy> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setDescription() throws MigrationException {
		newTypeInstance.setDescription(((edu.pitt.apollo.types.v3_1_0.VaccinationEfficacyStudy) oldTypeInstance).getDescription());
	}

	protected void setVaccinationPreventableOutcome() throws MigrationException {
		newTypeInstance.setVaccinationPreventableOutcome(edu.pitt.apollo.types.v4_0.TreatmentPreventableOutcomeEnum.valueOf(((edu.pitt.apollo.types.v3_1_0.VaccinationEfficacyStudy) oldTypeInstance).getVaccinationPreventableOutcome().toString()));
	}

	protected void setVaccinationEfficacyMeasured() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.VaccinationEfficacyMeasured oldObj : ((edu.pitt.apollo.types.v3_1_0.VaccinationEfficacyStudy) oldTypeInstance).getVaccinationEfficacyMeasured()) {
			VaccinationEfficacyMeasuredSetter setter = new VaccinationEfficacyMeasuredSetter(edu.pitt.apollo.types.v4_0.VaccinationEfficacyMeasured.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.VaccinationEfficacyMeasured newObj = setter.getNewTypeInstance();
			newTypeInstance.getVaccinationEfficacyMeasured().add(newObj);
		}

	}

	protected void setDataSets() throws MigrationException {
		for (java.lang.String oldObj : ((edu.pitt.apollo.types.v3_1_0.VaccinationEfficacyStudy) oldTypeInstance).getDataSets()) {
			newTypeInstance.getDataSets().add(oldObj);
		}

	}

	protected void setReferences() throws MigrationException {
		for (java.lang.String oldObj : ((edu.pitt.apollo.types.v3_1_0.VaccinationEfficacyStudy) oldTypeInstance).getReferences()) {
			newTypeInstance.getReferences().add(oldObj);
		}

	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			setDescription();
			setVaccinationPreventableOutcome();
			setVaccinationEfficacyMeasured();
			setDataSets();
			setReferences();
		}
	}

}