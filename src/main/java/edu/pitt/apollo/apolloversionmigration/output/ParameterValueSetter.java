package edu.pitt.apollo.apolloversionmigration.output;

public class ParameterValueSetter<T extends edu.pitt.apollo.types.v4_0.ParameterValue, O extends edu.pitt.apollo.types.v3_1_0.ParameterValue> extends AbstractSetter<T,O> {

	public ParameterValueSetter(Class<T> newTypeClass, O oldTypeInstance) throws MigrationException {
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