package edu.pitt.apollo.apolloversionmigration.output;

public class DrugTreatmentEfficacyForSimulatorConfigurationSetter extends TreatmentEfficacySetter<edu.pitt.apollo.types.v4_0.DrugTreatmentEfficacyForSimulatorConfiguration,edu.pitt.apollo.types.v3_1_0.DrugTreatmentEfficacyForSimulatorConfiguration> {

	public DrugTreatmentEfficacyForSimulatorConfigurationSetter(Class<edu.pitt.apollo.types.v4_0.DrugTreatmentEfficacyForSimulatorConfiguration> newTypeClass, edu.pitt.apollo.types.v3_1_0.DrugTreatmentEfficacyForSimulatorConfiguration oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setAverageDrugEfficacy() throws MigrationException {
		newTypeInstance.setAverageDrugEfficacy(oldTypeInstance.getAverageDrugEfficacy());
	}

	private void setDrugEfficacyConditionedOnAgeRange() throws MigrationException {
		ConditionalProbabilityDistributionSetter setter = new ConditionalProbabilityDistributionSetter(edu.pitt.apollo.types.v4_0.ConditionalProbabilityDistribution.class,oldTypeInstance.getDrugEfficacyConditionedOnAgeRange());
		setter.set();
		newTypeInstance.setDrugEfficacyConditionedOnAgeRange(setter.getNewTypeInstance());
	}

	private void setDrugEfficaciesConditionedOnCurrentDiseaseOutcome() throws MigrationException {
		ConditionalProbabilityDistributionSetter setter = new ConditionalProbabilityDistributionSetter(edu.pitt.apollo.types.v4_0.ConditionalProbabilityDistribution.class,oldTypeInstance.getDrugEfficaciesConditionedOnCurrentDiseaseOutcome());
		setter.set();
		newTypeInstance.setDrugEfficaciesConditionedOnCurrentDiseaseOutcome(setter.getNewTypeInstance());
	}

	@Override
	public void set() throws MigrationException {
		super.set();
		setAverageDrugEfficacy();
		setDrugEfficacyConditionedOnAgeRange();
		setDrugEfficaciesConditionedOnCurrentDiseaseOutcome();
	}

}