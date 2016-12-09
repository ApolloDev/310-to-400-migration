package edu.pitt.apollo.apolloversionmigration.output;

public class MosquitoBehaviorSetter extends BehaviorSetter<edu.pitt.apollo.types.v4_0_1.MosquitoBehavior> {

	public MosquitoBehaviorSetter(Class<edu.pitt.apollo.types.v4_0_1.MosquitoBehavior> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setBiteProbability() throws MigrationException {
		ProbabilisticParameterSetter setter = new ProbabilisticParameterSetter(edu.pitt.apollo.types.v4_0_1.ProbabilisticParameter.class,((edu.pitt.apollo.types.v3_1_0.MosquitoBehavior) oldTypeInstance).getBiteProbability());
		setter.set();
		newTypeInstance.setBiteProbability(setter.getNewTypeInstance());
	}

	protected void setBiteRadius() throws MigrationException {
		DistanceSetter setter = new DistanceSetter(edu.pitt.apollo.types.v4_0_1.Distance.class,((edu.pitt.apollo.types.v3_1_0.MosquitoBehavior) oldTypeInstance).getBiteRadius());
		setter.set();
		newTypeInstance.setBiteRadius(setter.getNewTypeInstance());
	}

	protected void setTimeBetweenBites() throws MigrationException {
		if (((edu.pitt.apollo.types.v3_1_0.MosquitoBehavior) oldTypeInstance).getTimeBetweenBites() != null) {
			DurationSetter setter = DurationSetterFactory.getSetter(((edu.pitt.apollo.types.v3_1_0.MosquitoBehavior) oldTypeInstance).getTimeBetweenBites());
			setter.set();
			newTypeInstance.setTimeBetweenBites(setter.getNewTypeInstance());
		}

	}

	protected void setMigrationSpeed() throws MigrationException {
		RateSetter setter = new RateSetter(edu.pitt.apollo.types.v4_0_1.Rate.class,((edu.pitt.apollo.types.v3_1_0.MosquitoBehavior) oldTypeInstance).getMigrationSpeed());
		setter.set();
		newTypeInstance.setMigrationSpeed(setter.getNewTypeInstance());
	}

	protected void setShadeAffinity() throws MigrationException {
		newTypeInstance.setShadeAffinity(((edu.pitt.apollo.types.v3_1_0.MosquitoBehavior) oldTypeInstance).getShadeAffinity());
	}

	protected void setMaleMatingRadius() throws MigrationException {
		DistanceSetter setter = new DistanceSetter(edu.pitt.apollo.types.v4_0_1.Distance.class,((edu.pitt.apollo.types.v3_1_0.MosquitoBehavior) oldTypeInstance).getMaleMatingRadius());
		setter.set();
		newTypeInstance.setMaleMatingRadius(setter.getNewTypeInstance());
	}

	protected void setMatingProbability() throws MigrationException {
		newTypeInstance.setMatingProbability(((edu.pitt.apollo.types.v3_1_0.MosquitoBehavior) oldTypeInstance).getMatingProbability());
	}

	protected void setStraightTravelAfterOviposit() throws MigrationException {
		DistanceSetter setter = new DistanceSetter(edu.pitt.apollo.types.v4_0_1.Distance.class,((edu.pitt.apollo.types.v3_1_0.MosquitoBehavior) oldTypeInstance).getStraightTravelAfterOviposit());
		setter.set();
		newTypeInstance.setStraightTravelAfterOviposit(setter.getNewTypeInstance());
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
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

}