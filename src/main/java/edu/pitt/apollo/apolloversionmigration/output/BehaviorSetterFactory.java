package edu.pitt.apollo.apolloversionmigration.output;

public class BehaviorSetterFactory {

	public static BehaviorSetter getSetter(Object oldTypeInstance) throws MigrationException {

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v3_1_0.MosquitoBehavior) {

			return new MosquitoBehaviorSetter(edu.pitt.apollo.types.v4_0_1.MosquitoBehavior.class, oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v3_1_0.ConditionalIndividualBehavior) {

			return new ConditionalIndividualBehaviorSetter(edu.pitt.apollo.types.v4_0_1.ConditionalIndividualBehavior.class, oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v3_1_0.HumanBehavior) {

			return new HumanBehaviorSetter(edu.pitt.apollo.types.v4_0_1.HumanBehavior.class, oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v3_1_0.ReceivingDestinationAndProbability) {

			return new ReceivingDestinationAndProbabilitySetter(edu.pitt.apollo.types.v4_0_1.ReceivingDestinationAndProbability.class, oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v3_1_0.Behavior) {

			return new BehaviorSetter(edu.pitt.apollo.types.v4_0_1.Behavior.class, oldTypeInstance);
		}

		throw new UnsupportedTypeException("Type " + oldTypeInstance.getClass().getCanonicalName() + " is not supported");

	}


}

