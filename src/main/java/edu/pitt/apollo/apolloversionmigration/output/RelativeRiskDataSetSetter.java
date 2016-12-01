package edu.pitt.apollo.apolloversionmigration.output;

public class RelativeRiskDataSetSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.RelativeRiskDataSet> {

	public RelativeRiskDataSetSetter(Class<edu.pitt.apollo.types.v4_0.RelativeRiskDataSet> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setTextualDescription() throws MigrationException {
		newTypeInstance.setTextualDescription(((edu.pitt.apollo.types.v3_1_0.RelativeRiskDataSet) oldTypeInstance).getTextualDescription());
	}

	protected void setCaseCountArray() throws MigrationException {
		VariableCategoryValueTreeSetter setter = new VariableCategoryValueTreeSetterImpl(edu.pitt.apollo.types.v4_0.VariableCategoryValueTree.class,((edu.pitt.apollo.types.v3_1_0.RelativeRiskDataSet) oldTypeInstance).getCaseCountArray());
		setter.set();
		newTypeInstance.setCaseCountArray(setter.getNewTypeInstance());
	}

	protected void setControlCountArray() throws MigrationException {
		VariableCategoryValueTreeSetter setter = new VariableCategoryValueTreeSetterImpl(edu.pitt.apollo.types.v4_0.VariableCategoryValueTree.class,((edu.pitt.apollo.types.v3_1_0.RelativeRiskDataSet) oldTypeInstance).getControlCountArray());
		setter.set();
		newTypeInstance.setControlCountArray(setter.getNewTypeInstance());
	}

	protected void setReferenceId() throws MigrationException {
		ReferenceSetter setter = new ReferenceSetter(edu.pitt.apollo.types.v4_0.Reference.class,((edu.pitt.apollo.types.v3_1_0.RelativeRiskDataSet) oldTypeInstance).getReferenceId());
		setter.set();
		newTypeInstance.setReferenceId(setter.getNewTypeInstance());
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			setTextualDescription();
			setCaseCountArray();
			setControlCountArray();
			setReferenceId();
		}
	}

}