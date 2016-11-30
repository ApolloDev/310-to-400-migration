package edu.pitt.apollo.apolloversionmigration.output;

public class ColonizationSetter extends ApolloIndexableItemSetter<edu.pitt.apollo.types.v4_0.Colonization,edu.pitt.apollo.types.v3_1_0.Colonization> {

	public ColonizationSetter(Class<edu.pitt.apollo.types.v4_0.Colonization> newTypeClass, edu.pitt.apollo.types.v3_1_0.Colonization oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setPathogen() throws MigrationException {
		ApolloPathogenCodeSetter setter = new ApolloPathogenCodeSetter(edu.pitt.apollo.types.v4_0.ApolloPathogenCode.class,oldTypeInstance.getPathogen());
		setter.set();
		newTypeInstance.setPathogen(setter.getNewTypeInstance());
	}

	private void setHost() throws MigrationException {
		newTypeInstance.setHost(oldTypeInstance.getHost());
	}

	private void setColonizationDuration() throws MigrationException {
		DurationSetter setter = DurationSetterFactory.getSetter(oldTypeInstance.getColonizationDuration());
		setter.set();
		newTypeInstance.setColonizationDuration(setter.getNewTypeInstance());
	}

	private void setProbabilityOfInfectionOverTime() throws MigrationException {
		ConditionalProbabilityDistributionSetter setter = new ConditionalProbabilityDistributionSetter(edu.pitt.apollo.types.v4_0.ConditionalProbabilityDistribution.class,oldTypeInstance.getProbabilityOfInfectionOverTime());
		setter.set();
		newTypeInstance.setProbabilityOfInfectionOverTime(setter.getNewTypeInstance());
	}

	private void setColonizationAcquisition() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.ColonizationAcquisition oldObj : oldTypeInstance.getColonizationAcquisition()) {
			ColonizationAcquisitionSetter setter = new ColonizationAcquisitionSetter(edu.pitt.apollo.types.v4_0.ColonizationAcquisition.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.ColonizationAcquisition newObj = setter.getNewTypeInstance();
			newTypeInstance.getColonizationAcquisition().add(newObj);
		}

	}

	@Override
	public void set() throws MigrationException {
		super.set();
		setPathogen();
		setHost();
		setColonizationDuration();
		setProbabilityOfInfectionOverTime();
		setColonizationAcquisition();
	}

}