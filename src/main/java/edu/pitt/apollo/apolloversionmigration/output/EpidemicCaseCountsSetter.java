package edu.pitt.apollo.apolloversionmigration.output;

public class EpidemicCaseCountsSetter extends ApolloIndexableItemSetter<edu.pitt.apollo.types.v4_0.EpidemicCaseCounts,edu.pitt.apollo.types.v3_1_0.EpidemicCaseCounts> {

	public EpidemicCaseCountsSetter(Class<edu.pitt.apollo.types.v4_0.EpidemicCaseCounts> newTypeClass, edu.pitt.apollo.types.v3_1_0.EpidemicCaseCounts oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setTotalCaseCount() throws MigrationException {
		CaseCountSetter setter = new CaseCountSetter(edu.pitt.apollo.types.v4_0.CaseCount.class,oldTypeInstance.getTotalCaseCount());
		setter.set();
		newTypeInstance.setTotalCaseCount(setter.getNewTypeInstance());
	}

	private void setTotalFatalCaseCount() throws MigrationException {
		CaseCountSetter setter = new CaseCountSetter(edu.pitt.apollo.types.v4_0.CaseCount.class,oldTypeInstance.getTotalFatalCaseCount());
		setter.set();
		newTypeInstance.setTotalFatalCaseCount(setter.getNewTypeInstance());
	}

	private void setOtherCaseCounts() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.CaseCount oldObj : oldTypeInstance.getOtherCaseCounts()) {
			CaseCountSetter setter = new CaseCountSetter(edu.pitt.apollo.types.v4_0.CaseCount.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.CaseCount newObj = setter.getNewTypeInstance();
			newTypeInstance.getOtherCaseCounts().add(newObj);
		}

	}

	@Override
	public void set() throws MigrationException {
		super.set();
		setTotalCaseCount();
		setTotalFatalCaseCount();
		setOtherCaseCounts();
	}

}