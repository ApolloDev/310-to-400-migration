package edu.pitt.apollo.apolloversionmigration.output;

public class InfectiousDiseaseSetterFactory {

	public static InfectiousDiseaseSetter getSetter(Object oldTypeInstance) throws MigrationException {

		throw new UnsupportedTypeException("Type " + oldTypeInstance.getClass().getCanonicalName() + " is not supported");

	}


}

