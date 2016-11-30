package edu.pitt.apollo.apolloversionmigration.output;

public class TriggerDefinitionSetter<T extends edu.pitt.apollo.types.v4_0.TriggerDefinition, O extends edu.pitt.apollo.types.v3_1_0.TriggerDefinition> extends AbstractSetter<T,O> {

	public TriggerDefinitionSetter(Class<T> newTypeClass, O oldTypeInstance) throws MigrationException {
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