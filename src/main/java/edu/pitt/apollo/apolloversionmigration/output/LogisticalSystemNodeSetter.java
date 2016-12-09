package edu.pitt.apollo.apolloversionmigration.output;

public class LogisticalSystemNodeSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0_1.LogisticalSystemNode> {

	public LogisticalSystemNodeSetter(Class<edu.pitt.apollo.types.v4_0_1.LogisticalSystemNode> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setDescription() throws MigrationException {
		newTypeInstance.setDescription(((edu.pitt.apollo.types.v3_1_0.LogisticalSystemNode) oldTypeInstance).getDescription());
	}

	protected void setCapacitySchedule() throws MigrationException {
		ScheduleSetter setter = new ScheduleSetter(edu.pitt.apollo.types.v4_0_1.Schedule.class,((edu.pitt.apollo.types.v3_1_0.LogisticalSystemNode) oldTypeInstance).getCapacitySchedule());
		setter.set();
		newTypeInstance.setCapacitySchedule(setter.getNewTypeInstance());
	}

	protected void setOutputSchedule() throws MigrationException {
		ScheduleSetter setter = new ScheduleSetter(edu.pitt.apollo.types.v4_0_1.Schedule.class,((edu.pitt.apollo.types.v3_1_0.LogisticalSystemNode) oldTypeInstance).getOutputSchedule());
		setter.set();
		newTypeInstance.setOutputSchedule(setter.getNewTypeInstance());
	}

	protected void setChildren() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.LogisticalSystemNode oldObj : ((edu.pitt.apollo.types.v3_1_0.LogisticalSystemNode) oldTypeInstance).getChildren()) {
			LogisticalSystemNodeSetter setter = new LogisticalSystemNodeSetter(edu.pitt.apollo.types.v4_0_1.LogisticalSystemNode.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0_1.LogisticalSystemNode newObj = setter.getNewTypeInstance();
			newTypeInstance.getChildren().add(newObj);
		}

	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			setDescription();
			setCapacitySchedule();
			setOutputSchedule();
			setChildren();
		}
	}

}