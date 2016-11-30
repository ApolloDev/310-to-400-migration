package edu.pitt.apollo.apolloversionmigration.output;

public class ContinuousParametricProbabilityDistributionSetterFactory {

	public static ContinuousParametricProbabilityDistributionSetter getSetter(Object oldTypeInstance) throws MigrationException {

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.GammaDistribution) {

			return new GammaDistributionSetter(edu.pitt.apollo.types.v4_0.GammaDistribution.class, (edu.pitt.apollo.types.v3_1_0.GammaDistribution) oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.LogNormalDistribution) {

			return new LogNormalDistributionSetter(edu.pitt.apollo.types.v4_0.LogNormalDistribution.class, (edu.pitt.apollo.types.v3_1_0.LogNormalDistribution) oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.WeibullDistribution) {

			return new WeibullDistributionSetter(edu.pitt.apollo.types.v4_0.WeibullDistribution.class, (edu.pitt.apollo.types.v3_1_0.WeibullDistribution) oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.ContinuousUniformDistribution) {

			return new ContinuousUniformDistributionSetter(edu.pitt.apollo.types.v4_0.ContinuousUniformDistribution.class, (edu.pitt.apollo.types.v3_1_0.ContinuousUniformDistribution) oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.NormalDistribution) {

			return new NormalDistributionSetter(edu.pitt.apollo.types.v4_0.NormalDistribution.class, (edu.pitt.apollo.types.v3_1_0.NormalDistribution) oldTypeInstance);
		}

		throw new UnsupportedTypeException("Type " + oldTypeInstance.getClass().getCanonicalName() + " is not supported");

	}


}

