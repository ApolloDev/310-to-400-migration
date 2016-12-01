package edu.pitt.apollo.apolloversionmigration.output;

public class VaccinationEfficacyConditionedOnTimeSinceDoseSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.VaccinationEfficacyConditionedOnTimeSinceDose> {

	public VaccinationEfficacyConditionedOnTimeSinceDoseSetter(Class<edu.pitt.apollo.types.v4_0.VaccinationEfficacyConditionedOnTimeSinceDose> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setNumberOfDosesAdministered() throws MigrationException {
		newTypeInstance.setNumberOfDosesAdministered(((edu.pitt.apollo.types.v3_1_0.VaccinationEfficacyConditionedOnTimeSinceDose) oldTypeInstance).getNumberOfDosesAdministered());
	}

	protected void setTimeIntervalLabelDefinitions() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.TimeAxisCategoryLabels oldObj : ((edu.pitt.apollo.types.v3_1_0.VaccinationEfficacyConditionedOnTimeSinceDose) oldTypeInstance).getTimeIntervalLabelDefinitions()) {
			TimeAxisCategoryLabelsSetter setter = new TimeAxisCategoryLabelsSetter(edu.pitt.apollo.types.v4_0.TimeAxisCategoryLabels.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.TimeAxisCategoryLabels newObj = setter.getNewTypeInstance();
			newTypeInstance.getTimeIntervalLabelDefinitions().add(newObj);
		}

	}

	protected void setVaccinationEfficacyConditionedOnTimeSinceMostRecentDose() throws MigrationException {
		for (java.lang.Double oldObj : ((edu.pitt.apollo.types.v3_1_0.VaccinationEfficacyConditionedOnTimeSinceDose) oldTypeInstance).getVaccinationEfficacyConditionedOnTimeSinceMostRecentDose()) {
			newTypeInstance.getVaccinationEfficacyConditionedOnTimeSinceMostRecentDose().add(oldObj);
		}

	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			setNumberOfDosesAdministered();
			setTimeIntervalLabelDefinitions();
			setVaccinationEfficacyConditionedOnTimeSinceMostRecentDose();
		}
	}

}