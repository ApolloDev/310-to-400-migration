package edu.pitt.apollo.apolloversionmigration.output;

public class IndividualSetterFactory {

	public static IndividualSetter getSetter(Object oldTypeInstance) throws MigrationException {

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v3_1_0.IndividualAndEpidemiologicalCharacteristics) {

			return new IndividualAndEpidemiologicalCharacteristicsSetter(edu.pitt.apollo.types.v4_0_1.IndividualAndEpidemiologicalCharacteristics.class, oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v3_1_0.Individual) {

			return new IndividualSetter(edu.pitt.apollo.types.v4_0_1.Individual.class, oldTypeInstance);
		}

		throw new UnsupportedTypeException("Type " + oldTypeInstance.getClass().getCanonicalName() + " is not supported");

	}


}

