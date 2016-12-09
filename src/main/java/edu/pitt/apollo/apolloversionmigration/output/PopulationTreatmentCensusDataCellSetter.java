package edu.pitt.apollo.apolloversionmigration.output;

public class PopulationTreatmentCensusDataCellSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0_1.PopulationTreatmentCensusDataCell> {

	public PopulationTreatmentCensusDataCellSetter(Class<edu.pitt.apollo.types.v4_0_1.PopulationTreatmentCensusDataCell> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setAgeRange() throws MigrationException {
		AgeRangeCategoryDefinitionSetter setter = new AgeRangeCategoryDefinitionSetterImpl(edu.pitt.apollo.types.v4_0_1.AgeRangeCategoryDefinition.class,((edu.pitt.apollo.types.v3_1_0.PopulationTreatmentCensusDataCell) oldTypeInstance).getAgeRange());
		setter.set();
		newTypeInstance.setAgeRange(setter.getNewTypeInstance());
	}

	protected void setSex() throws MigrationException {
		if (((edu.pitt.apollo.types.v3_1_0.PopulationTreatmentCensusDataCell) oldTypeInstance).getSex() != null) {
			newTypeInstance.setSex(edu.pitt.apollo.types.v4_0_1.GenderEnum.valueOf(((edu.pitt.apollo.types.v3_1_0.PopulationTreatmentCensusDataCell) oldTypeInstance).getSex().toString()));
		}
	}

	protected void setTreatmentState() throws MigrationException {
		if (((edu.pitt.apollo.types.v3_1_0.PopulationTreatmentCensusDataCell) oldTypeInstance).getTreatmentState() != null) {
			newTypeInstance.setTreatmentState(edu.pitt.apollo.types.v4_0_1.TreatmentStateEnum.valueOf(((edu.pitt.apollo.types.v3_1_0.PopulationTreatmentCensusDataCell) oldTypeInstance).getTreatmentState().toString()));
		}
	}

	protected void setFractionInTreatmentState() throws MigrationException {
		newTypeInstance.setFractionInTreatmentState(((edu.pitt.apollo.types.v3_1_0.PopulationTreatmentCensusDataCell) oldTypeInstance).getFractionInTreatmentState());
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			setAgeRange();
			setSex();
			setTreatmentState();
			setFractionInTreatmentState();
		}
	}

}