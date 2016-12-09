package edu.pitt.apollo.apolloversionmigration.output;

public class SensitivityAnalysisSpecificationSetterFactory {

	public static SensitivityAnalysisSpecificationSetter getSetter(Object oldTypeInstance) throws MigrationException {

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v3_1_0.OneWaySensitivityAnalysisOfContinousVariableSpecification) {

			return new OneWaySensitivityAnalysisOfContinousVariableSpecificationSetterImpl(edu.pitt.apollo.types.v4_0_1.OneWaySensitivityAnalysisOfContinousVariableSpecification.class, oldTypeInstance);
		}

		throw new UnsupportedTypeException("Type " + oldTypeInstance.getClass().getCanonicalName() + " is not supported");

	}


}

