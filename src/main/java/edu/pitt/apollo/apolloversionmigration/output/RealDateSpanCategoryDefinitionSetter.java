package edu.pitt.apollo.apolloversionmigration.output;

public class RealDateSpanCategoryDefinitionSetter extends CategoryDefinitionSetter<edu.pitt.apollo.types.v4_0.RealDateSpanCategoryDefinition> {

	public RealDateSpanCategoryDefinitionSetter(Class<edu.pitt.apollo.types.v4_0.RealDateSpanCategoryDefinition> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setOffsetFromUtcInHours() throws MigrationException {
		newTypeInstance.setOffsetFromUtcInHours(((edu.pitt.apollo.types.v3_1_0.RealDateSpanCategoryDefinition) oldTypeInstance).getOffsetFromUtcInHours());
	}

	protected void setFirstDay() throws MigrationException {
		newTypeInstance.setFirstDay(((edu.pitt.apollo.types.v3_1_0.RealDateSpanCategoryDefinition) oldTypeInstance).getFirstDay());
	}

	protected void setLastDay() throws MigrationException {
		newTypeInstance.setLastDay(((edu.pitt.apollo.types.v3_1_0.RealDateSpanCategoryDefinition) oldTypeInstance).getLastDay());
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
			setOffsetFromUtcInHours();
			setFirstDay();
			setLastDay();
		}
	}

}