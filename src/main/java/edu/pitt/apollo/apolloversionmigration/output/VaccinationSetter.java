package edu.pitt.apollo.apolloversionmigration.output;

public class VaccinationSetter extends TreatmentSetter<edu.pitt.apollo.types.v4_0_1.Vaccination> {

	public VaccinationSetter(Class<edu.pitt.apollo.types.v4_0_1.Vaccination> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setVaccineId() throws MigrationException {
		newTypeInstance.setVaccineId(((edu.pitt.apollo.types.v3_1_0.Vaccination) oldTypeInstance).getVaccineId());
	}

	protected void setVaccinationEfficacies() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.VaccinationEfficacyForSimulatorConfiguration oldObj : ((edu.pitt.apollo.types.v3_1_0.Vaccination) oldTypeInstance).getVaccinationEfficacies()) {
			VaccinationEfficacyForSimulatorConfigurationSetter setter = new VaccinationEfficacyForSimulatorConfigurationSetter(edu.pitt.apollo.types.v4_0_1.VaccinationEfficacyForSimulatorConfiguration.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0_1.VaccinationEfficacyForSimulatorConfiguration newObj = setter.getNewTypeInstance();
			newTypeInstance.getVaccinationEfficacies().add(newObj);
		}

	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
			setVaccineId();
			setVaccinationEfficacies();
		}
	}

}