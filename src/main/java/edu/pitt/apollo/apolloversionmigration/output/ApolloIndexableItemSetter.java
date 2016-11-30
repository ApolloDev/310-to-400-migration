package edu.pitt.apollo.apolloversionmigration.output;

public class ApolloIndexableItemSetter<T extends edu.pitt.apollo.types.v4_0.ApolloIndexableItem, O extends edu.pitt.apollo.types.v3_1_0.ApolloIndexableItem> extends AbstractSetter<T,O> {

	public ApolloIndexableItemSetter(Class<T> newTypeClass, O oldTypeInstance) throws MigrationException {
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