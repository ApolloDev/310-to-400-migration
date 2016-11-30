package edu.pitt.apollo.apolloversionmigration.output;

public class PopulationTreatmentCensusDataCellSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.PopulationTreatmentCensusDataCell,edu.pitt.apollo.types.v3_1_0.PopulationTreatmentCensusDataCell> {

	public PopulationTreatmentCensusDataCellSetter(Class<edu.pitt.apollo.types.v4_0.PopulationTreatmentCensusDataCell> newTypeClass, edu.pitt.apollo.types.v3_1_0.PopulationTreatmentCensusDataCell oldTypeInstance) throws MigrationException {
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

	private void setTreatmentState() throws MigrationException {
		newTypeInstance.setTreatmentState(edu.pitt.apollo.types.v4_0.TreatmentStateEnum.fromValue(oldTypeInstance.getTreatmentState().toString()));
	}

	private void setFractionInTreatmentState() throws MigrationException {
		newTypeInstance.setFractionInTreatmentState(oldTypeInstance.getFractionInTreatmentState());
	}

	@Override
	public void set() throws MigrationException {
		setAgeRange();
		setSex();
		setTreatmentState();
		setFractionInTreatmentState();
	}

}