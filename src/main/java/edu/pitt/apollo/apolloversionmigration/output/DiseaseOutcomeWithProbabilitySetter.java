package edu.pitt.apollo.apolloversionmigration.output;

public class DiseaseOutcomeWithProbabilitySetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.DiseaseOutcomeWithProbability,edu.pitt.apollo.types.v3_1_0.DiseaseOutcomeWithProbability> {

	public DiseaseOutcomeWithProbabilitySetter(Class<edu.pitt.apollo.types.v4_0.DiseaseOutcomeWithProbability> newTypeClass, edu.pitt.apollo.types.v3_1_0.DiseaseOutcomeWithProbability oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setTitle() throws MigrationException {
		newTypeInstance.setTitle(oldTypeInstance.getTitle());
	}

	private void setDiseaseOutcome() throws MigrationException {
		newTypeInstance.setDiseaseOutcome(edu.pitt.apollo.types.v4_0.DiseaseOutcomeEnum.fromValue(oldTypeInstance.getDiseaseOutcome().toString()));
	}

	private void setProbability() throws MigrationException {
		ProbabilisticParameterSetter setter = new ProbabilisticParameterSetter(edu.pitt.apollo.types.v4_0.ProbabilisticParameter.class,oldTypeInstance.getProbability());
		setter.set();
		newTypeInstance.setProbability(setter.getNewTypeInstance());
	}

	@Override
	public void set() throws MigrationException {
		setTitle();
		setDiseaseOutcome();
		setProbability();
	}

}