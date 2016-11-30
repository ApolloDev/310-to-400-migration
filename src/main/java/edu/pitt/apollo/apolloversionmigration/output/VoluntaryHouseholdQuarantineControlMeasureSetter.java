package edu.pitt.apollo.apolloversionmigration.output;

public class VoluntaryHouseholdQuarantineControlMeasureSetter extends InfectiousDiseaseControlMeasureSetter<edu.pitt.apollo.types.v4_0.VoluntaryHouseholdQuarantineControlMeasure,edu.pitt.apollo.types.v3_1_0.VoluntaryHouseholdQuarantineControlMeasure> {

	public VoluntaryHouseholdQuarantineControlMeasureSetter(Class<edu.pitt.apollo.types.v4_0.VoluntaryHouseholdQuarantineControlMeasure> newTypeClass, edu.pitt.apollo.types.v3_1_0.VoluntaryHouseholdQuarantineControlMeasure oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setCompliance() throws MigrationException {
		ProbabilisticParameterSetter setter = new ProbabilisticParameterSetter(edu.pitt.apollo.types.v4_0.ProbabilisticParameter.class,oldTypeInstance.getCompliance());
		setter.set();
		newTypeInstance.setCompliance(setter.getNewTypeInstance());
	}

	@Override
	public void set() throws MigrationException {
		super.set();
		setCompliance();
	}

}