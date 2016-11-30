package edu.pitt.apollo.apolloversionmigration.output;

public class InfectiousDiseaseDecisionAnalysisSpecificationAndResultsSetter extends ApolloIndexableItemSetter<edu.pitt.apollo.types.v4_0.InfectiousDiseaseDecisionAnalysisSpecificationAndResults,edu.pitt.apollo.types.v3_1_0.InfectiousDiseaseDecisionAnalysisSpecificationAndResults> {

	public InfectiousDiseaseDecisionAnalysisSpecificationAndResultsSetter(Class<edu.pitt.apollo.types.v4_0.InfectiousDiseaseDecisionAnalysisSpecificationAndResults> newTypeClass, edu.pitt.apollo.types.v3_1_0.InfectiousDiseaseDecisionAnalysisSpecificationAndResults oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setBaseCaseDecisionModel() throws MigrationException {
		InfectiousDiseaseControlDecisionModelSetter setter = new InfectiousDiseaseControlDecisionModelSetter(edu.pitt.apollo.types.v4_0.InfectiousDiseaseControlDecisionModel.class,oldTypeInstance.getBaseCaseDecisionModel());
		setter.set();
		newTypeInstance.setBaseCaseDecisionModel(setter.getNewTypeInstance());
	}

	private void setBaseCaseResult() throws MigrationException {
		BaseCaseResultSetter setter = new BaseCaseResultSetter(edu.pitt.apollo.types.v4_0.BaseCaseResult.class,oldTypeInstance.getBaseCaseResult());
		setter.set();
		newTypeInstance.setBaseCaseResult(setter.getNewTypeInstance());
	}

	private void setSensitivityAnalysisSpecificationsAndResults() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.SensitivityAnalysisSpecificationAndResult oldObj : oldTypeInstance.getSensitivityAnalysisSpecificationsAndResults()) {
			SensitivityAnalysisSpecificationAndResultSetter setter = new SensitivityAnalysisSpecificationAndResultSetter(edu.pitt.apollo.types.v4_0.SensitivityAnalysisSpecificationAndResult.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.SensitivityAnalysisSpecificationAndResult newObj = setter.getNewTypeInstance();
			newTypeInstance.getSensitivityAnalysisSpecificationsAndResults().add(newObj);
		}

	}

	@Override
	public void set() throws MigrationException {
		super.set();
		setBaseCaseDecisionModel();
		setBaseCaseResult();
		setSensitivityAnalysisSpecificationsAndResults();
	}

}