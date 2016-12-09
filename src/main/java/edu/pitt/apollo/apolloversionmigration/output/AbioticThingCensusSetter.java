package edu.pitt.apollo.apolloversionmigration.output;

public class AbioticThingCensusSetter<T extends edu.pitt.apollo.types.v4_0_1.AbioticThingCensus> extends CensusSetter<T> {

	public AbioticThingCensusSetter(Class<T> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setAbioticThing() throws MigrationException {
		if (((edu.pitt.apollo.types.v3_1_0.AbioticThingCensus) oldTypeInstance).getAbioticThing() != null) {
			newTypeInstance.setAbioticThing(edu.pitt.apollo.types.v4_0_1.AbioticThingEnum.valueOf(((edu.pitt.apollo.types.v3_1_0.AbioticThingCensus) oldTypeInstance).getAbioticThing().toString()));
		}
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
			setAbioticThing();
		}
	}

	@Override
	public T getNewTypeInstance() {
		return newTypeInstance;
	}

}