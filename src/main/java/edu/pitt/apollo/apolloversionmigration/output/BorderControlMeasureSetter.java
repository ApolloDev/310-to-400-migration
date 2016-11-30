package edu.pitt.apollo.apolloversionmigration.output;

public class BorderControlMeasureSetter extends InfectiousDiseaseControlMeasureSetter<edu.pitt.apollo.types.v4_0.BorderControlMeasure,edu.pitt.apollo.types.v3_1_0.BorderControlMeasure> {

	public BorderControlMeasureSetter(Class<edu.pitt.apollo.types.v4_0.BorderControlMeasure> newTypeClass, edu.pitt.apollo.types.v3_1_0.BorderControlMeasure oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setProbabilityEntryDenied() throws MigrationException {
		newTypeInstance.setProbabilityEntryDenied(oldTypeInstance.getProbabilityEntryDenied());
	}

	private void setProbabilityExitDenied() throws MigrationException {
		newTypeInstance.setProbabilityExitDenied(oldTypeInstance.getProbabilityExitDenied());
	}

	@Override
	public void set() throws MigrationException {
		super.set();
		setProbabilityEntryDenied();
		setProbabilityExitDenied();
	}

}