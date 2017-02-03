package edu.pitt.apollo.apolloversionmigration.output;

public class CensusDataSetterFactory {

	public static CensusDataSetter getSetter(Object oldTypeInstance) throws MigrationException {

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v3_1_0.PopulationTreatmentCensusData) {

			return new PopulationTreatmentCensusDataSetter(edu.pitt.apollo.types.v4_0_1.PopulationTreatmentCensusData.class, oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v3_1_0.ContaminatedThingCensusData) {

			return new ContaminatedThingCensusDataSetter(edu.pitt.apollo.types.v4_0_1.ContaminatedThingCensusData.class, oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v3_1_0.PopulationInfectionAndImmunityCensusData) {

			return new PopulationInfectionAndImmunityCensusDataSetter(edu.pitt.apollo.types.v4_0_1.PopulationInfectionAndImmunityCensusData.class, oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v3_1_0.CensusData) {

			return new CensusDataSetter(edu.pitt.apollo.types.v4_0_1.CensusData.class, oldTypeInstance);
		}

		throw new UnsupportedTypeException("Type " + oldTypeInstance.getClass().getCanonicalName() + " is not supported");

	}


}

