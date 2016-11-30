package edu.pitt.apollo.apolloversionmigration.output;

public class CensusDataSetterFactory {

	public static CensusDataSetter getSetter(Object oldTypeInstance) throws MigrationException {

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.ContaminatedThingCensusData) {

			return new ContaminatedThingCensusDataSetter(edu.pitt.apollo.types.v4_0.ContaminatedThingCensusData.class, (edu.pitt.apollo.types.v3_1_0.ContaminatedThingCensusData) oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.PopulationInfectionAndImmunityCensusData) {

			return new PopulationInfectionAndImmunityCensusDataSetter(edu.pitt.apollo.types.v4_0.PopulationInfectionAndImmunityCensusData.class, (edu.pitt.apollo.types.v3_1_0.PopulationInfectionAndImmunityCensusData) oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.PopulationTreatmentCensusData) {

			return new PopulationTreatmentCensusDataSetter(edu.pitt.apollo.types.v4_0.PopulationTreatmentCensusData.class, (edu.pitt.apollo.types.v3_1_0.PopulationTreatmentCensusData) oldTypeInstance);
		}

		throw new UnsupportedTypeException("Type " + oldTypeInstance.getClass().getCanonicalName() + " is not supported");

	}


}

