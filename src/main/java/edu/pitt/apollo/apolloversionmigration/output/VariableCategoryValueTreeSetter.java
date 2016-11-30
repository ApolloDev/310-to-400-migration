package edu.pitt.apollo.apolloversionmigration.output;

public class VariableCategoryValueTreeSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.VariableCategoryValueTree,edu.pitt.apollo.types.v3_1_0.CaseCountArray> {

	public VariableCategoryValueTreeSetter(Class<edu.pitt.apollo.types.v4_0.VariableCategoryValueTree> newTypeClass, edu.pitt.apollo.types.v3_1_0.CaseCountArray oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setNVariables() throws MigrationException {
		newTypeInstance.setNVariables(oldTypeInstance.getNDimensions());
	}

	private void setRootVariableNode() throws MigrationException {
		CategoricalVariableNodeArrayAxisSetter setter = new CategoricalVariableNodeArrayAxisSetter(edu.pitt.apollo.types.v4_0.CategoricalVariableNode.class,oldTypeInstance.getFirstArrayAxis());
		setter.set();
		newTypeInstance.setRootVariableNode(setter.getNewTypeInstance());
	}

	@Override
	public void set() throws MigrationException {
		setNVariables();
		setRootVariableNode();
	}

}