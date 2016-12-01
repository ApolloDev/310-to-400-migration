package edu.pitt.apollo.apolloversionmigration.output;

public abstract class LContaminationSetter<T extends edu.pitt.apollo.types.v4_0.LContamination> extends ApolloIndexableItemSetter<T> {

	public LContaminationSetter(Class<T> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected abstract void setXxx() throws MigrationException;
	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
			setXxx();
		}
	}

	@Override
	public T getNewTypeInstance() {
		return newTypeInstance;
	}

}