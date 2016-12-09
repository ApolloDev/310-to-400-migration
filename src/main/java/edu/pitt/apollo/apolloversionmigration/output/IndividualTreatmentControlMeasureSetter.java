package edu.pitt.apollo.apolloversionmigration.output;

public class IndividualTreatmentControlMeasureSetter<T extends edu.pitt.apollo.types.v4_0_1.IndividualTreatmentControlMeasure> extends InfectiousDiseaseControlMeasureSetter<T> {

	public IndividualTreatmentControlMeasureSetter(Class<T> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setPathogen() throws MigrationException {
		ApolloPathogenCodeSetter setter = new ApolloPathogenCodeSetter(edu.pitt.apollo.types.v4_0_1.ApolloPathogenCode.class,((edu.pitt.apollo.types.v3_1_0.IndividualTreatmentControlMeasure) oldTypeInstance).getPathogen());
		setter.set();
		newTypeInstance.setPathogen(setter.getNewTypeInstance());
	}

	protected void setTaxonOfTreatedIndividual() throws MigrationException {
		newTypeInstance.setTaxonOfTreatedIndividual(((edu.pitt.apollo.types.v3_1_0.IndividualTreatmentControlMeasure) oldTypeInstance).getTaxonOfTreatedIndividual());
	}

	protected void setIndividualTreatment() throws MigrationException {
		if (((edu.pitt.apollo.types.v3_1_0.IndividualTreatmentControlMeasure) oldTypeInstance).getIndividualTreatment() != null) {
			TreatmentSetter setter = TreatmentSetterFactory.getSetter(((edu.pitt.apollo.types.v3_1_0.IndividualTreatmentControlMeasure) oldTypeInstance).getIndividualTreatment());
			setter.set();
			newTypeInstance.setIndividualTreatment(setter.getNewTypeInstance());
		}

	}

	protected void setPopulationTreatmentCensus() throws MigrationException {
		PopulationTreatmentCensusSetter setter = new PopulationTreatmentCensusSetter(edu.pitt.apollo.types.v4_0_1.PopulationTreatmentCensus.class,((edu.pitt.apollo.types.v3_1_0.IndividualTreatmentControlMeasure) oldTypeInstance).getPopulationTreatmentCensus());
		setter.set();
		newTypeInstance.setPopulationTreatmentCensus(setter.getNewTypeInstance());
	}

	protected void setCompliance() throws MigrationException {
		ProbabilisticParameterSetter setter = new ProbabilisticParameterSetter(edu.pitt.apollo.types.v4_0_1.ProbabilisticParameter.class,((edu.pitt.apollo.types.v3_1_0.IndividualTreatmentControlMeasure) oldTypeInstance).getCompliance());
		setter.set();
		newTypeInstance.setCompliance(setter.getNewTypeInstance());
	}

	protected void setDelayFromSymptomsToTreatment() throws MigrationException {
		if (((edu.pitt.apollo.types.v3_1_0.IndividualTreatmentControlMeasure) oldTypeInstance).getDelayFromSymptomsToTreatment() != null) {
			DurationSetter setter = DurationSetterFactory.getSetter(((edu.pitt.apollo.types.v3_1_0.IndividualTreatmentControlMeasure) oldTypeInstance).getDelayFromSymptomsToTreatment());
			setter.set();
			newTypeInstance.setDelayFromSymptomsToTreatment(setter.getNewTypeInstance());
		}

	}

	protected void setTargetPopulationsAndPrioritizations() throws MigrationException {
		ControlMeasureTargetPopulationsAndPrioritizationSetter setter = new ControlMeasureTargetPopulationsAndPrioritizationSetter(edu.pitt.apollo.types.v4_0_1.ControlMeasureTargetPopulationsAndPrioritization.class,((edu.pitt.apollo.types.v3_1_0.IndividualTreatmentControlMeasure) oldTypeInstance).getTargetPopulationsAndPrioritizations());
		setter.set();
		newTypeInstance.setTargetPopulationsAndPrioritizations(setter.getNewTypeInstance());
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
			setPathogen();
			setTaxonOfTreatedIndividual();
			setIndividualTreatment();
			setPopulationTreatmentCensus();
			setCompliance();
			setDelayFromSymptomsToTreatment();
			setTargetPopulationsAndPrioritizations();
		}
	}

	@Override
	public T getNewTypeInstance() {
		return newTypeInstance;
	}

}