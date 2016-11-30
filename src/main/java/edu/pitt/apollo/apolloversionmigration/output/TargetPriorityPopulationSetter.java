package edu.pitt.apollo.apolloversionmigration.output;

public class TargetPriorityPopulationSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.TargetPriorityPopulation,edu.pitt.apollo.types.v3_1_0.TargetPriorityPopulation> {

	public TargetPriorityPopulationSetter(Class<edu.pitt.apollo.types.v4_0.TargetPriorityPopulation> newTypeClass, edu.pitt.apollo.types.v3_1_0.TargetPriorityPopulation oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setDescription() throws MigrationException {
		newTypeInstance.setDescription(oldTypeInstance.getDescription());
	}

	private void setTargetPopulationDefinition() throws MigrationException {
		TargetPopulationDefinitionSetter setter = new TargetPopulationDefinitionSetter(edu.pitt.apollo.types.v4_0.TargetPopulationDefinition.class,oldTypeInstance.getTargetPopulationDefinition());
		setter.set();
		newTypeInstance.setTargetPopulationDefinition(setter.getNewTypeInstance());
	}

	private void setTargetPopulationEnum() throws MigrationException {
		newTypeInstance.setTargetPopulationEnum(edu.pitt.apollo.types.v4_0.TargetPopulationEnum.fromValue(oldTypeInstance.getTargetPopulationEnum().toString()));
	}

	private void setFractionOfTargetPopulationToPrioritize() throws MigrationException {
		newTypeInstance.setFractionOfTargetPopulationToPrioritize(oldTypeInstance.getFractionOfTargetPopulationToPrioritize());
	}

	private void setPriority() throws MigrationException {
		newTypeInstance.setPriority(oldTypeInstance.getPriority());
	}

	@Override
	public void set() throws MigrationException {
		setDescription();
		setTargetPopulationDefinition();
		setTargetPopulationEnum();
		setFractionOfTargetPopulationToPrioritize();
		setPriority();
	}

}