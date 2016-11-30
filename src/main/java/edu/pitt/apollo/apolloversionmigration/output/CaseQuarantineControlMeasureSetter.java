package edu.pitt.apollo.apolloversionmigration.output;

public class CaseQuarantineControlMeasureSetter extends InfectiousDiseaseControlMeasureSetter<edu.pitt.apollo.types.v4_0.CaseQuarantineControlMeasure,edu.pitt.apollo.types.v3_1_0.CaseQuarantineControlMeasure> {

	public CaseQuarantineControlMeasureSetter(Class<edu.pitt.apollo.types.v4_0.CaseQuarantineControlMeasure> newTypeClass, edu.pitt.apollo.types.v3_1_0.CaseQuarantineControlMeasure oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setQuarantinePeriod() throws MigrationException {
		DurationSetter setter = DurationSetterFactory.getSetter(oldTypeInstance.getQuarantinePeriod());
		setter.set();
		newTypeInstance.setQuarantinePeriod(setter.getNewTypeInstance());
	}

	private void setCompliance() throws MigrationException {
		ProbabilisticParameterSetter setter = new ProbabilisticParameterSetter(edu.pitt.apollo.types.v4_0.ProbabilisticParameter.class,oldTypeInstance.getCompliance());
		setter.set();
		newTypeInstance.setCompliance(setter.getNewTypeInstance());
	}

	private void setHouseholdTransmissionMultiplier() throws MigrationException {
		newTypeInstance.setHouseholdTransmissionMultiplier(oldTypeInstance.getHouseholdTransmissionMultiplier());
	}

	private void setSchoolTransmissionMultiplier() throws MigrationException {
		newTypeInstance.setSchoolTransmissionMultiplier(oldTypeInstance.getSchoolTransmissionMultiplier());
	}

	private void setWorkplaceTransmissionMultiplier() throws MigrationException {
		newTypeInstance.setWorkplaceTransmissionMultiplier(oldTypeInstance.getWorkplaceTransmissionMultiplier());
	}

	@Override
	public void set() throws MigrationException {
		super.set();
		setQuarantinePeriod();
		setCompliance();
		setHouseholdTransmissionMultiplier();
		setSchoolTransmissionMultiplier();
		setWorkplaceTransmissionMultiplier();
	}

}