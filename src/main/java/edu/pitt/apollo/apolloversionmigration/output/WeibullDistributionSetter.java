package edu.pitt.apollo.apolloversionmigration.output;

public class WeibullDistributionSetter extends ContinuousParametricProbabilityDistributionSetter<edu.pitt.apollo.types.v4_0.WeibullDistribution,edu.pitt.apollo.types.v3_1_0.WeibullDistribution> {

	public WeibullDistributionSetter(Class<edu.pitt.apollo.types.v4_0.WeibullDistribution> newTypeClass, edu.pitt.apollo.types.v3_1_0.WeibullDistribution oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setKShape() throws MigrationException {
		newTypeInstance.setKShape(oldTypeInstance.getKShape());
	}

	private void setLambdaScale() throws MigrationException {
		newTypeInstance.setLambdaScale(oldTypeInstance.getLambdaScale());
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
		setLambdaScale();
		setShiftRight();
		setCutTailAt();
	}

}