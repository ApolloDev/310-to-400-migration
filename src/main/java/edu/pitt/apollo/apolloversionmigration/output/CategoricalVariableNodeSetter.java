package edu.pitt.apollo.apolloversionmigration.output;

public abstract class CategoricalVariableNodeSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0_1.CategoricalVariableNode> {

	public CategoricalVariableNodeSetter(Class<edu.pitt.apollo.types.v4_0_1.CategoricalVariableNode> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected abstract void setName() throws MigrationException;
	protected abstract void setCategories() throws MigrationException;
	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			setName();
			setCategories();
		}
	}

}