package edu.pitt.apollo.apolloversionmigration.output;

import edu.pitt.apollo.types.v3_1_0.UnconditionalProbabilityDistribution;

public class CategoryValueNodeSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.CategoryValueNode,edu.pitt.apollo.types.v3_1_0.Category> {

	public CategoryValueNodeSetter(Class<edu.pitt.apollo.types.v4_0.CategoryValueNode> newTypeClass, edu.pitt.apollo.types.v3_1_0.Category oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setCategoryDefinition() throws MigrationException {
		CategoryDefinitionSetter setter = CategoryDefinitionSetterFactory.getSetter(oldTypeInstance.getCategoryDefinition());
		setter.set();
		newTypeInstance.setCategoryDefinition(setter.getNewTypeInstance());
	}

	private void setValue() throws MigrationException {
		newTypeInstance.setValue(null);
	}

	private void setUnconditionalProbabilityDistribution() throws MigrationException {
		UnconditionalProbabilityDistributionSetter setter = UnconditionalProbabilityDistributionSetterFactory.getSetter(oldTypeInstance.getUnconditionalProbabilityDistribution());
		setter.set();
		newTypeInstance.setUnconditionalProbabilityDistribution(setter.getNewTypeInstance());
	}

	private void setNextCategoricalVariable() throws MigrationException {
		CategoricalVariableNodeSetter setter = new CategoricalVariableNodeSetter(edu.pitt.apollo.types.v4_0.CategoricalVariableNode.class,oldTypeInstance.getConditioningVariable());
		setter.set();
		newTypeInstance.setNextCategoricalVariable(setter.getNewTypeInstance());
	}

	@Override
	public void set() throws MigrationException {
		setCategoryDefinition();
		setValue();
		setUnconditionalProbabilityDistribution();
		setNextCategoricalVariable();
	}

}