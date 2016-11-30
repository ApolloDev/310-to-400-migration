package edu.pitt.apollo.apolloversionmigration.output;

public class IndividualsAndHouseholdsSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.IndividualsAndHouseholds,edu.pitt.apollo.types.v3_1_0.IndividualsAndHouseholds> {

	public IndividualsAndHouseholdsSetter(Class<edu.pitt.apollo.types.v4_0.IndividualsAndHouseholds> newTypeClass, edu.pitt.apollo.types.v3_1_0.IndividualsAndHouseholds oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setIndividuals() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.Individual oldObj : oldTypeInstance.getIndividuals()) {
			IndividualSetter setter = new IndividualSetter(edu.pitt.apollo.types.v4_0.Individual.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.Individual newObj = setter.getNewTypeInstance();
			newTypeInstance.getIndividuals().add(newObj);
		}

	}

	private void setHouseholds() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.Household oldObj : oldTypeInstance.getHouseholds()) {
			HouseholdSetter setter = new HouseholdSetter(edu.pitt.apollo.types.v4_0.Household.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.Household newObj = setter.getNewTypeInstance();
			newTypeInstance.getHouseholds().add(newObj);
		}

	}

	@Override
	public void set() throws MigrationException {
		setIndividuals();
		setHouseholds();
	}

}