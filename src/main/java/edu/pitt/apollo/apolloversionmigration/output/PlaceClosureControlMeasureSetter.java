package edu.pitt.apollo.apolloversionmigration.output;

public class PlaceClosureControlMeasureSetter extends InfectiousDiseaseControlMeasureSetter<edu.pitt.apollo.types.v4_0_1.PlaceClosureControlMeasure> {

	public PlaceClosureControlMeasureSetter(Class<edu.pitt.apollo.types.v4_0_1.PlaceClosureControlMeasure> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setCloseIndividualPlacesIndependently() throws MigrationException {
		newTypeInstance.setCloseIndividualPlacesIndependently(((edu.pitt.apollo.types.v3_1_0.PlaceClosureControlMeasure) oldTypeInstance).isCloseIndividualPlacesIndependently());
	}

	protected void setClosurePeriod() throws MigrationException {
		if (((edu.pitt.apollo.types.v3_1_0.PlaceClosureControlMeasure) oldTypeInstance).getClosurePeriod() != null) {
			DurationSetter setter = DurationSetterFactory.getSetter(((edu.pitt.apollo.types.v3_1_0.PlaceClosureControlMeasure) oldTypeInstance).getClosurePeriod());
			setter.set();
			newTypeInstance.setClosurePeriod(setter.getNewTypeInstance());
		}

	}

	protected void setHouseholdTransmissionMultiplier() throws MigrationException {
		newTypeInstance.setHouseholdTransmissionMultiplier(((edu.pitt.apollo.types.v3_1_0.PlaceClosureControlMeasure) oldTypeInstance).getHouseholdTransmissionMultiplier());
	}

	protected void setCommunityTransmissionMultiplier() throws MigrationException {
		newTypeInstance.setCommunityTransmissionMultiplier(((edu.pitt.apollo.types.v3_1_0.PlaceClosureControlMeasure) oldTypeInstance).getCommunityTransmissionMultiplier());
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
			setCloseIndividualPlacesIndependently();
			setClosurePeriod();
			setHouseholdTransmissionMultiplier();
			setCommunityTransmissionMultiplier();
		}
	}

}