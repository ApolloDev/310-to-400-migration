package edu.pitt.apollo.apolloversionmigration.output;

public class UncertainValueSetter<T extends edu.pitt.apollo.types.v4_0.UncertainValue, O extends edu.pitt.apollo.types.v3_1_0.UncertainValue> extends AbstractSetter<T,O> {

	public UncertainValueSetter(Class<T> newTypeClass, O oldTypeInstance) throws MigrationException {
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