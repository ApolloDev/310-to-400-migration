package edu.pitt.apollo.apolloversionmigration.output;

public class AntiviralTreatmentSetter extends TreatmentSetter<edu.pitt.apollo.types.v4_0_1.AntiviralTreatment> {

	public AntiviralTreatmentSetter(Class<edu.pitt.apollo.types.v4_0_1.AntiviralTreatment> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setAntiviralId() throws MigrationException {
		newTypeInstance.setAntiviralId(((edu.pitt.apollo.types.v3_1_0.AntiviralTreatment) oldTypeInstance).getAntiviralId());
	}

	protected void setAntiviralTreatmentEfficacy() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.AntiviralTreatmentEfficacy oldObj : ((edu.pitt.apollo.types.v3_1_0.AntiviralTreatment) oldTypeInstance).getAntiviralTreatmentEfficacy()) {
			AntiviralTreatmentEfficacySetter setter = new AntiviralTreatmentEfficacySetter(edu.pitt.apollo.types.v4_0_1.AntiviralTreatmentEfficacy.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0_1.AntiviralTreatmentEfficacy newObj = setter.getNewTypeInstance();
			newTypeInstance.getAntiviralTreatmentEfficacy().add(newObj);
		}

	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
			setAntiviralId();
			setAntiviralTreatmentEfficacy();
		}
	}

}