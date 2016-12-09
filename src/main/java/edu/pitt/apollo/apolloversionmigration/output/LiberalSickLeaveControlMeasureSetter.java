package edu.pitt.apollo.apolloversionmigration.output;

public class LiberalSickLeaveControlMeasureSetter extends InfectiousDiseaseControlMeasureSetter<edu.pitt.apollo.types.v4_0_1.LiberalSickLeaveControlMeasure> {

	public LiberalSickLeaveControlMeasureSetter(Class<edu.pitt.apollo.types.v4_0_1.LiberalSickLeaveControlMeasure> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setCompliance() throws MigrationException {
		ProbabilisticParameterSetter setter = new ProbabilisticParameterSetter(edu.pitt.apollo.types.v4_0_1.ProbabilisticParameter.class,((edu.pitt.apollo.types.v3_1_0.LiberalSickLeaveControlMeasure) oldTypeInstance).getCompliance());
		setter.set();
		newTypeInstance.setCompliance(setter.getNewTypeInstance());
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
			setCompliance();
		}
	}

}