package edu.pitt.apollo.apolloversionmigration.output;

public class ContaminationAcquisitionSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.ContaminationAcquisition,edu.pitt.apollo.types.v3_1_0.ContaminationAcquisition> {

	public ContaminationAcquisitionSetter(Class<edu.pitt.apollo.types.v4_0.ContaminationAcquisition> newTypeClass, edu.pitt.apollo.types.v3_1_0.ContaminationAcquisition oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setInfectiousHostSource() throws MigrationException {
		newTypeInstance.setInfectiousHostSource(oldTypeInstance.getInfectiousHostSource());
	}

	private void setContaminatedSource() throws MigrationException {
		newTypeInstance.setContaminatedSource(oldTypeInstance.getContaminatedSource());
	}

	private void setColonizedHostSource() throws MigrationException {
		newTypeInstance.setColonizedHostSource(oldTypeInstance.getColonizedHostSource());
	}

	private void setTransmissionProbability() throws MigrationException {
		ProbabilisticParameterSetter setter = new ProbabilisticParameterSetter(edu.pitt.apollo.types.v4_0.ProbabilisticParameter.class,oldTypeInstance.getTransmissionProbability());
		setter.set();
		newTypeInstance.setTransmissionProbability(setter.getNewTypeInstance());
	}

	@Override
	public void set() throws MigrationException {
		setInfectiousHostSource();
		setContaminatedSource();
		setColonizedHostSource();
		setTransmissionProbability();
	}

}