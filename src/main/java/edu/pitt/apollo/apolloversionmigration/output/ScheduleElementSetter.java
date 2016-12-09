package edu.pitt.apollo.apolloversionmigration.output;

public class ScheduleElementSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0_1.ScheduleElement> {

	public ScheduleElementSetter(Class<edu.pitt.apollo.types.v4_0_1.ScheduleElement> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setQuantity() throws MigrationException {
		newTypeInstance.setQuantity(((edu.pitt.apollo.types.v3_1_0.ScheduleElement) oldTypeInstance).getQuantity());
	}

	protected void setDateTime() throws MigrationException {
		newTypeInstance.setDateTime(((edu.pitt.apollo.types.v3_1_0.ScheduleElement) oldTypeInstance).getDateTime());
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			setQuantity();
			setDateTime();
		}
	}

}