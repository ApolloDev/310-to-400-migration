package edu.pitt.apollo.apolloversionmigration.output;

public class ConditionalProbabilityTableSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0_1.ConditionalProbabilityTable> {

	public ConditionalProbabilityTableSetter(Class<edu.pitt.apollo.types.v4_0_1.ConditionalProbabilityTable> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setAxisDefinitions() throws MigrationException {
		ArrayDimensionsDefinitionSetter setter = new ArrayDimensionsDefinitionSetter(edu.pitt.apollo.types.v4_0_1.ArrayDimensionsDefinition.class,((edu.pitt.apollo.types.v3_1_0.ConditionalProbabilityTable) oldTypeInstance).getAxisDefinitions());
		setter.set();
		newTypeInstance.setAxisDefinitions(setter.getNewTypeInstance());
	}

	protected void setPointProbabilities() throws MigrationException {
		for (java.lang.Double oldObj : ((edu.pitt.apollo.types.v3_1_0.ConditionalProbabilityTable) oldTypeInstance).getPointProbabilities()) {
			newTypeInstance.getPointProbabilities().add(oldObj);
		}

	}

	protected void setParametricDistribution() throws MigrationException {
		for (java.lang.Double oldObj : ((edu.pitt.apollo.types.v3_1_0.ConditionalProbabilityTable) oldTypeInstance).getParametricDistribution()) {
			newTypeInstance.getParametricDistribution().add(oldObj);
		}

	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			setAxisDefinitions();
			setPointProbabilities();
			setParametricDistribution();
		}
	}

}