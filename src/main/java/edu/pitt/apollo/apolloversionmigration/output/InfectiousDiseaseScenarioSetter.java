package edu.pitt.apollo.apolloversionmigration.output;

public class InfectiousDiseaseScenarioSetter extends ApolloIndexableItemSetter<edu.pitt.apollo.types.v4_0.InfectiousDiseaseScenario,edu.pitt.apollo.types.v3_1_0.InfectiousDiseaseScenario> {

	public InfectiousDiseaseScenarioSetter(Class<edu.pitt.apollo.types.v4_0.InfectiousDiseaseScenario> newTypeClass, edu.pitt.apollo.types.v3_1_0.InfectiousDiseaseScenario oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setScenarioDate() throws MigrationException {
		newTypeInstance.setScenarioDate(oldTypeInstance.getScenarioDate());
	}

	private void setScenarioLocation() throws MigrationException {
		LocationSetter setter = new LocationSetter(edu.pitt.apollo.types.v4_0.Location.class,oldTypeInstance.getScenarioLocation());
		setter.set();
		newTypeInstance.setScenarioLocation(setter.getNewTypeInstance());
	}

	private void setPopulations() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.Population oldObj : oldTypeInstance.getPopulations()) {
			PopulationSetter setter = new PopulationSetter(edu.pitt.apollo.types.v4_0.Population.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.Population newObj = setter.getNewTypeInstance();
			newTypeInstance.getPopulations().add(newObj);
		}

	}

	private void setInfections() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.Infection oldObj : oldTypeInstance.getInfections()) {
			InfectionSetter setter = new InfectionSetter(edu.pitt.apollo.types.v4_0.Infection.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.Infection newObj = setter.getNewTypeInstance();
			newTypeInstance.getInfections().add(newObj);
		}

	}

	private void setColonizations() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.Colonization oldObj : oldTypeInstance.getColonizations()) {
			ColonizationSetter setter = new ColonizationSetter(edu.pitt.apollo.types.v4_0.Colonization.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.Colonization newObj = setter.getNewTypeInstance();
			newTypeInstance.getColonizations().add(newObj);
		}

	}

	private void setContaminations() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.Contamination oldObj : oldTypeInstance.getContaminations()) {
			ContaminationSetter setter = new ContaminationSetter(edu.pitt.apollo.types.v4_0.Contamination.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.Contamination newObj = setter.getNewTypeInstance();
			newTypeInstance.getContaminations().add(newObj);
		}

	}

	private void setContaminatedThingCensuses() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.ContaminatedThingCensus oldObj : oldTypeInstance.getContaminatedThingCensuses()) {
			ContaminatedThingCensusSetter setter = new ContaminatedThingCensusSetter(edu.pitt.apollo.types.v4_0.ContaminatedThingCensus.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.ContaminatedThingCensus newObj = setter.getNewTypeInstance();
			newTypeInstance.getContaminatedThingCensuses().add(newObj);
		}

	}

	private void setAbioticThingCensuses() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.AbioticThingCensus oldObj : oldTypeInstance.getAbioticThingCensuses()) {
			AbioticThingCensusSetter setter = new AbioticThingCensusSetter(edu.pitt.apollo.types.v4_0.AbioticThingCensus.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.AbioticThingCensus newObj = setter.getNewTypeInstance();
			newTypeInstance.getAbioticThingCensuses().add(newObj);
		}

	}

	private void setInfectiousDiseaseControlStrategies() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.InfectiousDiseaseControlMeasure oldObj : oldTypeInstance.getInfectiousDiseaseControlStrategies()) {
			InfectiousDiseaseControlMeasureSetter setter = new InfectiousDiseaseControlMeasureSetter(edu.pitt.apollo.types.v4_0.InfectiousDiseaseControlMeasure.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.InfectiousDiseaseControlMeasure newObj = setter.getNewTypeInstance();
			newTypeInstance.getInfectiousDiseaseControlStrategies().add(newObj);
		}

	}

	private void setScenarioCartesianOrigin() throws MigrationException {
		ScenarioCartesianOriginSetter setter = new ScenarioCartesianOriginSetter(edu.pitt.apollo.types.v4_0.ScenarioCartesianOrigin.class,oldTypeInstance.getScenarioCartesianOrigin());
		setter.set();
		newTypeInstance.setScenarioCartesianOrigin(setter.getNewTypeInstance());
	}

	private void setNonApolloParameters() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.NonApolloParameter oldObj : oldTypeInstance.getNonApolloParameters()) {
			NonApolloParameterSetter setter = new NonApolloParameterSetter(edu.pitt.apollo.types.v4_0.NonApolloParameter.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.NonApolloParameter newObj = setter.getNewTypeInstance();
			newTypeInstance.getNonApolloParameters().add(newObj);
		}

	}

	@Override
	public void set() throws MigrationException {
		super.set();
		setScenarioDate();
		setScenarioLocation();
		setPopulations();
		setInfections();
		setColonizations();
		setContaminations();
		setContaminatedThingCensuses();
		setAbioticThingCensuses();
		setInfectiousDiseaseControlStrategies();
		setScenarioCartesianOrigin();
		setNonApolloParameters();
	}

}