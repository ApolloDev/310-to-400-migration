package edu.pitt.apollo.apolloversionmigration.output;

public class LogNormalDistributionSetter extends ContinuousParametricProbabilityDistributionSetter<edu.pitt.apollo.types.v4_0.LogNormalDistribution,edu.pitt.apollo.types.v3_1_0.LogNormalDistribution> {

	public LogNormalDistributionSetter(Class<edu.pitt.apollo.types.v4_0.LogNormalDistribution> newTypeClass, edu.pitt.apollo.types.v3_1_0.LogNormalDistribution oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setMean() throws MigrationException {
		newTypeInstance.setMean(oldTypeInstance.getMean());
	}

	private void setStandardDeviation() throws MigrationException {
		newTypeInstance.setStandardDeviation(oldTypeInstance.getStandardDeviation());
	}

	private void setShiftRight() throws MigrationException {
		newTypeInstance.setShiftRight(oldTypeInstance.getShiftRight());
	}

	private void setCutTailAt() throws MigrationException {
		newTypeInstance.setCutTailAt(oldTypeInstance.getCutTailAt());
	}

	@Override
	public void set() throws MigrationException {
		super.set();
		setMean();
		setStandardDeviation();
		setShiftRight();
		setCutTailAt();
	}

}