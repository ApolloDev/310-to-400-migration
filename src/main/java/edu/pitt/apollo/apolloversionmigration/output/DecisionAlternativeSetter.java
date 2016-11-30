package edu.pitt.apollo.apolloversionmigration.output;

public class DecisionAlternativeSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.DecisionAlternative,edu.pitt.apollo.types.v3_1_0.DecisionAlternative> {

	public DecisionAlternativeSetter(Class<edu.pitt.apollo.types.v4_0.DecisionAlternative> newTypeClass, edu.pitt.apollo.types.v3_1_0.DecisionAlternative oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setSingleMeasure() throws MigrationException {
		newTypeInstance.setSingleMeasure(oldTypeInstance.getSingleStrategy());
	}

	private void setCombinationMeasure() throws MigrationException {
		newTypeInstance.setCombinationMeasure(oldTypeInstance.getCombinationStrategy());
	}

	private void setSequentialCombinationMeasure() throws MigrationException {
		newTypeInstance.setSequentialCombinationMeasure(oldTypeInstance.getSequentialCombinationStrategy());
	}

	@Override
	public void set() throws MigrationException {
		setSingleMeasure();
		setCombinationMeasure();
		setSequentialCombinationMeasure();
	}

}