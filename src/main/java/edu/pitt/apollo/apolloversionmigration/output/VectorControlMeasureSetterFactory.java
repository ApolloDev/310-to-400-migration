package edu.pitt.apollo.apolloversionmigration.output;

public class VectorControlMeasureSetterFactory {

	public static VectorControlMeasureSetter getSetter(Object oldTypeInstance) throws MigrationException {

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v3_1_0.IndoorResidualSprayingVectorControlMeasure) {

			return new IndoorResidualSprayingVectorControlMeasureSetter(edu.pitt.apollo.types.v4_0_1.IndoorResidualSprayingVectorControlMeasure.class, oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v3_1_0.InsecticideTreatedNetControlMeasure) {

			return new InsecticideTreatedNetControlMeasureSetter(edu.pitt.apollo.types.v4_0_1.InsecticideTreatedNetControlMeasure.class, oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v3_1_0.WolbachiaControlMeasure) {

			return new WolbachiaControlMeasureSetter(edu.pitt.apollo.types.v4_0_1.WolbachiaControlMeasure.class, oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v3_1_0.LarvicideControlMeasure) {

			return new LarvicideControlMeasureSetter(edu.pitt.apollo.types.v4_0_1.LarvicideControlMeasure.class, oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v3_1_0.ContainerReductionControlMeasure) {

			return new ContainerReductionControlMeasureSetter(edu.pitt.apollo.types.v4_0_1.ContainerReductionControlMeasure.class, oldTypeInstance);
		}

		throw new UnsupportedTypeException("Type " + oldTypeInstance.getClass().getCanonicalName() + " is not supported");

	}


}

