package edu.pitt.apollo.apolloversionmigration.output;

public class IndividualInfectionSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.IndividualInfection> {

	public IndividualInfectionSetter(Class<edu.pitt.apollo.types.v4_0.IndividualInfection> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setPathogenId() throws MigrationException {
		newTypeInstance.setPathogenId(((edu.pitt.apollo.types.v3_1_0.IndividualInfection) oldTypeInstance).getPathogenId());
	}

	protected void setInfectionOutcomesWithDates() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.InfectionOutcomeWithDate oldObj : ((edu.pitt.apollo.types.v3_1_0.IndividualInfection) oldTypeInstance).getInfectionOutcomesWithDates()) {
			InfectionOutcomeWithDateSetter setter = new InfectionOutcomeWithDateSetter(edu.pitt.apollo.types.v4_0.InfectionOutcomeWithDate.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.InfectionOutcomeWithDate newObj = setter.getNewTypeInstance();
			newTypeInstance.getInfectionOutcomesWithDates().add(newObj);
		}

	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			setPathogenId();
			setInfectionOutcomesWithDates();
		}
	}

}