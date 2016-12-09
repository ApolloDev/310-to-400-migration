package edu.pitt.apollo.apolloversionmigration.output;

public class PointerToDataSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0_1.PointerToData> {

	public PointerToDataSetter(Class<edu.pitt.apollo.types.v4_0_1.PointerToData> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setDataType() throws MigrationException {
		if (((edu.pitt.apollo.types.v3_1_0.PointerToData) oldTypeInstance).getDataType() != null) {
			newTypeInstance.setDataType(edu.pitt.apollo.types.v4_0_1.DataTypeEnum.valueOf(((edu.pitt.apollo.types.v3_1_0.PointerToData) oldTypeInstance).getDataType().toString()));
		}
	}

	protected void setXmlFormat() throws MigrationException {
		newTypeInstance.setXmlFormat(((edu.pitt.apollo.types.v3_1_0.PointerToData) oldTypeInstance).getXmlFormat());
	}

	protected void setCsvFormat() throws MigrationException {
		newTypeInstance.setCsvFormat(((edu.pitt.apollo.types.v3_1_0.PointerToData) oldTypeInstance).getCsvFormat());
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			setDataType();
			setXmlFormat();
			setCsvFormat();
		}
	}

}