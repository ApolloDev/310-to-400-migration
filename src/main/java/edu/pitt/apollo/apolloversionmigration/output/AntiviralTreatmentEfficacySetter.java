package edu.pitt.apollo.apolloversionmigration.output;

public class AntiviralTreatmentEfficacySetter extends TreatmentEfficacySetter<edu.pitt.apollo.types.v4_0_1.AntiviralTreatmentEfficacy> {

	public AntiviralTreatmentEfficacySetter(Class<edu.pitt.apollo.types.v4_0_1.AntiviralTreatmentEfficacy> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setEfficacy() throws MigrationException {
		newTypeInstance.setEfficacy(((edu.pitt.apollo.types.v3_1_0.AntiviralTreatmentEfficacy) oldTypeInstance).getEfficacy());
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
			setEfficacy();
		}
	}

}