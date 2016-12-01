package edu.pitt.apollo.apolloversionmigration.output;

public class DiseaseSurveillanceTriggerDefinitionSetter extends TriggerDefinitionSetter<edu.pitt.apollo.types.v4_0.DiseaseSurveillanceTriggerDefinition> {

	public DiseaseSurveillanceTriggerDefinitionSetter(Class<edu.pitt.apollo.types.v4_0.DiseaseSurveillanceTriggerDefinition> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setReactiveControlMeasureTest() throws MigrationException {
		newTypeInstance.setReactiveControlMeasureTest(((edu.pitt.apollo.types.v3_1_0.DiseaseSurveillanceTriggerDefinition) oldTypeInstance).getReactiveControlMeasureTest());
	}

	protected void setReactiveControlMeasureThreshold() throws MigrationException {
		newTypeInstance.setReactiveControlMeasureThreshold(((edu.pitt.apollo.types.v3_1_0.DiseaseSurveillanceTriggerDefinition) oldTypeInstance).getReactiveControlMeasureThreshold());
	}

	protected void setUnitOfMeasureForThreshold() throws MigrationException {
		newTypeInstance.setUnitOfMeasureForThreshold(edu.pitt.apollo.types.v4_0.UnitOfMeasureEnum.valueOf(((edu.pitt.apollo.types.v3_1_0.DiseaseSurveillanceTriggerDefinition) oldTypeInstance).getUnitOfMeasureForThreshold().toString()));
	}

	protected void setReactiveControlMeasureOperator() throws MigrationException {
		newTypeInstance.setReactiveControlMeasureOperator(edu.pitt.apollo.types.v4_0.OperatorEnum.valueOf(((edu.pitt.apollo.types.v3_1_0.DiseaseSurveillanceTriggerDefinition) oldTypeInstance).getReactiveControlMeasureOperator().toString()));
	}

	protected void setDiseaseSurveillanceCapability() throws MigrationException {
		DiseaseSurveillanceCapabilitySetter setter = new DiseaseSurveillanceCapabilitySetter(edu.pitt.apollo.types.v4_0.DiseaseSurveillanceCapability.class,((edu.pitt.apollo.types.v3_1_0.DiseaseSurveillanceTriggerDefinition) oldTypeInstance).getDiseaseSurveillanceCapability());
		setter.set();
		newTypeInstance.setDiseaseSurveillanceCapability(setter.getNewTypeInstance());
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
			setReactiveControlMeasureTest();
			setReactiveControlMeasureThreshold();
			setUnitOfMeasureForThreshold();
			setReactiveControlMeasureOperator();
			setDiseaseSurveillanceCapability();
		}
	}

}