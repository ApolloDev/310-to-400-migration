package edu.pitt.apollo.apolloversionmigration.output;

public class InfectiousDiseaseControlMeasureSetterFactory {

	public static InfectiousDiseaseControlMeasureSetter getSetter(Object oldTypeInstance) throws MigrationException {

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.ContactIsolationControlMeasure) {

			return new ContactIsolationControlMeasureSetter(edu.pitt.apollo.types.v4_0.ContactIsolationControlMeasure.class, (edu.pitt.apollo.types.v3_1_0.ContactIsolationControlMeasure) oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.IndividualTreatmentControlMeasure) {

			return IndividualTreatmentControlMeasureSetterFactory.getSetter(oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.TravelRestrictionControlMeasure) {

			return new TravelRestrictionControlMeasureSetter(edu.pitt.apollo.types.v4_0.TravelRestrictionControlMeasure.class, (edu.pitt.apollo.types.v3_1_0.TravelRestrictionControlMeasure) oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.BorderControlMeasure) {

			return new BorderControlMeasureSetter(edu.pitt.apollo.types.v4_0.BorderControlMeasure.class, (edu.pitt.apollo.types.v3_1_0.BorderControlMeasure) oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.PlaceClosureControlMeasure) {

			return new PlaceClosureControlMeasureSetter(edu.pitt.apollo.types.v4_0.PlaceClosureControlMeasure.class, (edu.pitt.apollo.types.v3_1_0.PlaceClosureControlMeasure) oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.VoluntaryHouseholdQuarantineControlMeasure) {

			return new VoluntaryHouseholdQuarantineControlMeasureSetter(edu.pitt.apollo.types.v4_0.VoluntaryHouseholdQuarantineControlMeasure.class, (edu.pitt.apollo.types.v3_1_0.VoluntaryHouseholdQuarantineControlMeasure) oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.CaseQuarantineControlMeasure) {

			return new CaseQuarantineControlMeasureSetter(edu.pitt.apollo.types.v4_0.CaseQuarantineControlMeasure.class, (edu.pitt.apollo.types.v3_1_0.CaseQuarantineControlMeasure) oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.LiberalSickLeaveControlMeasure) {

			return new LiberalSickLeaveControlMeasureSetter(edu.pitt.apollo.types.v4_0.LiberalSickLeaveControlMeasure.class, (edu.pitt.apollo.types.v3_1_0.LiberalSickLeaveControlMeasure) oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.VectorControlMeasure) {

			return VectorControlMeasureSetterFactory.getSetter(oldTypeInstance);
		}

		throw new UnsupportedTypeException("Type " + oldTypeInstance.getClass().getCanonicalName() + " is not supported");

	}


}

