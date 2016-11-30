package edu.pitt.apollo.apolloversionmigration.output;

public class ConditionalProbabilityTableSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.ConditionalProbabilityTable,edu.pitt.apollo.types.v3_1_0.ConditionalProbabilityTable> {

	public ConditionalProbabilityTableSetter(Class<edu.pitt.apollo.types.v4_0.ConditionalProbabilityTable> newTypeClass, edu.pitt.apollo.types.v3_1_0.ConditionalProbabilityTable oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setAxisDefinitions() throws MigrationException {
		ArrayDimensionsDefinitionSetter setter = new ArrayDimensionsDefinitionSetter(edu.pitt.apollo.types.v4_0.ArrayDimensionsDefinition.class,oldTypeInstance.getAxisDefinitions());
		setter.set();
		newTypeInstance.setAxisDefinitions(setter.getNewTypeInstance());
	}

	private void setPointProbabilities() throws MigrationException {
		for (java.lang.Double oldObj : oldTypeInstance.getPointProbabilities()) {
			newTypeInstance.getPointProbabilities().add(oldObj);
		}

	}

	private void setParametricDistribution() throws MigrationException {
		for (java.lang.Double oldObj : oldTypeInstance.getParametricDistribution()) {
			newTypeInstance.getParametricDistribution().add(oldObj);
		}

	}

	@Override
	public void set() throws MigrationException {
		setAxisDefinitions();
		setPointProbabilities();
		setParametricDistribution();
	}

}