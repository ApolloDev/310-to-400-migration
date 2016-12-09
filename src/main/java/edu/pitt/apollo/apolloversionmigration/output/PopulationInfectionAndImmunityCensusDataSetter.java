package edu.pitt.apollo.apolloversionmigration.output;

public class PopulationInfectionAndImmunityCensusDataSetter extends CensusDataSetter<edu.pitt.apollo.types.v4_0_1.PopulationInfectionAndImmunityCensusData> {

	public PopulationInfectionAndImmunityCensusDataSetter(Class<edu.pitt.apollo.types.v4_0_1.PopulationInfectionAndImmunityCensusData> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setCensusDataCells() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.PopulationInfectionAndImmunityCensusDataCell oldObj : ((edu.pitt.apollo.types.v3_1_0.PopulationInfectionAndImmunityCensusData) oldTypeInstance).getCensusDataCells()) {
			PopulationInfectionAndImmunityCensusDataCellSetter setter = new PopulationInfectionAndImmunityCensusDataCellSetter(edu.pitt.apollo.types.v4_0_1.PopulationInfectionAndImmunityCensusDataCell.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0_1.PopulationInfectionAndImmunityCensusDataCell newObj = setter.getNewTypeInstance();
			newTypeInstance.getCensusDataCells().add(newObj);
		}

	}

	protected void setExceptionSubpopulations() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.PopulationInfectionAndImmunityCensusData oldObj : ((edu.pitt.apollo.types.v3_1_0.PopulationInfectionAndImmunityCensusData) oldTypeInstance).getExceptionSubpopulations()) {
			PopulationInfectionAndImmunityCensusDataSetter setter = new PopulationInfectionAndImmunityCensusDataSetter(edu.pitt.apollo.types.v4_0_1.PopulationInfectionAndImmunityCensusData.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0_1.PopulationInfectionAndImmunityCensusData newObj = setter.getNewTypeInstance();
			newTypeInstance.getExceptionSubpopulations().add(newObj);
		}

	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
			setCensusDataCells();
			setExceptionSubpopulations();
		}
	}

}