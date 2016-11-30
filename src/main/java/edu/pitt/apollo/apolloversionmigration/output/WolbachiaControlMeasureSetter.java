package edu.pitt.apollo.apolloversionmigration.output;

public class WolbachiaControlMeasureSetter extends VectorControlMeasureSetter<edu.pitt.apollo.types.v4_0.WolbachiaControlMeasure,edu.pitt.apollo.types.v3_1_0.WolbachiaControlMeasure> {

	public WolbachiaControlMeasureSetter(Class<edu.pitt.apollo.types.v4_0.WolbachiaControlMeasure> newTypeClass, edu.pitt.apollo.types.v3_1_0.WolbachiaControlMeasure oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setWolbachiaSitesEveryNth() throws MigrationException {
		newTypeInstance.setWolbachiaSitesEveryNth(oldTypeInstance.getWolbachiaSitesEveryNth());
	}

	private void setWolbachiaSeedAdultsPerHouse() throws MigrationException {
		newTypeInstance.setWolbachiaSeedAdultsPerHouse(oldTypeInstance.getWolbachiaSeedAdultsPerHouse());
	}

	private void setClearWolbachiaOnMigration() throws MigrationException {
		newTypeInstance.setClearWolbachiaOnMigration(oldTypeInstance.isClearWolbachiaOnMigration());
	}

	private void setWolbachiaReleaseInterval() throws MigrationException {
		FixedDurationSetter setter = new FixedDurationSetter(edu.pitt.apollo.types.v4_0.FixedDuration.class,oldTypeInstance.getWolbachiaReleaseInterval());
		setter.set();
		newTypeInstance.setWolbachiaReleaseInterval(setter.getNewTypeInstance());
	}

	private void setWolbachiaReleaseSites() throws MigrationException {
		newTypeInstance.setWolbachiaReleaseSites(edu.pitt.apollo.types.v4_0.WolbachiaReleaseSiteEnum.fromValue(oldTypeInstance.getWolbachiaReleaseSites().toString()));
	}

	private void setWolbachiaEffectOnEggMortalityRate() throws MigrationException {
		newTypeInstance.setWolbachiaEffectOnEggMortalityRate(oldTypeInstance.getWolbachiaEffectOnEggMortalityRate());
	}

	private void setWolbachiaEffectOnAdultMortalityRate() throws MigrationException {
		newTypeInstance.setWolbachiaEffectOnAdultMortalityRate(oldTypeInstance.getWolbachiaEffectOnAdultMortalityRate());
	}

	private void setWolbachiaEffectOnLarvalMortalityRate() throws MigrationException {
		newTypeInstance.setWolbachiaEffectOnLarvalMortalityRate(oldTypeInstance.getWolbachiaEffectOnLarvalMortalityRate());
	}

	private void setWolbachiaEffectOnFecundity() throws MigrationException {
		newTypeInstance.setWolbachiaEffectOnFecundity(oldTypeInstance.getWolbachiaEffectOnFecundity());
	}

	private void setWolbachiaEffectOnMatingProbability() throws MigrationException {
		newTypeInstance.setWolbachiaEffectOnMatingProbability(oldTypeInstance.getWolbachiaEffectOnMatingProbability());
	}

	private void setWolbachiaEffectOnLeakageRate() throws MigrationException {
		newTypeInstance.setWolbachiaEffectOnLeakageRate(oldTypeInstance.getWolbachiaEffectOnLeakageRate());
	}

	private void setWolbachiaEffectOnVectorialCapacity() throws MigrationException {
		newTypeInstance.setWolbachiaEffectOnVectorialCapacity(oldTypeInstance.getWolbachiaEffectOnVectorialCapacity());
	}

	private void setWolbachiaPreReleaseAdultSuppressionEfficacy() throws MigrationException {
		newTypeInstance.setWolbachiaPreReleaseAdultSuppressionEfficacy(oldTypeInstance.getWolbachiaPreReleaseAdultSuppressionEfficacy());
	}

	private void setWolbachiaPreReleaseLarvalSuppressionEfficacy() throws MigrationException {
		newTypeInstance.setWolbachiaPreReleaseLarvalSuppressionEfficacy(oldTypeInstance.getWolbachiaPreReleaseLarvalSuppressionEfficacy());
	}

	@Override
	public void set() throws MigrationException {
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