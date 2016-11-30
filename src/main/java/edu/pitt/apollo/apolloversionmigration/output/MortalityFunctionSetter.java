package edu.pitt.apollo.apolloversionmigration.output;

public class MortalityFunctionSetter<T extends edu.pitt.apollo.types.v4_0.MortalityFunction, O extends edu.pitt.apollo.types.v3_1_0.MortalityFunction> extends AbstractSetter<T,O> {

	public MortalityFunctionSetter(Class<T> newTypeClass, O oldTypeInstance) throws MigrationException {
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