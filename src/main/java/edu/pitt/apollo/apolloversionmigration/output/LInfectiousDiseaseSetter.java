package edu.pitt.apollo.apolloversionmigration.output;

public abstract class LInfectiousDiseaseSetter<T extends edu.pitt.apollo.types.v4_0.LInfectiousDisease> extends ApolloIndexableItemSetter<T> {

	public LInfectiousDiseaseSetter(Class<T> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected abstract void setCoosalPathogen() throws MigrationException;
	protected abstract void setHoostSpecies() throws MigrationException;
	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
			setCoosalPathogen();
			setHoostSpecies();
		}
	}

	@Override
	public T getNewTypeInstance() {
		return newTypeInstance;
	}

}