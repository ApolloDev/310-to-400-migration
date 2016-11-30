package edu.pitt.apollo.apolloversionmigration.output;

public class BaseCaseResultSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.BaseCaseResult,edu.pitt.apollo.types.v3_1_0.BaseCaseResult> {

	public BaseCaseResultSetter(Class<edu.pitt.apollo.types.v4_0.BaseCaseResult> newTypeClass, edu.pitt.apollo.types.v3_1_0.BaseCaseResult oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setDecisionAlternatives() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.DecisionAlternative oldObj : oldTypeInstance.getDecisionAlternatives()) {
			DecisionAlternativeSetter setter = new DecisionAlternativeSetter(edu.pitt.apollo.types.v4_0.DecisionAlternative.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.DecisionAlternative newObj = setter.getNewTypeInstance();
			newTypeInstance.getDecisionAlternatives().add(newObj);
		}

	}

	private void setExpectedUtilities() throws MigrationException {
		for (java.lang.Double oldObj : oldTypeInstance.getExpectedUtilities()) {
			newTypeInstance.getExpectedUtilities().add(oldObj);
		}

	}

	@Override
	public void set() throws MigrationException {
		setDecisionAlternatives();
		setExpectedUtilities();
	}

}