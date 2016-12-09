package edu.pitt.apollo.apolloversionmigration.output;

public abstract class CaseCountArrayDescriptionSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0_1.CaseCountArrayDescription> {

	public CaseCountArrayDescriptionSetter(Class<edu.pitt.apollo.types.v4_0_1.CaseCountArrayDescription> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setCaseCountArrayType() throws MigrationException {
		if (((edu.pitt.apollo.types.v3_1_0.CaseCountArrayDescription) oldTypeInstance).getCaseCountArrayType() != null) {
			newTypeInstance.setCaseCountArrayType(edu.pitt.apollo.types.v4_0_1.CaseCountArrayTypeEnum.valueOf(((edu.pitt.apollo.types.v3_1_0.CaseCountArrayDescription) oldTypeInstance).getCaseCountArrayType().toString()));
		}
	}

	protected abstract void setStartDateOfDataSeries() throws MigrationException;
	protected abstract void setResetDates() throws MigrationException;
	protected abstract void setDateSpansWithNoDataCollection() throws MigrationException;
	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			setCaseCountArrayType();
			setStartDateOfDataSeries();
			setResetDates();
			setDateSpansWithNoDataCollection();
		}
	}

}