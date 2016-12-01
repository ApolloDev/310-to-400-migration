package edu.pitt.apollo.apolloversionmigration.output;

public class BehaviorSetterFactory {

	public static BehaviorSetter getSetter(Object oldTypeInstance) throws MigrationException {

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.ReceivingDestinationAndProbability) {

			return new ReceivingDestinationAndProbabilitySetter(edu.pitt.apollo.types.v4_0.ReceivingDestinationAndProbability.class, oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.MosquitoBehavior) {

			return new MosquitoBehaviorSetter(edu.pitt.apollo.types.v4_0.MosquitoBehavior.class, oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.ConditionalIndividualBehavior) {

			return new ConditionalIndividualBehaviorSetter(edu.pitt.apollo.types.v4_0.ConditionalIndividualBehavior.class, oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.HumanBehavior) {

			return new HumanBehaviorSetter(edu.pitt.apollo.types.v4_0.HumanBehavior.class, oldTypeInstance);
		}

		throw new UnsupportedTypeException("Type " + oldTypeInstance.getClass().getCanonicalName() + " is not supported");

	}


}

