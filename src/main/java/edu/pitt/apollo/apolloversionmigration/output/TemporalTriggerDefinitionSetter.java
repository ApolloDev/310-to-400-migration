package edu.pitt.apollo.apolloversionmigration.output;

public class TemporalTriggerDefinitionSetter extends TriggerDefinitionSetter<edu.pitt.apollo.types.v4_0.TemporalTriggerDefinition,edu.pitt.apollo.types.v3_1_0.TemporalTriggerDefinition> {

	public TemporalTriggerDefinitionSetter(Class<edu.pitt.apollo.types.v4_0.TemporalTriggerDefinition> newTypeClass, edu.pitt.apollo.types.v3_1_0.TemporalTriggerDefinition oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setTimeScale() throws MigrationException {
		newTypeInstance.setTimeScale(edu.pitt.apollo.types.v4_0.TimeScaleEnum.fromValue(oldTypeInstance.getTimeScale().toString()));
	}

	private void setTimeSinceTimeScaleZero() throws MigrationException {
		FixedDurationSetter setter = new FixedDurationSetter(edu.pitt.apollo.types.v4_0.FixedDuration.class,oldTypeInstance.getTimeSinceTimeScaleZero());
		setter.set();
		newTypeInstance.setTimeSinceTimeScaleZero(setter.getNewTypeInstance());
	}

	@Override
	public void set() throws MigrationException {
		super.set();
		setTimeScale();
		setTimeSinceTimeScaleZero();
	}

}