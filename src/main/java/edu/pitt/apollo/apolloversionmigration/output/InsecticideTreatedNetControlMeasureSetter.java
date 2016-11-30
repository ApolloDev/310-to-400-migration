package edu.pitt.apollo.apolloversionmigration.output;

public class InsecticideTreatedNetControlMeasureSetter extends VectorControlMeasureSetter<edu.pitt.apollo.types.v4_0.InsecticideTreatedNetControlMeasure,edu.pitt.apollo.types.v3_1_0.InsecticideTreatedNetControlMeasure> {

	public InsecticideTreatedNetControlMeasureSetter(Class<edu.pitt.apollo.types.v4_0.InsecticideTreatedNetControlMeasure> newTypeClass, edu.pitt.apollo.types.v3_1_0.InsecticideTreatedNetControlMeasure oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setNetHolingRate() throws MigrationException {
		RateSetter setter = new RateSetter(edu.pitt.apollo.types.v4_0.Rate.class,oldTypeInstance.getNetHolingRate());
		setter.set();
		newTypeInstance.setNetHolingRate(setter.getNewTypeInstance());
	}

	private void setNightlyProbabilityOfUse() throws MigrationException {
		newTypeInstance.setNightlyProbabilityOfUse(oldTypeInstance.getNightlyProbabilityOfUse());
	}

	private void setInsecticideEfficacyDecayRate() throws MigrationException {
		RateSetter setter = new RateSetter(edu.pitt.apollo.types.v4_0.Rate.class,oldTypeInstance.getInsecticideEfficacyDecayRate());
		setter.set();
		newTypeInstance.setInsecticideEfficacyDecayRate(setter.getNewTypeInstance());
	}

	@Override
	public void set() throws MigrationException {
		super.set();
		setNetHolingRate();
		setNightlyProbabilityOfUse();
		setInsecticideEfficacyDecayRate();
	}

}