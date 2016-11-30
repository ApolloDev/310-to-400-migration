package edu.pitt.apollo.apolloversionmigration.output;

public class OneWaySensitivityAnalysisOfContinousVariableSpecificationSetter extends SensitivityAnalysisSpecificationSetter<edu.pitt.apollo.types.v4_0.OneWaySensitivityAnalysisOfContinousVariableSpecification,edu.pitt.apollo.types.v3_1_0.OneWaySensitivityAnalysisOfContinousVariableSpecification> {

	public OneWaySensitivityAnalysisOfContinousVariableSpecificationSetter(Class<edu.pitt.apollo.types.v4_0.OneWaySensitivityAnalysisOfContinousVariableSpecification> newTypeClass, edu.pitt.apollo.types.v3_1_0.OneWaySensitivityAnalysisOfContinousVariableSpecification oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setXPathToVariable() throws MigrationException {
		newTypeInstance.setXPathToVariable(oldTypeInstance.getUniqueApolloLabelOfParameter());
	}

	private void setMinimumValue() throws MigrationException {
		newTypeInstance.setMinimumValue(oldTypeInstance.getMinimumValue());
	}

	private void setMaximumValue() throws MigrationException {
		newTypeInstance.setMaximumValue(oldTypeInstance.getMaximumValue());
	}

	private void setNumberOfDiscretizations() throws MigrationException {
		newTypeInstance.setNumberOfDiscretizations(oldTypeInstance.getNumberOfDiscretizations());
	}

	@Override
	public void set() throws MigrationException {
		super.set();
		setXPathToVariable();
		setMinimumValue();
		setMaximumValue();
		setNumberOfDiscretizations();
	}

}