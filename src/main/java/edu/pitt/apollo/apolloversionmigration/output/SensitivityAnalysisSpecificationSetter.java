package edu.pitt.apollo.apolloversionmigration.output;

public class SensitivityAnalysisSpecificationSetter<T extends edu.pitt.apollo.types.v4_0_1.SensitivityAnalysisSpecification> extends AbstractSetter<T> {

	public SensitivityAnalysisSpecificationSetter(Class<T> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
		}
	}

	@Override
	public T getNewTypeInstance() {
		return newTypeInstance;
	}

}