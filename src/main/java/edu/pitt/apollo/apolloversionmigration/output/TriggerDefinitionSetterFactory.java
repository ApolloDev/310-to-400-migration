package edu.pitt.apollo.apolloversionmigration.output;

public class TriggerDefinitionSetterFactory {

	public static TriggerDefinitionSetter getSetter(Object oldTypeInstance) throws MigrationException {

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.TemporalTriggerDefinition) {

			return new TemporalTriggerDefinitionSetter(edu.pitt.apollo.types.v4_0.TemporalTriggerDefinition.class, (edu.pitt.apollo.types.v3_1_0.TemporalTriggerDefinition) oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.DiseaseSurveillanceTriggerDefinition) {

			return new DiseaseSurveillanceTriggerDefinitionSetter(edu.pitt.apollo.types.v4_0.DiseaseSurveillanceTriggerDefinition.class, (edu.pitt.apollo.types.v3_1_0.DiseaseSurveillanceTriggerDefinition) oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.TreatmentSurveillanceTriggerDefinition) {

			return new TreatmentSurveillanceTriggerDefinitionSetter(edu.pitt.apollo.types.v4_0.TreatmentSurveillanceTriggerDefinition.class, (edu.pitt.apollo.types.v3_1_0.TreatmentSurveillanceTriggerDefinition) oldTypeInstance);
		}

		throw new UnsupportedTypeException("Type " + oldTypeInstance.getClass().getCanonicalName() + " is not supported");

	}


}

