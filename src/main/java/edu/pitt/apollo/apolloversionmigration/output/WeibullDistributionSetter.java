package edu.pitt.apollo.apolloversionmigration.output;

public class WeibullDistributionSetter extends ContinuousParametricProbabilityDistributionSetter<edu.pitt.apollo.types.v4_0.WeibullDistribution> {

	public WeibullDistributionSetter(Class<edu.pitt.apollo.types.v4_0.WeibullDistribution> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setKShape() throws MigrationException {
		newTypeInstance.setKShape(((edu.pitt.apollo.types.v3_1_0.WeibullDistribution) oldTypeInstance).getKShape());
	}

	protected void setLambdaScale() throws MigrationException {
		newTypeInstance.setLambdaScale(((edu.pitt.apollo.types.v3_1_0.WeibullDistribution) oldTypeInstance).getLambdaScale());
	}

	protected void setShiftRight() throws MigrationException {
		newTypeInstance.setShiftRight(((edu.pitt.apollo.types.v3_1_0.WeibullDistribution) oldTypeInstance).getShiftRight());
	}

	protected void setCutTailAt() throws MigrationException {
		newTypeInstance.setCutTailAt(((edu.pitt.apollo.types.v3_1_0.WeibullDistribution) oldTypeInstance).getCutTailAt());
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
			setKShape();
			setLambdaScale();
			setShiftRight();
			setCutTailAt();
		}
	}

}