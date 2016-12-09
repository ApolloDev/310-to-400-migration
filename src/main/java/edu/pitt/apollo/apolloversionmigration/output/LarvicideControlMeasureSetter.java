package edu.pitt.apollo.apolloversionmigration.output;

public class LarvicideControlMeasureSetter extends VectorControlMeasureSetter<edu.pitt.apollo.types.v4_0_1.LarvicideControlMeasure> {

	public LarvicideControlMeasureSetter(Class<edu.pitt.apollo.types.v4_0_1.LarvicideControlMeasure> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setCoverRadius() throws MigrationException {
		DistanceSetter setter = new DistanceSetter(edu.pitt.apollo.types.v4_0_1.Distance.class,((edu.pitt.apollo.types.v3_1_0.LarvicideControlMeasure) oldTypeInstance).getCoverRadius());
		setter.set();
		newTypeInstance.setCoverRadius(setter.getNewTypeInstance());
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
			setCoverRadius();
		}
	}

}