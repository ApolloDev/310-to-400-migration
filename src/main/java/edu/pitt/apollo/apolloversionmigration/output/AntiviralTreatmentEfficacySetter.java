package edu.pitt.apollo.apolloversionmigration.output;

public class AntiviralTreatmentEfficacySetter extends TreatmentEfficacySetter<edu.pitt.apollo.types.v4_0.AntiviralTreatmentEfficacy,edu.pitt.apollo.types.v3_1_0.AntiviralTreatmentEfficacy> {

	public AntiviralTreatmentEfficacySetter(Class<edu.pitt.apollo.types.v4_0.AntiviralTreatmentEfficacy> newTypeClass, edu.pitt.apollo.types.v3_1_0.AntiviralTreatmentEfficacy oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setEfficacy() throws MigrationException {
		newTypeInstance.setEfficacy(oldTypeInstance.getEfficacy());
	}

	@Override
	public void set() throws MigrationException {
		super.set();
		setEfficacy();
	}

}