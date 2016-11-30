package edu.pitt.apollo.apolloversionmigration.output;

public class RealTimeSpanCategoryDefinitionSetter extends CategoryDefinitionSetter<edu.pitt.apollo.types.v4_0.RealTimeSpanCategoryDefinition,edu.pitt.apollo.types.v3_1_0.RealTimeSpanCategoryDefinition> {

	public RealTimeSpanCategoryDefinitionSetter(Class<edu.pitt.apollo.types.v4_0.RealTimeSpanCategoryDefinition> newTypeClass, edu.pitt.apollo.types.v3_1_0.RealTimeSpanCategoryDefinition oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setOffsetFromUtcInHours() throws MigrationException {
		newTypeInstance.setOffsetFromUtcInHours(oldTypeInstance.getOffsetFromUtcInHours());
	}

	private void setBeginningTime() throws MigrationException {
		newTypeInstance.setBeginningTime(oldTypeInstance.getBeginningTime());
	}

	private void setEndingTime() throws MigrationException {
		newTypeInstance.setEndingTime(oldTypeInstance.getEndingTime());
	}

	@Override
	public void set() throws MigrationException {
		super.set();
		setOffsetFromUtcInHours();
		setBeginningTime();
		setEndingTime();
	}

}