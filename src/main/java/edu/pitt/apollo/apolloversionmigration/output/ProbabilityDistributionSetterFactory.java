package edu.pitt.apollo.apolloversionmigration.output;

public class ProbabilityDistributionSetterFactory {

	public static ProbabilityDistributionSetter getSetter(Object oldTypeInstance) throws MigrationException {

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.UnconditionalProbabilityDistribution) {

			return UnconditionalProbabilityDistributionSetterFactory.getSetter(oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.BayesianNetwork) {

			return new BayesianNetworkSetter(edu.pitt.apollo.types.v4_0.BayesianNetwork.class, (edu.pitt.apollo.types.v3_1_0.BayesianNetwork) oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.ConditionalProbabilityDistribution) {

			return new ConditionalProbabilityDistributionSetter(edu.pitt.apollo.types.v4_0.ConditionalProbabilityDistribution.class, (edu.pitt.apollo.types.v3_1_0.ConditionalProbabilityDistribution) oldTypeInstance);
		}

		throw new UnsupportedTypeException("Type " + oldTypeInstance.getClass().getCanonicalName() + " is not supported");

	}


}

