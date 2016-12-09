package edu.pitt.apollo.apolloversionmigration.output;

public class UnconditionalProbabilityDistributionSetter<T extends edu.pitt.apollo.types.v4_0_1.UnconditionalProbabilityDistribution> extends ProbabilityDistributionSetter<T> {

	public UnconditionalProbabilityDistributionSetter(Class<T> newTypeClass, Object oldTypeInstance) throws MigrationException {
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