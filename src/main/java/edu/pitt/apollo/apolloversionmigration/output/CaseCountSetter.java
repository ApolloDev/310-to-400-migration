package edu.pitt.apollo.apolloversionmigration.output;

public class CaseCountSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0_1.CaseCount> {

	public CaseCountSetter(Class<edu.pitt.apollo.types.v4_0_1.CaseCount> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setCountTitle() throws MigrationException {
		newTypeInstance.setCountTitle(((edu.pitt.apollo.types.v3_1_0.CaseCount) oldTypeInstance).getCountTitle());
	}

	protected void setCaseDefinitionsIncluded() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.CaseDefinitionEnum oldObj : ((edu.pitt.apollo.types.v3_1_0.CaseCount) oldTypeInstance).getCaseDefinitionsIncluded()) {
			newTypeInstance.getCaseDefinitionsIncluded().add(edu.pitt.apollo.types.v4_0_1.CaseDefinitionEnum.valueOf(oldObj.toString()));
		}

	}

	protected void setCaseCountArrayDescription() throws MigrationException {
		CaseCountArrayDescriptionSetter setter = new CaseCountArrayDescriptionSetterImpl(edu.pitt.apollo.types.v4_0_1.CaseCountArrayDescription.class,((edu.pitt.apollo.types.v3_1_0.CaseCount) oldTypeInstance).getCaseCountArrayDescription());
		setter.set();
		newTypeInstance.setCaseCountArrayDescription(setter.getNewTypeInstance());
	}

	protected void setTotalCount() throws MigrationException {
		newTypeInstance.setTotalCount(((edu.pitt.apollo.types.v3_1_0.CaseCount) oldTypeInstance).getTotalCount());
	}

	protected void setCaseCountArray() throws MigrationException {
		VariableCategoryValueTreeSetter setter = new VariableCategoryValueTreeSetterImpl(edu.pitt.apollo.types.v4_0_1.VariableCategoryValueTree.class,((edu.pitt.apollo.types.v3_1_0.CaseCount) oldTypeInstance).getCaseCountArray());
		setter.set();
		newTypeInstance.setCaseCountArray(setter.getNewTypeInstance());
	}

	protected void setTemporalCountArrayWithUniformIntervals() throws MigrationException {
		TemporalCountArrayWithUniformIntervalsSetter setter = new TemporalCountArrayWithUniformIntervalsSetter(edu.pitt.apollo.types.v4_0_1.TemporalCountArrayWithUniformIntervals.class,((edu.pitt.apollo.types.v3_1_0.CaseCount) oldTypeInstance).getTemporalCountArrayWithUniformIntervals());
		setter.set();
		newTypeInstance.setTemporalCountArrayWithUniformIntervals(setter.getNewTypeInstance());
	}

	protected void setReferenceId() throws MigrationException {
		newTypeInstance.setReferenceId(((edu.pitt.apollo.types.v3_1_0.CaseCount) oldTypeInstance).getReferenceId());
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			setCountTitle();
			setCaseDefinitionsIncluded();
			setCaseCountArrayDescription();
			setTotalCount();
			setCaseCountArray();
			setTemporalCountArrayWithUniformIntervals();
			setReferenceId();
		}
	}

}