package edu.pitt.apollo.apolloversionmigration.output;

public class InfectiousDiseaseDecisionAnalysisSpecificationAndResultsSetter extends ApolloIndexableItemSetter<edu.pitt.apollo.types.v4_0_1.InfectiousDiseaseDecisionAnalysisSpecificationAndResults> {

	public InfectiousDiseaseDecisionAnalysisSpecificationAndResultsSetter(Class<edu.pitt.apollo.types.v4_0_1.InfectiousDiseaseDecisionAnalysisSpecificationAndResults> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setBaseCaseDecisionModel() throws MigrationException {
		InfectiousDiseaseControlDecisionModelSetter setter = new InfectiousDiseaseControlDecisionModelSetter(edu.pitt.apollo.types.v4_0_1.InfectiousDiseaseControlDecisionModel.class,((edu.pitt.apollo.types.v3_1_0.InfectiousDiseaseDecisionAnalysisSpecificationAndResults) oldTypeInstance).getBaseCaseDecisionModel());
		setter.set();
		newTypeInstance.setBaseCaseDecisionModel(setter.getNewTypeInstance());
	}

	protected void setBaseCaseResult() throws MigrationException {
		BaseCaseResultSetter setter = new BaseCaseResultSetter(edu.pitt.apollo.types.v4_0_1.BaseCaseResult.class,((edu.pitt.apollo.types.v3_1_0.InfectiousDiseaseDecisionAnalysisSpecificationAndResults) oldTypeInstance).getBaseCaseResult());
		setter.set();
		newTypeInstance.setBaseCaseResult(setter.getNewTypeInstance());
	}

	protected void setSensitivityAnalysisSpecificationsAndResults() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.SensitivityAnalysisSpecificationAndResult oldObj : ((edu.pitt.apollo.types.v3_1_0.InfectiousDiseaseDecisionAnalysisSpecificationAndResults) oldTypeInstance).getSensitivityAnalysisSpecificationsAndResults()) {
			SensitivityAnalysisSpecificationAndResultSetter setter = new SensitivityAnalysisSpecificationAndResultSetter(edu.pitt.apollo.types.v4_0_1.SensitivityAnalysisSpecificationAndResult.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0_1.SensitivityAnalysisSpecificationAndResult newObj = setter.getNewTypeInstance();
			newTypeInstance.getSensitivityAnalysisSpecificationsAndResults().add(newObj);
		}

	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
			setBaseCaseDecisionModel();
			setBaseCaseResult();
			setSensitivityAnalysisSpecificationsAndResults();
		}
	}

}