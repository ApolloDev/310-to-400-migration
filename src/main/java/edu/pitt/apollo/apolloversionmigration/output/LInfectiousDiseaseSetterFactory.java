package edu.pitt.apollo.apolloversionmigration.output;

public class LInfectiousDiseaseSetterFactory {

	public static LInfectiousDiseaseSetter getSetter(Object oldTypeInstance) throws MigrationException {

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.InfectiousDisease) {

			return new InfectiousDiseaseSetterImpl(edu.pitt.apollo.types.v4_0.InfectiousDisease.class, oldTypeInstance);
		}

		throw new UnsupportedTypeException("Type " + oldTypeInstance.getClass().getCanonicalName() + " is not supported");

	}


}

