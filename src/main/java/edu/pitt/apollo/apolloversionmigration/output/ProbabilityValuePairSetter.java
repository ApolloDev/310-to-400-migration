package edu.pitt.apollo.apolloversionmigration.output;

public class ProbabilityValuePairSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0_1.ProbabilityValuePair> {

	public ProbabilityValuePairSetter(Class<edu.pitt.apollo.types.v4_0_1.ProbabilityValuePair> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setValue() throws MigrationException {
		newTypeInstance.setValue(((edu.pitt.apollo.types.v3_1_0.ProbabilityValuePair) oldTypeInstance).getValue());
	}

	protected void setProbability() throws MigrationException {
		newTypeInstance.setProbability(((edu.pitt.apollo.types.v3_1_0.ProbabilityValuePair) oldTypeInstance).getProbability());
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			setValue();
			setProbability();
		}
	}

}