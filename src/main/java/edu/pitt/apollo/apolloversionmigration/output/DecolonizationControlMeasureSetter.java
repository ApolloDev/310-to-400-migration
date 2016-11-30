package edu.pitt.apollo.apolloversionmigration.output;

public class DecolonizationControlMeasureSetter extends IndividualTreatmentControlMeasureSetter<edu.pitt.apollo.types.v4_0.DecolonizationControlMeasure,edu.pitt.apollo.types.v3_1_0.DecolonizationControlMeasure> {

	public DecolonizationControlMeasureSetter(Class<edu.pitt.apollo.types.v4_0.DecolonizationControlMeasure> newTypeClass, edu.pitt.apollo.types.v3_1_0.DecolonizationControlMeasure oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setRelapseProbability() throws MigrationException {
		newTypeInstance.setRelapseProbability(oldTypeInstance.getRelapseProbability());
	}

	private void setRelapseInterval() throws MigrationException {
		newTypeInstance.setRelapseInterval(oldTypeInstance.getRelapseInterval());
	}

	@Override
	public void set() throws MigrationException {
		super.set();
		setRelapseProbability();
		setRelapseInterval();
	}

}