package edu.pitt.apollo.apolloversionmigration.output;

public class IndividualSetterFactory {

	public static IndividualSetter getSetter(Object oldTypeInstance) throws MigrationException {

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.IndividualAndEpidemiologicalCharacteristics) {

			return new IndividualAndEpidemiologicalCharacteristicsSetter(edu.pitt.apollo.types.v4_0.IndividualAndEpidemiologicalCharacteristics.class, oldTypeInstance);
		}

		throw new UnsupportedTypeException("Type " + oldTypeInstance.getClass().getCanonicalName() + " is not supported");

	}


}

