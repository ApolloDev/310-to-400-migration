package edu.pitt.apollo.apolloversionmigration.output;

public class CaseQuarantineControlMeasureSetter extends InfectiousDiseaseControlMeasureSetter<edu.pitt.apollo.types.v4_0_1.CaseQuarantineControlMeasure> {

	public CaseQuarantineControlMeasureSetter(Class<edu.pitt.apollo.types.v4_0_1.CaseQuarantineControlMeasure> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setQuarantinePeriod() throws MigrationException {
		if (((edu.pitt.apollo.types.v3_1_0.CaseQuarantineControlMeasure) oldTypeInstance).getQuarantinePeriod() != null) {
			DurationSetter setter = DurationSetterFactory.getSetter(((edu.pitt.apollo.types.v3_1_0.CaseQuarantineControlMeasure) oldTypeInstance).getQuarantinePeriod());
			setter.set();
			newTypeInstance.setQuarantinePeriod(setter.getNewTypeInstance());
		}

	}

	protected void setCompliance() throws MigrationException {
		ProbabilisticParameterSetter setter = new ProbabilisticParameterSetter(edu.pitt.apollo.types.v4_0_1.ProbabilisticParameter.class,((edu.pitt.apollo.types.v3_1_0.CaseQuarantineControlMeasure) oldTypeInstance).getCompliance());
		setter.set();
		newTypeInstance.setCompliance(setter.getNewTypeInstance());
	}

	protected void setHouseholdTransmissionMultiplier() throws MigrationException {
		newTypeInstance.setHouseholdTransmissionMultiplier(((edu.pitt.apollo.types.v3_1_0.CaseQuarantineControlMeasure) oldTypeInstance).getHouseholdTransmissionMultiplier());
	}

	protected void setSchoolTransmissionMultiplier() throws MigrationException {
		newTypeInstance.setSchoolTransmissionMultiplier(((edu.pitt.apollo.types.v3_1_0.CaseQuarantineControlMeasure) oldTypeInstance).getSchoolTransmissionMultiplier());
	}

	protected void setWorkplaceTransmissionMultiplier() throws MigrationException {
		newTypeInstance.setWorkplaceTransmissionMultiplier(((edu.pitt.apollo.types.v3_1_0.CaseQuarantineControlMeasure) oldTypeInstance).getWorkplaceTransmissionMultiplier());
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
			setQuarantinePeriod();
			setCompliance();
			setHouseholdTransmissionMultiplier();
			setSchoolTransmissionMultiplier();
			setWorkplaceTransmissionMultiplier();
		}
	}

}