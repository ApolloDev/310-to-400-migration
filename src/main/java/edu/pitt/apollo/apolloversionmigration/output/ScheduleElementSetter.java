package edu.pitt.apollo.apolloversionmigration.output;

public class ScheduleElementSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.ScheduleElement,edu.pitt.apollo.types.v3_1_0.ScheduleElement> {

	public ScheduleElementSetter(Class<edu.pitt.apollo.types.v4_0.ScheduleElement> newTypeClass, edu.pitt.apollo.types.v3_1_0.ScheduleElement oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setQuantity() throws MigrationException {
		newTypeInstance.setQuantity(oldTypeInstance.getQuantity());
	}

	private void setDateTime() throws MigrationException {
		newTypeInstance.setDateTime(oldTypeInstance.getDateTime());
	}

	@Override
	public void set() throws MigrationException {
		setQuantity();
		setDateTime();
	}

}