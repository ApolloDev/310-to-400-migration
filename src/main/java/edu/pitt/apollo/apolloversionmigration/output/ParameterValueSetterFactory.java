package edu.pitt.apollo.apolloversionmigration.output;

public class ParameterValueSetterFactory {

	public static ParameterValueSetter getSetter(Object oldTypeInstance) throws MigrationException {

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.ProbabilisticParameter) {

			return new ProbabilisticParameterSetter(edu.pitt.apollo.types.v4_0.ProbabilisticParameter.class, oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.Distance) {

			return new DistanceSetter(edu.pitt.apollo.types.v4_0.Distance.class, oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.Duration) {

			return DurationSetterFactory.getSetter(oldTypeInstance);
		}

		throw new UnsupportedTypeException("Type " + oldTypeInstance.getClass().getCanonicalName() + " is not supported");

	}


}

