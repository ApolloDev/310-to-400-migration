package edu.pitt.apollo.apolloversionmigration.output;

public class PopulationInfectionAndImmunityCensusDataSetter extends CensusDataSetter<edu.pitt.apollo.types.v4_0.PopulationInfectionAndImmunityCensusData,edu.pitt.apollo.types.v3_1_0.PopulationInfectionAndImmunityCensusData> {

	public PopulationInfectionAndImmunityCensusDataSetter(Class<edu.pitt.apollo.types.v4_0.PopulationInfectionAndImmunityCensusData> newTypeClass, edu.pitt.apollo.types.v3_1_0.PopulationInfectionAndImmunityCensusData oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setCensusDataCells() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.PopulationInfectionAndImmunityCensusDataCell oldObj : oldTypeInstance.getCensusDataCells()) {
			PopulationInfectionAndImmunityCensusDataCellSetter setter = new PopulationInfectionAndImmunityCensusDataCellSetter(edu.pitt.apollo.types.v4_0.PopulationInfectionAndImmunityCensusDataCell.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.PopulationInfectionAndImmunityCensusDataCell newObj = setter.getNewTypeInstance();
			newTypeInstance.getCensusDataCells().add(newObj);
		}

	}

	private void setExceptionSubpopulations() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.PopulationInfectionAndImmunityCensusData oldObj : oldTypeInstance.getExceptionSubpopulations()) {
			PopulationInfectionAndImmunityCensusDataSetter setter = new PopulationInfectionAndImmunityCensusDataSetter(edu.pitt.apollo.types.v4_0.PopulationInfectionAndImmunityCensusData.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.PopulationInfectionAndImmunityCensusData newObj = setter.getNewTypeInstance();
			newTypeInstance.getExceptionSubpopulations().add(newObj);
		}

	}

	@Override
	public void set() throws MigrationException {
		super.set();
		setCensusDataCells();
		setExceptionSubpopulations();
	}

}