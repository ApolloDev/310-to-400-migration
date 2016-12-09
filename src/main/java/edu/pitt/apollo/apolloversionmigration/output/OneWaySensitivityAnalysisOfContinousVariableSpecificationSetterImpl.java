package edu.pitt.apollo.apolloversionmigration.output;

public class OneWaySensitivityAnalysisOfContinousVariableSpecificationSetterImpl extends OneWaySensitivityAnalysisOfContinousVariableSpecificationSetter {

	public OneWaySensitivityAnalysisOfContinousVariableSpecificationSetterImpl(Class<edu.pitt.apollo.types.v4_0_1.OneWaySensitivityAnalysisOfContinousVariableSpecification> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	@Override
	protected void setXPathToVariable() throws MigrationException {
		newTypeInstance.setXPathToVariable(((edu.pitt.apollo.types.v3_1_0.OneWaySensitivityAnalysisOfContinousVariableSpecification)oldTypeInstance).getUniqueApolloLabelOfParameter());

	}

	@Override
	protected void setMinimumValue() throws MigrationException {
		newTypeInstance.setMinimumValue(((edu.pitt.apollo.types.v3_1_0.OneWaySensitivityAnalysisOfContinousVariableSpecification)oldTypeInstance).getMinimumValue());

	}

	@Override
	protected void setMaximumValue() throws MigrationException {
		newTypeInstance.setMaximumValue(((edu.pitt.apollo.types.v3_1_0.OneWaySensitivityAnalysisOfContinousVariableSpecification)oldTypeInstance).getMaximumValue());

	}

	@Override
	protected void setNumberOfDiscretizations() throws MigrationException {
		newTypeInstance.setNumberOfDiscretizations(((edu.pitt.apollo.types.v3_1_0.OneWaySensitivityAnalysisOfContinousVariableSpecification)oldTypeInstance).getNumberOfDiscretizations());

	}


}