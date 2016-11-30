package edu.pitt.apollo.apolloversionmigration.output;

public class PopulationTreatmentCensusSetter extends CensusSetter<edu.pitt.apollo.types.v4_0.PopulationTreatmentCensus,edu.pitt.apollo.types.v3_1_0.PopulationTreatmentCensus> {

	public PopulationTreatmentCensusSetter(Class<edu.pitt.apollo.types.v4_0.PopulationTreatmentCensus> newTypeClass, edu.pitt.apollo.types.v3_1_0.PopulationTreatmentCensus oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setPopulationSpecies() throws MigrationException {
		newTypeInstance.setPopulationSpecies(oldTypeInstance.getPopulationSpecies());
	}

	private void setTreatmentCensusData() throws MigrationException {
		PopulationTreatmentCensusDataSetter setter = new PopulationTreatmentCensusDataSetter(edu.pitt.apollo.types.v4_0.PopulationTreatmentCensusData.class,oldTypeInstance.getTreatmentCensusData());
		setter.set();
		newTypeInstance.setTreatmentCensusData(setter.getNewTypeInstance());
	}

	@Override
	public void set() throws MigrationException {
		super.set();
		setPopulationSpecies();
		setTreatmentCensusData();
	}

}