package edu.pitt.apollo.apolloversionmigration.output;

public class ContactIsolationControlMeasureSetter extends InfectiousDiseaseControlMeasureSetter<edu.pitt.apollo.types.v4_0.ContactIsolationControlMeasure,edu.pitt.apollo.types.v3_1_0.ContactIsolationControlMeasure> {

	public ContactIsolationControlMeasureSetter(Class<edu.pitt.apollo.types.v4_0.ContactIsolationControlMeasure> newTypeClass, edu.pitt.apollo.types.v3_1_0.ContactIsolationControlMeasure oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setContactDefinition() throws MigrationException {
		ContactDefinitionSetter setter = new ContactDefinitionSetter(edu.pitt.apollo.types.v4_0.ContactDefinition.class,oldTypeInstance.getContactDefinition());
		setter.set();
		newTypeInstance.setContactDefinition(setter.getNewTypeInstance());
	}

	private void setIsolationPeriod() throws MigrationException {
		DurationSetter setter = DurationSetterFactory.getSetter(oldTypeInstance.getIsolationPeriod());
		setter.set();
		newTypeInstance.setIsolationPeriod(setter.getNewTypeInstance());
	}

	private void setCompliance() throws MigrationException {
		ProbabilisticParameterSetter setter = new ProbabilisticParameterSetter(edu.pitt.apollo.types.v4_0.ProbabilisticParameter.class,oldTypeInstance.getCompliance());
		setter.set();
		newTypeInstance.setCompliance(setter.getNewTypeInstance());
	}

	private void setEfficacy() throws MigrationException {
		ProbabilityDistributionSetter setter = ProbabilityDistributionSetterFactory.getSetter(oldTypeInstance.getEfficacy());
		setter.set();
		newTypeInstance.setEfficacy(setter.getNewTypeInstance());
	}

	@Override
	public void set() throws MigrationException {
		super.set();
		setContactDefinition();
		setIsolationPeriod();
		setCompliance();
		setEfficacy();
	}

}