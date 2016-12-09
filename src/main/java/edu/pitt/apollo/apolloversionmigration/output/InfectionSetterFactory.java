package edu.pitt.apollo.apolloversionmigration.output;

public class InfectionSetterFactory {

	public static InfectionSetter getSetter(Object oldTypeInstance) throws MigrationException {

		throw new UnsupportedTypeException("Type " + oldTypeInstance.getClass().getCanonicalName() + " is not supported");

	}


}

