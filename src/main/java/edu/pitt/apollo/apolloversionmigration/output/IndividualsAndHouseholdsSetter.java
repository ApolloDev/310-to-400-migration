package edu.pitt.apollo.apolloversionmigration.output;

public class IndividualsAndHouseholdsSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.IndividualsAndHouseholds> {

	public IndividualsAndHouseholdsSetter(Class<edu.pitt.apollo.types.v4_0.IndividualsAndHouseholds> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setIndividuals() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.Individual oldObj : ((edu.pitt.apollo.types.v3_1_0.IndividualsAndHouseholds) oldTypeInstance).getIndividuals()) {
			IndividualSetter setter = new IndividualSetter(edu.pitt.apollo.types.v4_0.Individual.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.Individual newObj = setter.getNewTypeInstance();
			newTypeInstance.getIndividuals().add(newObj);
		}

	}

	protected void setHouseholds() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.Household oldObj : ((edu.pitt.apollo.types.v3_1_0.IndividualsAndHouseholds) oldTypeInstance).getHouseholds()) {
			HouseholdSetter setter = new HouseholdSetterImpl(edu.pitt.apollo.types.v4_0.Household.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.Household newObj = setter.getNewTypeInstance();
			newTypeInstance.getHouseholds().add(newObj);
		}

	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			setIndividuals();
			setHouseholds();
		}
	}

}