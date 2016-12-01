package edu.pitt.apollo.apolloversionmigration.output;

public class ModelIdAndProbabilitySetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.ModelIdAndProbability> {

	public ModelIdAndProbabilitySetter(Class<edu.pitt.apollo.types.v4_0.ModelIdAndProbability> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setModelId() throws MigrationException {
		newTypeInstance.setModelId(((edu.pitt.apollo.types.v3_1_0.ModelIdAndProbability) oldTypeInstance).getModelId());
	}

	protected void setProbability() throws MigrationException {
		newTypeInstance.setProbability(((edu.pitt.apollo.types.v3_1_0.ModelIdAndProbability) oldTypeInstance).getProbability());
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			setModelId();
			setProbability();
		}
	}

}