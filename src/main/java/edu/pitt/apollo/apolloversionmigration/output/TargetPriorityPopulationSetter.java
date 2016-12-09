package edu.pitt.apollo.apolloversionmigration.output;

public class TargetPriorityPopulationSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0_1.TargetPriorityPopulation> {

	public TargetPriorityPopulationSetter(Class<edu.pitt.apollo.types.v4_0_1.TargetPriorityPopulation> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setDescription() throws MigrationException {
		newTypeInstance.setDescription(((edu.pitt.apollo.types.v3_1_0.TargetPriorityPopulation) oldTypeInstance).getDescription());
	}

	protected void setTargetPopulationDefinition() throws MigrationException {
		TargetPopulationDefinitionSetter setter = new TargetPopulationDefinitionSetter(edu.pitt.apollo.types.v4_0_1.TargetPopulationDefinition.class,((edu.pitt.apollo.types.v3_1_0.TargetPriorityPopulation) oldTypeInstance).getTargetPopulationDefinition());
		setter.set();
		newTypeInstance.setTargetPopulationDefinition(setter.getNewTypeInstance());
	}

	protected void setTargetPopulationEnum() throws MigrationException {
		if (((edu.pitt.apollo.types.v3_1_0.TargetPriorityPopulation) oldTypeInstance).getTargetPopulationEnum() != null) {
			newTypeInstance.setTargetPopulationEnum(edu.pitt.apollo.types.v4_0_1.TargetPopulationEnum.valueOf(((edu.pitt.apollo.types.v3_1_0.TargetPriorityPopulation) oldTypeInstance).getTargetPopulationEnum().toString()));
		}
	}

	protected void setFractionOfTargetPopulationToPrioritize() throws MigrationException {
		newTypeInstance.setFractionOfTargetPopulationToPrioritize(((edu.pitt.apollo.types.v3_1_0.TargetPriorityPopulation) oldTypeInstance).getFractionOfTargetPopulationToPrioritize());
	}

	protected void setPriority() throws MigrationException {
		newTypeInstance.setPriority(((edu.pitt.apollo.types.v3_1_0.TargetPriorityPopulation) oldTypeInstance).getPriority());
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			setDescription();
			setTargetPopulationDefinition();
			setTargetPopulationEnum();
			setFractionOfTargetPopulationToPrioritize();
			setPriority();
		}
	}

}