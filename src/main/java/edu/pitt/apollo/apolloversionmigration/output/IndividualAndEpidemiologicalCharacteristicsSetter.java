package edu.pitt.apollo.apolloversionmigration.output;

public class IndividualAndEpidemiologicalCharacteristicsSetter extends IndividualSetter<edu.pitt.apollo.types.v4_0.IndividualAndEpidemiologicalCharacteristics> {

	public IndividualAndEpidemiologicalCharacteristicsSetter(Class<edu.pitt.apollo.types.v4_0.IndividualAndEpidemiologicalCharacteristics> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setIndividualInfection() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.IndividualInfection oldObj : ((edu.pitt.apollo.types.v3_1_0.IndividualAndEpidemiologicalCharacteristics) oldTypeInstance).getIndividualInfection()) {
			IndividualInfectionSetter setter = new IndividualInfectionSetter(edu.pitt.apollo.types.v4_0.IndividualInfection.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.IndividualInfection newObj = setter.getNewTypeInstance();
			newTypeInstance.getIndividualInfection().add(newObj);
		}

	}

	protected void setIndividualDisease() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.IndividualDisease oldObj : ((edu.pitt.apollo.types.v3_1_0.IndividualAndEpidemiologicalCharacteristics) oldTypeInstance).getIndividualDisease()) {
			IndividualDiseaseSetter setter = new IndividualDiseaseSetter(edu.pitt.apollo.types.v4_0.IndividualDisease.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.IndividualDisease newObj = setter.getNewTypeInstance();
			newTypeInstance.getIndividualDisease().add(newObj);
		}

	}

	protected void setExposurePeriodContacts() throws MigrationException {
		for (java.math.BigInteger oldObj : ((edu.pitt.apollo.types.v3_1_0.IndividualAndEpidemiologicalCharacteristics) oldTypeInstance).getExposurePeriodContacts()) {
			newTypeInstance.getExposurePeriodContacts().add(oldObj);
		}

	}

	protected void setExposurePeriodDefinition() throws MigrationException {
		for (java.math.BigInteger oldObj : ((edu.pitt.apollo.types.v3_1_0.IndividualAndEpidemiologicalCharacteristics) oldTypeInstance).getExposurePeriodDefinition()) {
			newTypeInstance.getExposurePeriodDefinition().add(oldObj);
		}

	}

	protected void setTransmissionPeriodContacts() throws MigrationException {
		for (java.math.BigInteger oldObj : ((edu.pitt.apollo.types.v3_1_0.IndividualAndEpidemiologicalCharacteristics) oldTypeInstance).getTransmissionPeriodContacts()) {
			newTypeInstance.getTransmissionPeriodContacts().add(oldObj);
		}

	}

	protected void setTransmissionPeriodDefinition() throws MigrationException {
		for (java.math.BigInteger oldObj : ((edu.pitt.apollo.types.v3_1_0.IndividualAndEpidemiologicalCharacteristics) oldTypeInstance).getTransmissionPeriodDefinition()) {
			newTypeInstance.getTransmissionPeriodDefinition().add(oldObj);
		}

	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
			setIndividualInfection();
			setIndividualDisease();
			setExposurePeriodContacts();
			setExposurePeriodDefinition();
			setTransmissionPeriodContacts();
			setTransmissionPeriodDefinition();
		}
	}

}