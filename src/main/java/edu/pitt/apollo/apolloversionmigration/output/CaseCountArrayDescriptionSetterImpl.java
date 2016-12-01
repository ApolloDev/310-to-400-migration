package edu.pitt.apollo.apolloversionmigration.output;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CaseCountArrayDescriptionSetterImpl extends CaseCountArrayDescriptionSetter {

	public CaseCountArrayDescriptionSetterImpl(Class<edu.pitt.apollo.types.v4_0.CaseCountArrayDescription> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setCaseCountArrayType() throws MigrationException {
		newTypeInstance.setCaseCountArrayType(edu.pitt.apollo.types.v4_0.CaseCountArrayTypeEnum.valueOf(((edu.pitt.apollo.types.v3_1_0.CaseCountArrayDescription) oldTypeInstance).getCaseCountArrayType().toString()));
	}

	@Override
	protected void setStartDateOfDataSeries() throws MigrationException {
		GregorianCalendar c = new GregorianCalendar();
		c.setTime(new Date());
		try {
			XMLGregorianCalendar date = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
			newTypeInstance.setStartDateOfDataSeries(date);
		} catch ( DatatypeConfigurationException e) {
			throw new MigrationException("DatatypeConfigurationException: " + e.getMessage());
		}
	}

	@Override
	protected void setResetDates() throws MigrationException {

	}

	@Override
	protected void setDateSpansWithNoDataCollection() throws MigrationException {

	}


}