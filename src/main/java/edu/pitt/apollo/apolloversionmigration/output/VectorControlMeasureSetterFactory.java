package edu.pitt.apollo.apolloversionmigration.output;

public class VectorControlMeasureSetterFactory {

	public static VectorControlMeasureSetter getSetter(Object oldTypeInstance) throws MigrationException {

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.InsecticideTreatedNetControlMeasure) {

			return new InsecticideTreatedNetControlMeasureSetter(edu.pitt.apollo.types.v4_0.InsecticideTreatedNetControlMeasure.class, oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.IndoorResidualSprayingVectorControlMeasure) {

			return new IndoorResidualSprayingVectorControlMeasureSetter(edu.pitt.apollo.types.v4_0.IndoorResidualSprayingVectorControlMeasure.class, oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.WolbachiaControlMeasure) {

			return new WolbachiaControlMeasureSetter(edu.pitt.apollo.types.v4_0.WolbachiaControlMeasure.class, oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.LarvicideControlMeasure) {

			return new LarvicideControlMeasureSetter(edu.pitt.apollo.types.v4_0.LarvicideControlMeasure.class, oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.ContainerReductionControlMeasure) {

			return new ContainerReductionControlMeasureSetter(edu.pitt.apollo.types.v4_0.ContainerReductionControlMeasure.class, oldTypeInstance);
		}

		throw new UnsupportedTypeException("Type " + oldTypeInstance.getClass().getCanonicalName() + " is not supported");

	}


}

