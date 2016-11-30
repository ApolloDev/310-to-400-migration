package edu.pitt.apollo.apolloversionmigration.output;

public class ContaminatedThingCensusSetter extends CensusSetter<edu.pitt.apollo.types.v4_0.ContaminatedThingCensus,edu.pitt.apollo.types.v3_1_0.ContaminatedThingCensus> {

	public ContaminatedThingCensusSetter(Class<edu.pitt.apollo.types.v4_0.ContaminatedThingCensus> newTypeClass, edu.pitt.apollo.types.v3_1_0.ContaminatedThingCensus oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setKindOfThing() throws MigrationException {
		newTypeInstance.setKindOfThing(edu.pitt.apollo.types.v4_0.AbioticThingEnum.fromValue(oldTypeInstance.getKindOfThing().toString()));
	}

	private void setPathogen() throws MigrationException {
		ApolloPathogenCodeSetter setter = new ApolloPathogenCodeSetter(edu.pitt.apollo.types.v4_0.ApolloPathogenCode.class,oldTypeInstance.getPathogen());
		setter.set();
		newTypeInstance.setPathogen(setter.getNewTypeInstance());
	}

	private void setCensusData() throws MigrationException {
		ContaminatedThingCensusDataSetter setter = new ContaminatedThingCensusDataSetter(edu.pitt.apollo.types.v4_0.ContaminatedThingCensusData.class,oldTypeInstance.getCensusData());
		setter.set();
		newTypeInstance.setCensusData(setter.getNewTypeInstance());
	}

	@Override
	public void set() throws MigrationException {
		super.set();
		setKindOfThing();
		setPathogen();
		setCensusData();
	}

}