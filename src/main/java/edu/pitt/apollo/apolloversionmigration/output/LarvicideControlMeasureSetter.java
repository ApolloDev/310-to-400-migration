package edu.pitt.apollo.apolloversionmigration.output;

public class LarvicideControlMeasureSetter extends VectorControlMeasureSetter<edu.pitt.apollo.types.v4_0.LarvicideControlMeasure,edu.pitt.apollo.types.v3_1_0.LarvicideControlMeasure> {

	public LarvicideControlMeasureSetter(Class<edu.pitt.apollo.types.v4_0.LarvicideControlMeasure> newTypeClass, edu.pitt.apollo.types.v3_1_0.LarvicideControlMeasure oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setCoverRadius() throws MigrationException {
		DistanceSetter setter = new DistanceSetter(edu.pitt.apollo.types.v4_0.Distance.class,oldTypeInstance.getCoverRadius());
		setter.set();
		newTypeInstance.setCoverRadius(setter.getNewTypeInstance());
	}

	@Override
	public void set() throws MigrationException {
		super.set();
		setCoverRadius();
	}

}