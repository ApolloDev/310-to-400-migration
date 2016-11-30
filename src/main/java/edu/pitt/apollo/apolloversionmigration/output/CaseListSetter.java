package edu.pitt.apollo.apolloversionmigration.output;

public class CaseListSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.CaseList,edu.pitt.apollo.types.v3_1_0.CaseList> {

	public CaseListSetter(Class<edu.pitt.apollo.types.v4_0.CaseList> newTypeClass, edu.pitt.apollo.types.v3_1_0.CaseList oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setSpeciesOfCases() throws MigrationException {
		newTypeInstance.setSpeciesOfCases(oldTypeInstance.getSpeciesOfCases());
	}

	private void setCaseRecords() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.CaseRecord oldObj : oldTypeInstance.getCaseRecords()) {
			CaseRecordSetter setter = new CaseRecordSetter(edu.pitt.apollo.types.v4_0.CaseRecord.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.CaseRecord newObj = setter.getNewTypeInstance();
			newTypeInstance.getCaseRecords().add(newObj);
		}

	}

	@Override
	public void set() throws MigrationException {
		setSpeciesOfCases();
		setCaseRecords();
	}

}