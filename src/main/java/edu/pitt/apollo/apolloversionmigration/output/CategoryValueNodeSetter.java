package edu.pitt.apollo.apolloversionmigration.output;

public abstract class CategoryValueNodeSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0_1.CategoryValueNode> {

	public CategoryValueNodeSetter(Class<edu.pitt.apollo.types.v4_0_1.CategoryValueNode> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setCategoryDefinition() throws MigrationException {
		if (((edu.pitt.apollo.types.v3_1_0.Category) oldTypeInstance).getCategoryDefinition() != null) {
			CategoryDefinitionSetter setter = CategoryDefinitionSetterFactory.getSetter(((edu.pitt.apollo.types.v3_1_0.Category) oldTypeInstance).getCategoryDefinition());
			setter.set();
			newTypeInstance.setCategoryDefinition(setter.getNewTypeInstance());
		}

	}

	protected abstract void setValue() throws MigrationException;
	protected abstract void setUnconditionalProbabilityDistribution() throws MigrationException;
	protected abstract void setNextCategoricalVariable() throws MigrationException;
	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			setCategoryDefinition();
			setValue();
			setUnconditionalProbabilityDistribution();
			setNextCategoricalVariable();
		}
	}

}