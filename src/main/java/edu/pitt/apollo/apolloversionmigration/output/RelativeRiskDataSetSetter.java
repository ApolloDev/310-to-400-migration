package edu.pitt.apollo.apolloversionmigration.output;

public class RelativeRiskDataSetSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.RelativeRiskDataSet,edu.pitt.apollo.types.v3_1_0.RelativeRiskDataSet> {

	public RelativeRiskDataSetSetter(Class<edu.pitt.apollo.types.v4_0.RelativeRiskDataSet> newTypeClass, edu.pitt.apollo.types.v3_1_0.RelativeRiskDataSet oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setTextualDescription() throws MigrationException {
		newTypeInstance.setTextualDescription(oldTypeInstance.getTextualDescription());
	}

	private void setCaseCountArray() throws MigrationException {
		VariableCategoryValueTreeSetter setter = new VariableCategoryValueTreeSetter(edu.pitt.apollo.types.v4_0.VariableCategoryValueTree.class,oldTypeInstance.getCaseCountArray());
		setter.set();
		newTypeInstance.setCaseCountArray(setter.getNewTypeInstance());
	}

	private void setControlCountArray() throws MigrationException {
		VariableCategoryValueTreeSetter setter = new VariableCategoryValueTreeSetter(edu.pitt.apollo.types.v4_0.VariableCategoryValueTree.class,oldTypeInstance.getControlCountArray());
		setter.set();
		newTypeInstance.setControlCountArray(setter.getNewTypeInstance());
	}

	private void setReferenceId() throws MigrationException {
		ReferenceSetter setter = new ReferenceSetter(edu.pitt.apollo.types.v4_0.Reference.class,oldTypeInstance.getReferenceId());
		setter.set();
		newTypeInstance.setReferenceId(setter.getNewTypeInstance());
	}

	@Override
	public void set() throws MigrationException {
		setTextualDescription();
		setCaseCountArray();
		setControlCountArray();
		setReferenceId();
	}

}