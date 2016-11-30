package edu.pitt.apollo.apolloversionmigration.output;

public class ColonizationAcquisitionSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.ColonizationAcquisition,edu.pitt.apollo.types.v3_1_0.ColonizationAcquisition> {

	public ColonizationAcquisitionSetter(Class<edu.pitt.apollo.types.v4_0.ColonizationAcquisition> newTypeClass, edu.pitt.apollo.types.v3_1_0.ColonizationAcquisition oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setInfectiousHostSource() throws MigrationException {
		newTypeInstance.setInfectiousHostSource(oldTypeInstance.getInfectiousHostSource());
	}

	private void setContaminatedSource() throws MigrationException {
		newTypeInstance.setContaminatedSource(edu.pitt.apollo.types.v4_0.AbioticThingEnum.fromValue(oldTypeInstance.getContaminatedSource().toString()));
	}

	private void setColonizedHost() throws MigrationException {
		newTypeInstance.setColonizedHost(oldTypeInstance.getColonizedHost());
	}

	private void setTransmissionProbability() throws MigrationException {
		TransmissionProbabilitySetter setter = new TransmissionProbabilitySetter(edu.pitt.apollo.types.v4_0.TransmissionProbability.class,oldTypeInstance.getTransmissionProbability());
		setter.set();
		newTypeInstance.setTransmissionProbability(setter.getNewTypeInstance());
	}

	private void setBeta() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.Rate oldObj : oldTypeInstance.getBeta()) {
			RateSetter setter = new RateSetter(edu.pitt.apollo.types.v4_0.Rate.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.Rate newObj = setter.getNewTypeInstance();
			newTypeInstance.getBeta().add(newObj);
		}

	}

	@Override
	public void set() throws MigrationException {
		setInfectiousHostSource();
		setContaminatedSource();
		setColonizedHost();
		setTransmissionProbability();
		setBeta();
	}

}