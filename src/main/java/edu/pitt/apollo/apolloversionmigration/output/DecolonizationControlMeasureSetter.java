package edu.pitt.apollo.apolloversionmigration.output;

public class DecolonizationControlMeasureSetter extends IndividualTreatmentControlMeasureSetter<edu.pitt.apollo.types.v4_0.DecolonizationControlMeasure> {

	public DecolonizationControlMeasureSetter(Class<edu.pitt.apollo.types.v4_0.DecolonizationControlMeasure> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setRelapseProbability() throws MigrationException {
		newTypeInstance.setRelapseProbability(((edu.pitt.apollo.types.v3_1_0.DecolonizationControlMeasure) oldTypeInstance).getRelapseProbability());
	}

	protected void setRelapseInterval() throws MigrationException {
		newTypeInstance.setRelapseInterval(((edu.pitt.apollo.types.v3_1_0.DecolonizationControlMeasure) oldTypeInstance).getRelapseInterval());
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
			setRelapseProbability();
			setRelapseInterval();
		}
	}

}