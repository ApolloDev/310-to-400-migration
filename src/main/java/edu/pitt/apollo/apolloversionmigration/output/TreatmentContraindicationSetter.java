package edu.pitt.apollo.apolloversionmigration.output;

public class TreatmentContraindicationSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.TreatmentContraindication> {

	public TreatmentContraindicationSetter(Class<edu.pitt.apollo.types.v4_0.TreatmentContraindication> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setDescription() throws MigrationException {
		newTypeInstance.setDescription(((edu.pitt.apollo.types.v3_1_0.TreatmentContraindication) oldTypeInstance).getDescription());
	}

	protected void setSimulatorReferencablePopulation() throws MigrationException {
		TargetPopulationDefinitionSetter setter = new TargetPopulationDefinitionSetter(edu.pitt.apollo.types.v4_0.TargetPopulationDefinition.class,((edu.pitt.apollo.types.v3_1_0.TreatmentContraindication) oldTypeInstance).getSimulatorReferencablePopulation());
		setter.set();
		newTypeInstance.setSimulatorReferencablePopulation(setter.getNewTypeInstance());
	}

	protected void setFractionOfSimulatorReferencablePopulation() throws MigrationException {
		newTypeInstance.setFractionOfSimulatorReferencablePopulation(((edu.pitt.apollo.types.v3_1_0.TreatmentContraindication) oldTypeInstance).getFractionOfSimulatorReferencablePopulation());
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			setDescription();
			setSimulatorReferencablePopulation();
			setFractionOfSimulatorReferencablePopulation();
		}
	}

}