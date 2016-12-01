package edu.pitt.apollo.apolloversionmigration.output;

public abstract class OneWaySensitivityAnalysisOfContinousVariableSpecificationSetter extends SensitivityAnalysisSpecificationSetter<edu.pitt.apollo.types.v4_0.OneWaySensitivityAnalysisOfContinousVariableSpecification> {

	public OneWaySensitivityAnalysisOfContinousVariableSpecificationSetter(Class<edu.pitt.apollo.types.v4_0.OneWaySensitivityAnalysisOfContinousVariableSpecification> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected abstract void setXPathToVariable() throws MigrationException;
	protected abstract void setMinimumValue() throws MigrationException;
	protected abstract void setMaximumValue() throws MigrationException;
	protected abstract void setNumberOfDiscretizations() throws MigrationException;
	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
			setXPathToVariable();
			setMinimumValue();
			setMaximumValue();
			setNumberOfDiscretizations();
		}
	}

}