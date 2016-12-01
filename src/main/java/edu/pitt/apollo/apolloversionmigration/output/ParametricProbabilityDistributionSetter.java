package edu.pitt.apollo.apolloversionmigration.output;

public class ParametricProbabilityDistributionSetter<T extends edu.pitt.apollo.types.v4_0.ParametricProbabilityDistribution> extends UnconditionalProbabilityDistributionSetter<T> {

	public ParametricProbabilityDistributionSetter(Class<T> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
		}
	}

	@Override
	public T getNewTypeInstance() {
		return newTypeInstance;
	}

}