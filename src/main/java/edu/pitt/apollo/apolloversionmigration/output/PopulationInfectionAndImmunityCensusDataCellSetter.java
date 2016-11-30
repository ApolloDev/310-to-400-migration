package edu.pitt.apollo.apolloversionmigration.output;

public class PopulationInfectionAndImmunityCensusDataCellSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.PopulationInfectionAndImmunityCensusDataCell,edu.pitt.apollo.types.v3_1_0.PopulationInfectionAndImmunityCensusDataCell> {

	public PopulationInfectionAndImmunityCensusDataCellSetter(Class<edu.pitt.apollo.types.v4_0.PopulationInfectionAndImmunityCensusDataCell> newTypeClass, edu.pitt.apollo.types.v3_1_0.PopulationInfectionAndImmunityCensusDataCell oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setAgeRange() throws MigrationException {
		AgeRangeCategoryDefinitionSetter setter = new AgeRangeCategoryDefinitionSetter(edu.pitt.apollo.types.v4_0.AgeRangeCategoryDefinition.class,oldTypeInstance.getAgeRange());
		setter.set();
		newTypeInstance.setAgeRange(setter.getNewTypeInstance());
	}

	private void setSex() throws MigrationException {
		newTypeInstance.setSex(edu.pitt.apollo.types.v4_0.GenderEnum.fromValue(oldTypeInstance.getSex().toString()));
	}

	private void setInfectionState() throws MigrationException {
		newTypeInstance.setInfectionState(edu.pitt.apollo.types.v4_0.InfectionStateEnum.fromValue(oldTypeInstance.getInfectionState().toString()));
	}

	private void setDiseaseState() throws MigrationException {
		newTypeInstance.setDiseaseState(edu.pitt.apollo.types.v4_0.DiseaseOutcomeEnum.fromValue(oldTypeInstance.getDiseaseState().toString()));
	}

	private void setFractionInState() throws MigrationException {
		newTypeInstance.setFractionInState(oldTypeInstance.getFractionInState());
	}

	@Override
	public void set() throws MigrationException {
		setAgeRange();
		setSex();
		setInfectionState();
		setDiseaseState();
		setFractionInState();
	}

}