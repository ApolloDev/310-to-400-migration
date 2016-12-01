package edu.pitt.apollo.apolloversionmigration.output;

public class InfectionSetterFactory {

	public static InfectionSetter getSetter(Object oldTypeInstance) throws MigrationException {

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.LInfection) {

			return new LInfectionSetterImpl(edu.pitt.apollo.types.v4_0.LInfection.class, oldTypeInstance);
		}

		throw new UnsupportedTypeException("Type " + oldTypeInstance.getClass().getCanonicalName() + " is not supported");

	}


}

