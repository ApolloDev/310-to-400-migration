package edu.pitt.apollo.apolloversionmigration.output;

public class AbioticThingCensusSetterFactory {

	public static AbioticThingCensusSetter getSetter(Object oldTypeInstance) throws MigrationException {

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.OvipositionSiteCensus) {

			return new OvipositionSiteCensusSetter(edu.pitt.apollo.types.v4_0.OvipositionSiteCensus.class, (edu.pitt.apollo.types.v3_1_0.OvipositionSiteCensus) oldTypeInstance);
		}

		throw new UnsupportedTypeException("Type " + oldTypeInstance.getClass().getCanonicalName() + " is not supported");

	}


}
