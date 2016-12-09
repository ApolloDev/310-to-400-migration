package edu.pitt.apollo.apolloversionmigration.output;

public class MeanMedianMinimumMaximumSetter extends UncertainValueSetter<edu.pitt.apollo.types.v4_0_1.MeanMedianMinimumMaximum> {

	public MeanMedianMinimumMaximumSetter(Class<edu.pitt.apollo.types.v4_0_1.MeanMedianMinimumMaximum> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setMean() throws MigrationException {
		newTypeInstance.setMean(((edu.pitt.apollo.types.v3_1_0.MeanMedianMinimumMaximum) oldTypeInstance).getMean());
	}

	protected void setMedian() throws MigrationException {
		newTypeInstance.setMedian(((edu.pitt.apollo.types.v3_1_0.MeanMedianMinimumMaximum) oldTypeInstance).getMedian());
	}

	protected void setMinimumValue() throws MigrationException {
		newTypeInstance.setMinimumValue(((edu.pitt.apollo.types.v3_1_0.MeanMedianMinimumMaximum) oldTypeInstance).getMinimumValue());
	}

	protected void setMaximumValue() throws MigrationException {
		newTypeInstance.setMaximumValue(((edu.pitt.apollo.types.v3_1_0.MeanMedianMinimumMaximum) oldTypeInstance).getMaximumValue());
	}

	protected void setSampleSize() throws MigrationException {
		newTypeInstance.setSampleSize(((edu.pitt.apollo.types.v3_1_0.MeanMedianMinimumMaximum) oldTypeInstance).getSampleSize());
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
			setMean();
			setMedian();
			setMinimumValue();
			setMaximumValue();
			setSampleSize();
		}
	}

}