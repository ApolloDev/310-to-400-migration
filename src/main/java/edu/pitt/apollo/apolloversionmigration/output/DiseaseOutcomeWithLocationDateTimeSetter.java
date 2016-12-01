package edu.pitt.apollo.apolloversionmigration.output;

public class DiseaseOutcomeWithLocationDateTimeSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.DiseaseOutcomeWithLocationDateTime> {

	public DiseaseOutcomeWithLocationDateTimeSetter(Class<edu.pitt.apollo.types.v4_0.DiseaseOutcomeWithLocationDateTime> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setDiseaseOutcome() throws MigrationException {
		newTypeInstance.setDiseaseOutcome(edu.pitt.apollo.types.v4_0.DiseaseOutcomeEnum.valueOf(((edu.pitt.apollo.types.v3_1_0.DiseaseOutcomeWithLocationDateTime) oldTypeInstance).getDiseaseOutcome().toString()));
	}

	protected void setDateTime() throws MigrationException {
		newTypeInstance.setDateTime(((edu.pitt.apollo.types.v3_1_0.DiseaseOutcomeWithLocationDateTime) oldTypeInstance).getDateTime());
	}

	protected void setPlace() throws MigrationException {
		newTypeInstance.setPlace(edu.pitt.apollo.types.v4_0.PlaceEnum.valueOf(((edu.pitt.apollo.types.v3_1_0.DiseaseOutcomeWithLocationDateTime) oldTypeInstance).getPlace().toString()));
	}

	protected void setLocationCode() throws MigrationException {
		newTypeInstance.setLocationCode(((edu.pitt.apollo.types.v3_1_0.DiseaseOutcomeWithLocationDateTime) oldTypeInstance).getLocationCode());
	}

	protected void setLatLongPair() throws MigrationException {
		LatLongPairSetter setter = new LatLongPairSetter(edu.pitt.apollo.types.v4_0.LatLongPair.class,((edu.pitt.apollo.types.v3_1_0.DiseaseOutcomeWithLocationDateTime) oldTypeInstance).getLatLongPair());
		setter.set();
		newTypeInstance.setLatLongPair(setter.getNewTypeInstance());
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			setDiseaseOutcome();
			setDateTime();
			setPlace();
			setLocationCode();
			setLatLongPair();
		}
	}

}