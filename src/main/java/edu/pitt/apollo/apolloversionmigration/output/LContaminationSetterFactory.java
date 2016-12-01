package edu.pitt.apollo.apolloversionmigration.output;

public class LContaminationSetterFactory {

	public static LContaminationSetter getSetter(Object oldTypeInstance) throws MigrationException {

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.Contamination) {

			return new ContaminationSetterImpl(edu.pitt.apollo.types.v4_0.Contamination.class, oldTypeInstance);
		}

		throw new UnsupportedTypeException("Type " + oldTypeInstance.getClass().getCanonicalName() + " is not supported");

	}


}

