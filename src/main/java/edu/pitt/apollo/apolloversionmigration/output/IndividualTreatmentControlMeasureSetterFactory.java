package edu.pitt.apollo.apolloversionmigration.output;

public class IndividualTreatmentControlMeasureSetterFactory {

	public static IndividualTreatmentControlMeasureSetter getSetter(Object oldTypeInstance) throws MigrationException {

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.RingIndividualTreatmentControlMeasure) {

			return new RingIndividualTreatmentControlMeasureSetter(edu.pitt.apollo.types.v4_0.RingIndividualTreatmentControlMeasure.class, (edu.pitt.apollo.types.v3_1_0.RingIndividualTreatmentControlMeasure) oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.DecolonizationControlMeasure) {

			return new DecolonizationControlMeasureSetter(edu.pitt.apollo.types.v4_0.DecolonizationControlMeasure.class, (edu.pitt.apollo.types.v3_1_0.DecolonizationControlMeasure) oldTypeInstance);
		}

		throw new UnsupportedTypeException("Type " + oldTypeInstance.getClass().getCanonicalName() + " is not supported");

	}


}

