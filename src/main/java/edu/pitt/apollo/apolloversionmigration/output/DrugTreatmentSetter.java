package edu.pitt.apollo.apolloversionmigration.output;

public class DrugTreatmentSetter extends TreatmentSetter<edu.pitt.apollo.types.v4_0.DrugTreatment> {

	public DrugTreatmentSetter(Class<edu.pitt.apollo.types.v4_0.DrugTreatment> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setDrugId() throws MigrationException {
		newTypeInstance.setDrugId(((edu.pitt.apollo.types.v3_1_0.DrugTreatment) oldTypeInstance).getDrugId());
	}

	protected void setDrugTreatmentEfficacy() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.DrugTreatmentEfficacyForSimulatorConfiguration oldObj : ((edu.pitt.apollo.types.v3_1_0.DrugTreatment) oldTypeInstance).getDrugTreatmentEfficacy()) {
			DrugTreatmentEfficacyForSimulatorConfigurationSetter setter = new DrugTreatmentEfficacyForSimulatorConfigurationSetter(edu.pitt.apollo.types.v4_0.DrugTreatmentEfficacyForSimulatorConfiguration.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.DrugTreatmentEfficacyForSimulatorConfiguration newObj = setter.getNewTypeInstance();
			newTypeInstance.getDrugTreatmentEfficacy().add(newObj);
		}

	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
			setDrugId();
			setDrugTreatmentEfficacy();
		}
	}

}