package edu.pitt.apollo.apolloversionmigration.output;

public class ContinuousParametricProbabilityDistributionSetterFactory {

	public static ContinuousParametricProbabilityDistributionSetter getSetter(Object oldTypeInstance) throws MigrationException {

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v3_1_0.LogNormalDistribution) {

			return new LogNormalDistributionSetter(edu.pitt.apollo.types.v4_0_1.LogNormalDistribution.class, oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v3_1_0.GammaDistribution) {

			return new GammaDistributionSetter(edu.pitt.apollo.types.v4_0_1.GammaDistribution.class, oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v3_1_0.WeibullDistribution) {

			return new WeibullDistributionSetter(edu.pitt.apollo.types.v4_0_1.WeibullDistribution.class, oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v3_1_0.NormalDistribution) {

			return new NormalDistributionSetter(edu.pitt.apollo.types.v4_0_1.NormalDistribution.class, oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v3_1_0.ContinuousUniformDistribution) {

			return new ContinuousUniformDistributionSetter(edu.pitt.apollo.types.v4_0_1.ContinuousUniformDistribution.class, oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v3_1_0.ContinuousParametricProbabilityDistribution) {

			return new ContinuousParametricProbabilityDistributionSetter(edu.pitt.apollo.types.v4_0_1.ContinuousParametricProbabilityDistribution.class, oldTypeInstance);
		}

		throw new UnsupportedTypeException("Type " + oldTypeInstance.getClass().getCanonicalName() + " is not supported");

	}


}

