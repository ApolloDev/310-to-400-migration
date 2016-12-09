package edu.pitt.apollo.apolloversionmigration.output;

public class IndoorResidualSprayingVectorControlMeasureSetter extends VectorControlMeasureSetter<edu.pitt.apollo.types.v4_0_1.IndoorResidualSprayingVectorControlMeasure> {

	public IndoorResidualSprayingVectorControlMeasureSetter(Class<edu.pitt.apollo.types.v4_0_1.IndoorResidualSprayingVectorControlMeasure> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setCoverRadius() throws MigrationException {
		DistanceSetter setter = new DistanceSetter(edu.pitt.apollo.types.v4_0_1.Distance.class,((edu.pitt.apollo.types.v3_1_0.IndoorResidualSprayingVectorControlMeasure) oldTypeInstance).getCoverRadius());
		setter.set();
		newTypeInstance.setCoverRadius(setter.getNewTypeInstance());
	}

	protected void setFractionOfVectorIndividualsAffected() throws MigrationException {
		newTypeInstance.setFractionOfVectorIndividualsAffected(((edu.pitt.apollo.types.v3_1_0.IndoorResidualSprayingVectorControlMeasure) oldTypeInstance).getFractionOfVectorIndividualsAffected());
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
			setCoverRadius();
			setFractionOfVectorIndividualsAffected();
		}
	}

}