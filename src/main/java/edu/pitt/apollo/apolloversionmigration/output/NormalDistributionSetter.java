package edu.pitt.apollo.apolloversionmigration.output;

public class NormalDistributionSetter extends ContinuousParametricProbabilityDistributionSetter<edu.pitt.apollo.types.v4_0_1.NormalDistribution> {

	public NormalDistributionSetter(Class<edu.pitt.apollo.types.v4_0_1.NormalDistribution> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setMean() throws MigrationException {
		newTypeInstance.setMean(((edu.pitt.apollo.types.v3_1_0.NormalDistribution) oldTypeInstance).getMean());
	}

	protected void setStandardDeviation() throws MigrationException {
		newTypeInstance.setStandardDeviation(((edu.pitt.apollo.types.v3_1_0.NormalDistribution) oldTypeInstance).getStandardDeviation());
	}

	protected void setShiftRight() throws MigrationException {
		newTypeInstance.setShiftRight(((edu.pitt.apollo.types.v3_1_0.NormalDistribution) oldTypeInstance).getShiftRight());
	}

	protected void setCutTailAt() throws MigrationException {
		newTypeInstance.setCutTailAt(((edu.pitt.apollo.types.v3_1_0.NormalDistribution) oldTypeInstance).getCutTailAt());
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
			setMean();
			setStandardDeviation();
			setShiftRight();
			setCutTailAt();
		}
	}

}