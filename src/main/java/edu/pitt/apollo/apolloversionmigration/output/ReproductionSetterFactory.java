package edu.pitt.apollo.apolloversionmigration.output;

public class ReproductionSetterFactory {

	public static ReproductionSetter getSetter(Object oldTypeInstance) throws MigrationException {

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.MosquitoReproduction) {

			return new MosquitoReproductionSetter(edu.pitt.apollo.types.v4_0.MosquitoReproduction.class, oldTypeInstance);
		}

		throw new UnsupportedTypeException("Type " + oldTypeInstance.getClass().getCanonicalName() + " is not supported");

	}


}

