package edu.pitt.apollo.apolloversionmigration.output;

public class LabTestAndResultSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.LabTestAndResult,edu.pitt.apollo.types.v3_1_0.LabTestAndResult> {

	public LabTestAndResultSetter(Class<edu.pitt.apollo.types.v4_0.LabTestAndResult> newTypeClass, edu.pitt.apollo.types.v3_1_0.LabTestAndResult oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setTextualName() throws MigrationException {
		newTypeInstance.setTextualName(oldTypeInstance.getTextualName());
	}

	private void setLoincCode() throws MigrationException {
		newTypeInstance.setLoincCode(oldTypeInstance.getLoincCode());
	}

	private void setSampleDate() throws MigrationException {
		newTypeInstance.setSampleDate(oldTypeInstance.getSampleDate());
	}

	private void setResult() throws MigrationException {
		newTypeInstance.setResult(oldTypeInstance.getResult());
	}

	@Override
	public void set() throws MigrationException {
		setTextualName();
		setLoincCode();
		setSampleDate();
		setResult();
	}

}