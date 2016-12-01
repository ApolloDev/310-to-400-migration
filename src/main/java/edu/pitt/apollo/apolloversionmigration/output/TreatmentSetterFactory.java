package edu.pitt.apollo.apolloversionmigration.output;

public class TreatmentSetterFactory {

	public static TreatmentSetter getSetter(Object oldTypeInstance) throws MigrationException {

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.Vaccination) {

			return new VaccinationSetter(edu.pitt.apollo.types.v4_0.Vaccination.class, oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.IndividualDecolonization) {

			return new IndividualDecolonizationSetter(edu.pitt.apollo.types.v4_0.IndividualDecolonization.class, oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.AntiviralTreatment) {

			return new AntiviralTreatmentSetter(edu.pitt.apollo.types.v4_0.AntiviralTreatment.class, oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.DrugTreatment) {

			return new DrugTreatmentSetter(edu.pitt.apollo.types.v4_0.DrugTreatment.class, oldTypeInstance);
		}

		throw new UnsupportedTypeException("Type " + oldTypeInstance.getClass().getCanonicalName() + " is not supported");

	}


}

