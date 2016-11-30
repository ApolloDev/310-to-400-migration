package edu.pitt.apollo.apolloversionmigration.output;

public class CensusSetterFactory {

	public static CensusSetter getSetter(Object oldTypeInstance) throws MigrationException {

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.PopulationInfectionAndImmunityCensus) {

			return new PopulationInfectionAndImmunityCensusSetter(edu.pitt.apollo.types.v4_0.PopulationInfectionAndImmunityCensus.class, (edu.pitt.apollo.types.v3_1_0.PopulationInfectionAndImmunityCensus) oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.PopulationTreatmentCensus) {

			return new PopulationTreatmentCensusSetter(edu.pitt.apollo.types.v4_0.PopulationTreatmentCensus.class, (edu.pitt.apollo.types.v3_1_0.PopulationTreatmentCensus) oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.AbioticThingCensus) {

			return AbioticThingCensusSetterFactory.getSetter(oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.ContaminatedThingCensus) {

			return new ContaminatedThingCensusSetter(edu.pitt.apollo.types.v4_0.ContaminatedThingCensus.class, (edu.pitt.apollo.types.v3_1_0.ContaminatedThingCensus) oldTypeInstance);
		}

		throw new UnsupportedTypeException("Type " + oldTypeInstance.getClass().getCanonicalName() + " is not supported");

	}


}

