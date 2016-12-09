package edu.pitt.apollo.apolloversionmigration.output;

public class UncertainValueSetterFactory {

	public static UncertainValueSetter getSetter(Object oldTypeInstance) throws MigrationException {

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v3_1_0.MeanWithConfidenceInterval) {

			return new MeanWithConfidenceIntervalSetter(edu.pitt.apollo.types.v4_0_1.MeanWithConfidenceInterval.class, oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v3_1_0.MeanWithStandardDeviation) {

			return new MeanWithStandardDeviationSetter(edu.pitt.apollo.types.v4_0_1.MeanWithStandardDeviation.class, oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v3_1_0.MeanMedianMinimumMaximum) {

			return new MeanMedianMinimumMaximumSetter(edu.pitt.apollo.types.v4_0_1.MeanMedianMinimumMaximum.class, oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v3_1_0.ProbabilityDistribution) {

			return ProbabilityDistributionSetterFactory.getSetter(oldTypeInstance);
		}

		throw new UnsupportedTypeException("Type " + oldTypeInstance.getClass().getCanonicalName() + " is not supported");

	}


}

