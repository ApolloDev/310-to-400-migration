package edu.pitt.apollo.apolloversionmigration.output;

public class ProbabilityDistributionSetter<T extends edu.pitt.apollo.types.v4_0.ProbabilityDistribution, O extends edu.pitt.apollo.types.v3_1_0.ProbabilityDistribution> extends UncertainValueSetter<T,O> {

	public ProbabilityDistributionSetter(Class<T> newTypeClass, O oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setReferenceId() throws MigrationException {
		newTypeInstance.setReferenceId(oldTypeInstance.getReferenceId());
	}

	@Override
	public void set() throws MigrationException {
		super.set();
		setReferenceId();
	}

	@Override
	public T getNewTypeInstance() {
		return newTypeInstance;
	}

}