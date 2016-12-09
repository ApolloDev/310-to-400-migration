package edu.pitt.apollo.apolloversionmigration.output;

public class ControlMeasureTargetPopulationsAndPrioritizationSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0_1.ControlMeasureTargetPopulationsAndPrioritization> {

	public ControlMeasureTargetPopulationsAndPrioritizationSetter(Class<edu.pitt.apollo.types.v4_0_1.ControlMeasureTargetPopulationsAndPrioritization> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setControlMeasureNamedPrioritizationScheme() throws MigrationException {
		if (((edu.pitt.apollo.types.v3_1_0.ControlMeasureTargetPopulationsAndPrioritization) oldTypeInstance).getControlMeasureNamedPrioritizationScheme() != null) {
			newTypeInstance.setControlMeasureNamedPrioritizationScheme(edu.pitt.apollo.types.v4_0_1.NamedPrioritizationSchemeEnum.valueOf(((edu.pitt.apollo.types.v3_1_0.ControlMeasureTargetPopulationsAndPrioritization) oldTypeInstance).getControlMeasureNamedPrioritizationScheme().toString()));
		}
	}

	protected void setControlMeasureTargetPopulationsAndPrioritization() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.TargetPriorityPopulation oldObj : ((edu.pitt.apollo.types.v3_1_0.ControlMeasureTargetPopulationsAndPrioritization) oldTypeInstance).getControlMeasureTargetPopulationsAndPrioritization()) {
			TargetPriorityPopulationSetter setter = new TargetPriorityPopulationSetter(edu.pitt.apollo.types.v4_0_1.TargetPriorityPopulation.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0_1.TargetPriorityPopulation newObj = setter.getNewTypeInstance();
			newTypeInstance.getControlMeasureTargetPopulationsAndPrioritization().add(newObj);
		}

	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			setControlMeasureNamedPrioritizationScheme();
			setControlMeasureTargetPopulationsAndPrioritization();
		}
	}

}