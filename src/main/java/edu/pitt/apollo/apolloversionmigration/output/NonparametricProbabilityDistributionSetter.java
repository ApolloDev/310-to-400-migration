package edu.pitt.apollo.apolloversionmigration.output;

public class NonparametricProbabilityDistributionSetter<T extends edu.pitt.apollo.types.v4_0.NonparametricProbabilityDistribution, O extends edu.pitt.apollo.types.v3_1_0.NonparametricProbabilityDistribution> extends UnconditionalProbabilityDistributionSetter<T,O> {

	public NonparametricProbabilityDistributionSetter(Class<T> newTypeClass, O oldTypeInstance) throws MigrationException {
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