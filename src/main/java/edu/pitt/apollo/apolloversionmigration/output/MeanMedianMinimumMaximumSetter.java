package edu.pitt.apollo.apolloversionmigration.output;

public class MeanMedianMinimumMaximumSetter extends UncertainValueSetter<edu.pitt.apollo.types.v4_0.MeanMedianMinimumMaximum,edu.pitt.apollo.types.v3_1_0.MeanMedianMinimumMaximum> {

	public MeanMedianMinimumMaximumSetter(Class<edu.pitt.apollo.types.v4_0.MeanMedianMinimumMaximum> newTypeClass, edu.pitt.apollo.types.v3_1_0.MeanMedianMinimumMaximum oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setMean() throws MigrationException {
		newTypeInstance.setMean(oldTypeInstance.getMean());
	}

	private void setMedian() throws MigrationException {
		newTypeInstance.setMedian(oldTypeInstance.getMedian());
	}

	private void setMinimumValue() throws MigrationException {
		newTypeInstance.setMinimumValue(oldTypeInstance.getMinimumValue());
	}

	private void setMaximumValue() throws MigrationException {
		newTypeInstance.setMaximumValue(oldTypeInstance.getMaximumValue());
	}

	private void setSampleSize() throws MigrationException {
		newTypeInstance.setSampleSize(oldTypeInstance.getSampleSize());
	}

	@Override
	public void set() throws MigrationException {
		super.set();
		setMean();
		setMedian();
		setMinimumValue();
		setMaximumValue();
		setSampleSize();
	}

}