package edu.pitt.apollo.apolloversionmigration.output;

public class SensitivityAnalysisSpecificationAndResultSetter extends ApolloIndexableItemSetter<edu.pitt.apollo.types.v4_0.SensitivityAnalysisSpecificationAndResult,edu.pitt.apollo.types.v3_1_0.SensitivityAnalysisSpecificationAndResult> {

	public SensitivityAnalysisSpecificationAndResultSetter(Class<edu.pitt.apollo.types.v4_0.SensitivityAnalysisSpecificationAndResult> newTypeClass, edu.pitt.apollo.types.v3_1_0.SensitivityAnalysisSpecificationAndResult oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setSensitivityAnalysisSpecification() throws MigrationException {
		SensitivityAnalysisSpecificationSetter setter = SensitivityAnalysisSpecificationSetterFactory.getSetter(oldTypeInstance.getSensitivityAnalysisSpecification());
		setter.set();
		newTypeInstance.setSensitivityAnalysisSpecification(setter.getNewTypeInstance());
	}

	private void setSensitivityAnalysisResult() throws MigrationException {
		SensitivityAnalysisResultSetter setter = new SensitivityAnalysisResultSetter(edu.pitt.apollo.types.v4_0.SensitivityAnalysisResult.class,oldTypeInstance.getSensitivityAnalysisResult());
		setter.set();
		newTypeInstance.setSensitivityAnalysisResult(setter.getNewTypeInstance());
	}

	@Override
	public void set() throws MigrationException {
		super.set();
		setSensitivityAnalysisSpecification();
		setSensitivityAnalysisResult();
	}

}