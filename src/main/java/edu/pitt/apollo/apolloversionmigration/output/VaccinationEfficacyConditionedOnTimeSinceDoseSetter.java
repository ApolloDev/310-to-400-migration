package edu.pitt.apollo.apolloversionmigration.output;

public class VaccinationEfficacyConditionedOnTimeSinceDoseSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.VaccinationEfficacyConditionedOnTimeSinceDose,edu.pitt.apollo.types.v3_1_0.VaccinationEfficacyConditionedOnTimeSinceDose> {

	public VaccinationEfficacyConditionedOnTimeSinceDoseSetter(Class<edu.pitt.apollo.types.v4_0.VaccinationEfficacyConditionedOnTimeSinceDose> newTypeClass, edu.pitt.apollo.types.v3_1_0.VaccinationEfficacyConditionedOnTimeSinceDose oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setNumberOfDosesAdministered() throws MigrationException {
		newTypeInstance.setNumberOfDosesAdministered(oldTypeInstance.getNumberOfDosesAdministered());
	}

	private void setTimeIntervalLabelDefinitions() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.TimeAxisCategoryLabels oldObj : oldTypeInstance.getTimeIntervalLabelDefinitions()) {
			TimeAxisCategoryLabelsSetter setter = new TimeAxisCategoryLabelsSetter(edu.pitt.apollo.types.v4_0.TimeAxisCategoryLabels.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.TimeAxisCategoryLabels newObj = setter.getNewTypeInstance();
			newTypeInstance.getTimeIntervalLabelDefinitions().add(newObj);
		}

	}

	private void setVaccinationEfficacyConditionedOnTimeSinceMostRecentDose() throws MigrationException {
		for (java.lang.Double oldObj : oldTypeInstance.getVaccinationEfficacyConditionedOnTimeSinceMostRecentDose()) {
			newTypeInstance.getVaccinationEfficacyConditionedOnTimeSinceMostRecentDose().add(oldObj);
		}

	}

	@Override
	public void set() throws MigrationException {
		setNumberOfDosesAdministered();
		setTimeIntervalLabelDefinitions();
		setVaccinationEfficacyConditionedOnTimeSinceMostRecentDose();
	}

}