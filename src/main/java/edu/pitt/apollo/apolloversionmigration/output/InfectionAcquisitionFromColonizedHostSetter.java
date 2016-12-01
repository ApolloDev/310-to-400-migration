package edu.pitt.apollo.apolloversionmigration.output;

public class InfectionAcquisitionFromColonizedHostSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.InfectionAcquisitionFromColonizedHost> {

	public InfectionAcquisitionFromColonizedHostSetter(Class<edu.pitt.apollo.types.v4_0.InfectionAcquisitionFromColonizedHost> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setColonizedHost() throws MigrationException {
		newTypeInstance.setColonizedHost(((edu.pitt.apollo.types.v3_1_0.InfectionAcquisitionFromColonizedHost) oldTypeInstance).getColonizedHost());
	}

	protected void setTransmissionProbability() throws MigrationException {
		ProbabilisticParameterSetter setter = new ProbabilisticParameterSetter(edu.pitt.apollo.types.v4_0.ProbabilisticParameter.class,((edu.pitt.apollo.types.v3_1_0.InfectionAcquisitionFromColonizedHost) oldTypeInstance).getTransmissionProbability());
		setter.set();
		newTypeInstance.setTransmissionProbability(setter.getNewTypeInstance());
	}

	protected void setBeta() throws MigrationException {
		newTypeInstance.setBeta(((edu.pitt.apollo.types.v3_1_0.InfectionAcquisitionFromColonizedHost) oldTypeInstance).getBeta());
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			setColonizedHost();
			setTransmissionProbability();
			setBeta();
		}
	}

}