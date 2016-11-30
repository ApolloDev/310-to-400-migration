package edu.pitt.apollo.apolloversionmigration.output;

public class InfectionAcquisitionFromColonizedHostSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.InfectionAcquisitionFromColonizedHost,edu.pitt.apollo.types.v3_1_0.InfectionAcquisitionFromColonizedHost> {

	public InfectionAcquisitionFromColonizedHostSetter(Class<edu.pitt.apollo.types.v4_0.InfectionAcquisitionFromColonizedHost> newTypeClass, edu.pitt.apollo.types.v3_1_0.InfectionAcquisitionFromColonizedHost oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setColonizedHost() throws MigrationException {
		newTypeInstance.setColonizedHost(oldTypeInstance.getColonizedHost());
	}

	private void setTransmissionProbability() throws MigrationException {
		ProbabilisticParameterSetter setter = new ProbabilisticParameterSetter(edu.pitt.apollo.types.v4_0.ProbabilisticParameter.class,oldTypeInstance.getTransmissionProbability());
		setter.set();
		newTypeInstance.setTransmissionProbability(setter.getNewTypeInstance());
	}

	private void setBeta() throws MigrationException {
		newTypeInstance.setBeta(oldTypeInstance.getBeta());
	}

	@Override
	public void set() throws MigrationException {
		setColonizedHost();
		setTransmissionProbability();
		setBeta();
	}

}