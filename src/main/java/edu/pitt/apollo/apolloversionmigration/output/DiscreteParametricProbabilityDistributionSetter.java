package edu.pitt.apollo.apolloversionmigration.output;

public class DiscreteParametricProbabilityDistributionSetter extends ParametricProbabilityDistributionSetter<edu.pitt.apollo.types.v4_0.DiscreteParametricProbabilityDistribution> {

	public DiscreteParametricProbabilityDistributionSetter(Class<edu.pitt.apollo.types.v4_0.DiscreteParametricProbabilityDistribution> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
		}
	}

}