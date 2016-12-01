package edu.pitt.apollo.apolloversionmigration.output;

public class ProbabilityDistributionSetter<T extends edu.pitt.apollo.types.v4_0.ProbabilityDistribution> extends UncertainValueSetter<T> {

	public ProbabilityDistributionSetter(Class<T> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setReferenceId() throws MigrationException {
		newTypeInstance.setReferenceId(((edu.pitt.apollo.types.v3_1_0.ProbabilityDistribution) oldTypeInstance).getReferenceId());
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
			setReferenceId();
		}
	}

	@Override
	public T getNewTypeInstance() {
		return newTypeInstance;
	}

}