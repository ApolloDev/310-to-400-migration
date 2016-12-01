package edu.pitt.apollo.apolloversionmigration.output;

public class BorderControlMeasureSetter extends InfectiousDiseaseControlMeasureSetter<edu.pitt.apollo.types.v4_0.BorderControlMeasure> {

	public BorderControlMeasureSetter(Class<edu.pitt.apollo.types.v4_0.BorderControlMeasure> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setProbabilityEntryDenied() throws MigrationException {
		newTypeInstance.setProbabilityEntryDenied(((edu.pitt.apollo.types.v3_1_0.BorderControlMeasure) oldTypeInstance).getProbabilityEntryDenied());
	}

	protected void setProbabilityExitDenied() throws MigrationException {
		newTypeInstance.setProbabilityExitDenied(((edu.pitt.apollo.types.v3_1_0.BorderControlMeasure) oldTypeInstance).getProbabilityExitDenied());
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
			setProbabilityEntryDenied();
			setProbabilityExitDenied();
		}
	}

}