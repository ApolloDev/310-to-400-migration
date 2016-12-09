package edu.pitt.apollo.apolloversionmigration.output;

public class TreatmentSurveillanceCapabilitySetter extends AbstractSetter<edu.pitt.apollo.types.v4_0_1.TreatmentSurveillanceCapability> {

	public TreatmentSurveillanceCapabilitySetter(Class<edu.pitt.apollo.types.v4_0_1.TreatmentSurveillanceCapability> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setLocation() throws MigrationException {
		LocationSetter setter = new LocationSetter(edu.pitt.apollo.types.v4_0_1.Location.class,((edu.pitt.apollo.types.v3_1_0.TreatmentSurveillanceCapability) oldTypeInstance).getLocation());
		setter.set();
		newTypeInstance.setLocation(setter.getNewTypeInstance());
	}

	protected void setTreatment() throws MigrationException {
		if (((edu.pitt.apollo.types.v3_1_0.TreatmentSurveillanceCapability) oldTypeInstance).getTreatment() != null) {
			newTypeInstance.setTreatment(edu.pitt.apollo.types.v4_0_1.IndividualTreatmentEnum.valueOf(((edu.pitt.apollo.types.v3_1_0.TreatmentSurveillanceCapability) oldTypeInstance).getTreatment().toString()));
		}
	}

	protected void setSensitivityOfTreatmentDetection() throws MigrationException {
		newTypeInstance.setSensitivityOfTreatmentDetection(((edu.pitt.apollo.types.v3_1_0.TreatmentSurveillanceCapability) oldTypeInstance).getSensitivityOfTreatmentDetection());
	}

	protected void setSpecificityOfTreatmentDetection() throws MigrationException {
		newTypeInstance.setSpecificityOfTreatmentDetection(((edu.pitt.apollo.types.v3_1_0.TreatmentSurveillanceCapability) oldTypeInstance).getSpecificityOfTreatmentDetection());
	}

	protected void setTimeDelayOfTreatmentDetection() throws MigrationException {
		if (((edu.pitt.apollo.types.v3_1_0.TreatmentSurveillanceCapability) oldTypeInstance).getTimeDelayOfTreatmentDetection() != null) {
			DurationSetter setter = DurationSetterFactory.getSetter(((edu.pitt.apollo.types.v3_1_0.TreatmentSurveillanceCapability) oldTypeInstance).getTimeDelayOfTreatmentDetection());
			setter.set();
			newTypeInstance.setTimeDelayOfTreatmentDetection(setter.getNewTypeInstance());
		}

	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			setLocation();
			setTreatment();
			setSensitivityOfTreatmentDetection();
			setSpecificityOfTreatmentDetection();
			setTimeDelayOfTreatmentDetection();
		}
	}

}