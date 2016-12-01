package edu.pitt.apollo.apolloversionmigration.output;

public class PopulationInfectionAndImmunityCensusDataCellSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.PopulationInfectionAndImmunityCensusDataCell> {

	public PopulationInfectionAndImmunityCensusDataCellSetter(Class<edu.pitt.apollo.types.v4_0.PopulationInfectionAndImmunityCensusDataCell> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setAgeRange() throws MigrationException {
		AgeRangeCategoryDefinitionSetter setter = new AgeRangeCategoryDefinitionSetterImpl(edu.pitt.apollo.types.v4_0.AgeRangeCategoryDefinition.class,((edu.pitt.apollo.types.v3_1_0.PopulationInfectionAndImmunityCensusDataCell) oldTypeInstance).getAgeRange());
		setter.set();
		newTypeInstance.setAgeRange(setter.getNewTypeInstance());
	}

	protected void setSex() throws MigrationException {
		newTypeInstance.setSex(edu.pitt.apollo.types.v4_0.GenderEnum.valueOf(((edu.pitt.apollo.types.v3_1_0.PopulationInfectionAndImmunityCensusDataCell) oldTypeInstance).getSex().toString()));
	}

	protected void setInfectionState() throws MigrationException {
		newTypeInstance.setInfectionState(edu.pitt.apollo.types.v4_0.InfectionStateEnum.valueOf(((edu.pitt.apollo.types.v3_1_0.PopulationInfectionAndImmunityCensusDataCell) oldTypeInstance).getInfectionState().toString()));
	}

	protected void setDiseaseState() throws MigrationException {
		newTypeInstance.setDiseaseState(edu.pitt.apollo.types.v4_0.DiseaseOutcomeEnum.valueOf(((edu.pitt.apollo.types.v3_1_0.PopulationInfectionAndImmunityCensusDataCell) oldTypeInstance).getDiseaseState().toString()));
	}

	protected void setFractionInState() throws MigrationException {
		newTypeInstance.setFractionInState(((edu.pitt.apollo.types.v3_1_0.PopulationInfectionAndImmunityCensusDataCell) oldTypeInstance).getFractionInState());
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			setAgeRange();
			setSex();
			setInfectionState();
			setDiseaseState();
			setFractionInState();
		}
	}

}