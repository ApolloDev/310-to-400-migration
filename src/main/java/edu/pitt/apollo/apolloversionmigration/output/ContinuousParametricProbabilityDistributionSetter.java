package edu.pitt.apollo.apolloversionmigration.output;

public class ContinuousParametricProbabilityDistributionSetter<T extends edu.pitt.apollo.types.v4_0.ContinuousParametricProbabilityDistribution, O extends edu.pitt.apollo.types.v3_1_0.ContinuousParametricProbabilityDistribution> extends ParametricProbabilityDistributionSetter<T,O> {

	public ContinuousParametricProbabilityDistributionSetter(Class<T> newTypeClass, O oldTypeInstance) throws MigrationException {
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