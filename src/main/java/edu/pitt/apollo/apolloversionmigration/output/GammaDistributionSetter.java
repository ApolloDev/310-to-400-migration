package edu.pitt.apollo.apolloversionmigration.output;

public class GammaDistributionSetter extends ContinuousParametricProbabilityDistributionSetter<edu.pitt.apollo.types.v4_0.GammaDistribution,edu.pitt.apollo.types.v3_1_0.GammaDistribution> {

	public GammaDistributionSetter(Class<edu.pitt.apollo.types.v4_0.GammaDistribution> newTypeClass, edu.pitt.apollo.types.v3_1_0.GammaDistribution oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setKShape() throws MigrationException {
		newTypeInstance.setKShape(oldTypeInstance.getKShape());
	}

	private void setThetaScale() throws MigrationException {
		newTypeInstance.setThetaScale(oldTypeInstance.getThetaScale());
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
		setKShape();
		setThetaScale();
		setShiftRight();
		setCutTailAt();
	}

}