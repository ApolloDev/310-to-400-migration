package edu.pitt.apollo.apolloversionmigration.output;

public class TemporalCountArrayWithUniformIntervalsSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.TemporalCountArrayWithUniformIntervals,edu.pitt.apollo.types.v3_1_0.TemporalCountArrayWithUniformIntervals> {

	public TemporalCountArrayWithUniformIntervalsSetter(Class<edu.pitt.apollo.types.v4_0.TemporalCountArrayWithUniformIntervals> newTypeClass, edu.pitt.apollo.types.v3_1_0.TemporalCountArrayWithUniformIntervals oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setNDimensions() throws MigrationException {
		newTypeInstance.setNDimensions(oldTypeInstance.getNDimensions());
	}

	private void setNTemporalIntervals() throws MigrationException {
		newTypeInstance.setNTemporalIntervals(oldTypeInstance.getNTemporalIntervals());
	}

	private void setFirstArrayAxis() throws MigrationException {
		CategoricalVariableNodeArrayAxisSetter setter = new CategoricalVariableNodeArrayAxisSetter(edu.pitt.apollo.types.v4_0.CategoricalVariableNode.class,oldTypeInstance.getFirstArrayAxis());
		setter.set();
		newTypeInstance.setFirstArrayAxis(setter.getNewTypeInstance());
	}

	@Override
	public void set() throws MigrationException {
		setNDimensions();
		setNTemporalIntervals();
		setFirstArrayAxis();
	}

}