package edu.pitt.apollo.apolloversionmigration.output;

public class LabTestAndResultSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0_1.LabTestAndResult> {

	public LabTestAndResultSetter(Class<edu.pitt.apollo.types.v4_0_1.LabTestAndResult> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setTextualName() throws MigrationException {
		newTypeInstance.setTextualName(((edu.pitt.apollo.types.v3_1_0.LabTestAndResult) oldTypeInstance).getTextualName());
	}

	protected void setLoincCode() throws MigrationException {
		newTypeInstance.setLoincCode(((edu.pitt.apollo.types.v3_1_0.LabTestAndResult) oldTypeInstance).getLoincCode());
	}

	protected void setSampleDate() throws MigrationException {
		newTypeInstance.setSampleDate(((edu.pitt.apollo.types.v3_1_0.LabTestAndResult) oldTypeInstance).getSampleDate());
	}

	protected void setResult() throws MigrationException {
		newTypeInstance.setResult(((edu.pitt.apollo.types.v3_1_0.LabTestAndResult) oldTypeInstance).getResult());
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			setTextualName();
			setLoincCode();
			setSampleDate();
			setResult();
		}
	}

}