package edu.pitt.apollo.apolloversionmigration.output;

public class ContinuousUniformDistributionSetter extends ContinuousParametricProbabilityDistributionSetter<edu.pitt.apollo.types.v4_0.ContinuousUniformDistribution,edu.pitt.apollo.types.v3_1_0.ContinuousUniformDistribution> {

	public ContinuousUniformDistributionSetter(Class<edu.pitt.apollo.types.v4_0.ContinuousUniformDistribution> newTypeClass, edu.pitt.apollo.types.v3_1_0.ContinuousUniformDistribution oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setMinimumValue() throws MigrationException {
		newTypeInstance.setMinimumValue(oldTypeInstance.getMinimumValue());
	}

	private void setMaximumValue() throws MigrationException {
		newTypeInstance.setMaximumValue(oldTypeInstance.getMaximumValue());
	}

	@Override
	public void set() throws MigrationException {
		super.set();
		setMinimumValue();
		setMaximumValue();
	}

}