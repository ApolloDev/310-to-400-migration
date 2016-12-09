package edu.pitt.apollo.apolloversionmigration.output;

public abstract class DecisionAlternativeSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0_1.DecisionAlternative> {

	public DecisionAlternativeSetter(Class<edu.pitt.apollo.types.v4_0_1.DecisionAlternative> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected abstract void setSingleMeasure() throws MigrationException;
	protected abstract void setCombinationMeasure() throws MigrationException;
	protected abstract void setSequentialCombinationMeasure() throws MigrationException;
	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			setSingleMeasure();
			setCombinationMeasure();
			setSequentialCombinationMeasure();
		}
	}

}