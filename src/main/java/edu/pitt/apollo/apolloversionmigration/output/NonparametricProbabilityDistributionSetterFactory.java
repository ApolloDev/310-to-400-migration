package edu.pitt.apollo.apolloversionmigration.output;

public class NonparametricProbabilityDistributionSetterFactory {

	public static NonparametricProbabilityDistributionSetter getSetter(Object oldTypeInstance) throws MigrationException {

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v3_1_0.DiscreteNonparametricProbabilityDistribution) {

			return new DiscreteNonparametricProbabilityDistributionSetter(edu.pitt.apollo.types.v4_0_1.DiscreteNonparametricProbabilityDistribution.class, oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v3_1_0.NonparametricProbabilityDistribution) {

			return new NonparametricProbabilityDistributionSetter(edu.pitt.apollo.types.v4_0_1.NonparametricProbabilityDistribution.class, oldTypeInstance);
		}

		throw new UnsupportedTypeException("Type " + oldTypeInstance.getClass().getCanonicalName() + " is not supported");

	}


}

