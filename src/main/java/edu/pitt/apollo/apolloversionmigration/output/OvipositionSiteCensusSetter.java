package edu.pitt.apollo.apolloversionmigration.output;

public class OvipositionSiteCensusSetter extends AbioticThingCensusSetter<edu.pitt.apollo.types.v4_0.OvipositionSiteCensus> {

	public OvipositionSiteCensusSetter(Class<edu.pitt.apollo.types.v4_0.OvipositionSiteCensus> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setBreteauIndex() throws MigrationException {
		newTypeInstance.setBreteauIndex(((edu.pitt.apollo.types.v3_1_0.OvipositionSiteCensus) oldTypeInstance).getBreteauIndex());
	}

	protected void setCarryingCapacityPerHouse() throws MigrationException {
		newTypeInstance.setCarryingCapacityPerHouse(((edu.pitt.apollo.types.v3_1_0.OvipositionSiteCensus) oldTypeInstance).getCarryingCapacityPerHouse());
	}

	protected void setHeterogenousCarryingCapacity() throws MigrationException {
		newTypeInstance.setHeterogenousCarryingCapacity(((edu.pitt.apollo.types.v3_1_0.OvipositionSiteCensus) oldTypeInstance).isHeterogenousCarryingCapacity());
	}

	protected void setRatioOfOutdoorToIndoorOvisites() throws MigrationException {
		newTypeInstance.setRatioOfOutdoorToIndoorOvisites(((edu.pitt.apollo.types.v3_1_0.OvipositionSiteCensus) oldTypeInstance).getRatioOfOutdoorToIndoorOvisites());
	}

	protected void setMaximumRatioOfOutdoorCarryingCapacityToIndoor() throws MigrationException {
		newTypeInstance.setMaximumRatioOfOutdoorCarryingCapacityToIndoor(((edu.pitt.apollo.types.v3_1_0.OvipositionSiteCensus) oldTypeInstance).getMaximumRatioOfOutdoorCarryingCapacityToIndoor());
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
			setBreteauIndex();
			setCarryingCapacityPerHouse();
			setHeterogenousCarryingCapacity();
			setRatioOfOutdoorToIndoorOvisites();
			setMaximumRatioOfOutdoorCarryingCapacityToIndoor();
		}
	}

}