package edu.pitt.apollo.apolloversionmigration.output;

public class InfectionAcquisitionFromInfectedHostSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.InfectionAcquisitionFromInfectedHost,edu.pitt.apollo.types.v3_1_0.InfectionAcquisitionFromInfectedHost> {

	public InfectionAcquisitionFromInfectedHostSetter(Class<edu.pitt.apollo.types.v4_0.InfectionAcquisitionFromInfectedHost> newTypeClass, edu.pitt.apollo.types.v3_1_0.InfectionAcquisitionFromInfectedHost oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setInfectedHost() throws MigrationException {
		newTypeInstance.setInfectedHost(oldTypeInstance.getInfectedHost());
	}

	private void setLatentPeriodDuration() throws MigrationException {
		DurationSetter setter = DurationSetterFactory.getSetter(oldTypeInstance.getLatentPeriodDuration());
		setter.set();
		newTypeInstance.setLatentPeriodDuration(setter.getNewTypeInstance());
	}

	private void setInfectiousPeriodDuration() throws MigrationException {
		DurationSetter setter = DurationSetterFactory.getSetter(oldTypeInstance.getInfectiousPeriodDuration());
		setter.set();
		newTypeInstance.setInfectiousPeriodDuration(setter.getNewTypeInstance());
	}

	private void setBasicReproductionNumbers() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.ReproductionNumber oldObj : oldTypeInstance.getBasicReproductionNumbers()) {
			ReproductionNumberSetter setter = new ReproductionNumberSetter(edu.pitt.apollo.types.v4_0.ReproductionNumber.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.ReproductionNumber newObj = setter.getNewTypeInstance();
			newTypeInstance.getBasicReproductionNumbers().add(newObj);
		}

	}

	private void setBeta() throws MigrationException {
		RateSetter setter = new RateSetter(edu.pitt.apollo.types.v4_0.Rate.class,oldTypeInstance.getBeta());
		setter.set();
		newTypeInstance.setBeta(setter.getNewTypeInstance());
	}

	private void setTransmissionProbabilities() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.TransmissionProbability oldObj : oldTypeInstance.getTransmissionProbabilities()) {
			TransmissionProbabilitySetter setter = new TransmissionProbabilitySetter(edu.pitt.apollo.types.v4_0.TransmissionProbability.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.TransmissionProbability newObj = setter.getNewTypeInstance();
			newTypeInstance.getTransmissionProbabilities().add(newObj);
		}

	}

	private void setInoculationRate() throws MigrationException {
		RateSetter setter = new RateSetter(edu.pitt.apollo.types.v4_0.Rate.class,oldTypeInstance.getInoculationRate());
		setter.set();
		newTypeInstance.setInoculationRate(setter.getNewTypeInstance());
	}

	@Override
	public void set() throws MigrationException {
		setInfectedHost();
		setLatentPeriodDuration();
		setInfectiousPeriodDuration();
		setBasicReproductionNumbers();
		setBeta();
		setTransmissionProbabilities();
		setInoculationRate();
	}

}