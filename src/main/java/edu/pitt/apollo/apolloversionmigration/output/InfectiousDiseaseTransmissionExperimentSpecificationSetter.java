package edu.pitt.apollo.apolloversionmigration.output;

public class InfectiousDiseaseTransmissionExperimentSpecificationSetter extends ApolloIndexableItemSetter<edu.pitt.apollo.types.v4_0.InfectiousDiseaseTransmissionExperimentSpecification,edu.pitt.apollo.types.v3_1_0.InfectiousDiseaseTransmissionExperimentSpecification> {

	public InfectiousDiseaseTransmissionExperimentSpecificationSetter(Class<edu.pitt.apollo.types.v4_0.InfectiousDiseaseTransmissionExperimentSpecification> newTypeClass, edu.pitt.apollo.types.v3_1_0.InfectiousDiseaseTransmissionExperimentSpecification oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setInfectiousDiseaseScenarioWithoutIntervention() throws MigrationException {
		InfectiousDiseaseScenarioSetter setter = new InfectiousDiseaseScenarioSetter(edu.pitt.apollo.types.v4_0.InfectiousDiseaseScenario.class,oldTypeInstance.getInfectiousDiseaseScenarioWithoutIntervention());
		setter.set();
		newTypeInstance.setInfectiousDiseaseScenarioWithoutIntervention(setter.getNewTypeInstance());
	}

	private void setInfectiousDiseaseControlStrategies() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.InfectiousDiseaseControlStrategy oldObj : oldTypeInstance.getInfectiousDiseaseControlStrategies()) {
			InfectiousDiseaseControlStrategySetter setter = new InfectiousDiseaseControlStrategySetter(edu.pitt.apollo.types.v4_0.InfectiousDiseaseControlStrategy.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.InfectiousDiseaseControlStrategy newObj = setter.getNewTypeInstance();
			newTypeInstance.getInfectiousDiseaseControlStrategies().add(newObj);
		}

	}

	private void setInfectiousDiseaseTransmissionModelIds() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.SoftwareIdentification oldObj : oldTypeInstance.getInfectiousDiseaseTransmissionModelIds()) {
			SoftwareIdentificationSetter setter = new SoftwareIdentificationSetter(edu.pitt.apollo.types.v4_0.SoftwareIdentification.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.SoftwareIdentification newObj = setter.getNewTypeInstance();
			newTypeInstance.getInfectiousDiseaseTransmissionModelIds().add(newObj);
		}

	}

	private void setSensitivityAnalyses() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.SensitivityAnalysisSpecification oldObj : oldTypeInstance.getSensitivityAnalyses()) {
			SensitivityAnalysisSpecificationSetter setter = new SensitivityAnalysisSpecificationSetter(edu.pitt.apollo.types.v4_0.SensitivityAnalysisSpecification.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.SensitivityAnalysisSpecification newObj = setter.getNewTypeInstance();
			newTypeInstance.getSensitivityAnalyses().add(newObj);
		}

	}

	@Override
	public void set() throws MigrationException {
		super.set();
		setInfectiousDiseaseScenarioWithoutIntervention();
		setInfectiousDiseaseControlStrategies();
		setInfectiousDiseaseTransmissionModelIds();
		setSensitivityAnalyses();
	}

}