package edu.pitt.apollo.apolloversionmigration.output;

public class DiseaseSurveillanceTriggerDefinitionSetter extends TriggerDefinitionSetter<edu.pitt.apollo.types.v4_0.DiseaseSurveillanceTriggerDefinition,edu.pitt.apollo.types.v3_1_0.DiseaseSurveillanceTriggerDefinition> {

	public DiseaseSurveillanceTriggerDefinitionSetter(Class<edu.pitt.apollo.types.v4_0.DiseaseSurveillanceTriggerDefinition> newTypeClass, edu.pitt.apollo.types.v3_1_0.DiseaseSurveillanceTriggerDefinition oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setReactiveControlMeasureTest() throws MigrationException {
		newTypeInstance.setReactiveControlMeasureTest(oldTypeInstance.getReactiveControlMeasureTest());
	}

	private void setReactiveControlMeasureThreshold() throws MigrationException {
		newTypeInstance.setReactiveControlMeasureThreshold(oldTypeInstance.getReactiveControlMeasureThreshold());
	}

	private void setUnitOfMeasureForThreshold() throws MigrationException {
		newTypeInstance.setUnitOfMeasureForThreshold(edu.pitt.apollo.types.v4_0.UnitOfMeasureEnum.fromValue(oldTypeInstance.getUnitOfMeasureForThreshold().toString()));
	}

	private void setReactiveControlMeasureOperator() throws MigrationException {
		newTypeInstance.setReactiveControlMeasureOperator(edu.pitt.apollo.types.v4_0.OperatorEnum.fromValue(oldTypeInstance.getReactiveControlMeasureOperator().toString()));
	}

	private void setDiseaseSurveillanceCapability() throws MigrationException {
		DiseaseSurveillanceCapabilitySetter setter = new DiseaseSurveillanceCapabilitySetter(edu.pitt.apollo.types.v4_0.DiseaseSurveillanceCapability.class,oldTypeInstance.getDiseaseSurveillanceCapability());
		setter.set();
		newTypeInstance.setDiseaseSurveillanceCapability(setter.getNewTypeInstance());
	}

	@Override
	public void set() throws MigrationException {
		super.set();
		setReactiveControlMeasureTest();
		setReactiveControlMeasureThreshold();
		setUnitOfMeasureForThreshold();
		setReactiveControlMeasureOperator();
		setDiseaseSurveillanceCapability();
	}

}