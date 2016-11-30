package edu.pitt.apollo.apolloversionmigration.output;

public class PointerToDataSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.PointerToData,edu.pitt.apollo.types.v3_1_0.PointerToData> {

	public PointerToDataSetter(Class<edu.pitt.apollo.types.v4_0.PointerToData> newTypeClass, edu.pitt.apollo.types.v3_1_0.PointerToData oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setDataType() throws MigrationException {
		newTypeInstance.setDataType(edu.pitt.apollo.types.v4_0.DataTypeEnum.fromValue(oldTypeInstance.getDataType().toString()));
	}

	private void setXmlFormat() throws MigrationException {
		newTypeInstance.setXmlFormat(oldTypeInstance.getXmlFormat());
	}

	private void setCsvFormat() throws MigrationException {
		newTypeInstance.setCsvFormat(oldTypeInstance.getCsvFormat());
	}

	@Override
	public void set() throws MigrationException {
		setDataType();
		setXmlFormat();
		setCsvFormat();
	}

}