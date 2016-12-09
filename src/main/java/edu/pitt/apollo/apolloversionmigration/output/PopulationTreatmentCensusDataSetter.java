package edu.pitt.apollo.apolloversionmigration.output;

public class PopulationTreatmentCensusDataSetter extends CensusDataSetter<edu.pitt.apollo.types.v4_0_1.PopulationTreatmentCensusData> {

	public PopulationTreatmentCensusDataSetter(Class<edu.pitt.apollo.types.v4_0_1.PopulationTreatmentCensusData> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setTreatmentCensusDataCells() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.PopulationTreatmentCensusDataCell oldObj : ((edu.pitt.apollo.types.v3_1_0.PopulationTreatmentCensusData) oldTypeInstance).getTreatmentCensusDataCells()) {
			PopulationTreatmentCensusDataCellSetter setter = new PopulationTreatmentCensusDataCellSetter(edu.pitt.apollo.types.v4_0_1.PopulationTreatmentCensusDataCell.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0_1.PopulationTreatmentCensusDataCell newObj = setter.getNewTypeInstance();
			newTypeInstance.getTreatmentCensusDataCells().add(newObj);
		}

	}

	protected void setExceptionSubpopulations() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.PopulationTreatmentCensusData oldObj : ((edu.pitt.apollo.types.v3_1_0.PopulationTreatmentCensusData) oldTypeInstance).getExceptionSubpopulations()) {
			PopulationTreatmentCensusDataSetter setter = new PopulationTreatmentCensusDataSetter(edu.pitt.apollo.types.v4_0_1.PopulationTreatmentCensusData.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0_1.PopulationTreatmentCensusData newObj = setter.getNewTypeInstance();
			newTypeInstance.getExceptionSubpopulations().add(newObj);
		}

	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
			setTreatmentCensusDataCells();
			setExceptionSubpopulations();
		}
	}

}