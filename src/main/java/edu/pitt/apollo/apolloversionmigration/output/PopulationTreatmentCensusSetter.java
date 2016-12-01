package edu.pitt.apollo.apolloversionmigration.output;

public class PopulationTreatmentCensusSetter extends CensusSetter<edu.pitt.apollo.types.v4_0.PopulationTreatmentCensus> {

	public PopulationTreatmentCensusSetter(Class<edu.pitt.apollo.types.v4_0.PopulationTreatmentCensus> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setPopulationSpecies() throws MigrationException {
		newTypeInstance.setPopulationSpecies(((edu.pitt.apollo.types.v3_1_0.PopulationTreatmentCensus) oldTypeInstance).getPopulationSpecies());
	}

	protected void setTreatmentCensusData() throws MigrationException {
		PopulationTreatmentCensusDataSetter setter = new PopulationTreatmentCensusDataSetter(edu.pitt.apollo.types.v4_0.PopulationTreatmentCensusData.class,((edu.pitt.apollo.types.v3_1_0.PopulationTreatmentCensus) oldTypeInstance).getTreatmentCensusData());
		setter.set();
		newTypeInstance.setTreatmentCensusData(setter.getNewTypeInstance());
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
			setPopulationSpecies();
			setTreatmentCensusData();
		}
	}

}