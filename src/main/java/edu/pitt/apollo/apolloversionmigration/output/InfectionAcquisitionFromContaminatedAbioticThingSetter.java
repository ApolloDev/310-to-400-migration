package edu.pitt.apollo.apolloversionmigration.output;

public class InfectionAcquisitionFromContaminatedAbioticThingSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0_1.InfectionAcquisitionFromContaminatedAbioticThing> {

	public InfectionAcquisitionFromContaminatedAbioticThingSetter(Class<edu.pitt.apollo.types.v4_0_1.InfectionAcquisitionFromContaminatedAbioticThing> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setContaminatedAbioticThing() throws MigrationException {
		if (((edu.pitt.apollo.types.v3_1_0.InfectionAcquisitionFromContaminatedAbioticThing) oldTypeInstance).getContaminatedAbioticThing() != null) {
			newTypeInstance.setContaminatedAbioticThing(edu.pitt.apollo.types.v4_0_1.AbioticThingEnum.valueOf(((edu.pitt.apollo.types.v3_1_0.InfectionAcquisitionFromContaminatedAbioticThing) oldTypeInstance).getContaminatedAbioticThing().toString()));
		}
	}

	protected void setTransmissionProbability() throws MigrationException {
		ProbabilisticParameterSetter setter = new ProbabilisticParameterSetter(edu.pitt.apollo.types.v4_0_1.ProbabilisticParameter.class,((edu.pitt.apollo.types.v3_1_0.InfectionAcquisitionFromContaminatedAbioticThing) oldTypeInstance).getTransmissionProbability());
		setter.set();
		newTypeInstance.setTransmissionProbability(setter.getNewTypeInstance());
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			setContaminatedAbioticThing();
			setTransmissionProbability();
		}
	}

}