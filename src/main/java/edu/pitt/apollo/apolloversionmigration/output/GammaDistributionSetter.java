package edu.pitt.apollo.apolloversionmigration.output;

public class GammaDistributionSetter extends ContinuousParametricProbabilityDistributionSetter<edu.pitt.apollo.types.v4_0.GammaDistribution> {

	public GammaDistributionSetter(Class<edu.pitt.apollo.types.v4_0.GammaDistribution> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setKShape() throws MigrationException {
		newTypeInstance.setKShape(((edu.pitt.apollo.types.v3_1_0.GammaDistribution) oldTypeInstance).getKShape());
	}

	protected void setThetaScale() throws MigrationException {
		newTypeInstance.setThetaScale(((edu.pitt.apollo.types.v3_1_0.GammaDistribution) oldTypeInstance).getThetaScale());
	}

	protected void setShiftRight() throws MigrationException {
		newTypeInstance.setShiftRight(((edu.pitt.apollo.types.v3_1_0.GammaDistribution) oldTypeInstance).getShiftRight());
	}

	protected void setCutTailAt() throws MigrationException {
		newTypeInstance.setCutTailAt(((edu.pitt.apollo.types.v3_1_0.GammaDistribution) oldTypeInstance).getCutTailAt());
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
			setKShape();
			setThetaScale();
			setShiftRight();
			setCutTailAt();
		}
	}

}