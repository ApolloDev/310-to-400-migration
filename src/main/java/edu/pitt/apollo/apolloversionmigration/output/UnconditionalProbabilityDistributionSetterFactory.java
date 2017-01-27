package edu.pitt.apollo.apolloversionmigration.output;

public class UnconditionalProbabilityDistributionSetterFactory {

	public static UnconditionalProbabilityDistributionSetter getSetter(Object oldTypeInstance) throws MigrationException {

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v3_1_0.NonparametricProbabilityDistribution) {

			return NonparametricProbabilityDistributionSetterFactory.getSetter(oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v3_1_0.ParametricProbabilityDistribution) {

			return ParametricProbabilityDistributionSetterFactory.getSetter(oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v3_1_0.UnconditionalProbabilityDistribution) {

			return new UnconditionalProbabilityDistributionSetter(edu.pitt.apollo.types.v4_0_1.UnconditionalProbabilityDistribution.class, oldTypeInstance);
		}

		throw new UnsupportedTypeException("Type " + oldTypeInstance.getClass().getCanonicalName() + " is not supported");

	}


}

