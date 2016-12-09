package edu.pitt.apollo.apolloversionmigration.output;

public class ContaminationAcquisitionSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0_1.ContaminationAcquisition> {

	public ContaminationAcquisitionSetter(Class<edu.pitt.apollo.types.v4_0_1.ContaminationAcquisition> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setInfectiousHostSource() throws MigrationException {
		newTypeInstance.setInfectiousHostSource(((edu.pitt.apollo.types.v3_1_0.ContaminationAcquisition) oldTypeInstance).getInfectiousHostSource());
	}

	protected void setContaminatedSource() throws MigrationException {
		newTypeInstance.setContaminatedSource(((edu.pitt.apollo.types.v3_1_0.ContaminationAcquisition) oldTypeInstance).getContaminatedSource());
	}

	protected void setColonizedHostSource() throws MigrationException {
		newTypeInstance.setColonizedHostSource(((edu.pitt.apollo.types.v3_1_0.ContaminationAcquisition) oldTypeInstance).getColonizedHostSource());
	}

	protected void setTransmissionProbability() throws MigrationException {
		ProbabilisticParameterSetter setter = new ProbabilisticParameterSetter(edu.pitt.apollo.types.v4_0_1.ProbabilisticParameter.class,((edu.pitt.apollo.types.v3_1_0.ContaminationAcquisition) oldTypeInstance).getTransmissionProbability());
		setter.set();
		newTypeInstance.setTransmissionProbability(setter.getNewTypeInstance());
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			setInfectiousHostSource();
			setContaminatedSource();
			setColonizedHostSource();
			setTransmissionProbability();
		}
	}

}