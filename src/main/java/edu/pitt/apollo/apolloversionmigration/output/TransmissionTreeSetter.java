package edu.pitt.apollo.apolloversionmigration.output;

public class TransmissionTreeSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.TransmissionTree,edu.pitt.apollo.types.v3_1_0.TransmissionTree> {

	public TransmissionTreeSetter(Class<edu.pitt.apollo.types.v4_0.TransmissionTree> newTypeClass, edu.pitt.apollo.types.v3_1_0.TransmissionTree oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setThisCase() throws MigrationException {
		CaseRecordSetter setter = new CaseRecordSetter(edu.pitt.apollo.types.v4_0.CaseRecord.class,oldTypeInstance.getThisCase());
		setter.set();
		newTypeInstance.setThisCase(setter.getNewTypeInstance());
	}

	private void setCasesThisCaseInfected() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.TransmissionTree oldObj : oldTypeInstance.getCasesThisCaseInfected()) {
			TransmissionTreeSetter setter = new TransmissionTreeSetter(edu.pitt.apollo.types.v4_0.TransmissionTree.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.TransmissionTree newObj = setter.getNewTypeInstance();
			newTypeInstance.getCasesThisCaseInfected().add(newObj);
		}

	}

	@Override
	public void set() throws MigrationException {
		setThisCase();
		setCasesThisCaseInfected();
	}

}