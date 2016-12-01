package edu.pitt.apollo.apolloversionmigration.output;

public class PointerToDataSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.PointerToData> {

	public PointerToDataSetter(Class<edu.pitt.apollo.types.v4_0.PointerToData> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setDataType() throws MigrationException {
		newTypeInstance.setDataType(edu.pitt.apollo.types.v4_0.DataTypeEnum.valueOf(((edu.pitt.apollo.types.v3_1_0.PointerToData) oldTypeInstance).getDataType().toString()));
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