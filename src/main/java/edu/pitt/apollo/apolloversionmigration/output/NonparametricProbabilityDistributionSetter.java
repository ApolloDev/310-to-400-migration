package edu.pitt.apollo.apolloversionmigration.output;

public class NonparametricProbabilityDistributionSetter<T extends edu.pitt.apollo.types.v4_0.NonparametricProbabilityDistribution> extends UnconditionalProbabilityDistributionSetter<T> {

	public NonparametricProbabilityDistributionSetter(Class<T> newTypeClass, Object oldTypeInstance) throws MigrationException {
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