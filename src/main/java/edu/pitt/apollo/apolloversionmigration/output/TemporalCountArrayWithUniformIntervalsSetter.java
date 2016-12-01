package edu.pitt.apollo.apolloversionmigration.output;

public class TemporalCountArrayWithUniformIntervalsSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.TemporalCountArrayWithUniformIntervals> {

	public TemporalCountArrayWithUniformIntervalsSetter(Class<edu.pitt.apollo.types.v4_0.TemporalCountArrayWithUniformIntervals> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setNDimensions() throws MigrationException {
		newTypeInstance.setNDimensions(((edu.pitt.apollo.types.v3_1_0.TemporalCountArrayWithUniformIntervals) oldTypeInstance).getNDimensions());
	}

	protected void setNTemporalIntervals() throws MigrationException {
		newTypeInstance.setNTemporalIntervals(((edu.pitt.apollo.types.v3_1_0.TemporalCountArrayWithUniformIntervals) oldTypeInstance).getNTemporalIntervals());
	}

	protected void setFirstArrayAxis() throws MigrationException {
		CategoricalVariableNodeSetter setter = new CategoricalVariableNodeSetterImpl(edu.pitt.apollo.types.v4_0.CategoricalVariableNode.class,((edu.pitt.apollo.types.v3_1_0.TemporalCountArrayWithUniformIntervals) oldTypeInstance).getFirstArrayAxis());
		setter.set();
		newTypeInstance.setFirstArrayAxis(setter.getNewTypeInstance());
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			setNDimensions();
			setNTemporalIntervals();
			setFirstArrayAxis();
		}
	}

}