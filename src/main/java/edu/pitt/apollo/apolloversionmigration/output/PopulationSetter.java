package edu.pitt.apollo.apolloversionmigration.output;

public class PopulationSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.Population,edu.pitt.apollo.types.v3_1_0.Population> {

	public PopulationSetter(Class<edu.pitt.apollo.types.v4_0.Population> newTypeClass, edu.pitt.apollo.types.v3_1_0.Population oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setLocation() throws MigrationException {
		newTypeInstance.setLocation(oldTypeInstance.getLocation());
	}

	private void setTaxonId() throws MigrationException {
		newTypeInstance.setTaxonId(oldTypeInstance.getTaxonId());
	}

	private void setCount() throws MigrationException {
		newTypeInstance.setCount(oldTypeInstance.getCount());
	}

	private void setInfectionAndImmunityCensuses() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.PopulationInfectionAndImmunityCensus oldObj : oldTypeInstance.getInfectionAndImmunityCensuses()) {
			PopulationInfectionAndImmunityCensusSetter setter = new PopulationInfectionAndImmunityCensusSetter(edu.pitt.apollo.types.v4_0.PopulationInfectionAndImmunityCensus.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.PopulationInfectionAndImmunityCensus newObj = setter.getNewTypeInstance();
			newTypeInstance.getInfectionAndImmunityCensuses().add(newObj);
		}

	}

	private void setColonizationCensuses() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.PopulationColonizationCensus oldObj : oldTypeInstance.getColonizationCensuses()) {
			PopulationColonizationCensusSetter setter = new PopulationColonizationCensusSetter(edu.pitt.apollo.types.v4_0.PopulationColonizationCensus.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.PopulationColonizationCensus newObj = setter.getNewTypeInstance();
			newTypeInstance.getColonizationCensuses().add(newObj);
		}

	}

	private void setIndividualsAndHouseholds() throws MigrationException {
		IndividualsAndHouseholdsSetter setter = new IndividualsAndHouseholdsSetter(edu.pitt.apollo.types.v4_0.IndividualsAndHouseholds.class,oldTypeInstance.getIndividualsAndHouseholds());
		setter.set();
		newTypeInstance.setIndividualsAndHouseholds(setter.getNewTypeInstance());
	}

	private void setPointerToIndividualsAndHouseholds() throws MigrationException {
		PointerToDataSetter setter = new PointerToDataSetter(edu.pitt.apollo.types.v4_0.PointerToData.class,oldTypeInstance.getPointerToIndividualsAndHouseholds());
		setter.set();
		newTypeInstance.setPointerToIndividualsAndHouseholds(setter.getNewTypeInstance());
	}

	private void setIndividualBiologyAndBehavior() throws MigrationException {
		IndividualBiologyAndBehaviorSetter setter = new IndividualBiologyAndBehaviorSetter(edu.pitt.apollo.types.v4_0.IndividualBiologyAndBehavior.class,oldTypeInstance.getIndividualBiologyAndBehavior());
		setter.set();
		newTypeInstance.setIndividualBiologyAndBehavior(setter.getNewTypeInstance());
	}

	@Override
	public void set() throws MigrationException {
		setLocation();
		setTaxonId();
		setCount();
		setInfectionAndImmunityCensuses();
		setColonizationCensuses();
		setIndividualsAndHouseholds();
		setPointerToIndividualsAndHouseholds();
		setIndividualBiologyAndBehavior();
	}

}