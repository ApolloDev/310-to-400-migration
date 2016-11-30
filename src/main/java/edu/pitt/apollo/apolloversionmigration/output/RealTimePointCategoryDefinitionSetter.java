package edu.pitt.apollo.apolloversionmigration.output;

public class RealTimePointCategoryDefinitionSetter extends CategoryDefinitionSetter<edu.pitt.apollo.types.v4_0.RealTimePointCategoryDefinition,edu.pitt.apollo.types.v3_1_0.RealTimePointCategoryDefinition> {

	public RealTimePointCategoryDefinitionSetter(Class<edu.pitt.apollo.types.v4_0.RealTimePointCategoryDefinition> newTypeClass, edu.pitt.apollo.types.v3_1_0.RealTimePointCategoryDefinition oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setOffsetFromUtcInHours() throws MigrationException {
		newTypeInstance.setOffsetFromUtcInHours(oldTypeInstance.getOffsetFromUtcInHours());
	}

	private void setDate() throws MigrationException {
		newTypeInstance.setDate(oldTypeInstance.getDate());
	}

	@Override
	public void set() throws MigrationException {
		super.set();
		setOffsetFromUtcInHours();
		setDate();
	}

}