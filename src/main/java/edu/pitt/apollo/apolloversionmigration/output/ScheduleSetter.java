package edu.pitt.apollo.apolloversionmigration.output;

public class ScheduleSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.Schedule,edu.pitt.apollo.types.v3_1_0.Schedule> {

	public ScheduleSetter(Class<edu.pitt.apollo.types.v4_0.Schedule> newTypeClass, edu.pitt.apollo.types.v3_1_0.Schedule oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setUnitOfMeasure() throws MigrationException {
		newTypeInstance.setUnitOfMeasure(edu.pitt.apollo.types.v4_0.UnitOfMeasureEnum.fromValue(oldTypeInstance.getUnitOfMeasure().toString()));
	}

	private void setScheduleElements() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.ScheduleElement oldObj : oldTypeInstance.getScheduleElements()) {
			ScheduleElementSetter setter = new ScheduleElementSetter(edu.pitt.apollo.types.v4_0.ScheduleElement.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.ScheduleElement newObj = setter.getNewTypeInstance();
			newTypeInstance.getScheduleElements().add(newObj);
		}

	}

	@Override
	public void set() throws MigrationException {
		setUnitOfMeasure();
		setScheduleElements();
	}

}