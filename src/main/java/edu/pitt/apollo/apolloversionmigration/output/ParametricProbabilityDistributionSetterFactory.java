package edu.pitt.apollo.apolloversionmigration.output;

public class ParametricProbabilityDistributionSetterFactory {

	public static ParametricProbabilityDistributionSetter getSetter(Object oldTypeInstance) throws MigrationException {

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.ContinuousParametricProbabilityDistribution) {

			return ContinuousParametricProbabilityDistributionSetterFactory.getSetter(oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.DiscreteParametricProbabilityDistribution) {

			return new DiscreteParametricProbabilityDistributionSetter(edu.pitt.apollo.types.v4_0.DiscreteParametricProbabilityDistribution.class, oldTypeInstance);
		}

		throw new UnsupportedTypeException("Type " + oldTypeInstance.getClass().getCanonicalName() + " is not supported");

	}


}

