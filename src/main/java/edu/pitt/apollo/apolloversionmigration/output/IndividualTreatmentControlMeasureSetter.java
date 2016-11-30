package edu.pitt.apollo.apolloversionmigration.output;

public class IndividualTreatmentControlMeasureSetter<T extends edu.pitt.apollo.types.v4_0.IndividualTreatmentControlMeasure, O extends edu.pitt.apollo.types.v3_1_0.IndividualTreatmentControlMeasure> extends InfectiousDiseaseControlMeasureSetter<T,O> {

	public IndividualTreatmentControlMeasureSetter(Class<T> newTypeClass, O oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setPathogen() throws MigrationException {
		ApolloPathogenCodeSetter setter = new ApolloPathogenCodeSetter(edu.pitt.apollo.types.v4_0.ApolloPathogenCode.class,oldTypeInstance.getPathogen());
		setter.set();
		newTypeInstance.setPathogen(setter.getNewTypeInstance());
	}

	private void setTaxonOfTreatedIndividual() throws MigrationException {
		newTypeInstance.setTaxonOfTreatedIndividual(oldTypeInstance.getTaxonOfTreatedIndividual());
	}

	private void setIndividualTreatment() throws MigrationException {
		TreatmentSetter setter = TreatmentSetterFactory.getSetter(oldTypeInstance.getIndividualTreatment());
		setter.set();
		newTypeInstance.setIndividualTreatment(setter.getNewTypeInstance());
	}

	private void setPopulationTreatmentCensus() throws MigrationException {
		PopulationTreatmentCensusSetter setter = new PopulationTreatmentCensusSetter(edu.pitt.apollo.types.v4_0.PopulationTreatmentCensus.class,oldTypeInstance.getPopulationTreatmentCensus());
		setter.set();
		newTypeInstance.setPopulationTreatmentCensus(setter.getNewTypeInstance());
	}

	private void setCompliance() throws MigrationException {
		ProbabilisticParameterSetter setter = new ProbabilisticParameterSetter(edu.pitt.apollo.types.v4_0.ProbabilisticParameter.class,oldTypeInstance.getCompliance());
		setter.set();
		newTypeInstance.setCompliance(setter.getNewTypeInstance());
	}

	private void setDelayFromSymptomsToTreatment() throws MigrationException {
		DurationSetter setter = DurationSetterFactory.getSetter(oldTypeInstance.getDelayFromSymptomsToTreatment());
		setter.set();
		newTypeInstance.setDelayFromSymptomsToTreatment(setter.getNewTypeInstance());
	}

	private void setTargetPopulationsAndPrioritizations() throws MigrationException {
		ControlMeasureTargetPopulationsAndPrioritizationSetter setter = new ControlMeasureTargetPopulationsAndPrioritizationSetter(edu.pitt.apollo.types.v4_0.ControlMeasureTargetPopulationsAndPrioritization.class,oldTypeInstance.getTargetPopulationsAndPrioritizations());
		setter.set();
		newTypeInstance.setTargetPopulationsAndPrioritizations(setter.getNewTypeInstance());
	}

	@Override
	public void set() throws MigrationException {
		super.set();
		setPathogen();
		setTaxonOfTreatedIndividual();
		setIndividualTreatment();
		setPopulationTreatmentCensus();
		setCompliance();
		setDelayFromSymptomsToTreatment();
		setTargetPopulationsAndPrioritizations();
	}

	@Override
	public T getNewTypeInstance() {
		return newTypeInstance;
	}

}