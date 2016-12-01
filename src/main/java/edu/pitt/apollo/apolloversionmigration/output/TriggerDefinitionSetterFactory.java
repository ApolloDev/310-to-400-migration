package edu.pitt.apollo.apolloversionmigration.output;

public class TriggerDefinitionSetterFactory {

	public static TriggerDefinitionSetter getSetter(Object oldTypeInstance) throws MigrationException {

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.DiseaseSurveillanceTriggerDefinition) {

			return new DiseaseSurveillanceTriggerDefinitionSetter(edu.pitt.apollo.types.v4_0.DiseaseSurveillanceTriggerDefinition.class, oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.TreatmentSurveillanceTriggerDefinition) {

			return new TreatmentSurveillanceTriggerDefinitionSetter(edu.pitt.apollo.types.v4_0.TreatmentSurveillanceTriggerDefinition.class, oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.TemporalTriggerDefinition) {

			return new TemporalTriggerDefinitionSetter(edu.pitt.apollo.types.v4_0.TemporalTriggerDefinition.class, oldTypeInstance);
		}

		throw new UnsupportedTypeException("Type " + oldTypeInstance.getClass().getCanonicalName() + " is not supported");

	}


}

