package edu.pitt.apollo.apolloversionmigration.output;

public class TimeSpanCategoryDefinitionSetter extends CategoryDefinitionSetter<edu.pitt.apollo.types.v4_0.TimeSpanCategoryDefinition,edu.pitt.apollo.types.v3_1_0.TimeSpanCategoryDefinition> {

	public TimeSpanCategoryDefinitionSetter(Class<edu.pitt.apollo.types.v4_0.TimeSpanCategoryDefinition> newTypeClass, edu.pitt.apollo.types.v3_1_0.TimeSpanCategoryDefinition oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setUnitOfTime() throws MigrationException {
		newTypeInstance.setUnitOfTime(edu.pitt.apollo.types.v4_0.UnitOfTimeEnum.fromValue(oldTypeInstance.getUnitOfTime().toString()));
	}

	private void setTimeZeroReference() throws MigrationException {
		newTypeInstance.setTimeZeroReference(edu.pitt.apollo.types.v4_0.TimeScaleEnum.fromValue(oldTypeInstance.getTimeZeroReference().toString()));
	}

	private void setStartOfTimeSpan() throws MigrationException {
		newTypeInstance.setStartOfTimeSpan(oldTypeInstance.getStartOfTimeSpan());
	}

	private void setDurationInTimeUnits() throws MigrationException {
		newTypeInstance.setDurationInTimeUnits(oldTypeInstance.getDurationInTimeUnits());
	}

	@Override
	public void set() throws MigrationException {
		super.set();
		setUnitOfTime();
		setTimeZeroReference();
		setStartOfTimeSpan();
		setDurationInTimeUnits();
	}

}