package edu.pitt.apollo.apolloversionmigration.output;

public class ContinuousUniformDistributionSetter extends ContinuousParametricProbabilityDistributionSetter<edu.pitt.apollo.types.v4_0_1.ContinuousUniformDistribution> {

	public ContinuousUniformDistributionSetter(Class<edu.pitt.apollo.types.v4_0_1.ContinuousUniformDistribution> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setMinimumValue() throws MigrationException {
		newTypeInstance.setMinimumValue(((edu.pitt.apollo.types.v3_1_0.ContinuousUniformDistribution) oldTypeInstance).getMinimumValue());
	}

	protected void setMaximumValue() throws MigrationException {
		newTypeInstance.setMaximumValue(((edu.pitt.apollo.types.v3_1_0.ContinuousUniformDistribution) oldTypeInstance).getMaximumValue());
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
			setMinimumValue();
			setMaximumValue();
		}
	}

}