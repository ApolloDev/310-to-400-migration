package edu.pitt.apollo.apolloversionmigration.output;

public class ColonizationAcquisitionSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0_1.ColonizationAcquisition> {

	public ColonizationAcquisitionSetter(Class<edu.pitt.apollo.types.v4_0_1.ColonizationAcquisition> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setInfectiousHostSource() throws MigrationException {
		newTypeInstance.setInfectiousHostSource(((edu.pitt.apollo.types.v3_1_0.ColonizationAcquisition) oldTypeInstance).getInfectiousHostSource());
	}

	protected void setContaminatedSource() throws MigrationException {
		if (((edu.pitt.apollo.types.v3_1_0.ColonizationAcquisition) oldTypeInstance).getContaminatedSource() != null) {
			newTypeInstance.setContaminatedSource(edu.pitt.apollo.types.v4_0_1.AbioticThingEnum.valueOf(((edu.pitt.apollo.types.v3_1_0.ColonizationAcquisition) oldTypeInstance).getContaminatedSource().toString()));
		}
	}

	protected void setColonizedHost() throws MigrationException {
		newTypeInstance.setColonizedHost(((edu.pitt.apollo.types.v3_1_0.ColonizationAcquisition) oldTypeInstance).getColonizedHost());
	}

	protected void setTransmissionProbability() throws MigrationException {
		TransmissionProbabilitySetter setter = new TransmissionProbabilitySetter(edu.pitt.apollo.types.v4_0_1.TransmissionProbability.class,((edu.pitt.apollo.types.v3_1_0.ColonizationAcquisition) oldTypeInstance).getTransmissionProbability());
		setter.set();
		newTypeInstance.setTransmissionProbability(setter.getNewTypeInstance());
	}

	protected void setBeta() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.Rate oldObj : ((edu.pitt.apollo.types.v3_1_0.ColonizationAcquisition) oldTypeInstance).getBeta()) {
			RateSetter setter = new RateSetter(edu.pitt.apollo.types.v4_0_1.Rate.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0_1.Rate newObj = setter.getNewTypeInstance();
			newTypeInstance.getBeta().add(newObj);
		}

	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			setInfectiousHostSource();
			setContaminatedSource();
			setColonizedHost();
			setTransmissionProbability();
			setBeta();
		}
	}

}