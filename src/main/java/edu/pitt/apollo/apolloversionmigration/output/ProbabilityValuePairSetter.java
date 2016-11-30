package edu.pitt.apollo.apolloversionmigration.output;

public class ProbabilityValuePairSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.ProbabilityValuePair,edu.pitt.apollo.types.v3_1_0.ProbabilityValuePair> {

	public ProbabilityValuePairSetter(Class<edu.pitt.apollo.types.v4_0.ProbabilityValuePair> newTypeClass, edu.pitt.apollo.types.v3_1_0.ProbabilityValuePair oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setValue() throws MigrationException {
		newTypeInstance.setValue(oldTypeInstance.getValue());
	}

	private void setProbability() throws MigrationException {
		newTypeInstance.setProbability(oldTypeInstance.getProbability());
	}

	@Override
	public void set() throws MigrationException {
		setValue();
		setProbability();
	}

}