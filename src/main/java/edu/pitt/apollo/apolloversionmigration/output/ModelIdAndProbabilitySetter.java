package edu.pitt.apollo.apolloversionmigration.output;

public class ModelIdAndProbabilitySetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.ModelIdAndProbability,edu.pitt.apollo.types.v3_1_0.ModelIdAndProbability> {

	public ModelIdAndProbabilitySetter(Class<edu.pitt.apollo.types.v4_0.ModelIdAndProbability> newTypeClass, edu.pitt.apollo.types.v3_1_0.ModelIdAndProbability oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setModelId() throws MigrationException {
		newTypeInstance.setModelId(oldTypeInstance.getModelId());
	}

	private void setProbability() throws MigrationException {
		newTypeInstance.setProbability(oldTypeInstance.getProbability());
	}

	@Override
	public void set() throws MigrationException {
		setModelId();
		setProbability();
	}

}