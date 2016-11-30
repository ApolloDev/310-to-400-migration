package edu.pitt.apollo.apolloversionmigration.output;

public class TimeAxisCategoryLabelsSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.TimeAxisCategoryLabels,edu.pitt.apollo.types.v3_1_0.TimeAxisCategoryLabels> {

	public TimeAxisCategoryLabelsSetter(Class<edu.pitt.apollo.types.v4_0.TimeAxisCategoryLabels> newTypeClass, edu.pitt.apollo.types.v3_1_0.TimeAxisCategoryLabels oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setLabel() throws MigrationException {
		newTypeInstance.setLabel(oldTypeInstance.getLabel());
	}

	private void setSimulatorTimeEarliest() throws MigrationException {
		newTypeInstance.setSimulatorTimeEarliest(oldTypeInstance.getSimulatorTimeEarliest());
	}

	private void setSimulatorTimeLatest() throws MigrationException {
		newTypeInstance.setSimulatorTimeLatest(oldTypeInstance.getSimulatorTimeLatest());
	}

	@Override
	public void set() throws MigrationException {
		setLabel();
		setSimulatorTimeEarliest();
		setSimulatorTimeLatest();
	}

}