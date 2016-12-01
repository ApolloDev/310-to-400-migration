package edu.pitt.apollo.apolloversionmigration.output;

public class ConditioningVariableSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.ConditioningVariable> {

	public ConditioningVariableSetter(Class<edu.pitt.apollo.types.v4_0.ConditioningVariable> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setName() throws MigrationException {
		newTypeInstance.setName(edu.pitt.apollo.types.v4_0.CategoricalVariableEnum.valueOf(((edu.pitt.apollo.types.v3_1_0.ConditioningVariable) oldTypeInstance).getName().toString()));
	}

	protected void setCategories() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.Category oldObj : ((edu.pitt.apollo.types.v3_1_0.ConditioningVariable) oldTypeInstance).getCategories()) {
			CategoryValueNodeSetter setter = new CategoryValueNodeSetterImpl(edu.pitt.apollo.types.v4_0.CategoryValueNode.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.CategoryValueNode newObj = setter.getNewTypeInstance();
			newTypeInstance.getCategories().add(newObj);
		}

	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			setName();
			setCategories();
		}
	}

}