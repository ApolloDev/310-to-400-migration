package edu.pitt.apollo.apolloversionmigration.output;

public class InfectionAcquisitionFromInfectedHostSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.InfectionAcquisitionFromInfectedHost> {

	public InfectionAcquisitionFromInfectedHostSetter(Class<edu.pitt.apollo.types.v4_0.InfectionAcquisitionFromInfectedHost> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setInfectedHost() throws MigrationException {
		newTypeInstance.setInfectedHost(((edu.pitt.apollo.types.v3_1_0.InfectionAcquisitionFromInfectedHost) oldTypeInstance).getInfectedHost());
	}

	protected void setLatentPeriodDuration() throws MigrationException {
		if (((edu.pitt.apollo.types.v3_1_0.InfectionAcquisitionFromInfectedHost) oldTypeInstance).getLatentPeriodDuration() != null) {
			DurationSetter setter = DurationSetterFactory.getSetter(((edu.pitt.apollo.types.v3_1_0.InfectionAcquisitionFromInfectedHost) oldTypeInstance).getLatentPeriodDuration());
			setter.set();
			newTypeInstance.setLatentPeriodDuration(setter.getNewTypeInstance());
		}

	}

	protected void setInfectiousPeriodDuration() throws MigrationException {
		if (((edu.pitt.apollo.types.v3_1_0.InfectionAcquisitionFromInfectedHost) oldTypeInstance).getInfectiousPeriodDuration() != null) {
			DurationSetter setter = DurationSetterFactory.getSetter(((edu.pitt.apollo.types.v3_1_0.InfectionAcquisitionFromInfectedHost) oldTypeInstance).getInfectiousPeriodDuration());
			setter.set();
			newTypeInstance.setInfectiousPeriodDuration(setter.getNewTypeInstance());
		}

	}

	protected void setBasicReproductionNumbers() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.ReproductionNumber oldObj : ((edu.pitt.apollo.types.v3_1_0.InfectionAcquisitionFromInfectedHost) oldTypeInstance).getBasicReproductionNumbers()) {
			ReproductionNumberSetter setter = new ReproductionNumberSetter(edu.pitt.apollo.types.v4_0.ReproductionNumber.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.ReproductionNumber newObj = setter.getNewTypeInstance();
			newTypeInstance.getBasicReproductionNumbers().add(newObj);
		}

	}

	protected void setBeta() throws MigrationException {
		RateSetter setter = new RateSetter(edu.pitt.apollo.types.v4_0.Rate.class,((edu.pitt.apollo.types.v3_1_0.InfectionAcquisitionFromInfectedHost) oldTypeInstance).getBeta());
		setter.set();
		newTypeInstance.setBeta(setter.getNewTypeInstance());
	}

	protected void setTransmissionProbabilities() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.TransmissionProbability oldObj : ((edu.pitt.apollo.types.v3_1_0.InfectionAcquisitionFromInfectedHost) oldTypeInstance).getTransmissionProbabilities()) {
			TransmissionProbabilitySetter setter = new TransmissionProbabilitySetter(edu.pitt.apollo.types.v4_0.TransmissionProbability.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.TransmissionProbability newObj = setter.getNewTypeInstance();
			newTypeInstance.getTransmissionProbabilities().add(newObj);
		}

	}

	protected void setInoculationRate() throws MigrationException {
		RateSetter setter = new RateSetter(edu.pitt.apollo.types.v4_0.Rate.class,((edu.pitt.apollo.types.v3_1_0.InfectionAcquisitionFromInfectedHost) oldTypeInstance).getInoculationRate());
		setter.set();
		newTypeInstance.setInoculationRate(setter.getNewTypeInstance());
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			setInfectedHost();
			setLatentPeriodDuration();
			setInfectiousPeriodDuration();
			setBasicReproductionNumbers();
			setBeta();
			setTransmissionProbabilities();
			setInoculationRate();
		}
	}

}