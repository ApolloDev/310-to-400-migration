package edu.pitt.apollo.apolloversionmigration.output;

public class MeanWithStandardDeviationSetter extends UncertainValueSetter<edu.pitt.apollo.types.v4_0.MeanWithStandardDeviation> {

	public MeanWithStandardDeviationSetter(Class<edu.pitt.apollo.types.v4_0.MeanWithStandardDeviation> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setMean() throws MigrationException {
		newTypeInstance.setMean(((edu.pitt.apollo.types.v3_1_0.MeanWithStandardDeviation) oldTypeInstance).getMean());
	}

	protected void setStandardDeviation() throws MigrationException {
		newTypeInstance.setStandardDeviation(((edu.pitt.apollo.types.v3_1_0.MeanWithStandardDeviation) oldTypeInstance).getStandardDeviation());
	}

	protected void setSampleSize() throws MigrationException {
		newTypeInstance.setSampleSize(((edu.pitt.apollo.types.v3_1_0.MeanWithStandardDeviation) oldTypeInstance).getSampleSize());
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
			setMean();
			setStandardDeviation();
			setSampleSize();
		}
	}

}