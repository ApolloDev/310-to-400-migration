package edu.pitt.apollo.apolloversionmigration.output;

public class ParametricProbabilityDistributionSetter<T extends edu.pitt.apollo.types.v4_0.ParametricProbabilityDistribution, O extends edu.pitt.apollo.types.v3_1_0.ParametricProbabilityDistribution> extends UnconditionalProbabilityDistributionSetter<T,O> {

	public ParametricProbabilityDistributionSetter(Class<T> newTypeClass, O oldTypeInstance) throws MigrationException {
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