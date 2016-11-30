package edu.pitt.apollo.apolloversionmigration.output;

public class ContainerReductionControlMeasureSetter extends VectorControlMeasureSetter<edu.pitt.apollo.types.v4_0.ContainerReductionControlMeasure,edu.pitt.apollo.types.v3_1_0.ContainerReductionControlMeasure> {

	public ContainerReductionControlMeasureSetter(Class<edu.pitt.apollo.types.v4_0.ContainerReductionControlMeasure> newTypeClass, edu.pitt.apollo.types.v3_1_0.ContainerReductionControlMeasure oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setCoverRadius() throws MigrationException {
		DistanceSetter setter = new DistanceSetter(edu.pitt.apollo.types.v4_0.Distance.class,oldTypeInstance.getCoverRadius());
		setter.set();
		newTypeInstance.setCoverRadius(setter.getNewTypeInstance());
	}

	private void setFractionReductionOfEggs() throws MigrationException {
		newTypeInstance.setFractionReductionOfEggs(oldTypeInstance.getFractionReductionOfEggs());
	}

	private void setFractionReductionOfLarvae() throws MigrationException {
		newTypeInstance.setFractionReductionOfLarvae(oldTypeInstance.getFractionReductionOfLarvae());
	}

	@Override
	public void set() throws MigrationException {
		super.set();
		setCoverRadius();
		setFractionReductionOfEggs();
		setFractionReductionOfLarvae();
	}

}