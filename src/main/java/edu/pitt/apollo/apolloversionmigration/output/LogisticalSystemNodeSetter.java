package edu.pitt.apollo.apolloversionmigration.output;

public class LogisticalSystemNodeSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.LogisticalSystemNode,edu.pitt.apollo.types.v3_1_0.LogisticalSystemNode> {

	public LogisticalSystemNodeSetter(Class<edu.pitt.apollo.types.v4_0.LogisticalSystemNode> newTypeClass, edu.pitt.apollo.types.v3_1_0.LogisticalSystemNode oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setDescription() throws MigrationException {
		newTypeInstance.setDescription(oldTypeInstance.getDescription());
	}

	private void setCapacitySchedule() throws MigrationException {
		ScheduleSetter setter = new ScheduleSetter(edu.pitt.apollo.types.v4_0.Schedule.class,oldTypeInstance.getCapacitySchedule());
		setter.set();
		newTypeInstance.setCapacitySchedule(setter.getNewTypeInstance());
	}

	private void setOutputSchedule() throws MigrationException {
		ScheduleSetter setter = new ScheduleSetter(edu.pitt.apollo.types.v4_0.Schedule.class,oldTypeInstance.getOutputSchedule());
		setter.set();
		newTypeInstance.setOutputSchedule(setter.getNewTypeInstance());
	}

	private void setChildren() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.LogisticalSystemNode oldObj : oldTypeInstance.getChildren()) {
			LogisticalSystemNodeSetter setter = new LogisticalSystemNodeSetter(edu.pitt.apollo.types.v4_0.LogisticalSystemNode.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.LogisticalSystemNode newObj = setter.getNewTypeInstance();
			newTypeInstance.getChildren().add(newObj);
		}

	}

	@Override
	public void set() throws MigrationException {
		setDescription();
		setCapacitySchedule();
		setOutputSchedule();
		setChildren();
	}

}