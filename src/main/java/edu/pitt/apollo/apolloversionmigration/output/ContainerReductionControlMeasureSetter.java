package edu.pitt.apollo.apolloversionmigration.output;

public class ContainerReductionControlMeasureSetter extends VectorControlMeasureSetter<edu.pitt.apollo.types.v4_0.ContainerReductionControlMeasure> {

	public ContainerReductionControlMeasureSetter(Class<edu.pitt.apollo.types.v4_0.ContainerReductionControlMeasure> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setCoverRadius() throws MigrationException {
		DistanceSetter setter = new DistanceSetter(edu.pitt.apollo.types.v4_0.Distance.class,((edu.pitt.apollo.types.v3_1_0.ContainerReductionControlMeasure) oldTypeInstance).getCoverRadius());
		setter.set();
		newTypeInstance.setCoverRadius(setter.getNewTypeInstance());
	}

	protected void setFractionReductionOfEggs() throws MigrationException {
		newTypeInstance.setFractionReductionOfEggs(((edu.pitt.apollo.types.v3_1_0.ContainerReductionControlMeasure) oldTypeInstance).getFractionReductionOfEggs());
	}

	protected void setFractionReductionOfLarvae() throws MigrationException {
		newTypeInstance.setFractionReductionOfLarvae(((edu.pitt.apollo.types.v3_1_0.ContainerReductionControlMeasure) oldTypeInstance).getFractionReductionOfLarvae());
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
			setCoverRadius();
			setFractionReductionOfEggs();
			setFractionReductionOfLarvae();
		}
	}

}