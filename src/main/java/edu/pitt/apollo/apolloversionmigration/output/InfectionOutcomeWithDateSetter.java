package edu.pitt.apollo.apolloversionmigration.output;

public class InfectionOutcomeWithDateSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0_1.InfectionOutcomeWithDate> {

	public InfectionOutcomeWithDateSetter(Class<edu.pitt.apollo.types.v4_0_1.InfectionOutcomeWithDate> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setInfectionOutcome() throws MigrationException {
		if (((edu.pitt.apollo.types.v3_1_0.InfectionOutcomeWithDate) oldTypeInstance).getInfectionOutcome() != null) {
			newTypeInstance.setInfectionOutcome(edu.pitt.apollo.types.v4_0_1.InfectionOutcomeEnum.valueOf(((edu.pitt.apollo.types.v3_1_0.InfectionOutcomeWithDate) oldTypeInstance).getInfectionOutcome().toString()));
		}
	}

	protected void setDate() throws MigrationException {
		newTypeInstance.setDate(((edu.pitt.apollo.types.v3_1_0.InfectionOutcomeWithDate) oldTypeInstance).getDate());
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			setInfectionOutcome();
			setDate();
		}
	}

}