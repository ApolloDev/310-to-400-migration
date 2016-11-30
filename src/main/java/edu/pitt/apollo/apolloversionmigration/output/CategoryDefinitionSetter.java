package edu.pitt.apollo.apolloversionmigration.output;

public class CategoryDefinitionSetter<T extends edu.pitt.apollo.types.v4_0.CategoryDefinition, O extends edu.pitt.apollo.types.v3_1_0.CategoryDefinition> extends AbstractSetter<T,O> {

	public CategoryDefinitionSetter(Class<T> newTypeClass, O oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	@Override
	public void set() throws MigrationException {
	}

	@Override
	public T getNewTypeInstance() {
		return newTypeInstance;
	}

}