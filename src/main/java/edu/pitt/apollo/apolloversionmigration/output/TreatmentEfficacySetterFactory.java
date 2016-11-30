package edu.pitt.apollo.apolloversionmigration.output;

public class TreatmentEfficacySetterFactory {

	public static TreatmentEfficacySetter getSetter(Object oldTypeInstance) throws MigrationException {

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.DrugTreatmentEfficacyForSimulatorConfiguration) {

			return new DrugTreatmentEfficacyForSimulatorConfigurationSetter(edu.pitt.apollo.types.v4_0.DrugTreatmentEfficacyForSimulatorConfiguration.class, (edu.pitt.apollo.types.v3_1_0.DrugTreatmentEfficacyForSimulatorConfiguration) oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.VaccinationEfficacyForSimulatorConfiguration) {

			return new VaccinationEfficacyForSimulatorConfigurationSetter(edu.pitt.apollo.types.v4_0.VaccinationEfficacyForSimulatorConfiguration.class, (edu.pitt.apollo.types.v3_1_0.VaccinationEfficacyForSimulatorConfiguration) oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.VaccinationEfficacyMeasured) {

			return new VaccinationEfficacyMeasuredSetter(edu.pitt.apollo.types.v4_0.VaccinationEfficacyMeasured.class, (edu.pitt.apollo.types.v3_1_0.VaccinationEfficacyMeasured) oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.AntiviralTreatmentEfficacy) {

			return new AntiviralTreatmentEfficacySetter(edu.pitt.apollo.types.v4_0.AntiviralTreatmentEfficacy.class, (edu.pitt.apollo.types.v3_1_0.AntiviralTreatmentEfficacy) oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.VaccinationEfficacyInferred) {

			return new VaccinationEfficacyInferredSetter(edu.pitt.apollo.types.v4_0.VaccinationEfficacyInferred.class, (edu.pitt.apollo.types.v3_1_0.VaccinationEfficacyInferred) oldTypeInstance);
		}

		throw new UnsupportedTypeException("Type " + oldTypeInstance.getClass().getCanonicalName() + " is not supported");

	}


}

