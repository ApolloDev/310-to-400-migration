package edu.pitt.apollo.apolloversionmigration.output;

public class PopulationSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.Population> {

	public PopulationSetter(Class<edu.pitt.apollo.types.v4_0.Population> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setLocation() throws MigrationException {
		newTypeInstance.setLocation(((edu.pitt.apollo.types.v3_1_0.Population) oldTypeInstance).getLocation());
	}

	protected void setTaxonId() throws MigrationException {
		newTypeInstance.setTaxonId(((edu.pitt.apollo.types.v3_1_0.Population) oldTypeInstance).getTaxonId());
	}

	protected void setCount() throws MigrationException {
		newTypeInstance.setCount(((edu.pitt.apollo.types.v3_1_0.Population) oldTypeInstance).getCount());
	}

	protected void setInfectionAndImmunityCensuses() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.PopulationInfectionAndImmunityCensus oldObj : ((edu.pitt.apollo.types.v3_1_0.Population) oldTypeInstance).getInfectionAndImmunityCensuses()) {
			PopulationInfectionAndImmunityCensusSetter setter = new PopulationInfectionAndImmunityCensusSetter(edu.pitt.apollo.types.v4_0.PopulationInfectionAndImmunityCensus.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.PopulationInfectionAndImmunityCensus newObj = setter.getNewTypeInstance();
			newTypeInstance.getInfectionAndImmunityCensuses().add(newObj);
		}

	}

	protected void setColonizationCensuses() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.PopulationColonizationCensus oldObj : ((edu.pitt.apollo.types.v3_1_0.Population) oldTypeInstance).getColonizationCensuses()) {
			PopulationColonizationCensusSetter setter = new PopulationColonizationCensusSetter(edu.pitt.apollo.types.v4_0.PopulationColonizationCensus.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.PopulationColonizationCensus newObj = setter.getNewTypeInstance();
			newTypeInstance.getColonizationCensuses().add(newObj);
		}

	}

	protected void setIndividualsAndHouseholds() throws MigrationException {
		IndividualsAndHouseholdsSetter setter = new IndividualsAndHouseholdsSetter(edu.pitt.apollo.types.v4_0.IndividualsAndHouseholds.class,((edu.pitt.apollo.types.v3_1_0.Population) oldTypeInstance).getIndividualsAndHouseholds());
		setter.set();
		newTypeInstance.setIndividualsAndHouseholds(setter.getNewTypeInstance());
	}

	protected void setPointerToIndividualsAndHouseholds() throws MigrationException {
		PointerToDataSetter setter = new PointerToDataSetter(edu.pitt.apollo.types.v4_0.PointerToData.class,((edu.pitt.apollo.types.v3_1_0.Population) oldTypeInstance).getPointerToIndividualsAndHouseholds());
		setter.set();
		newTypeInstance.setPointerToIndividualsAndHouseholds(setter.getNewTypeInstance());
	}

	protected void setIndividualBiologyAndBehavior() throws MigrationException {
		IndividualBiologyAndBehaviorSetter setter = new IndividualBiologyAndBehaviorSetter(edu.pitt.apollo.types.v4_0.IndividualBiologyAndBehavior.class,((edu.pitt.apollo.types.v3_1_0.Population) oldTypeInstance).getIndividualBiologyAndBehavior());
		setter.set();
		newTypeInstance.setIndividualBiologyAndBehavior(setter.getNewTypeInstance());
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
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

}