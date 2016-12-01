package edu.pitt.apollo.apolloversionmigration.output;

public class VaccinationEfficacyForSimulatorConfigurationSetter extends TreatmentEfficacySetter<edu.pitt.apollo.types.v4_0.VaccinationEfficacyForSimulatorConfiguration> {

	public VaccinationEfficacyForSimulatorConfigurationSetter(Class<edu.pitt.apollo.types.v4_0.VaccinationEfficacyForSimulatorConfiguration> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setAverageVaccinationEfficacy() throws MigrationException {
		newTypeInstance.setAverageVaccinationEfficacy(((edu.pitt.apollo.types.v3_1_0.VaccinationEfficacyForSimulatorConfiguration) oldTypeInstance).getAverageVaccinationEfficacy());
	}

	protected void setVaccinationEfficacyConditionedOnAgeRange() throws MigrationException {
		ConditionalProbabilityDistributionSetter setter = new ConditionalProbabilityDistributionSetter(edu.pitt.apollo.types.v4_0.ConditionalProbabilityDistribution.class,((edu.pitt.apollo.types.v3_1_0.VaccinationEfficacyForSimulatorConfiguration) oldTypeInstance).getVaccinationEfficacyConditionedOnAgeRange());
		setter.set();
		newTypeInstance.setVaccinationEfficacyConditionedOnAgeRange(setter.getNewTypeInstance());
	}

	protected void setVaccinationEfficaciesConditionedOnTimeSinceMostRecentDose() throws MigrationException {
		VaccinationEfficacyConditionedOnTimeSinceDoseSetter setter = new VaccinationEfficacyConditionedOnTimeSinceDoseSetter(edu.pitt.apollo.types.v4_0.VaccinationEfficacyConditionedOnTimeSinceDose.class,((edu.pitt.apollo.types.v3_1_0.VaccinationEfficacyForSimulatorConfiguration) oldTypeInstance).getVaccinationEfficaciesConditionedOnTimeSinceMostRecentDose());
		setter.set();
		newTypeInstance.setVaccinationEfficaciesConditionedOnTimeSinceMostRecentDose(setter.getNewTypeInstance());
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
			setAverageVaccinationEfficacy();
			setVaccinationEfficacyConditionedOnAgeRange();
			setVaccinationEfficaciesConditionedOnTimeSinceMostRecentDose();
		}
	}

}