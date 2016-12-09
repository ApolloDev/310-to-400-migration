package edu.pitt.apollo.apolloversionmigration.output;

public class VectorControlMeasureSetter<T extends edu.pitt.apollo.types.v4_0_1.VectorControlMeasure> extends InfectiousDiseaseControlMeasureSetter<T> {

	public VectorControlMeasureSetter(Class<T> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setVectorTaxonId() throws MigrationException {
		newTypeInstance.setVectorTaxonId(((edu.pitt.apollo.types.v3_1_0.VectorControlMeasure) oldTypeInstance).getVectorTaxonId());
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
			setVectorTaxonId();
		}
	}

	@Override
	public T getNewTypeInstance() {
		return newTypeInstance;
	}

}