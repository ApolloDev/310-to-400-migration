package edu.pitt.apollo.apolloversionmigration.output;

public class MeanWithConfidenceIntervalSetter extends UncertainValueSetter<edu.pitt.apollo.types.v4_0_1.MeanWithConfidenceInterval> {

	public MeanWithConfidenceIntervalSetter(Class<edu.pitt.apollo.types.v4_0_1.MeanWithConfidenceInterval> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setMean() throws MigrationException {
		newTypeInstance.setMean(((edu.pitt.apollo.types.v3_1_0.MeanWithConfidenceInterval) oldTypeInstance).getMean());
	}

	protected void setLowerBound() throws MigrationException {
		newTypeInstance.setLowerBound(((edu.pitt.apollo.types.v3_1_0.MeanWithConfidenceInterval) oldTypeInstance).getLowerBound());
	}

	protected void setUpperBound() throws MigrationException {
		newTypeInstance.setUpperBound(((edu.pitt.apollo.types.v3_1_0.MeanWithConfidenceInterval) oldTypeInstance).getUpperBound());
	}

	protected void setConfidence() throws MigrationException {
		newTypeInstance.setConfidence(((edu.pitt.apollo.types.v3_1_0.MeanWithConfidenceInterval) oldTypeInstance).getConfidence());
	}

	protected void setSampleSize() throws MigrationException {
		newTypeInstance.setSampleSize(((edu.pitt.apollo.types.v3_1_0.MeanWithConfidenceInterval) oldTypeInstance).getSampleSize());
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
			setMean();
			setLowerBound();
			setUpperBound();
			setConfidence();
			setSampleSize();
		}
	}

}