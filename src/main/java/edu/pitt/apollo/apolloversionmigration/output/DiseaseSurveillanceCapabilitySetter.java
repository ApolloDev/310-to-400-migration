package edu.pitt.apollo.apolloversionmigration.output;

public class DiseaseSurveillanceCapabilitySetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.DiseaseSurveillanceCapability,edu.pitt.apollo.types.v3_1_0.DiseaseSurveillanceCapability> {

	public DiseaseSurveillanceCapabilitySetter(Class<edu.pitt.apollo.types.v4_0.DiseaseSurveillanceCapability> newTypeClass, edu.pitt.apollo.types.v3_1_0.DiseaseSurveillanceCapability oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setLocation() throws MigrationException {
		LocationSetter setter = new LocationSetter(edu.pitt.apollo.types.v4_0.Location.class,oldTypeInstance.getLocation());
		setter.set();
		newTypeInstance.setLocation(setter.getNewTypeInstance());
	}

	private void setPathogen() throws MigrationException {
		ApolloPathogenCodeSetter setter = new ApolloPathogenCodeSetter(edu.pitt.apollo.types.v4_0.ApolloPathogenCode.class,oldTypeInstance.getPathogen());
		setter.set();
		newTypeInstance.setPathogen(setter.getNewTypeInstance());
	}

	private void setSpeciesOfCase() throws MigrationException {
		newTypeInstance.setSpeciesOfCase(oldTypeInstance.getSpeciesOfCase());
	}

	private void setCaseDefinition() throws MigrationException {
		newTypeInstance.setCaseDefinition(edu.pitt.apollo.types.v4_0.DiseaseOutcomeEnum.fromValue(oldTypeInstance.getCaseDefinition().toString()));
	}

	private void setSensitivityOfCaseDetection() throws MigrationException {
		newTypeInstance.setSensitivityOfCaseDetection(oldTypeInstance.getSensitivityOfCaseDetection());
	}

	private void setSpecificityOfCaseDetection() throws MigrationException {
		newTypeInstance.setSpecificityOfCaseDetection(oldTypeInstance.getSpecificityOfCaseDetection());
	}

	private void setTimeDelayOfCaseDetection() throws MigrationException {
		DurationSetter setter = DurationSetterFactory.getSetter(oldTypeInstance.getTimeDelayOfCaseDetection());
		setter.set();
		newTypeInstance.setTimeDelayOfCaseDetection(setter.getNewTypeInstance());
	}

	@Override
	public void set() throws MigrationException {
		setLocation();
		setPathogen();
		setSpeciesOfCase();
		setCaseDefinition();
		setSensitivityOfCaseDetection();
		setSpecificityOfCaseDetection();
		setTimeDelayOfCaseDetection();
	}

}