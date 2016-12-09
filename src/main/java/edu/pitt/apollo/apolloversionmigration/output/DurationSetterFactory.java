package edu.pitt.apollo.apolloversionmigration.output;

public class DurationSetterFactory {

	public static DurationSetter getSetter(Object oldTypeInstance) throws MigrationException {

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v3_1_0.FixedDuration) {

			return new FixedDurationSetter(edu.pitt.apollo.types.v4_0_1.FixedDuration.class, oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v3_1_0.UncertainDuration) {

			return new UncertainDurationSetter(edu.pitt.apollo.types.v4_0_1.UncertainDuration.class, oldTypeInstance);
		}

		throw new UnsupportedTypeException("Type " + oldTypeInstance.getClass().getCanonicalName() + " is not supported");

	}


}

