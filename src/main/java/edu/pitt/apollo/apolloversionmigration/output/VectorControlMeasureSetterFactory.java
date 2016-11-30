package edu.pitt.apollo.apolloversionmigration.output;

public class VectorControlMeasureSetterFactory {

	public static VectorControlMeasureSetter getSetter(Object oldTypeInstance) throws MigrationException {

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.InsecticideTreatedNetControlMeasure) {

			return new InsecticideTreatedNetControlMeasureSetter(edu.pitt.apollo.types.v4_0.InsecticideTreatedNetControlMeasure.class, (edu.pitt.apollo.types.v3_1_0.InsecticideTreatedNetControlMeasure) oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.LarvicideControlMeasure) {

			return new LarvicideControlMeasureSetter(edu.pitt.apollo.types.v4_0.LarvicideControlMeasure.class, (edu.pitt.apollo.types.v3_1_0.LarvicideControlMeasure) oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.ContainerReductionControlMeasure) {

			return new ContainerReductionControlMeasureSetter(edu.pitt.apollo.types.v4_0.ContainerReductionControlMeasure.class, (edu.pitt.apollo.types.v3_1_0.ContainerReductionControlMeasure) oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.WolbachiaControlMeasure) {

			return new WolbachiaControlMeasureSetter(edu.pitt.apollo.types.v4_0.WolbachiaControlMeasure.class, (edu.pitt.apollo.types.v3_1_0.WolbachiaControlMeasure) oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.IndoorResidualSprayingVectorControlMeasure) {

			return new IndoorResidualSprayingVectorControlMeasureSetter(edu.pitt.apollo.types.v4_0.IndoorResidualSprayingVectorControlMeasure.class, (edu.pitt.apollo.types.v3_1_0.IndoorResidualSprayingVectorControlMeasure) oldTypeInstance);
		}

		throw new UnsupportedTypeException("Type " + oldTypeInstance.getClass().getCanonicalName() + " is not supported");

	}


}

