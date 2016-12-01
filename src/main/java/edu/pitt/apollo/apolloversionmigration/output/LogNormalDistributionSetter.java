package edu.pitt.apollo.apolloversionmigration.output;

public class LogNormalDistributionSetter extends ContinuousParametricProbabilityDistributionSetter<edu.pitt.apollo.types.v4_0.LogNormalDistribution> {

	public LogNormalDistributionSetter(Class<edu.pitt.apollo.types.v4_0.LogNormalDistribution> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setMean() throws MigrationException {
		newTypeInstance.setMean(((edu.pitt.apollo.types.v3_1_0.LogNormalDistribution) oldTypeInstance).getMean());
	}

	protected void setStandardDeviation() throws MigrationException {
		newTypeInstance.setStandardDeviation(((edu.pitt.apollo.types.v3_1_0.LogNormalDistribution) oldTypeInstance).getStandardDeviation());
	}

	protected void setShiftRight() throws MigrationException {
		newTypeInstance.setShiftRight(((edu.pitt.apollo.types.v3_1_0.LogNormalDistribution) oldTypeInstance).getShiftRight());
	}

	protected void setCutTailAt() throws MigrationException {
		newTypeInstance.setCutTailAt(((edu.pitt.apollo.types.v3_1_0.LogNormalDistribution) oldTypeInstance).getCutTailAt());
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