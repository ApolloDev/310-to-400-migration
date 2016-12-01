package edu.pitt.apollo.apolloversionmigration.output;

public class RealTimePointCategoryDefinitionSetter extends CategoryDefinitionSetter<edu.pitt.apollo.types.v4_0.RealTimePointCategoryDefinition> {

	public RealTimePointCategoryDefinitionSetter(Class<edu.pitt.apollo.types.v4_0.RealTimePointCategoryDefinition> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setOffsetFromUtcInHours() throws MigrationException {
		newTypeInstance.setOffsetFromUtcInHours(((edu.pitt.apollo.types.v3_1_0.RealTimePointCategoryDefinition) oldTypeInstance).getOffsetFromUtcInHours());
	}

	protected void setDate() throws MigrationException {
		newTypeInstance.setDate(((edu.pitt.apollo.types.v3_1_0.RealTimePointCategoryDefinition) oldTypeInstance).getDate());
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
			setOffsetFromUtcInHours();
			setDate();
		}
	}

}