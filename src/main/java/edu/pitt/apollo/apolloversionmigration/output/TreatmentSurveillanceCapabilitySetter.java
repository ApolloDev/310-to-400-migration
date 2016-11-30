package edu.pitt.apollo.apolloversionmigration.output;

public class TreatmentSurveillanceCapabilitySetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.TreatmentSurveillanceCapability,edu.pitt.apollo.types.v3_1_0.TreatmentSurveillanceCapability> {

	public TreatmentSurveillanceCapabilitySetter(Class<edu.pitt.apollo.types.v4_0.TreatmentSurveillanceCapability> newTypeClass, edu.pitt.apollo.types.v3_1_0.TreatmentSurveillanceCapability oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setLocation() throws MigrationException {
		LocationSetter setter = new LocationSetter(edu.pitt.apollo.types.v4_0.Location.class,oldTypeInstance.getLocation());
		setter.set();
		newTypeInstance.setLocation(setter.getNewTypeInstance());
	}

	private void setTreatment() throws MigrationException {
		newTypeInstance.setTreatment(edu.pitt.apollo.types.v4_0.IndividualTreatmentEnum.fromValue(oldTypeInstance.getTreatment().toString()));
	}

	private void setSensitivityOfTreatmentDetection() throws MigrationException {
		newTypeInstance.setSensitivityOfTreatmentDetection(oldTypeInstance.getSensitivityOfTreatmentDetection());
	}

	private void setSpecificityOfTreatmentDetection() throws MigrationException {
		newTypeInstance.setSpecificityOfTreatmentDetection(oldTypeInstance.getSpecificityOfTreatmentDetection());
	}

	private void setTimeDelayOfTreatmentDetection() throws MigrationException {
		DurationSetter setter = DurationSetterFactory.getSetter(oldTypeInstance.getTimeDelayOfTreatmentDetection());
		setter.set();
		newTypeInstance.setTimeDelayOfTreatmentDetection(setter.getNewTypeInstance());
	}

	@Override
	public void set() throws MigrationException {
		setLocation();
		setTreatment();
		setSensitivityOfTreatmentDetection();
		setSpecificityOfTreatmentDetection();
		setTimeDelayOfTreatmentDetection();
	}

}