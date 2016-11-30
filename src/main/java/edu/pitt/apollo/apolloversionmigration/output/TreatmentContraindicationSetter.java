package edu.pitt.apollo.apolloversionmigration.output;

public class TreatmentContraindicationSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.TreatmentContraindication,edu.pitt.apollo.types.v3_1_0.TreatmentContraindication> {

	public TreatmentContraindicationSetter(Class<edu.pitt.apollo.types.v4_0.TreatmentContraindication> newTypeClass, edu.pitt.apollo.types.v3_1_0.TreatmentContraindication oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setDescription() throws MigrationException {
		newTypeInstance.setDescription(oldTypeInstance.getDescription());
	}

	private void setSimulatorReferencablePopulation() throws MigrationException {
		TargetPopulationDefinitionSetter setter = new TargetPopulationDefinitionSetter(edu.pitt.apollo.types.v4_0.TargetPopulationDefinition.class,oldTypeInstance.getSimulatorReferencablePopulation());
		setter.set();
		newTypeInstance.setSimulatorReferencablePopulation(setter.getNewTypeInstance());
	}

	private void setFractionOfSimulatorReferencablePopulation() throws MigrationException {
		newTypeInstance.setFractionOfSimulatorReferencablePopulation(oldTypeInstance.getFractionOfSimulatorReferencablePopulation());
	}

	@Override
	public void set() throws MigrationException {
		setDescription();
		setSimulatorReferencablePopulation();
		setFractionOfSimulatorReferencablePopulation();
	}

}