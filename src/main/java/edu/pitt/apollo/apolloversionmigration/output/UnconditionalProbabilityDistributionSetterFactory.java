package edu.pitt.apollo.apolloversionmigration.output;

public class UnconditionalProbabilityDistributionSetterFactory {

	public static UnconditionalProbabilityDistributionSetter getSetter(Object oldTypeInstance) throws MigrationException {

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.NonparametricProbabilityDistribution) {

			return NonparametricProbabilityDistributionSetterFactory.getSetter(oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.ParametricProbabilityDistribution) {

			return ParametricProbabilityDistributionSetterFactory.getSetter(oldTypeInstance);
		}

		throw new UnsupportedTypeException("Type " + oldTypeInstance.getClass().getCanonicalName() + " is not supported");

	}


}

