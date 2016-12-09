package edu.pitt.apollo.apolloversionmigration.output;

public class GeNIEXMLTypeSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0_1.GeNIEXMLType> {

	public GeNIEXMLTypeSetter(Class<edu.pitt.apollo.types.v4_0_1.GeNIEXMLType> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setTheXML() throws MigrationException {
		newTypeInstance.setTheXML(((edu.pitt.apollo.types.v3_1_0.GeNIEXMLType) oldTypeInstance).getTheXML());
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			setTheXML();
		}
	}

}