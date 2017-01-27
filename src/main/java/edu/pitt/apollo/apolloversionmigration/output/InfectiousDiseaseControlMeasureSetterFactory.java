package edu.pitt.apollo.apolloversionmigration.output;

public class InfectiousDiseaseControlMeasureSetterFactory {

	public static InfectiousDiseaseControlMeasureSetter getSetter(Object oldTypeInstance) throws MigrationException {

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v3_1_0.TravelRestrictionControlMeasure) {

			return new TravelRestrictionControlMeasureSetter(edu.pitt.apollo.types.v4_0_1.TravelRestrictionControlMeasure.class, oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v3_1_0.ContactIsolationControlMeasure) {

			return new ContactIsolationControlMeasureSetter(edu.pitt.apollo.types.v4_0_1.ContactIsolationControlMeasure.class, oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v3_1_0.BorderControlMeasure) {

			return new BorderControlMeasureSetter(edu.pitt.apollo.types.v4_0_1.BorderControlMeasure.class, oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v3_1_0.PlaceClosureControlMeasure) {

			return new PlaceClosureControlMeasureSetter(edu.pitt.apollo.types.v4_0_1.PlaceClosureControlMeasure.class, oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v3_1_0.CaseQuarantineControlMeasure) {

			return new CaseQuarantineControlMeasureSetter(edu.pitt.apollo.types.v4_0_1.CaseQuarantineControlMeasure.class, oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v3_1_0.LiberalSickLeaveControlMeasure) {

			return new LiberalSickLeaveControlMeasureSetter(edu.pitt.apollo.types.v4_0_1.LiberalSickLeaveControlMeasure.class, oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v3_1_0.VectorControlMeasure) {

			return VectorControlMeasureSetterFactory.getSetter(oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v3_1_0.VoluntaryHouseholdQuarantineControlMeasure) {

			return new VoluntaryHouseholdQuarantineControlMeasureSetter(edu.pitt.apollo.types.v4_0_1.VoluntaryHouseholdQuarantineControlMeasure.class, oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v3_1_0.IndividualTreatmentControlMeasure) {

			return IndividualTreatmentControlMeasureSetterFactory.getSetter(oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v3_1_0.InfectiousDiseaseControlMeasure) {

			return new InfectiousDiseaseControlMeasureSetter(edu.pitt.apollo.types.v4_0_1.InfectiousDiseaseControlMeasure.class, oldTypeInstance);
		}

		throw new UnsupportedTypeException("Type " + oldTypeInstance.getClass().getCanonicalName() + " is not supported");

	}


}

