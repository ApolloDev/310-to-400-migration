package edu.pitt.apollo.apolloversionmigration.output;

public class CategoryDefinitionSetter<T extends edu.pitt.apollo.types.v4_0_1.CategoryDefinition> extends AbstractSetter<T> {

	public CategoryDefinitionSetter(Class<T> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
		}
	}

	@Override
	public T getNewTypeInstance() {
		return newTypeInstance;
	}

}