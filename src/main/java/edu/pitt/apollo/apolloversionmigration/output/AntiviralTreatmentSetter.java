package edu.pitt.apollo.apolloversionmigration.output;

public class AntiviralTreatmentSetter extends TreatmentSetter<edu.pitt.apollo.types.v4_0.AntiviralTreatment,edu.pitt.apollo.types.v3_1_0.AntiviralTreatment> {

	public AntiviralTreatmentSetter(Class<edu.pitt.apollo.types.v4_0.AntiviralTreatment> newTypeClass, edu.pitt.apollo.types.v3_1_0.AntiviralTreatment oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setAntiviralId() throws MigrationException {
		newTypeInstance.setAntiviralId(oldTypeInstance.getAntiviralId());
	}

	private void setAntiviralTreatmentEfficacy() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.AntiviralTreatmentEfficacy oldObj : oldTypeInstance.getAntiviralTreatmentEfficacy()) {
			AntiviralTreatmentEfficacySetter setter = new AntiviralTreatmentEfficacySetter(edu.pitt.apollo.types.v4_0.AntiviralTreatmentEfficacy.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.AntiviralTreatmentEfficacy newObj = setter.getNewTypeInstance();
			newTypeInstance.getAntiviralTreatmentEfficacy().add(newObj);
		}

	}

	@Override
	public void set() throws MigrationException {
		super.set();
		setAntiviralId();
		setAntiviralTreatmentEfficacy();
	}

}