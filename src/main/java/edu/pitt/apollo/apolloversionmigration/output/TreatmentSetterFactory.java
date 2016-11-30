package edu.pitt.apollo.apolloversionmigration.output;

public class TreatmentSetterFactory {

	public static TreatmentSetter getSetter(Object oldTypeInstance) throws MigrationException {

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.Vaccination) {

			return new VaccinationSetter(edu.pitt.apollo.types.v4_0.Vaccination.class, (edu.pitt.apollo.types.v3_1_0.Vaccination) oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.AntiviralTreatment) {

			return new AntiviralTreatmentSetter(edu.pitt.apollo.types.v4_0.AntiviralTreatment.class, (edu.pitt.apollo.types.v3_1_0.AntiviralTreatment) oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.IndividualDecolonization) {

			return new IndividualDecolonizationSetter(edu.pitt.apollo.types.v4_0.IndividualDecolonization.class, (edu.pitt.apollo.types.v3_1_0.IndividualDecolonization) oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.DrugTreatment) {

			return new DrugTreatmentSetter(edu.pitt.apollo.types.v4_0.DrugTreatment.class, (edu.pitt.apollo.types.v3_1_0.DrugTreatment) oldTypeInstance);
		}

		throw new UnsupportedTypeException("Type " + oldTypeInstance.getClass().getCanonicalName() + " is not supported");

	}


}

