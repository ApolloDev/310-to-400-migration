package edu.pitt.apollo.apolloversionmigration.output;

public class RealTimeSpanCategoryDefinitionSetter extends CategoryDefinitionSetter<edu.pitt.apollo.types.v4_0.RealTimeSpanCategoryDefinition> {

	public RealTimeSpanCategoryDefinitionSetter(Class<edu.pitt.apollo.types.v4_0.RealTimeSpanCategoryDefinition> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setOffsetFromUtcInHours() throws MigrationException {
		newTypeInstance.setOffsetFromUtcInHours(((edu.pitt.apollo.types.v3_1_0.RealTimeSpanCategoryDefinition) oldTypeInstance).getOffsetFromUtcInHours());
	}

	protected void setBeginningTime() throws MigrationException {
		newTypeInstance.setBeginningTime(((edu.pitt.apollo.types.v3_1_0.RealTimeSpanCategoryDefinition) oldTypeInstance).getBeginningTime());
	}

	protected void setEndingTime() throws MigrationException {
		newTypeInstance.setEndingTime(((edu.pitt.apollo.types.v3_1_0.RealTimeSpanCategoryDefinition) oldTypeInstance).getEndingTime());
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
			setOffsetFromUtcInHours();
			setBeginningTime();
			setEndingTime();
		}
	}

}