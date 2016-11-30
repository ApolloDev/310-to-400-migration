package edu.pitt.apollo.apolloversionmigration.output;

public class AbioticThingCensusSetter<T extends edu.pitt.apollo.types.v4_0.AbioticThingCensus, O extends edu.pitt.apollo.types.v3_1_0.AbioticThingCensus> extends CensusSetter<T,O> {

	public AbioticThingCensusSetter(Class<T> newTypeClass, O oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setAbioticThing() throws MigrationException {
		newTypeInstance.setAbioticThing(edu.pitt.apollo.types.v4_0.AbioticThingEnum.fromValue(oldTypeInstance.getAbioticThing().toString()));
	}

	@Override
	public void set() throws MigrationException {
		super.set();
		setAbioticThing();
	}

	@Override
	public T getNewTypeInstance() {
		return newTypeInstance;
	}

}