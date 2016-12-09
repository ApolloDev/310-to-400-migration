package edu.pitt.apollo.apolloversionmigration.output;

public class PopulationInfectionAndImmunityCensusDataCellSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0_1.PopulationInfectionAndImmunityCensusDataCell> {

	public PopulationInfectionAndImmunityCensusDataCellSetter(Class<edu.pitt.apollo.types.v4_0_1.PopulationInfectionAndImmunityCensusDataCell> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setAgeRange() throws MigrationException {
		AgeRangeCategoryDefinitionSetter setter = new AgeRangeCategoryDefinitionSetterImpl(edu.pitt.apollo.types.v4_0_1.AgeRangeCategoryDefinition.class,((edu.pitt.apollo.types.v3_1_0.PopulationInfectionAndImmunityCensusDataCell) oldTypeInstance).getAgeRange());
		setter.set();
		newTypeInstance.setAgeRange(setter.getNewTypeInstance());
	}

	protected void setSex() throws MigrationException {
		if (((edu.pitt.apollo.types.v3_1_0.PopulationInfectionAndImmunityCensusDataCell) oldTypeInstance).getSex() != null) {
			newTypeInstance.setSex(edu.pitt.apollo.types.v4_0_1.GenderEnum.valueOf(((edu.pitt.apollo.types.v3_1_0.PopulationInfectionAndImmunityCensusDataCell) oldTypeInstance).getSex().toString()));
		}
	}

	protected void setInfectionState() throws MigrationException {
		if (((edu.pitt.apollo.types.v3_1_0.PopulationInfectionAndImmunityCensusDataCell) oldTypeInstance).getInfectionState() != null) {
			newTypeInstance.setInfectionState(edu.pitt.apollo.types.v4_0_1.InfectionStateEnum.valueOf(((edu.pitt.apollo.types.v3_1_0.PopulationInfectionAndImmunityCensusDataCell) oldTypeInstance).getInfectionState().toString()));
		}
	}

	protected void setDiseaseState() throws MigrationException {
		if (((edu.pitt.apollo.types.v3_1_0.PopulationInfectionAndImmunityCensusDataCell) oldTypeInstance).getDiseaseState() != null) {
			newTypeInstance.setDiseaseState(edu.pitt.apollo.types.v4_0_1.DiseaseOutcomeEnum.valueOf(((edu.pitt.apollo.types.v3_1_0.PopulationInfectionAndImmunityCensusDataCell) oldTypeInstance).getDiseaseState().toString()));
		}
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