package edu.pitt.apollo.apolloversionmigration.output;

public class InfectionOutcomeWithDateSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.InfectionOutcomeWithDate,edu.pitt.apollo.types.v3_1_0.InfectionOutcomeWithDate> {

	public InfectionOutcomeWithDateSetter(Class<edu.pitt.apollo.types.v4_0.InfectionOutcomeWithDate> newTypeClass, edu.pitt.apollo.types.v3_1_0.InfectionOutcomeWithDate oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setInfectionOutcome() throws MigrationException {
		newTypeInstance.setInfectionOutcome(edu.pitt.apollo.types.v4_0.InfectionOutcomeEnum.fromValue(oldTypeInstance.getInfectionOutcome().toString()));
	}

	private void setDate() throws MigrationException {
		newTypeInstance.setDate(oldTypeInstance.getDate());
	}

	@Override
	public void set() throws MigrationException {
		setInfectionOutcome();
		setDate();
	}

}