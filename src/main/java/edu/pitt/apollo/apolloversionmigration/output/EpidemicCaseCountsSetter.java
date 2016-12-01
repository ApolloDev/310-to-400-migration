package edu.pitt.apollo.apolloversionmigration.output;

public class EpidemicCaseCountsSetter extends ApolloIndexableItemSetter<edu.pitt.apollo.types.v4_0.EpidemicCaseCounts> {

	public EpidemicCaseCountsSetter(Class<edu.pitt.apollo.types.v4_0.EpidemicCaseCounts> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setTotalCaseCount() throws MigrationException {
		CaseCountSetter setter = new CaseCountSetter(edu.pitt.apollo.types.v4_0.CaseCount.class,((edu.pitt.apollo.types.v3_1_0.EpidemicCaseCounts) oldTypeInstance).getTotalCaseCount());
		setter.set();
		newTypeInstance.setTotalCaseCount(setter.getNewTypeInstance());
	}

	protected void setTotalFatalCaseCount() throws MigrationException {
		CaseCountSetter setter = new CaseCountSetter(edu.pitt.apollo.types.v4_0.CaseCount.class,((edu.pitt.apollo.types.v3_1_0.EpidemicCaseCounts) oldTypeInstance).getTotalFatalCaseCount());
		setter.set();
		newTypeInstance.setTotalFatalCaseCount(setter.getNewTypeInstance());
	}

	protected void setOtherCaseCounts() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.CaseCount oldObj : ((edu.pitt.apollo.types.v3_1_0.EpidemicCaseCounts) oldTypeInstance).getOtherCaseCounts()) {
			CaseCountSetter setter = new CaseCountSetter(edu.pitt.apollo.types.v4_0.CaseCount.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.CaseCount newObj = setter.getNewTypeInstance();
			newTypeInstance.getOtherCaseCounts().add(newObj);
		}

	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
			setTotalCaseCount();
			setTotalFatalCaseCount();
			setOtherCaseCounts();
		}
	}

}