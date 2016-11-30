package edu.pitt.apollo.apolloversionmigration.output;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CaseCountArrayDescriptionSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.CaseCountArrayDescription,edu.pitt.apollo.types.v3_1_0.CaseCountArrayDescription> {

	public CaseCountArrayDescriptionSetter(Class<edu.pitt.apollo.types.v4_0.CaseCountArrayDescription> newTypeClass, edu.pitt.apollo.types.v3_1_0.CaseCountArrayDescription oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setCaseCountArrayType() throws MigrationException {
		newTypeInstance.setCaseCountArrayType(edu.pitt.apollo.types.v4_0.CaseCountArrayTypeEnum.fromValue(oldTypeInstance.getCaseCountArrayType().toString()));
	}

	private void setStartDateOfDataSeries() throws MigrationException {
		GregorianCalendar c = new GregorianCalendar();
		c.setTime(new Date());
		try {
			XMLGregorianCalendar date = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
			newTypeInstance.setStartDateOfDataSeries(date);
		} catch ( DatatypeConfigurationException e) {
			throw new MigrationException("DatatypeConfigurationException: " + e.getMessage());
		}
	}

	private void setResetDates() throws MigrationException {
//		for (javax.xml.datatype.XMLGregorianCalendar oldObj : oldTypeInstance.getResetDates()) {
//			newTypeInstance.getResetDates().add(oldObj);
//		}

	}

	private void setDateSpansWithNoDataCollection() throws MigrationException {
//		for (edu.pitt.apollo.types.v3_1_0.RealDateSpanCategoryDefinition oldObj : oldTypeInstance.getDateSpansWithNoDataCollection()) {
//			RealDateSpanCategoryDefinitionSetter setter = new RealDateSpanCategoryDefinitionSetter(edu.pitt.apollo.types.v4_0.RealDateSpanCategoryDefinition.class,oldObj);
//			setter.set();
//			edu.pitt.apollo.types.v4_0.RealDateSpanCategoryDefinition newObj = setter.getNewTypeInstance();
//			newTypeInstance.getDateSpansWithNoDataCollection().add(newObj);
//		}

	}

	@Override
	public void set() throws MigrationException {
		setCaseCountArrayType();
		setStartDateOfDataSeries();
//		setResetDates();
//		setDateSpansWithNoDataCollection();
	}

}