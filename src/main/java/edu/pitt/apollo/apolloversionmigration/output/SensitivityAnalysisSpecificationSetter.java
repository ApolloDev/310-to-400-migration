package edu.pitt.apollo.apolloversionmigration.output;

public class SensitivityAnalysisSpecificationSetter<T extends edu.pitt.apollo.types.v4_0.SensitivityAnalysisSpecification, O extends edu.pitt.apollo.types.v3_1_0.SensitivityAnalysisSpecification> extends AbstractSetter<T,O> {

	public SensitivityAnalysisSpecificationSetter(Class<T> newTypeClass, O oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	@Override
	public void set() throws MigrationException {
	}

	@Override
	public T getNewTypeInstance() {
		return newTypeInstance;
	}

}