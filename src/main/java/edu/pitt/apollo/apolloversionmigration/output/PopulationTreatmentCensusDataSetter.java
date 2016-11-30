package edu.pitt.apollo.apolloversionmigration.output;

public class PopulationTreatmentCensusDataSetter extends CensusDataSetter<edu.pitt.apollo.types.v4_0.PopulationTreatmentCensusData,edu.pitt.apollo.types.v3_1_0.PopulationTreatmentCensusData> {

	public PopulationTreatmentCensusDataSetter(Class<edu.pitt.apollo.types.v4_0.PopulationTreatmentCensusData> newTypeClass, edu.pitt.apollo.types.v3_1_0.PopulationTreatmentCensusData oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setTreatmentCensusDataCells() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.PopulationTreatmentCensusDataCell oldObj : oldTypeInstance.getTreatmentCensusDataCells()) {
			PopulationTreatmentCensusDataCellSetter setter = new PopulationTreatmentCensusDataCellSetter(edu.pitt.apollo.types.v4_0.PopulationTreatmentCensusDataCell.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.PopulationTreatmentCensusDataCell newObj = setter.getNewTypeInstance();
			newTypeInstance.getTreatmentCensusDataCells().add(newObj);
		}

	}

	private void setExceptionSubpopulations() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.PopulationTreatmentCensusData oldObj : oldTypeInstance.getExceptionSubpopulations()) {
			PopulationTreatmentCensusDataSetter setter = new PopulationTreatmentCensusDataSetter(edu.pitt.apollo.types.v4_0.PopulationTreatmentCensusData.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.PopulationTreatmentCensusData newObj = setter.getNewTypeInstance();
			newTypeInstance.getExceptionSubpopulations().add(newObj);
		}

	}

	@Override
	public void set() throws MigrationException {
		super.set();
		setTreatmentCensusDataCells();
		setExceptionSubpopulations();
	}

}