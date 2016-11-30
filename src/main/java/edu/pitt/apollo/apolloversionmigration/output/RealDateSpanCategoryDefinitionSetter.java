package edu.pitt.apollo.apolloversionmigration.output;

public class RealDateSpanCategoryDefinitionSetter extends CategoryDefinitionSetter<edu.pitt.apollo.types.v4_0.RealDateSpanCategoryDefinition,edu.pitt.apollo.types.v3_1_0.RealDateSpanCategoryDefinition> {

	public RealDateSpanCategoryDefinitionSetter(Class<edu.pitt.apollo.types.v4_0.RealDateSpanCategoryDefinition> newTypeClass, edu.pitt.apollo.types.v3_1_0.RealDateSpanCategoryDefinition oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setOffsetFromUtcInHours() throws MigrationException {
		newTypeInstance.setOffsetFromUtcInHours(oldTypeInstance.getOffsetFromUtcInHours());
	}

	private void setFirstDay() throws MigrationException {
		newTypeInstance.setFirstDay(oldTypeInstance.getFirstDay());
	}

	private void setLastDay() throws MigrationException {
		newTypeInstance.setLastDay(oldTypeInstance.getLastDay());
	}

	@Override
	public void set() throws MigrationException {
		super.set();
		setOffsetFromUtcInHours();
		setFirstDay();
		setLastDay();
	}

}