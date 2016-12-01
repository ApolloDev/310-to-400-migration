package edu.pitt.apollo.apolloversionmigration.output;

public class DiseaseOutcomeWithProbabilitySetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.DiseaseOutcomeWithProbability> {

	public DiseaseOutcomeWithProbabilitySetter(Class<edu.pitt.apollo.types.v4_0.DiseaseOutcomeWithProbability> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setTitle() throws MigrationException {
		newTypeInstance.setTitle(((edu.pitt.apollo.types.v3_1_0.DiseaseOutcomeWithProbability) oldTypeInstance).getTitle());
	}

	protected void setDiseaseOutcome() throws MigrationException {
		newTypeInstance.setDiseaseOutcome(edu.pitt.apollo.types.v4_0.DiseaseOutcomeEnum.valueOf(((edu.pitt.apollo.types.v3_1_0.DiseaseOutcomeWithProbability) oldTypeInstance).getDiseaseOutcome().toString()));
	}

	protected void setProbability() throws MigrationException {
		ProbabilisticParameterSetter setter = new ProbabilisticParameterSetter(edu.pitt.apollo.types.v4_0.ProbabilisticParameter.class,((edu.pitt.apollo.types.v3_1_0.DiseaseOutcomeWithProbability) oldTypeInstance).getProbability());
		setter.set();
		newTypeInstance.setProbability(setter.getNewTypeInstance());
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			setTitle();
			setDiseaseOutcome();
			setProbability();
		}
	}

}