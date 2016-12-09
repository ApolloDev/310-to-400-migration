package edu.pitt.apollo.apolloversionmigration.output;

public class UncertainValueSetter<T extends edu.pitt.apollo.types.v4_0_1.UncertainValue> extends AbstractSetter<T> {

	public UncertainValueSetter(Class<T> newTypeClass, Object oldTypeInstance) throws MigrationException {
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