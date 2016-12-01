package edu.pitt.apollo.apolloversionmigration.output;

public class InfectiousDiseaseControlMeasureSetter<T extends edu.pitt.apollo.types.v4_0.InfectiousDiseaseControlMeasure> extends ApolloIndexableItemSetter<T> {

	public InfectiousDiseaseControlMeasureSetter(Class<T> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setDescription() throws MigrationException {
		newTypeInstance.setDescription(((edu.pitt.apollo.types.v3_1_0.InfectiousDiseaseControlMeasure) oldTypeInstance).getDescription());
	}

	protected void setLocation() throws MigrationException {
		LocationSetter setter = new LocationSetter(edu.pitt.apollo.types.v4_0.Location.class,((edu.pitt.apollo.types.v3_1_0.InfectiousDiseaseControlMeasure) oldTypeInstance).getLocation());
		setter.set();
		newTypeInstance.setLocation(setter.getNewTypeInstance());
	}

	protected void setControlMeasureStartTime() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.TriggerDefinition oldObj : ((edu.pitt.apollo.types.v3_1_0.InfectiousDiseaseControlMeasure) oldTypeInstance).getControlMeasureStartTime()) {
			TriggerDefinitionSetter setter = new TriggerDefinitionSetter(edu.pitt.apollo.types.v4_0.TriggerDefinition.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.TriggerDefinition newObj = setter.getNewTypeInstance();
			newTypeInstance.getControlMeasureStartTime().add(newObj);
		}

	}

	protected void setControlMeasureStopTime() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.TriggerDefinition oldObj : ((edu.pitt.apollo.types.v3_1_0.InfectiousDiseaseControlMeasure) oldTypeInstance).getControlMeasureStopTime()) {
			TriggerDefinitionSetter setter = new TriggerDefinitionSetter(edu.pitt.apollo.types.v4_0.TriggerDefinition.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.TriggerDefinition newObj = setter.getNewTypeInstance();
			newTypeInstance.getControlMeasureStopTime().add(newObj);
		}

	}

	protected void setControlMeasureResponseDelay() throws MigrationException {
		if (((edu.pitt.apollo.types.v3_1_0.InfectiousDiseaseControlMeasure) oldTypeInstance).getControlMeasureResponseDelay() != null) {
			DurationSetter setter = DurationSetterFactory.getSetter(((edu.pitt.apollo.types.v3_1_0.InfectiousDiseaseControlMeasure) oldTypeInstance).getControlMeasureResponseDelay());
			setter.set();
			newTypeInstance.setControlMeasureResponseDelay(setter.getNewTypeInstance());
		}

	}

	protected void setControlMeasureStandDownDelay() throws MigrationException {
		if (((edu.pitt.apollo.types.v3_1_0.InfectiousDiseaseControlMeasure) oldTypeInstance).getControlMeasureStandDownDelay() != null) {
			DurationSetter setter = DurationSetterFactory.getSetter(((edu.pitt.apollo.types.v3_1_0.InfectiousDiseaseControlMeasure) oldTypeInstance).getControlMeasureStandDownDelay());
			setter.set();
			newTypeInstance.setControlMeasureStandDownDelay(setter.getNewTypeInstance());
		}

	}

	protected void setLogisticalSystems() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.LogisticalSystem oldObj : ((edu.pitt.apollo.types.v3_1_0.InfectiousDiseaseControlMeasure) oldTypeInstance).getLogisticalSystems()) {
			LogisticalSystemSetter setter = new LogisticalSystemSetter(edu.pitt.apollo.types.v4_0.LogisticalSystem.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.LogisticalSystem newObj = setter.getNewTypeInstance();
			newTypeInstance.getLogisticalSystems().add(newObj);
		}

	}

	protected void setReferenceId() throws MigrationException {
		newTypeInstance.setReferenceId(((edu.pitt.apollo.types.v3_1_0.InfectiousDiseaseControlMeasure) oldTypeInstance).getReferenceId());
	}

	protected void setTemplatedInfectiousDiseaseControlMeasureUrlsForSoftware() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.TemplatedInfectiousDiseaseControlMeasureUrlForSoftware oldObj : ((edu.pitt.apollo.types.v3_1_0.InfectiousDiseaseControlMeasure) oldTypeInstance).getTemplatedInfectiousDiseaseControlMeasureUrlsForSoftware()) {
			TemplatedInfectiousDiseaseControlMeasureUrlForSoftwareSetter setter = new TemplatedInfectiousDiseaseControlMeasureUrlForSoftwareSetter(edu.pitt.apollo.types.v4_0.TemplatedInfectiousDiseaseControlMeasureUrlForSoftware.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.TemplatedInfectiousDiseaseControlMeasureUrlForSoftware newObj = setter.getNewTypeInstance();
			newTypeInstance.getTemplatedInfectiousDiseaseControlMeasureUrlsForSoftware().add(newObj);
		}

	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
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
	}

	@Override
	public T getNewTypeInstance() {
		return newTypeInstance;
	}

}