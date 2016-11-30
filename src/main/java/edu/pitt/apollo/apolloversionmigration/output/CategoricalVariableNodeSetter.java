package edu.pitt.apollo.apolloversionmigration.output;

public class CategoricalVariableNodeSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.CategoricalVariableNode,edu.pitt.apollo.types.v3_1_0.ConditioningVariable> {

	public CategoricalVariableNodeSetter(Class<edu.pitt.apollo.types.v4_0.CategoricalVariableNode> newTypeClass, edu.pitt.apollo.types.v3_1_0.ConditioningVariable oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setName() throws MigrationException {
		newTypeInstance.setName(edu.pitt.apollo.types.v4_0.CategoricalVariableEnum.fromValue(oldTypeInstance.getName().toString()));
	}

	private void setCategories() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.Category oldObj : oldTypeInstance.getCategories()) {
			CategoryValueNodeSetter setter = new CategoryValueNodeSetter(edu.pitt.apollo.types.v4_0.CategoryValueNode.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.CategoryValueNode newObj = setter.getNewTypeInstance();
			newTypeInstance.getCategories().add(newObj);
		}

	}

	@Override
	public void set() throws MigrationException {
		setName();
		setCategories();
	}

}