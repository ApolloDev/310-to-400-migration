package edu.pitt.apollo.apolloversionmigration.output;

public class WolbachiaControlMeasureSetter extends VectorControlMeasureSetter<edu.pitt.apollo.types.v4_0.WolbachiaControlMeasure> {

	public WolbachiaControlMeasureSetter(Class<edu.pitt.apollo.types.v4_0.WolbachiaControlMeasure> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setWolbachiaSitesEveryNth() throws MigrationException {
		newTypeInstance.setWolbachiaSitesEveryNth(((edu.pitt.apollo.types.v3_1_0.WolbachiaControlMeasure) oldTypeInstance).getWolbachiaSitesEveryNth());
	}

	protected void setWolbachiaSeedAdultsPerHouse() throws MigrationException {
		newTypeInstance.setWolbachiaSeedAdultsPerHouse(((edu.pitt.apollo.types.v3_1_0.WolbachiaControlMeasure) oldTypeInstance).getWolbachiaSeedAdultsPerHouse());
	}

	protected void setClearWolbachiaOnMigration() throws MigrationException {
		newTypeInstance.setClearWolbachiaOnMigration(((edu.pitt.apollo.types.v3_1_0.WolbachiaControlMeasure) oldTypeInstance).isClearWolbachiaOnMigration());
	}

	protected void setWolbachiaReleaseInterval() throws MigrationException {
		FixedDurationSetter setter = new FixedDurationSetter(edu.pitt.apollo.types.v4_0.FixedDuration.class,((edu.pitt.apollo.types.v3_1_0.WolbachiaControlMeasure) oldTypeInstance).getWolbachiaReleaseInterval());
		setter.set();
		newTypeInstance.setWolbachiaReleaseInterval(setter.getNewTypeInstance());
	}

	protected void setWolbachiaReleaseSites() throws MigrationException {
		newTypeInstance.setWolbachiaReleaseSites(edu.pitt.apollo.types.v4_0.WolbachiaReleaseSiteEnum.valueOf(((edu.pitt.apollo.types.v3_1_0.WolbachiaControlMeasure) oldTypeInstance).getWolbachiaReleaseSites().toString()));
	}

	protected void setWolbachiaEffectOnEggMortalityRate() throws MigrationException {
		newTypeInstance.setWolbachiaEffectOnEggMortalityRate(((edu.pitt.apollo.types.v3_1_0.WolbachiaControlMeasure) oldTypeInstance).getWolbachiaEffectOnEggMortalityRate());
	}

	protected void setWolbachiaEffectOnAdultMortalityRate() throws MigrationException {
		newTypeInstance.setWolbachiaEffectOnAdultMortalityRate(((edu.pitt.apollo.types.v3_1_0.WolbachiaControlMeasure) oldTypeInstance).getWolbachiaEffectOnAdultMortalityRate());
	}

	protected void setWolbachiaEffectOnLarvalMortalityRate() throws MigrationException {
		newTypeInstance.setWolbachiaEffectOnLarvalMortalityRate(((edu.pitt.apollo.types.v3_1_0.WolbachiaControlMeasure) oldTypeInstance).getWolbachiaEffectOnLarvalMortalityRate());
	}

	protected void setWolbachiaEffectOnFecundity() throws MigrationException {
		newTypeInstance.setWolbachiaEffectOnFecundity(((edu.pitt.apollo.types.v3_1_0.WolbachiaControlMeasure) oldTypeInstance).getWolbachiaEffectOnFecundity());
	}

	protected void setWolbachiaEffectOnMatingProbability() throws MigrationException {
		newTypeInstance.setWolbachiaEffectOnMatingProbability(((edu.pitt.apollo.types.v3_1_0.WolbachiaControlMeasure) oldTypeInstance).getWolbachiaEffectOnMatingProbability());
	}

	protected void setWolbachiaEffectOnLeakageRate() throws MigrationException {
		newTypeInstance.setWolbachiaEffectOnLeakageRate(((edu.pitt.apollo.types.v3_1_0.WolbachiaControlMeasure) oldTypeInstance).getWolbachiaEffectOnLeakageRate());
	}

	protected void setWolbachiaEffectOnVectorialCapacity() throws MigrationException {
		newTypeInstance.setWolbachiaEffectOnVectorialCapacity(((edu.pitt.apollo.types.v3_1_0.WolbachiaControlMeasure) oldTypeInstance).getWolbachiaEffectOnVectorialCapacity());
	}

	protected void setWolbachiaPreReleaseAdultSuppressionEfficacy() throws MigrationException {
		newTypeInstance.setWolbachiaPreReleaseAdultSuppressionEfficacy(((edu.pitt.apollo.types.v3_1_0.WolbachiaControlMeasure) oldTypeInstance).getWolbachiaPreReleaseAdultSuppressionEfficacy());
	}

	protected void setWolbachiaPreReleaseLarvalSuppressionEfficacy() throws MigrationException {
		newTypeInstance.setWolbachiaPreReleaseLarvalSuppressionEfficacy(((edu.pitt.apollo.types.v3_1_0.WolbachiaControlMeasure) oldTypeInstance).getWolbachiaPreReleaseLarvalSuppressionEfficacy());
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
			setWolbachiaSitesEveryNth();
			setWolbachiaSeedAdultsPerHouse();
			setClearWolbachiaOnMigration();
			setWolbachiaReleaseInterval();
			setWolbachiaReleaseSites();
			setWolbachiaEffectOnEggMortalityRate();
			setWolbachiaEffectOnAdultMortalityRate();
			setWolbachiaEffectOnLarvalMortalityRate();
			setWolbachiaEffectOnFecundity();
			setWolbachiaEffectOnMatingProbability();
			setWolbachiaEffectOnLeakageRate();
			setWolbachiaEffectOnVectorialCapacity();
			setWolbachiaPreReleaseAdultSuppressionEfficacy();
			setWolbachiaPreReleaseLarvalSuppressionEfficacy();
		}
	}

}