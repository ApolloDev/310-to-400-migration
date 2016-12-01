package edu.pitt.apollo.apolloversionmigration.output;

public class TemporalTriggerDefinitionSetter extends TriggerDefinitionSetter<edu.pitt.apollo.types.v4_0.TemporalTriggerDefinition> {

	public TemporalTriggerDefinitionSetter(Class<edu.pitt.apollo.types.v4_0.TemporalTriggerDefinition> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setTimeScale() throws MigrationException {
		newTypeInstance.setTimeScale(edu.pitt.apollo.types.v4_0.TimeScaleEnum.valueOf(((edu.pitt.apollo.types.v3_1_0.TemporalTriggerDefinition) oldTypeInstance).getTimeScale().toString()));
	}

	protected void setTimeSinceTimeScaleZero() throws MigrationException {
		FixedDurationSetter setter = new FixedDurationSetter(edu.pitt.apollo.types.v4_0.FixedDuration.class,((edu.pitt.apollo.types.v3_1_0.TemporalTriggerDefinition) oldTypeInstance).getTimeSinceTimeScaleZero());
		setter.set();
		newTypeInstance.setTimeSinceTimeScaleZero(setter.getNewTypeInstance());
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
			setTimeScale();
			setTimeSinceTimeScaleZero();
		}
	}

}