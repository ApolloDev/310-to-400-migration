package edu.pitt.apollo.apolloversionmigration.output;

public class ContaminationSetterFactory {

	public static ContaminationSetter getSetter(Object oldTypeInstance) throws MigrationException {

		throw new UnsupportedTypeException("Type " + oldTypeInstance.getClass().getCanonicalName() + " is not supported");

	}


}

