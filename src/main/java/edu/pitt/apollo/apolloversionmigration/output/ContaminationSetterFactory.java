package edu.pitt.apollo.apolloversionmigration.output;

public class ContaminationSetterFactory {

	public static ContaminationSetter getSetter(Object oldTypeInstance) throws MigrationException {

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v3_1_0.Contamination) {

			return new ContaminationSetter(edu.pitt.apollo.types.v4_0_1.Contamination.class, oldTypeInstance);
		}

		throw new UnsupportedTypeException("Type " + oldTypeInstance.getClass().getCanonicalName() + " is not supported");

	}


}

