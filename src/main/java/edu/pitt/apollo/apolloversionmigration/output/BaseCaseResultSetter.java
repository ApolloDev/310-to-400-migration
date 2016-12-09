package edu.pitt.apollo.apolloversionmigration.output;

public class BaseCaseResultSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0_1.BaseCaseResult> {

	public BaseCaseResultSetter(Class<edu.pitt.apollo.types.v4_0_1.BaseCaseResult> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setDecisionAlternatives() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.DecisionAlternative oldObj : ((edu.pitt.apollo.types.v3_1_0.BaseCaseResult) oldTypeInstance).getDecisionAlternatives()) {
			DecisionAlternativeSetter setter = new DecisionAlternativeSetterImpl(edu.pitt.apollo.types.v4_0_1.DecisionAlternative.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0_1.DecisionAlternative newObj = setter.getNewTypeInstance();
			newTypeInstance.getDecisionAlternatives().add(newObj);
		}

	}

	protected void setExpectedUtilities() throws MigrationException {
		for (java.lang.Double oldObj : ((edu.pitt.apollo.types.v3_1_0.BaseCaseResult) oldTypeInstance).getExpectedUtilities()) {
			newTypeInstance.getExpectedUtilities().add(oldObj);
		}

	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			setDecisionAlternatives();
			setExpectedUtilities();
		}
	}

}