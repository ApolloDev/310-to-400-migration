package edu.pitt.apollo.apolloversionmigration.output;

public class MortalityFunctionSetterFactory {

	public static MortalityFunctionSetter getSetter(Object oldTypeInstance) throws MigrationException {

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.ClaraDensityDependentMortalityFunction) {

			return new ClaraDensityDependentMortalityFunctionSetter(edu.pitt.apollo.types.v4_0.ClaraDensityDependentMortalityFunction.class, (edu.pitt.apollo.types.v3_1_0.ClaraDensityDependentMortalityFunction) oldTypeInstance);
		}

		throw new UnsupportedTypeException("Type " + oldTypeInstance.getClass().getCanonicalName() + " is not supported");

	}


}

