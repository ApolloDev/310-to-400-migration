package edu.pitt.apollo.apolloversionmigration.output;

public class VaccinationEfficacyForSimulatorConfigurationSetter extends TreatmentEfficacySetter<edu.pitt.apollo.types.v4_0.VaccinationEfficacyForSimulatorConfiguration,edu.pitt.apollo.types.v3_1_0.VaccinationEfficacyForSimulatorConfiguration> {

	public VaccinationEfficacyForSimulatorConfigurationSetter(Class<edu.pitt.apollo.types.v4_0.VaccinationEfficacyForSimulatorConfiguration> newTypeClass, edu.pitt.apollo.types.v3_1_0.VaccinationEfficacyForSimulatorConfiguration oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setAverageVaccinationEfficacy() throws MigrationException {
		newTypeInstance.setAverageVaccinationEfficacy(oldTypeInstance.getAverageVaccinationEfficacy());
	}

	private void setVaccinationEfficacyConditionedOnAgeRange() throws MigrationException {
		ConditionalProbabilityDistributionSetter setter = new ConditionalProbabilityDistributionSetter(edu.pitt.apollo.types.v4_0.ConditionalProbabilityDistribution.class,oldTypeInstance.getVaccinationEfficacyConditionedOnAgeRange());
		setter.set();
		newTypeInstance.setVaccinationEfficacyConditionedOnAgeRange(setter.getNewTypeInstance());
	}

	private void setVaccinationEfficaciesConditionedOnTimeSinceMostRecentDose() throws MigrationException {
		VaccinationEfficacyConditionedOnTimeSinceDoseSetter setter = new VaccinationEfficacyConditionedOnTimeSinceDoseSetter(edu.pitt.apollo.types.v4_0.VaccinationEfficacyConditionedOnTimeSinceDose.class,oldTypeInstance.getVaccinationEfficaciesConditionedOnTimeSinceMostRecentDose());
		setter.set();
		newTypeInstance.setVaccinationEfficaciesConditionedOnTimeSinceMostRecentDose(setter.getNewTypeInstance());
	}

	@Override
	public void set() throws MigrationException {
		super.set();
		setAverageVaccinationEfficacy();
		setVaccinationEfficacyConditionedOnAgeRange();
		setVaccinationEfficaciesConditionedOnTimeSinceMostRecentDose();
	}

}