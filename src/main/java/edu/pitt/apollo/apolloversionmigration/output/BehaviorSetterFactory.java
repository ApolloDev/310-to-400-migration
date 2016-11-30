package edu.pitt.apollo.apolloversionmigration.output;

public class BehaviorSetterFactory {

	public static BehaviorSetter getSetter(Object oldTypeInstance) throws MigrationException {

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.ConditionalIndividualBehavior) {

			return new ConditionalIndividualBehaviorSetter(edu.pitt.apollo.types.v4_0.ConditionalIndividualBehavior.class, (edu.pitt.apollo.types.v3_1_0.ConditionalIndividualBehavior) oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.MosquitoBehavior) {

			return new MosquitoBehaviorSetter(edu.pitt.apollo.types.v4_0.MosquitoBehavior.class, (edu.pitt.apollo.types.v3_1_0.MosquitoBehavior) oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.ReceivingDestinationAndProbability) {

			return new ReceivingDestinationAndProbabilitySetter(edu.pitt.apollo.types.v4_0.ReceivingDestinationAndProbability.class, (edu.pitt.apollo.types.v3_1_0.ReceivingDestinationAndProbability) oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.HumanBehavior) {

			return new HumanBehaviorSetter(edu.pitt.apollo.types.v4_0.HumanBehavior.class, (edu.pitt.apollo.types.v3_1_0.HumanBehavior) oldTypeInstance);
		}

		throw new UnsupportedTypeException("Type " + oldTypeInstance.getClass().getCanonicalName() + " is not supported");

	}


}

