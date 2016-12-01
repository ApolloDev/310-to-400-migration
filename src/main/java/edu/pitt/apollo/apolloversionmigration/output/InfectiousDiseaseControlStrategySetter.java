package edu.pitt.apollo.apolloversionmigration.output;

public class InfectiousDiseaseControlStrategySetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.InfectiousDiseaseControlStrategy> {

	public InfectiousDiseaseControlStrategySetter(Class<edu.pitt.apollo.types.v4_0.InfectiousDiseaseControlStrategy> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setControlMeasures() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.InfectiousDiseaseControlMeasure oldObj : ((edu.pitt.apollo.types.v3_1_0.InfectiousDiseaseControlStrategy) oldTypeInstance).getControlMeasures()) {
			InfectiousDiseaseControlMeasureSetter setter = new InfectiousDiseaseControlMeasureSetter(edu.pitt.apollo.types.v4_0.InfectiousDiseaseControlMeasure.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.InfectiousDiseaseControlMeasure newObj = setter.getNewTypeInstance();
			newTypeInstance.getControlMeasures().add(newObj);
		}

	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			setControlMeasures();
		}
	}

}