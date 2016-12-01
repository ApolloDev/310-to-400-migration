package edu.pitt.apollo.apolloversionmigration.output;

public class PopulationInfectionAndImmunityCensusSetter extends CensusSetter<edu.pitt.apollo.types.v4_0.PopulationInfectionAndImmunityCensus> {

	public PopulationInfectionAndImmunityCensusSetter(Class<edu.pitt.apollo.types.v4_0.PopulationInfectionAndImmunityCensus> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setPathogen() throws MigrationException {
		ApolloPathogenCodeSetter setter = new ApolloPathogenCodeSetter(edu.pitt.apollo.types.v4_0.ApolloPathogenCode.class,((edu.pitt.apollo.types.v3_1_0.PopulationInfectionAndImmunityCensus) oldTypeInstance).getPathogen());
		setter.set();
		newTypeInstance.setPathogen(setter.getNewTypeInstance());
	}

	protected void setCensusData() throws MigrationException {
		PopulationInfectionAndImmunityCensusDataSetter setter = new PopulationInfectionAndImmunityCensusDataSetter(edu.pitt.apollo.types.v4_0.PopulationInfectionAndImmunityCensusData.class,((edu.pitt.apollo.types.v3_1_0.PopulationInfectionAndImmunityCensus) oldTypeInstance).getCensusData());
		setter.set();
		newTypeInstance.setCensusData(setter.getNewTypeInstance());
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
			setPathogen();
			setCensusData();
		}
	}

}