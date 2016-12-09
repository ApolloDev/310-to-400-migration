package edu.pitt.apollo.apolloversionmigration.output;

public class SensitivityAnalysisSpecificationAndResultSetter extends ApolloIndexableItemSetter<edu.pitt.apollo.types.v4_0_1.SensitivityAnalysisSpecificationAndResult> {

	public SensitivityAnalysisSpecificationAndResultSetter(Class<edu.pitt.apollo.types.v4_0_1.SensitivityAnalysisSpecificationAndResult> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setSensitivityAnalysisSpecification() throws MigrationException {
		if (((edu.pitt.apollo.types.v3_1_0.SensitivityAnalysisSpecificationAndResult) oldTypeInstance).getSensitivityAnalysisSpecification() != null) {
			SensitivityAnalysisSpecificationSetter setter = SensitivityAnalysisSpecificationSetterFactory.getSetter(((edu.pitt.apollo.types.v3_1_0.SensitivityAnalysisSpecificationAndResult) oldTypeInstance).getSensitivityAnalysisSpecification());
			setter.set();
			newTypeInstance.setSensitivityAnalysisSpecification(setter.getNewTypeInstance());
		}

	}

	protected void setSensitivityAnalysisResult() throws MigrationException {
		SensitivityAnalysisResultSetter setter = new SensitivityAnalysisResultSetter(edu.pitt.apollo.types.v4_0_1.SensitivityAnalysisResult.class,((edu.pitt.apollo.types.v3_1_0.SensitivityAnalysisSpecificationAndResult) oldTypeInstance).getSensitivityAnalysisResult());
		setter.set();
		newTypeInstance.setSensitivityAnalysisResult(setter.getNewTypeInstance());
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
			setSensitivityAnalysisSpecification();
			setSensitivityAnalysisResult();
		}
	}

}