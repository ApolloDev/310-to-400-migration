package edu.pitt.apollo.apolloversionmigration.output;

public class IndoorResidualSprayingVectorControlMeasureSetter extends VectorControlMeasureSetter<edu.pitt.apollo.types.v4_0.IndoorResidualSprayingVectorControlMeasure,edu.pitt.apollo.types.v3_1_0.IndoorResidualSprayingVectorControlMeasure> {

	public IndoorResidualSprayingVectorControlMeasureSetter(Class<edu.pitt.apollo.types.v4_0.IndoorResidualSprayingVectorControlMeasure> newTypeClass, edu.pitt.apollo.types.v3_1_0.IndoorResidualSprayingVectorControlMeasure oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setCoverRadius() throws MigrationException {
		DistanceSetter setter = new DistanceSetter(edu.pitt.apollo.types.v4_0.Distance.class,oldTypeInstance.getCoverRadius());
		setter.set();
		newTypeInstance.setCoverRadius(setter.getNewTypeInstance());
	}

	private void setFractionOfVectorIndividualsAffected() throws MigrationException {
		newTypeInstance.setFractionOfVectorIndividualsAffected(oldTypeInstance.getFractionOfVectorIndividualsAffected());
	}

	@Override
	public void set() throws MigrationException {
		super.set();
		setCoverRadius();
		setFractionOfVectorIndividualsAffected();
	}

}