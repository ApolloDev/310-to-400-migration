package edu.pitt.apollo.apolloversionmigration.output;

public class ColonizationSetter extends ApolloIndexableItemSetter<edu.pitt.apollo.types.v4_0_1.Colonization> {

	public ColonizationSetter(Class<edu.pitt.apollo.types.v4_0_1.Colonization> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setPathogen() throws MigrationException {
		ApolloPathogenCodeSetter setter = new ApolloPathogenCodeSetter(edu.pitt.apollo.types.v4_0_1.ApolloPathogenCode.class,((edu.pitt.apollo.types.v3_1_0.Colonization) oldTypeInstance).getPathogen());
		setter.set();
		newTypeInstance.setPathogen(setter.getNewTypeInstance());
	}

	protected void setHost() throws MigrationException {
		newTypeInstance.setHost(((edu.pitt.apollo.types.v3_1_0.Colonization) oldTypeInstance).getHost());
	}

	protected void setColonizationDuration() throws MigrationException {
		if (((edu.pitt.apollo.types.v3_1_0.Colonization) oldTypeInstance).getColonizationDuration() != null) {
			DurationSetter setter = DurationSetterFactory.getSetter(((edu.pitt.apollo.types.v3_1_0.Colonization) oldTypeInstance).getColonizationDuration());
			setter.set();
			newTypeInstance.setColonizationDuration(setter.getNewTypeInstance());
		}

	}

	protected void setProbabilityOfInfectionOverTime() throws MigrationException {
		ConditionalProbabilityDistributionSetter setter = new ConditionalProbabilityDistributionSetter(edu.pitt.apollo.types.v4_0_1.ConditionalProbabilityDistribution.class,((edu.pitt.apollo.types.v3_1_0.Colonization) oldTypeInstance).getProbabilityOfInfectionOverTime());
		setter.set();
		newTypeInstance.setProbabilityOfInfectionOverTime(setter.getNewTypeInstance());
	}

	protected void setColonizationAcquisition() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.ColonizationAcquisition oldObj : ((edu.pitt.apollo.types.v3_1_0.Colonization) oldTypeInstance).getColonizationAcquisition()) {
			ColonizationAcquisitionSetter setter = new ColonizationAcquisitionSetter(edu.pitt.apollo.types.v4_0_1.ColonizationAcquisition.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0_1.ColonizationAcquisition newObj = setter.getNewTypeInstance();
			newTypeInstance.getColonizationAcquisition().add(newObj);
		}

	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
			setPathogen();
			setHost();
			setColonizationDuration();
			setProbabilityOfInfectionOverTime();
			setColonizationAcquisition();
		}
	}

}