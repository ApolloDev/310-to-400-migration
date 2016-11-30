package edu.pitt.apollo.apolloversionmigration.output;

public class IndividualInfectionSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.IndividualInfection,edu.pitt.apollo.types.v3_1_0.IndividualInfection> {

	public IndividualInfectionSetter(Class<edu.pitt.apollo.types.v4_0.IndividualInfection> newTypeClass, edu.pitt.apollo.types.v3_1_0.IndividualInfection oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setPathogenId() throws MigrationException {
		newTypeInstance.setPathogenId(oldTypeInstance.getPathogenId());
	}

	private void setInfectionOutcomesWithDates() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.InfectionOutcomeWithDate oldObj : oldTypeInstance.getInfectionOutcomesWithDates()) {
			InfectionOutcomeWithDateSetter setter = new InfectionOutcomeWithDateSetter(edu.pitt.apollo.types.v4_0.InfectionOutcomeWithDate.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.InfectionOutcomeWithDate newObj = setter.getNewTypeInstance();
			newTypeInstance.getInfectionOutcomesWithDates().add(newObj);
		}

	}

	@Override
	public void set() throws MigrationException {
		setPathogenId();
		setInfectionOutcomesWithDates();
	}

}