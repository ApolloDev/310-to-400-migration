package edu.pitt.apollo.apolloversionmigration.output;

public class ApolloIndexableItemSetter<T extends edu.pitt.apollo.types.v4_0.ApolloIndexableItem> extends AbstractSetter<T> {

	public ApolloIndexableItemSetter(Class<T> newTypeClass, Object oldTypeInstance) throws MigrationException {
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