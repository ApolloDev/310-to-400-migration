package edu.pitt.apollo.apolloversionmigration.output;

public class ContaminatedThingCensusSetter extends CensusSetter<edu.pitt.apollo.types.v4_0.ContaminatedThingCensus> {

	public ContaminatedThingCensusSetter(Class<edu.pitt.apollo.types.v4_0.ContaminatedThingCensus> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setKindOfThing() throws MigrationException {
		newTypeInstance.setKindOfThing(edu.pitt.apollo.types.v4_0.AbioticThingEnum.valueOf(((edu.pitt.apollo.types.v3_1_0.ContaminatedThingCensus) oldTypeInstance).getKindOfThing().toString()));
	}

	protected void setPathogen() throws MigrationException {
		ApolloPathogenCodeSetter setter = new ApolloPathogenCodeSetter(edu.pitt.apollo.types.v4_0.ApolloPathogenCode.class,((edu.pitt.apollo.types.v3_1_0.ContaminatedThingCensus) oldTypeInstance).getPathogen());
		setter.set();
		newTypeInstance.setPathogen(setter.getNewTypeInstance());
	}

	protected void setCensusData() throws MigrationException {
		ContaminatedThingCensusDataSetter setter = new ContaminatedThingCensusDataSetter(edu.pitt.apollo.types.v4_0.ContaminatedThingCensusData.class,((edu.pitt.apollo.types.v3_1_0.ContaminatedThingCensus) oldTypeInstance).getCensusData());
		setter.set();
		newTypeInstance.setCensusData(setter.getNewTypeInstance());
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
			setKindOfThing();
			setPathogen();
			setCensusData();
		}
	}

}