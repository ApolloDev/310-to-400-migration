package edu.pitt.apollo.apolloversionmigration.output;

public class DiseaseOutcomeWithLocationDateTimeSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.DiseaseOutcomeWithLocationDateTime,edu.pitt.apollo.types.v3_1_0.DiseaseOutcomeWithLocationDateTime> {

	public DiseaseOutcomeWithLocationDateTimeSetter(Class<edu.pitt.apollo.types.v4_0.DiseaseOutcomeWithLocationDateTime> newTypeClass, edu.pitt.apollo.types.v3_1_0.DiseaseOutcomeWithLocationDateTime oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setDiseaseOutcome() throws MigrationException {
		newTypeInstance.setDiseaseOutcome(edu.pitt.apollo.types.v4_0.DiseaseOutcomeEnum.fromValue(oldTypeInstance.getDiseaseOutcome().toString()));
	}

	private void setDateTime() throws MigrationException {
		newTypeInstance.setDateTime(oldTypeInstance.getDateTime());
	}

	private void setPlace() throws MigrationException {
		newTypeInstance.setPlace(edu.pitt.apollo.types.v4_0.PlaceEnum.fromValue(oldTypeInstance.getPlace().toString()));
	}

	private void setLocationCode() throws MigrationException {
		newTypeInstance.setLocationCode(oldTypeInstance.getLocationCode());
	}

	private void setLatLongPair() throws MigrationException {
		LatLongPairSetter setter = new LatLongPairSetter(edu.pitt.apollo.types.v4_0.LatLongPair.class,oldTypeInstance.getLatLongPair());
		setter.set();
		newTypeInstance.setLatLongPair(setter.getNewTypeInstance());
	}

	@Override
	public void set() throws MigrationException {
		setDiseaseOutcome();
		setDateTime();
		setPlace();
		setLocationCode();
		setLatLongPair();
	}

}