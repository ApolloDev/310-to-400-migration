package edu.pitt.apollo.apolloversionmigration.output;

public class InsecticideTreatedNetControlMeasureSetter extends VectorControlMeasureSetter<edu.pitt.apollo.types.v4_0_1.InsecticideTreatedNetControlMeasure> {

	public InsecticideTreatedNetControlMeasureSetter(Class<edu.pitt.apollo.types.v4_0_1.InsecticideTreatedNetControlMeasure> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setNetHolingRate() throws MigrationException {
		RateSetter setter = new RateSetter(edu.pitt.apollo.types.v4_0_1.Rate.class,((edu.pitt.apollo.types.v3_1_0.InsecticideTreatedNetControlMeasure) oldTypeInstance).getNetHolingRate());
		setter.set();
		newTypeInstance.setNetHolingRate(setter.getNewTypeInstance());
	}

	protected void setNightlyProbabilityOfUse() throws MigrationException {
		newTypeInstance.setNightlyProbabilityOfUse(((edu.pitt.apollo.types.v3_1_0.InsecticideTreatedNetControlMeasure) oldTypeInstance).getNightlyProbabilityOfUse());
	}

	protected void setInsecticideEfficacyDecayRate() throws MigrationException {
		RateSetter setter = new RateSetter(edu.pitt.apollo.types.v4_0_1.Rate.class,((edu.pitt.apollo.types.v3_1_0.InsecticideTreatedNetControlMeasure) oldTypeInstance).getInsecticideEfficacyDecayRate());
		setter.set();
		newTypeInstance.setInsecticideEfficacyDecayRate(setter.getNewTypeInstance());
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
			setNetHolingRate();
			setNightlyProbabilityOfUse();
			setInsecticideEfficacyDecayRate();
		}
	}

}