package edu.pitt.apollo.apolloversionmigration.output;

public class TreatmentSurveillanceTriggerDefinitionSetter extends TriggerDefinitionSetter<edu.pitt.apollo.types.v4_0_1.TreatmentSurveillanceTriggerDefinition> {

	public TreatmentSurveillanceTriggerDefinitionSetter(Class<edu.pitt.apollo.types.v4_0_1.TreatmentSurveillanceTriggerDefinition> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setReactiveControlMeasureTest() throws MigrationException {
		newTypeInstance.setReactiveControlMeasureTest(((edu.pitt.apollo.types.v3_1_0.TreatmentSurveillanceTriggerDefinition) oldTypeInstance).getReactiveControlMeasureTest());
	}

	protected void setReactiveControlMeasureThreshold() throws MigrationException {
		newTypeInstance.setReactiveControlMeasureThreshold(((edu.pitt.apollo.types.v3_1_0.TreatmentSurveillanceTriggerDefinition) oldTypeInstance).getReactiveControlMeasureThreshold());
	}

	protected void setReactiveControlMeasureOperator() throws MigrationException {
		if (((edu.pitt.apollo.types.v3_1_0.TreatmentSurveillanceTriggerDefinition) oldTypeInstance).getReactiveControlMeasureOperator() != null) {
			newTypeInstance.setReactiveControlMeasureOperator(edu.pitt.apollo.types.v4_0_1.OperatorEnum.valueOf(((edu.pitt.apollo.types.v3_1_0.TreatmentSurveillanceTriggerDefinition) oldTypeInstance).getReactiveControlMeasureOperator().toString()));
		}
	}

	protected void setUnitOfMeasureForThreshold() throws MigrationException {
		if (((edu.pitt.apollo.types.v3_1_0.TreatmentSurveillanceTriggerDefinition) oldTypeInstance).getUnitOfMeasureForThreshold() != null) {
			newTypeInstance.setUnitOfMeasureForThreshold(edu.pitt.apollo.types.v4_0_1.UnitOfMeasureEnum.valueOf(((edu.pitt.apollo.types.v3_1_0.TreatmentSurveillanceTriggerDefinition) oldTypeInstance).getUnitOfMeasureForThreshold().toString()));
		}
	}

	protected void setTreatmentSurveillanceCapability() throws MigrationException {
		TreatmentSurveillanceCapabilitySetter setter = new TreatmentSurveillanceCapabilitySetter(edu.pitt.apollo.types.v4_0_1.TreatmentSurveillanceCapability.class,((edu.pitt.apollo.types.v3_1_0.TreatmentSurveillanceTriggerDefinition) oldTypeInstance).getTreatmentSurveillanceCapability());
		setter.set();
		newTypeInstance.setTreatmentSurveillanceCapability(setter.getNewTypeInstance());
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
			setReactiveControlMeasureTest();
			setReactiveControlMeasureThreshold();
			setReactiveControlMeasureOperator();
			setUnitOfMeasureForThreshold();
			setTreatmentSurveillanceCapability();
		}
	}

}