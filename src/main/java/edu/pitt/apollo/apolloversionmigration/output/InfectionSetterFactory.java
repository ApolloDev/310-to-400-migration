package edu.pitt.apollo.apolloversionmigration.output;

public class InfectionSetterFactory {

	public static InfectionSetter getSetter(Object oldTypeInstance) throws MigrationException {

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v3_1_0.Infection) {

			return new InfectionSetter(edu.pitt.apollo.types.v4_0_1.Infection.class, oldTypeInstance);
		}

		throw new UnsupportedTypeException("Type " + oldTypeInstance.getClass().getCanonicalName() + " is not supported");

	}


}

