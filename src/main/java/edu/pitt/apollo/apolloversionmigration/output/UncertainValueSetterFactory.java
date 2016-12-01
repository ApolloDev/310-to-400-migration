package edu.pitt.apollo.apolloversionmigration.output;

public class UncertainValueSetterFactory {

	public static UncertainValueSetter getSetter(Object oldTypeInstance) throws MigrationException {

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.MeanWithConfidenceInterval) {

			return new MeanWithConfidenceIntervalSetter(edu.pitt.apollo.types.v4_0.MeanWithConfidenceInterval.class, oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.MeanMedianMinimumMaximum) {

			return new MeanMedianMinimumMaximumSetter(edu.pitt.apollo.types.v4_0.MeanMedianMinimumMaximum.class, oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.ProbabilityDistribution) {

			return ProbabilityDistributionSetterFactory.getSetter(oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.MeanWithStandardDeviation) {

			return new MeanWithStandardDeviationSetter(edu.pitt.apollo.types.v4_0.MeanWithStandardDeviation.class, oldTypeInstance);
		}

		throw new UnsupportedTypeException("Type " + oldTypeInstance.getClass().getCanonicalName() + " is not supported");

	}


}

