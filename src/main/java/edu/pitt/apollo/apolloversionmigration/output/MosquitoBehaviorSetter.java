package edu.pitt.apollo.apolloversionmigration.output;

public class MosquitoBehaviorSetter extends BehaviorSetter<edu.pitt.apollo.types.v4_0.MosquitoBehavior,edu.pitt.apollo.types.v3_1_0.MosquitoBehavior> {

	public MosquitoBehaviorSetter(Class<edu.pitt.apollo.types.v4_0.MosquitoBehavior> newTypeClass, edu.pitt.apollo.types.v3_1_0.MosquitoBehavior oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setBiteProbability() throws MigrationException {
		ProbabilisticParameterSetter setter = new ProbabilisticParameterSetter(edu.pitt.apollo.types.v4_0.ProbabilisticParameter.class,oldTypeInstance.getBiteProbability());
		setter.set();
		newTypeInstance.setBiteProbability(setter.getNewTypeInstance());
	}

	private void setBiteRadius() throws MigrationException {
		DistanceSetter setter = new DistanceSetter(edu.pitt.apollo.types.v4_0.Distance.class,oldTypeInstance.getBiteRadius());
		setter.set();
		newTypeInstance.setBiteRadius(setter.getNewTypeInstance());
	}

	private void setTimeBetweenBites() throws MigrationException {
		DurationSetter setter = DurationSetterFactory.getSetter(oldTypeInstance.getTimeBetweenBites());
		setter.set();
		newTypeInstance.setTimeBetweenBites(setter.getNewTypeInstance());
	}

	private void setMigrationSpeed() throws MigrationException {
		RateSetter setter = new RateSetter(edu.pitt.apollo.types.v4_0.Rate.class,oldTypeInstance.getMigrationSpeed());
		setter.set();
		newTypeInstance.setMigrationSpeed(setter.getNewTypeInstance());
	}

	private void setShadeAffinity() throws MigrationException {
		newTypeInstance.setShadeAffinity(oldTypeInstance.getShadeAffinity());
	}

	private void setMaleMatingRadius() throws MigrationException {
		DistanceSetter setter = new DistanceSetter(edu.pitt.apollo.types.v4_0.Distance.class,oldTypeInstance.getMaleMatingRadius());
		setter.set();
		newTypeInstance.setMaleMatingRadius(setter.getNewTypeInstance());
	}

	private void setMatingProbability() throws MigrationException {
		newTypeInstance.setMatingProbability(oldTypeInstance.getMatingProbability());
	}

	private void setStraightTravelAfterOviposit() throws MigrationException {
		DistanceSetter setter = new DistanceSetter(edu.pitt.apollo.types.v4_0.Distance.class,oldTypeInstance.getStraightTravelAfterOviposit());
		setter.set();
		newTypeInstance.setStraightTravelAfterOviposit(setter.getNewTypeInstance());
	}

	@Override
	public void set() throws MigrationException {
		super.set();
		setBiteProbability();
		setBiteRadius();
		setTimeBetweenBites();
		setMigrationSpeed();
		setShadeAffinity();
		setMaleMatingRadius();
		setMatingProbability();
		setStraightTravelAfterOviposit();
	}

}