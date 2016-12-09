package edu.pitt.apollo.apolloversionmigration.output;

public class ScheduleSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0_1.Schedule> {

	public ScheduleSetter(Class<edu.pitt.apollo.types.v4_0_1.Schedule> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setUnitOfMeasure() throws MigrationException {
		if (((edu.pitt.apollo.types.v3_1_0.Schedule) oldTypeInstance).getUnitOfMeasure() != null) {
			newTypeInstance.setUnitOfMeasure(edu.pitt.apollo.types.v4_0_1.UnitOfMeasureEnum.valueOf(((edu.pitt.apollo.types.v3_1_0.Schedule) oldTypeInstance).getUnitOfMeasure().toString()));
		}
	}

	protected void setScheduleElements() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.ScheduleElement oldObj : ((edu.pitt.apollo.types.v3_1_0.Schedule) oldTypeInstance).getScheduleElements()) {
			ScheduleElementSetter setter = new ScheduleElementSetter(edu.pitt.apollo.types.v4_0_1.ScheduleElement.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0_1.ScheduleElement newObj = setter.getNewTypeInstance();
			newTypeInstance.getScheduleElements().add(newObj);
		}

	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			setUnitOfMeasure();
			setScheduleElements();
		}
	}

}