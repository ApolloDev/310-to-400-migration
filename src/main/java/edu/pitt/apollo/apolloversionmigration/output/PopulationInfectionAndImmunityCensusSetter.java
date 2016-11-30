package edu.pitt.apollo.apolloversionmigration.output;

public class PopulationInfectionAndImmunityCensusSetter extends CensusSetter<edu.pitt.apollo.types.v4_0.PopulationInfectionAndImmunityCensus,edu.pitt.apollo.types.v3_1_0.PopulationInfectionAndImmunityCensus> {

	public PopulationInfectionAndImmunityCensusSetter(Class<edu.pitt.apollo.types.v4_0.PopulationInfectionAndImmunityCensus> newTypeClass, edu.pitt.apollo.types.v3_1_0.PopulationInfectionAndImmunityCensus oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setPathogen() throws MigrationException {
		ApolloPathogenCodeSetter setter = new ApolloPathogenCodeSetter(edu.pitt.apollo.types.v4_0.ApolloPathogenCode.class,oldTypeInstance.getPathogen());
		setter.set();
		newTypeInstance.setPathogen(setter.getNewTypeInstance());
	}

	private void setCensusData() throws MigrationException {
		PopulationInfectionAndImmunityCensusDataSetter setter = new PopulationInfectionAndImmunityCensusDataSetter(edu.pitt.apollo.types.v4_0.PopulationInfectionAndImmunityCensusData.class,oldTypeInstance.getCensusData());
		setter.set();
		newTypeInstance.setCensusData(setter.getNewTypeInstance());
	}

	@Override
	public void set() throws MigrationException {
		super.set();
		setPathogen();
		setCensusData();
	}

}