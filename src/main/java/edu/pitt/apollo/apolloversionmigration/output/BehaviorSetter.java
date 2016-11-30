package edu.pitt.apollo.apolloversionmigration.output;

public class BehaviorSetter<T extends edu.pitt.apollo.types.v4_0.Behavior, O extends edu.pitt.apollo.types.v3_1_0.Behavior> extends AbstractSetter<T,O> {

	public BehaviorSetter(Class<T> newTypeClass, O oldTypeInstance) throws MigrationException {
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