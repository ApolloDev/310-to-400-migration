package edu.pitt.apollo.apolloversionmigration.output;

public class TreatmentSurveillanceTriggerDefinitionSetter extends TriggerDefinitionSetter<edu.pitt.apollo.types.v4_0.TreatmentSurveillanceTriggerDefinition,edu.pitt.apollo.types.v3_1_0.TreatmentSurveillanceTriggerDefinition> {

	public TreatmentSurveillanceTriggerDefinitionSetter(Class<edu.pitt.apollo.types.v4_0.TreatmentSurveillanceTriggerDefinition> newTypeClass, edu.pitt.apollo.types.v3_1_0.TreatmentSurveillanceTriggerDefinition oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setReactiveControlMeasureTest() throws MigrationException {
		newTypeInstance.setReactiveControlMeasureTest(oldTypeInstance.getReactiveControlMeasureTest());
	}

	private void setReactiveControlMeasureThreshold() throws MigrationException {
		newTypeInstance.setReactiveControlMeasureThreshold(oldTypeInstance.getReactiveControlMeasureThreshold());
	}

	private void setReactiveControlMeasureOperator() throws MigrationException {
		newTypeInstance.setReactiveControlMeasureOperator(edu.pitt.apollo.types.v4_0.OperatorEnum.fromValue(oldTypeInstance.getReactiveControlMeasureOperator().toString()));
	}

	private void setUnitOfMeasureForThreshold() throws MigrationException {
		newTypeInstance.setUnitOfMeasureForThreshold(edu.pitt.apollo.types.v4_0.UnitOfMeasureEnum.fromValue(oldTypeInstance.getUnitOfMeasureForThreshold().toString()));
	}

	private void setTreatmentSurveillanceCapability() throws MigrationException {
		TreatmentSurveillanceCapabilitySetter setter = new TreatmentSurveillanceCapabilitySetter(edu.pitt.apollo.types.v4_0.TreatmentSurveillanceCapability.class,oldTypeInstance.getTreatmentSurveillanceCapability());
		setter.set();
		newTypeInstance.setTreatmentSurveillanceCapability(setter.getNewTypeInstance());
	}

	@Override
	public void set() throws MigrationException {
		super.set();
		setReactiveControlMeasureTest();
		setReactiveControlMeasureThreshold();
		setReactiveControlMeasureOperator();
		setUnitOfMeasureForThreshold();
		setTreatmentSurveillanceCapability();
	}

}