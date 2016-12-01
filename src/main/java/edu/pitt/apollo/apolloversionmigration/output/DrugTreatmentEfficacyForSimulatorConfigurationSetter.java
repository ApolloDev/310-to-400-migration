package edu.pitt.apollo.apolloversionmigration.output;

public class DrugTreatmentEfficacyForSimulatorConfigurationSetter extends TreatmentEfficacySetter<edu.pitt.apollo.types.v4_0.DrugTreatmentEfficacyForSimulatorConfiguration> {

	public DrugTreatmentEfficacyForSimulatorConfigurationSetter(Class<edu.pitt.apollo.types.v4_0.DrugTreatmentEfficacyForSimulatorConfiguration> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setAverageDrugEfficacy() throws MigrationException {
		newTypeInstance.setAverageDrugEfficacy(((edu.pitt.apollo.types.v3_1_0.DrugTreatmentEfficacyForSimulatorConfiguration) oldTypeInstance).getAverageDrugEfficacy());
	}

	protected void setDrugEfficacyConditionedOnAgeRange() throws MigrationException {
		ConditionalProbabilityDistributionSetter setter = new ConditionalProbabilityDistributionSetter(edu.pitt.apollo.types.v4_0.ConditionalProbabilityDistribution.class,((edu.pitt.apollo.types.v3_1_0.DrugTreatmentEfficacyForSimulatorConfiguration) oldTypeInstance).getDrugEfficacyConditionedOnAgeRange());
		setter.set();
		newTypeInstance.setDrugEfficacyConditionedOnAgeRange(setter.getNewTypeInstance());
	}

	protected void setDrugEfficaciesConditionedOnCurrentDiseaseOutcome() throws MigrationException {
		ConditionalProbabilityDistributionSetter setter = new ConditionalProbabilityDistributionSetter(edu.pitt.apollo.types.v4_0.ConditionalProbabilityDistribution.class,((edu.pitt.apollo.types.v3_1_0.DrugTreatmentEfficacyForSimulatorConfiguration) oldTypeInstance).getDrugEfficaciesConditionedOnCurrentDiseaseOutcome());
		setter.set();
		newTypeInstance.setDrugEfficaciesConditionedOnCurrentDiseaseOutcome(setter.getNewTypeInstance());
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
			setAverageDrugEfficacy();
			setDrugEfficacyConditionedOnAgeRange();
			setDrugEfficaciesConditionedOnCurrentDiseaseOutcome();
		}
	}

}