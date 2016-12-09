package edu.pitt.apollo.apolloversionmigration.output;

public class TimeSpanCategoryDefinitionSetter extends CategoryDefinitionSetter<edu.pitt.apollo.types.v4_0_1.TimeSpanCategoryDefinition> {

	public TimeSpanCategoryDefinitionSetter(Class<edu.pitt.apollo.types.v4_0_1.TimeSpanCategoryDefinition> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setUnitOfTime() throws MigrationException {
		if (((edu.pitt.apollo.types.v3_1_0.TimeSpanCategoryDefinition) oldTypeInstance).getUnitOfTime() != null) {
			newTypeInstance.setUnitOfTime(edu.pitt.apollo.types.v4_0_1.UnitOfTimeEnum.valueOf(((edu.pitt.apollo.types.v3_1_0.TimeSpanCategoryDefinition) oldTypeInstance).getUnitOfTime().toString()));
		}
	}

	protected void setTimeZeroReference() throws MigrationException {
		if (((edu.pitt.apollo.types.v3_1_0.TimeSpanCategoryDefinition) oldTypeInstance).getTimeZeroReference() != null) {
			newTypeInstance.setTimeZeroReference(edu.pitt.apollo.types.v4_0_1.TimeScaleEnum.valueOf(((edu.pitt.apollo.types.v3_1_0.TimeSpanCategoryDefinition) oldTypeInstance).getTimeZeroReference().toString()));
		}
	}

	protected void setStartOfTimeSpan() throws MigrationException {
		newTypeInstance.setStartOfTimeSpan(((edu.pitt.apollo.types.v3_1_0.TimeSpanCategoryDefinition) oldTypeInstance).getStartOfTimeSpan());
	}

	protected void setDurationInTimeUnits() throws MigrationException {
		newTypeInstance.setDurationInTimeUnits(((edu.pitt.apollo.types.v3_1_0.TimeSpanCategoryDefinition) oldTypeInstance).getDurationInTimeUnits());
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
			setUnitOfTime();
			setTimeZeroReference();
			setStartOfTimeSpan();
			setDurationInTimeUnits();
		}
	}

}