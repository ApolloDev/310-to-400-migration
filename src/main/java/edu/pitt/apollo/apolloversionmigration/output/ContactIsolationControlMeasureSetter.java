package edu.pitt.apollo.apolloversionmigration.output;

public class ContactIsolationControlMeasureSetter extends InfectiousDiseaseControlMeasureSetter<edu.pitt.apollo.types.v4_0.ContactIsolationControlMeasure> {

	public ContactIsolationControlMeasureSetter(Class<edu.pitt.apollo.types.v4_0.ContactIsolationControlMeasure> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setContactDefinition() throws MigrationException {
		ContactDefinitionSetter setter = new ContactDefinitionSetter(edu.pitt.apollo.types.v4_0.ContactDefinition.class,((edu.pitt.apollo.types.v3_1_0.ContactIsolationControlMeasure) oldTypeInstance).getContactDefinition());
		setter.set();
		newTypeInstance.setContactDefinition(setter.getNewTypeInstance());
	}

	protected void setIsolationPeriod() throws MigrationException {
		if (((edu.pitt.apollo.types.v3_1_0.ContactIsolationControlMeasure) oldTypeInstance).getIsolationPeriod() != null) {
			DurationSetter setter = DurationSetterFactory.getSetter(((edu.pitt.apollo.types.v3_1_0.ContactIsolationControlMeasure) oldTypeInstance).getIsolationPeriod());
			setter.set();
			newTypeInstance.setIsolationPeriod(setter.getNewTypeInstance());
		}

	}

	protected void setCompliance() throws MigrationException {
		ProbabilisticParameterSetter setter = new ProbabilisticParameterSetter(edu.pitt.apollo.types.v4_0.ProbabilisticParameter.class,((edu.pitt.apollo.types.v3_1_0.ContactIsolationControlMeasure) oldTypeInstance).getCompliance());
		setter.set();
		newTypeInstance.setCompliance(setter.getNewTypeInstance());
	}

	protected void setEfficacy() throws MigrationException {
		if (((edu.pitt.apollo.types.v3_1_0.ContactIsolationControlMeasure) oldTypeInstance).getEfficacy() != null) {
			ProbabilityDistributionSetter setter = ProbabilityDistributionSetterFactory.getSetter(((edu.pitt.apollo.types.v3_1_0.ContactIsolationControlMeasure) oldTypeInstance).getEfficacy());
			setter.set();
			newTypeInstance.setEfficacy(setter.getNewTypeInstance());
		}

	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
			setContactDefinition();
			setIsolationPeriod();
			setCompliance();
			setEfficacy();
		}
	}

}