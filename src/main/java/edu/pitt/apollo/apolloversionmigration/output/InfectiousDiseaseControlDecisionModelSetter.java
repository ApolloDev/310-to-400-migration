package edu.pitt.apollo.apolloversionmigration.output;

public class InfectiousDiseaseControlDecisionModelSetter extends ApolloIndexableItemSetter<edu.pitt.apollo.types.v4_0.InfectiousDiseaseControlDecisionModel,edu.pitt.apollo.types.v3_1_0.InfectiousDiseaseControlDecisionModel> {

	public InfectiousDiseaseControlDecisionModelSetter(Class<edu.pitt.apollo.types.v4_0.InfectiousDiseaseControlDecisionModel> newTypeClass, edu.pitt.apollo.types.v3_1_0.InfectiousDiseaseControlDecisionModel oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setControlStrategyAlternatives() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.InfectiousDiseaseControlStrategy oldObj : oldTypeInstance.getControlStrategyAlternatives()) {
			InfectiousDiseaseControlStrategySetter setter = new InfectiousDiseaseControlStrategySetter(edu.pitt.apollo.types.v4_0.InfectiousDiseaseControlStrategy.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.InfectiousDiseaseControlStrategy newObj = setter.getNewTypeInstance();
			newTypeInstance.getControlStrategyAlternatives().add(newObj);
		}

	}

	private void setDiseaseTransmissionModelChanceNode() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.ModelIdAndProbability oldObj : oldTypeInstance.getDiseaseTransmissionModelChanceNode()) {
			ModelIdAndProbabilitySetter setter = new ModelIdAndProbabilitySetter(edu.pitt.apollo.types.v4_0.ModelIdAndProbability.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.ModelIdAndProbability newObj = setter.getNewTypeInstance();
			newTypeInstance.getDiseaseTransmissionModelChanceNode().add(newObj);
		}

	}

	private void setInfectiousDiseaseScenarioWithoutIntervention() throws MigrationException {
		InfectiousDiseaseScenarioSetter setter = new InfectiousDiseaseScenarioSetter(edu.pitt.apollo.types.v4_0.InfectiousDiseaseScenario.class,oldTypeInstance.getInfectiousDiseaseScenarioWithoutIntervention());
		setter.set();
		newTypeInstance.setInfectiousDiseaseScenarioWithoutIntervention(setter.getNewTypeInstance());
	}

	private void setUtilityFunction() throws MigrationException {
		UtilityFunctionSetter setter = new UtilityFunctionSetter(edu.pitt.apollo.types.v4_0.UtilityFunction.class,oldTypeInstance.getUtilityFunction());
		setter.set();
		newTypeInstance.setUtilityFunction(setter.getNewTypeInstance());
	}

	@Override
	public void set() throws MigrationException {
		super.set();
		setControlStrategyAlternatives();
		setDiseaseTransmissionModelChanceNode();
		setInfectiousDiseaseScenarioWithoutIntervention();
		setUtilityFunction();
	}

}