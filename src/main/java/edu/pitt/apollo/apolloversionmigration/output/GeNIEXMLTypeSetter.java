package edu.pitt.apollo.apolloversionmigration.output;

public class GeNIEXMLTypeSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.GeNIEXMLType,edu.pitt.apollo.types.v3_1_0.GeNIEXMLType> {

	public GeNIEXMLTypeSetter(Class<edu.pitt.apollo.types.v4_0.GeNIEXMLType> newTypeClass, edu.pitt.apollo.types.v3_1_0.GeNIEXMLType oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setTheXML() throws MigrationException {
		newTypeInstance.setTheXML(oldTypeInstance.getTheXML());
	}

	@Override
	public void set() throws MigrationException {
		setTheXML();
	}

}