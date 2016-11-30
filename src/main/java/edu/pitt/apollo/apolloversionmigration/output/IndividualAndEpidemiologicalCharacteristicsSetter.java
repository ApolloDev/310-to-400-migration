package edu.pitt.apollo.apolloversionmigration.output;

public class IndividualAndEpidemiologicalCharacteristicsSetter extends IndividualSetter<edu.pitt.apollo.types.v4_0.IndividualAndEpidemiologicalCharacteristics,edu.pitt.apollo.types.v3_1_0.IndividualAndEpidemiologicalCharacteristics> {

	public IndividualAndEpidemiologicalCharacteristicsSetter(Class<edu.pitt.apollo.types.v4_0.IndividualAndEpidemiologicalCharacteristics> newTypeClass, edu.pitt.apollo.types.v3_1_0.IndividualAndEpidemiologicalCharacteristics oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setIndividualInfection() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.IndividualInfection oldObj : oldTypeInstance.getIndividualInfection()) {
			IndividualInfectionSetter setter = new IndividualInfectionSetter(edu.pitt.apollo.types.v4_0.IndividualInfection.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.IndividualInfection newObj = setter.getNewTypeInstance();
			newTypeInstance.getIndividualInfection().add(newObj);
		}

	}

	private void setIndividualDisease() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.IndividualDisease oldObj : oldTypeInstance.getIndividualDisease()) {
			IndividualDiseaseSetter setter = new IndividualDiseaseSetter(edu.pitt.apollo.types.v4_0.IndividualDisease.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.IndividualDisease newObj = setter.getNewTypeInstance();
			newTypeInstance.getIndividualDisease().add(newObj);
		}

	}

	private void setExposurePeriodContacts() throws MigrationException {
		for (java.math.BigInteger oldObj : oldTypeInstance.getExposurePeriodContacts()) {
			newTypeInstance.getExposurePeriodContacts().add(oldObj);
		}

	}

	private void setExposurePeriodDefinition() throws MigrationException {
		for (java.math.BigInteger oldObj : oldTypeInstance.getExposurePeriodDefinition()) {
			newTypeInstance.getExposurePeriodDefinition().add(oldObj);
		}

	}

	private void setTransmissionPeriodContacts() throws MigrationException {
		for (java.math.BigInteger oldObj : oldTypeInstance.getTransmissionPeriodContacts()) {
			newTypeInstance.getTransmissionPeriodContacts().add(oldObj);
		}

	}

	private void setTransmissionPeriodDefinition() throws MigrationException {
		for (java.math.BigInteger oldObj : oldTypeInstance.getTransmissionPeriodDefinition()) {
			newTypeInstance.getTransmissionPeriodDefinition().add(oldObj);
		}

	}

	@Override
	public void set() throws MigrationException {
		super.set();
		setIndividualInfection();
		setIndividualDisease();
		setExposurePeriodContacts();
		setExposurePeriodDefinition();
		setTransmissionPeriodContacts();
		setTransmissionPeriodDefinition();
	}

}