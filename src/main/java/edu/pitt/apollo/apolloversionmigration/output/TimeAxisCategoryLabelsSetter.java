package edu.pitt.apollo.apolloversionmigration.output;

public class TimeAxisCategoryLabelsSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.TimeAxisCategoryLabels> {

	public TimeAxisCategoryLabelsSetter(Class<edu.pitt.apollo.types.v4_0.TimeAxisCategoryLabels> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setLabel() throws MigrationException {
		newTypeInstance.setLabel(((edu.pitt.apollo.types.v3_1_0.TimeAxisCategoryLabels) oldTypeInstance).getLabel());
	}

	protected void setSimulatorTimeEarliest() throws MigrationException {
		newTypeInstance.setSimulatorTimeEarliest(((edu.pitt.apollo.types.v3_1_0.TimeAxisCategoryLabels) oldTypeInstance).getSimulatorTimeEarliest());
	}

	protected void setSimulatorTimeLatest() throws MigrationException {
		newTypeInstance.setSimulatorTimeLatest(((edu.pitt.apollo.types.v3_1_0.TimeAxisCategoryLabels) oldTypeInstance).getSimulatorTimeLatest());
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			setLabel();
			setSimulatorTimeEarliest();
			setSimulatorTimeLatest();
		}
	}

}