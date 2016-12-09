package edu.pitt.apollo.apolloversionmigration.output;

public abstract class VariableCategoryValueTreeSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0_1.VariableCategoryValueTree> {

	public VariableCategoryValueTreeSetter(Class<edu.pitt.apollo.types.v4_0_1.VariableCategoryValueTree> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected abstract void setNVariables() throws MigrationException;
	protected abstract void setRootVariableNode() throws MigrationException;
	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			setNVariables();
			setRootVariableNode();
		}
	}

}