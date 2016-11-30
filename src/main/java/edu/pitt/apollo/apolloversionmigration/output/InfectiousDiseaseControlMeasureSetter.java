package edu.pitt.apollo.apolloversionmigration.output;

public class InfectiousDiseaseControlMeasureSetter<T extends edu.pitt.apollo.types.v4_0.InfectiousDiseaseControlMeasure, O extends edu.pitt.apollo.types.v3_1_0.InfectiousDiseaseControlMeasure> extends ApolloIndexableItemSetter<T,O> {

	public InfectiousDiseaseControlMeasureSetter(Class<T> newTypeClass, O oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setDescription() throws MigrationException {
		newTypeInstance.setDescription(oldTypeInstance.getDescription());
	}

	private void setLocation() throws MigrationException {
		LocationSetter setter = new LocationSetter(edu.pitt.apollo.types.v4_0.Location.class,oldTypeInstance.getLocation());
		setter.set();
		newTypeInstance.setLocation(setter.getNewTypeInstance());
	}

	private void setControlMeasureStartTime() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.TriggerDefinition oldObj : oldTypeInstance.getControlMeasureStartTime()) {
			TriggerDefinitionSetter setter = new TriggerDefinitionSetter(edu.pitt.apollo.types.v4_0.TriggerDefinition.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.TriggerDefinition newObj = setter.getNewTypeInstance();
			newTypeInstance.getControlMeasureStartTime().add(newObj);
		}

	}

	private void setControlMeasureStopTime() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.TriggerDefinition oldObj : oldTypeInstance.getControlMeasureStopTime()) {
			TriggerDefinitionSetter setter = new TriggerDefinitionSetter(edu.pitt.apollo.types.v4_0.TriggerDefinition.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.TriggerDefinition newObj = setter.getNewTypeInstance();
			newTypeInstance.getControlMeasureStopTime().add(newObj);
		}

	}

	private void setControlMeasureResponseDelay() throws MigrationException {
		DurationSetter setter = DurationSetterFactory.getSetter(oldTypeInstance.getControlMeasureResponseDelay());
		setter.set();
		newTypeInstance.setControlMeasureResponseDelay(setter.getNewTypeInstance());
	}

	private void setControlMeasureStandDownDelay() throws MigrationException {
		DurationSetter setter = DurationSetterFactory.getSetter(oldTypeInstance.getControlMeasureStandDownDelay());
		setter.set();
		newTypeInstance.setControlMeasureStandDownDelay(setter.getNewTypeInstance());
	}

	private void setLogisticalSystems() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.LogisticalSystem oldObj : oldTypeInstance.getLogisticalSystems()) {
			LogisticalSystemSetter setter = new LogisticalSystemSetter(edu.pitt.apollo.types.v4_0.LogisticalSystem.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.LogisticalSystem newObj = setter.getNewTypeInstance();
			newTypeInstance.getLogisticalSystems().add(newObj);
		}

	}

	private void setReferenceId() throws MigrationException {
		newTypeInstance.setReferenceId(oldTypeInstance.getReferenceId());
	}

	private void setTemplatedInfectiousDiseaseControlMeasureUrlsForSoftware() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.TemplatedInfectiousDiseaseControlMeasureUrlForSoftware oldObj : oldTypeInstance.getTemplatedInfectiousDiseaseControlMeasureUrlsForSoftware()) {
			TemplatedInfectiousDiseaseControlMeasureUrlForSoftwareSetter setter = new TemplatedInfectiousDiseaseControlMeasureUrlForSoftwareSetter(edu.pitt.apollo.types.v4_0.TemplatedInfectiousDiseaseControlMeasureUrlForSoftware.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.TemplatedInfectiousDiseaseControlMeasureUrlForSoftware newObj = setter.getNewTypeInstance();
			newTypeInstance.getTemplatedInfectiousDiseaseControlMeasureUrlsForSoftware().add(newObj);
		}

	}

	@Override
	public void set() throws MigrationException {
		super.set();
		setDescription();
		setLocation();
		setControlMeasureStartTime();
		setControlMeasureStopTime();
		setControlMeasureResponseDelay();
		setControlMeasureStandDownDelay();
		setLogisticalSystems();
		setReferenceId();
		setTemplatedInfectiousDiseaseControlMeasureUrlsForSoftware();
	}

	@Override
	public T getNewTypeInstance() {
		return newTypeInstance;
	}

}