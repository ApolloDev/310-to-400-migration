package edu.pitt.apollo.apolloversionmigration.output;

public class RingIndividualTreatmentControlMeasureSetter extends IndividualTreatmentControlMeasureSetter<edu.pitt.apollo.types.v4_0.RingIndividualTreatmentControlMeasure,edu.pitt.apollo.types.v3_1_0.RingIndividualTreatmentControlMeasure> {

	public RingIndividualTreatmentControlMeasureSetter(Class<edu.pitt.apollo.types.v4_0.RingIndividualTreatmentControlMeasure> newTypeClass, edu.pitt.apollo.types.v3_1_0.RingIndividualTreatmentControlMeasure oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setRingDiameterInMeters() throws MigrationException {
		newTypeInstance.setRingDiameterInMeters(oldTypeInstance.getRingDiameterInMeters());
	}

	@Override
	public void set() throws MigrationException {
		super.set();
		setRingDiameterInMeters();
	}

}