package edu.pitt.apollo.apolloversionmigration.output;

public class RingIndividualTreatmentControlMeasureSetter extends IndividualTreatmentControlMeasureSetter<edu.pitt.apollo.types.v4_0_1.RingIndividualTreatmentControlMeasure> {

	public RingIndividualTreatmentControlMeasureSetter(Class<edu.pitt.apollo.types.v4_0_1.RingIndividualTreatmentControlMeasure> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setRingDiameterInMeters() throws MigrationException {
		newTypeInstance.setRingDiameterInMeters(((edu.pitt.apollo.types.v3_1_0.RingIndividualTreatmentControlMeasure) oldTypeInstance).getRingDiameterInMeters());
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
			setRingDiameterInMeters();
		}
	}

}