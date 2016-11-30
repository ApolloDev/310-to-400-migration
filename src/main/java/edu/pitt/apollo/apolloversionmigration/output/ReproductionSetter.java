package edu.pitt.apollo.apolloversionmigration.output;

public class ReproductionSetter<T extends edu.pitt.apollo.types.v4_0.Reproduction, O extends edu.pitt.apollo.types.v3_1_0.Reproduction> extends AbstractSetter<T,O> {

	public ReproductionSetter(Class<T> newTypeClass, O oldTypeInstance) throws MigrationException {
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