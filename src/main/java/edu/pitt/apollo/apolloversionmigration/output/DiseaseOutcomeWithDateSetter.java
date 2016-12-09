package edu.pitt.apollo.apolloversionmigration.output;

public class DiseaseOutcomeWithDateSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0_1.DiseaseOutcomeWithDate> {

	public DiseaseOutcomeWithDateSetter(Class<edu.pitt.apollo.types.v4_0_1.DiseaseOutcomeWithDate> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setInfectionOutcome() throws MigrationException {
		if (((edu.pitt.apollo.types.v3_1_0.DiseaseOutcomeWithDate) oldTypeInstance).getInfectionOutcome() != null) {
			newTypeInstance.setInfectionOutcome(edu.pitt.apollo.types.v4_0_1.InfectionOutcomeEnum.valueOf(((edu.pitt.apollo.types.v3_1_0.DiseaseOutcomeWithDate) oldTypeInstance).getInfectionOutcome().toString()));
		}
	}

	protected void setDate() throws MigrationException {
		newTypeInstance.setDate(((edu.pitt.apollo.types.v3_1_0.DiseaseOutcomeWithDate) oldTypeInstance).getDate());
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			setInfectionOutcome();
			setDate();
		}
	}

}