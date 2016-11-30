package edu.pitt.apollo.apolloversionmigration.output;

public class MeanWithStandardDeviationSetter extends UncertainValueSetter<edu.pitt.apollo.types.v4_0.MeanWithStandardDeviation,edu.pitt.apollo.types.v3_1_0.MeanWithStandardDeviation> {

	public MeanWithStandardDeviationSetter(Class<edu.pitt.apollo.types.v4_0.MeanWithStandardDeviation> newTypeClass, edu.pitt.apollo.types.v3_1_0.MeanWithStandardDeviation oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setMean() throws MigrationException {
		newTypeInstance.setMean(oldTypeInstance.getMean());
	}

	private void setStandardDeviation() throws MigrationException {
		newTypeInstance.setStandardDeviation(oldTypeInstance.getStandardDeviation());
	}

	private void setSampleSize() throws MigrationException {
		newTypeInstance.setSampleSize(oldTypeInstance.getSampleSize());
	}

	@Override
	public void set() throws MigrationException {
		super.set();
		setMean();
		setStandardDeviation();
		setSampleSize();
	}

}