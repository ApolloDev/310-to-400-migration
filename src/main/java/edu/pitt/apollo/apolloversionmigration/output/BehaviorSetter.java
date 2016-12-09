package edu.pitt.apollo.apolloversionmigration.output;

public class BehaviorSetter<T extends edu.pitt.apollo.types.v4_0_1.Behavior> extends AbstractSetter<T> {

	public BehaviorSetter(Class<T> newTypeClass, Object oldTypeInstance) throws MigrationException {
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