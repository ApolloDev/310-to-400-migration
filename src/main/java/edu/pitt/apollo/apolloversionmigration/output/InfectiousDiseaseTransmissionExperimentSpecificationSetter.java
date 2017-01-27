package edu.pitt.apollo.apolloversionmigration.output;

public class InfectiousDiseaseTransmissionExperimentSpecificationSetter extends ApolloIndexableItemSetter<edu.pitt.apollo.types.v4_0_1.InfectiousDiseaseTransmissionExperimentSpecification> {

	public InfectiousDiseaseTransmissionExperimentSpecificationSetter(Class<edu.pitt.apollo.types.v4_0_1.InfectiousDiseaseTransmissionExperimentSpecification> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setInfectiousDiseaseScenarioWithoutIntervention() throws MigrationException {
		InfectiousDiseaseScenarioSetter setter = new InfectiousDiseaseScenarioSetter(edu.pitt.apollo.types.v4_0_1.InfectiousDiseaseScenario.class,((edu.pitt.apollo.types.v3_1_0.InfectiousDiseaseTransmissionExperimentSpecification) oldTypeInstance).getInfectiousDiseaseScenarioWithoutIntervention());
		setter.set();
		newTypeInstance.setInfectiousDiseaseScenarioWithoutIntervention(setter.getNewTypeInstance());
	}

	protected void setInfectiousDiseaseControlStrategies() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.InfectiousDiseaseControlStrategy oldObj : ((edu.pitt.apollo.types.v3_1_0.InfectiousDiseaseTransmissionExperimentSpecification) oldTypeInstance).getInfectiousDiseaseControlStrategies()) {
			InfectiousDiseaseControlStrategySetter setter = new InfectiousDiseaseControlStrategySetter(edu.pitt.apollo.types.v4_0_1.InfectiousDiseaseControlStrategy.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0_1.InfectiousDiseaseControlStrategy newObj = setter.getNewTypeInstance();
			newTypeInstance.getInfectiousDiseaseControlStrategies().add(newObj);
		}

	}

	protected void setInfectiousDiseaseTransmissionModelIds() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.SoftwareIdentification oldObj : ((edu.pitt.apollo.types.v3_1_0.InfectiousDiseaseTransmissionExperimentSpecification) oldTypeInstance).getInfectiousDiseaseTransmissionModelIds()) {
			SoftwareIdentificationSetter setter = new SoftwareIdentificationSetter(edu.pitt.apollo.types.v4_0_1.SoftwareIdentification.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0_1.SoftwareIdentification newObj = setter.getNewTypeInstance();
			newTypeInstance.getInfectiousDiseaseTransmissionModelIds().add(newObj);
		}

	}

	protected void setSensitivityAnalyses() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.SensitivityAnalysisSpecification oldObj : ((edu.pitt.apollo.types.v3_1_0.InfectiousDiseaseTransmissionExperimentSpecification) oldTypeInstance).getSensitivityAnalyses()) {
			SensitivityAnalysisSpecificationSetter setter = SensitivityAnalysisSpecificationSetterFactory.getSetter(oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0_1.SensitivityAnalysisSpecification newObj = setter.getNewTypeInstance();
			newTypeInstance.getSensitivityAnalyses().add(newObj);
		}

	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
			setInfectiousDiseaseScenarioWithoutIntervention();
			setInfectiousDiseaseControlStrategies();
			setInfectiousDiseaseTransmissionModelIds();
			setSensitivityAnalyses();
		}
	}

}