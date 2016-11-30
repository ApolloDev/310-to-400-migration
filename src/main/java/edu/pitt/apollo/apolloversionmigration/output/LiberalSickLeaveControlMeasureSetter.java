package edu.pitt.apollo.apolloversionmigration.output;

public class LiberalSickLeaveControlMeasureSetter extends InfectiousDiseaseControlMeasureSetter<edu.pitt.apollo.types.v4_0.LiberalSickLeaveControlMeasure,edu.pitt.apollo.types.v3_1_0.LiberalSickLeaveControlMeasure> {

	public LiberalSickLeaveControlMeasureSetter(Class<edu.pitt.apollo.types.v4_0.LiberalSickLeaveControlMeasure> newTypeClass, edu.pitt.apollo.types.v3_1_0.LiberalSickLeaveControlMeasure oldTypeInstance) throws MigrationException {
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