package edu.pitt.apollo.apolloversionmigration.output;

public class CaseCountSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.CaseCount,edu.pitt.apollo.types.v3_1_0.CaseCount> {

	public CaseCountSetter(Class<edu.pitt.apollo.types.v4_0.CaseCount> newTypeClass, edu.pitt.apollo.types.v3_1_0.CaseCount oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setCountTitle() throws MigrationException {
		newTypeInstance.setCountTitle(oldTypeInstance.getCountTitle());
	}

	private void setCaseDefinitionsIncluded() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.CaseDefinitionEnum oldObj : oldTypeInstance.getCaseDefinitionsIncluded()) {
			newTypeInstance.getCaseDefinitionsIncluded().add(edu.pitt.apollo.types.v4_0.CaseDefinitionEnum.fromValue(oldObj.toString()));
		}

	}

	private void setCaseCountArrayDescription() throws MigrationException {
		CaseCountArrayDescriptionSetter setter = new CaseCountArrayDescriptionSetter(edu.pitt.apollo.types.v4_0.CaseCountArrayDescription.class,oldTypeInstance.getCaseCountArrayDescription());
		setter.set();
		newTypeInstance.setCaseCountArrayDescription(setter.getNewTypeInstance());
	}

	private void setTotalCount() throws MigrationException {
		newTypeInstance.setTotalCount(oldTypeInstance.getTotalCount());
	}

	private void setCaseCountArray() throws MigrationException {
		VariableCategoryValueTreeSetter setter = new VariableCategoryValueTreeSetter(edu.pitt.apollo.types.v4_0.VariableCategoryValueTree.class,oldTypeInstance.getCaseCountArray());
		setter.set();
		newTypeInstance.setCaseCountArray(setter.getNewTypeInstance());
	}

	private void setTemporalCountArrayWithUniformIntervals() throws MigrationException {
		TemporalCountArrayWithUniformIntervalsSetter setter = new TemporalCountArrayWithUniformIntervalsSetter(edu.pitt.apollo.types.v4_0.TemporalCountArrayWithUniformIntervals.class,oldTypeInstance.getTemporalCountArrayWithUniformIntervals());
		setter.set();
		newTypeInstance.setTemporalCountArrayWithUniformIntervals(setter.getNewTypeInstance());
	}

	private void setReferenceId() throws MigrationException {
		newTypeInstance.setReferenceId(oldTypeInstance.getReferenceId());
	}

	@Override
	public void set() throws MigrationException {
		setCountTitle();
		setCaseDefinitionsIncluded();
		setCaseCountArrayDescription();
		setTotalCount();
		setCaseCountArray();
		setTemporalCountArrayWithUniformIntervals();
		setReferenceId();
	}

}