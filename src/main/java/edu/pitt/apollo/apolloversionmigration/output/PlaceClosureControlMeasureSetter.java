package edu.pitt.apollo.apolloversionmigration.output;

public class PlaceClosureControlMeasureSetter extends InfectiousDiseaseControlMeasureSetter<edu.pitt.apollo.types.v4_0.PlaceClosureControlMeasure,edu.pitt.apollo.types.v3_1_0.PlaceClosureControlMeasure> {

	public PlaceClosureControlMeasureSetter(Class<edu.pitt.apollo.types.v4_0.PlaceClosureControlMeasure> newTypeClass, edu.pitt.apollo.types.v3_1_0.PlaceClosureControlMeasure oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setCloseIndividualPlacesIndependently() throws MigrationException {
		newTypeInstance.setCloseIndividualPlacesIndependently(oldTypeInstance.isCloseIndividualPlacesIndependently());
	}

	private void setClosurePeriod() throws MigrationException {
		DurationSetter setter = DurationSetterFactory.getSetter(oldTypeInstance.getClosurePeriod());
		setter.set();
		newTypeInstance.setClosurePeriod(setter.getNewTypeInstance());
	}

	private void setHouseholdTransmissionMultiplier() throws MigrationException {
		newTypeInstance.setHouseholdTransmissionMultiplier(oldTypeInstance.getHouseholdTransmissionMultiplier());
	}

	private void setCommunityTransmissionMultiplier() throws MigrationException {
		newTypeInstance.setCommunityTransmissionMultiplier(oldTypeInstance.getCommunityTransmissionMultiplier());
	}

	@Override
	public void set() throws MigrationException {
		super.set();
		setCloseIndividualPlacesIndependently();
		setClosurePeriod();
		setHouseholdTransmissionMultiplier();
		setCommunityTransmissionMultiplier();
	}

}