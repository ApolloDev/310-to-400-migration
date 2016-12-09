package edu.pitt.apollo.apolloversionmigration.output;

public abstract class AgeRangeCategoryDefinitionSetter extends CategoryDefinitionSetter<edu.pitt.apollo.types.v4_0_1.AgeRangeCategoryDefinition> {

	public AgeRangeCategoryDefinitionSetter(Class<edu.pitt.apollo.types.v4_0_1.AgeRangeCategoryDefinition> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected abstract void setLabel() throws MigrationException;
	protected abstract void setUnitOfTimeForLowerBound() throws MigrationException;
	protected abstract void setLowerBound() throws MigrationException;
	protected abstract void setUnitOfTimeForUpperBound() throws MigrationException;
	protected abstract void setUpperBound() throws MigrationException;
	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
			setLabel();
			setUnitOfTimeForLowerBound();
			setLowerBound();
			setUnitOfTimeForUpperBound();
			setUpperBound();
		}
	}

}