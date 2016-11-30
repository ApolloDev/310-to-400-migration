package edu.pitt.apollo.apolloversionmigration.output;

public class UnconditionalProbabilityDistributionSetter<T extends edu.pitt.apollo.types.v4_0.UnconditionalProbabilityDistribution, O extends edu.pitt.apollo.types.v3_1_0.UnconditionalProbabilityDistribution> extends ProbabilityDistributionSetter<T,O> {

	public UnconditionalProbabilityDistributionSetter(Class<T> newTypeClass, O oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	@Override
	public void set() throws MigrationException {
		super.set();
	}

	@Override
	public T getNewTypeInstance() {
		return newTypeInstance;
	}

}