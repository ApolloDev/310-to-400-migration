package edu.pitt.apollo.apolloversionmigration.output;

public class DiseaseSurveillanceCapabilitySetter extends AbstractSetter<edu.pitt.apollo.types.v4_0_1.DiseaseSurveillanceCapability> {

	public DiseaseSurveillanceCapabilitySetter(Class<edu.pitt.apollo.types.v4_0_1.DiseaseSurveillanceCapability> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setLocation() throws MigrationException {
		LocationSetter setter = new LocationSetter(edu.pitt.apollo.types.v4_0_1.Location.class,((edu.pitt.apollo.types.v3_1_0.DiseaseSurveillanceCapability) oldTypeInstance).getLocation());
		setter.set();
		newTypeInstance.setLocation(setter.getNewTypeInstance());
	}

	protected void setPathogen() throws MigrationException {
		ApolloPathogenCodeSetter setter = new ApolloPathogenCodeSetter(edu.pitt.apollo.types.v4_0_1.ApolloPathogenCode.class,((edu.pitt.apollo.types.v3_1_0.DiseaseSurveillanceCapability) oldTypeInstance).getPathogen());
		setter.set();
		newTypeInstance.setPathogen(setter.getNewTypeInstance());
	}

	protected void setSpeciesOfCase() throws MigrationException {
		newTypeInstance.setSpeciesOfCase(((edu.pitt.apollo.types.v3_1_0.DiseaseSurveillanceCapability) oldTypeInstance).getSpeciesOfCase());
	}

	protected void setCaseDefinition() throws MigrationException {
		if (((edu.pitt.apollo.types.v3_1_0.DiseaseSurveillanceCapability) oldTypeInstance).getCaseDefinition() != null) {
			newTypeInstance.setCaseDefinition(edu.pitt.apollo.types.v4_0_1.DiseaseOutcomeEnum.valueOf(((edu.pitt.apollo.types.v3_1_0.DiseaseSurveillanceCapability) oldTypeInstance).getCaseDefinition().toString()));
		}
	}

	protected void setSensitivityOfCaseDetection() throws MigrationException {
		newTypeInstance.setSensitivityOfCaseDetection(((edu.pitt.apollo.types.v3_1_0.DiseaseSurveillanceCapability) oldTypeInstance).getSensitivityOfCaseDetection());
	}

	protected void setSpecificityOfCaseDetection() throws MigrationException {
		newTypeInstance.setSpecificityOfCaseDetection(((edu.pitt.apollo.types.v3_1_0.DiseaseSurveillanceCapability) oldTypeInstance).getSpecificityOfCaseDetection());
	}

	protected void setTimeDelayOfCaseDetection() throws MigrationException {
		if (((edu.pitt.apollo.types.v3_1_0.DiseaseSurveillanceCapability) oldTypeInstance).getTimeDelayOfCaseDetection() != null) {
			DurationSetter setter = DurationSetterFactory.getSetter(((edu.pitt.apollo.types.v3_1_0.DiseaseSurveillanceCapability) oldTypeInstance).getTimeDelayOfCaseDetection());
			setter.set();
			newTypeInstance.setTimeDelayOfCaseDetection(setter.getNewTypeInstance());
		}

	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			setLocation();
			setPathogen();
			setSpeciesOfCase();
			setCaseDefinition();
			setSensitivityOfCaseDetection();
			setSpecificityOfCaseDetection();
			setTimeDelayOfCaseDetection();
		}
	}

}