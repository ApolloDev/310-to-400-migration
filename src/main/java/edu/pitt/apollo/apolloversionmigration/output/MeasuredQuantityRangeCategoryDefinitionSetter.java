package edu.pitt.apollo.apolloversionmigration.output;

public abstract class MeasuredQuantityRangeCategoryDefinitionSetter extends CategoryDefinitionSetter<edu.pitt.apollo.types.v4_0.MeasuredQuantityRangeCategoryDefinition> {

	public MeasuredQuantityRangeCategoryDefinitionSetter(Class<edu.pitt.apollo.types.v4_0.MeasuredQuantityRangeCategoryDefinition> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected abstract void setUnitOfMeasure() throws MigrationException;
	protected abstract void setLowerBound() throws MigrationException;
	protected abstract void setUpperBound() throws MigrationException;
	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
			setUnitOfMeasure();
			setLowerBound();
			setUpperBound();
		}
	}

}