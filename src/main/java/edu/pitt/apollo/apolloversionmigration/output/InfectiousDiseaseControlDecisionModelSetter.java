package edu.pitt.apollo.apolloversionmigration.output;

public class InfectiousDiseaseControlDecisionModelSetter extends ApolloIndexableItemSetter<edu.pitt.apollo.types.v4_0_1.InfectiousDiseaseControlDecisionModel> {

	public InfectiousDiseaseControlDecisionModelSetter(Class<edu.pitt.apollo.types.v4_0_1.InfectiousDiseaseControlDecisionModel> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setControlStrategyAlternatives() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.InfectiousDiseaseControlStrategy oldObj : ((edu.pitt.apollo.types.v3_1_0.InfectiousDiseaseControlDecisionModel) oldTypeInstance).getControlStrategyAlternatives()) {
			InfectiousDiseaseControlStrategySetter setter = new InfectiousDiseaseControlStrategySetter(edu.pitt.apollo.types.v4_0_1.InfectiousDiseaseControlStrategy.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0_1.InfectiousDiseaseControlStrategy newObj = setter.getNewTypeInstance();
			newTypeInstance.getControlStrategyAlternatives().add(newObj);
		}

	}

	protected void setDiseaseTransmissionModelChanceNode() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.ModelIdAndProbability oldObj : ((edu.pitt.apollo.types.v3_1_0.InfectiousDiseaseControlDecisionModel) oldTypeInstance).getDiseaseTransmissionModelChanceNode()) {
			ModelIdAndProbabilitySetter setter = new ModelIdAndProbabilitySetter(edu.pitt.apollo.types.v4_0_1.ModelIdAndProbability.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0_1.ModelIdAndProbability newObj = setter.getNewTypeInstance();
			newTypeInstance.getDiseaseTransmissionModelChanceNode().add(newObj);
		}

	}

	protected void setInfectiousDiseaseScenarioWithoutIntervention() throws MigrationException {
		InfectiousDiseaseScenarioSetter setter = new InfectiousDiseaseScenarioSetter(edu.pitt.apollo.types.v4_0_1.InfectiousDiseaseScenario.class,((edu.pitt.apollo.types.v3_1_0.InfectiousDiseaseControlDecisionModel) oldTypeInstance).getInfectiousDiseaseScenarioWithoutIntervention());
		setter.set();
		newTypeInstance.setInfectiousDiseaseScenarioWithoutIntervention(setter.getNewTypeInstance());
	}

	protected void setUtilityFunction() throws MigrationException {
		UtilityFunctionSetter setter = new UtilityFunctionSetter(edu.pitt.apollo.types.v4_0_1.UtilityFunction.class,((edu.pitt.apollo.types.v3_1_0.InfectiousDiseaseControlDecisionModel) oldTypeInstance).getUtilityFunction());
		setter.set();
		newTypeInstance.setUtilityFunction(setter.getNewTypeInstance());
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
			setControlStrategyAlternatives();
			setDiseaseTransmissionModelChanceNode();
			setInfectiousDiseaseScenarioWithoutIntervention();
			setUtilityFunction();
		}
	}

}