package edu.pitt.apollo.apolloversionmigration.output;

public class ControlMeasureTargetPopulationsAndPrioritizationSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.ControlMeasureTargetPopulationsAndPrioritization,edu.pitt.apollo.types.v3_1_0.ControlMeasureTargetPopulationsAndPrioritization> {

	public ControlMeasureTargetPopulationsAndPrioritizationSetter(Class<edu.pitt.apollo.types.v4_0.ControlMeasureTargetPopulationsAndPrioritization> newTypeClass, edu.pitt.apollo.types.v3_1_0.ControlMeasureTargetPopulationsAndPrioritization oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setControlMeasureNamedPrioritizationScheme() throws MigrationException {
		newTypeInstance.setControlMeasureNamedPrioritizationScheme(edu.pitt.apollo.types.v4_0.NamedPrioritizationSchemeEnum.fromValue(oldTypeInstance.getControlMeasureNamedPrioritizationScheme().toString()));
	}

	private void setControlMeasureTargetPopulationsAndPrioritization() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.TargetPriorityPopulation oldObj : oldTypeInstance.getControlMeasureTargetPopulationsAndPrioritization()) {
			TargetPriorityPopulationSetter setter = new TargetPriorityPopulationSetter(edu.pitt.apollo.types.v4_0.TargetPriorityPopulation.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.TargetPriorityPopulation newObj = setter.getNewTypeInstance();
			newTypeInstance.getControlMeasureTargetPopulationsAndPrioritization().add(newObj);
		}

	}

	@Override
	public void set() throws MigrationException {
		setControlMeasureNamedPrioritizationScheme();
		setControlMeasureTargetPopulationsAndPrioritization();
	}

}