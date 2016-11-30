package edu.pitt.apollo.apolloversionmigration.output;

public class OvipositionSiteCensusSetter extends AbioticThingCensusSetter<edu.pitt.apollo.types.v4_0.OvipositionSiteCensus,edu.pitt.apollo.types.v3_1_0.OvipositionSiteCensus> {

	public OvipositionSiteCensusSetter(Class<edu.pitt.apollo.types.v4_0.OvipositionSiteCensus> newTypeClass, edu.pitt.apollo.types.v3_1_0.OvipositionSiteCensus oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setBreteauIndex() throws MigrationException {
		newTypeInstance.setBreteauIndex(oldTypeInstance.getBreteauIndex());
	}

	private void setCarryingCapacityPerHouse() throws MigrationException {
		newTypeInstance.setCarryingCapacityPerHouse(oldTypeInstance.getCarryingCapacityPerHouse());
	}

	private void setHeterogenousCarryingCapacity() throws MigrationException {
		newTypeInstance.setHeterogenousCarryingCapacity(oldTypeInstance.isHeterogenousCarryingCapacity());
	}

	private void setRatioOfOutdoorToIndoorOvisites() throws MigrationException {
		newTypeInstance.setRatioOfOutdoorToIndoorOvisites(oldTypeInstance.getRatioOfOutdoorToIndoorOvisites());
	}

	private void setMaximumRatioOfOutdoorCarryingCapacityToIndoor() throws MigrationException {
		newTypeInstance.setMaximumRatioOfOutdoorCarryingCapacityToIndoor(oldTypeInstance.getMaximumRatioOfOutdoorCarryingCapacityToIndoor());
	}

	@Override
	public void set() throws MigrationException {
		super.set();
		setBreteauIndex();
		setCarryingCapacityPerHouse();
		setHeterogenousCarryingCapacity();
		setRatioOfOutdoorToIndoorOvisites();
		setMaximumRatioOfOutdoorCarryingCapacityToIndoor();
	}

}