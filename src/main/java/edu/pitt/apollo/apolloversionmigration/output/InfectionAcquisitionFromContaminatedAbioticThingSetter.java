package edu.pitt.apollo.apolloversionmigration.output;

public class InfectionAcquisitionFromContaminatedAbioticThingSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.InfectionAcquisitionFromContaminatedAbioticThing,edu.pitt.apollo.types.v3_1_0.InfectionAcquisitionFromContaminatedAbioticThing> {

	public InfectionAcquisitionFromContaminatedAbioticThingSetter(Class<edu.pitt.apollo.types.v4_0.InfectionAcquisitionFromContaminatedAbioticThing> newTypeClass, edu.pitt.apollo.types.v3_1_0.InfectionAcquisitionFromContaminatedAbioticThing oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setContaminatedAbioticThing() throws MigrationException {
		newTypeInstance.setContaminatedAbioticThing(edu.pitt.apollo.types.v4_0.AbioticThingEnum.fromValue(oldTypeInstance.getContaminatedAbioticThing().toString()));
	}

	private void setTransmissionProbability() throws MigrationException {
		ProbabilisticParameterSetter setter = new ProbabilisticParameterSetter(edu.pitt.apollo.types.v4_0.ProbabilisticParameter.class,oldTypeInstance.getTransmissionProbability());
		setter.set();
		newTypeInstance.setTransmissionProbability(setter.getNewTypeInstance());
	}

	@Override
	public void set() throws MigrationException {
		setContaminatedAbioticThing();
		setTransmissionProbability();
	}

}