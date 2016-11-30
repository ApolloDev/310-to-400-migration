package edu.pitt.apollo.apolloversionmigration.output;

public class MeanWithConfidenceIntervalSetter extends UncertainValueSetter<edu.pitt.apollo.types.v4_0.MeanWithConfidenceInterval,edu.pitt.apollo.types.v3_1_0.MeanWithConfidenceInterval> {

	public MeanWithConfidenceIntervalSetter(Class<edu.pitt.apollo.types.v4_0.MeanWithConfidenceInterval> newTypeClass, edu.pitt.apollo.types.v3_1_0.MeanWithConfidenceInterval oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setMean() throws MigrationException {
		newTypeInstance.setMean(oldTypeInstance.getMean());
	}

	private void setLowerBound() throws MigrationException {
		newTypeInstance.setLowerBound(oldTypeInstance.getLowerBound());
	}

	private void setUpperBound() throws MigrationException {
		newTypeInstance.setUpperBound(oldTypeInstance.getUpperBound());
	}

	private void setConfidence() throws MigrationException {
		newTypeInstance.setConfidence(oldTypeInstance.getConfidence());
	}

	private void setSampleSize() throws MigrationException {
		newTypeInstance.setSampleSize(oldTypeInstance.getSampleSize());
	}

	@Override
	public void set() throws MigrationException {
		super.set();
		setMean();
		setLowerBound();
		setUpperBound();
		setConfidence();
		setSampleSize();
	}

}