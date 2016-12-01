package edu.pitt.apollo.apolloversionmigration.output;

public class ReproductionSetter<T extends edu.pitt.apollo.types.v4_0.Reproduction> extends AbstractSetter<T> {

	public ReproductionSetter(Class<T> newTypeClass, Object oldTypeInstance) throws MigrationException {
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