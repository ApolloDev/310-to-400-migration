package edu.pitt.apollo.apolloversionmigration.output;

public class VectorControlMeasureSetter<T extends edu.pitt.apollo.types.v4_0.VectorControlMeasure, O extends edu.pitt.apollo.types.v3_1_0.VectorControlMeasure> extends InfectiousDiseaseControlMeasureSetter<T,O> {

	public VectorControlMeasureSetter(Class<T> newTypeClass, O oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setVectorTaxonId() throws MigrationException {
		newTypeInstance.setVectorTaxonId(oldTypeInstance.getVectorTaxonId());
	}

	@Override
	public void set() throws MigrationException {
		super.set();
		setVectorTaxonId();
	}

	@Override
	public T getNewTypeInstance() {
		return newTypeInstance;
	}

}