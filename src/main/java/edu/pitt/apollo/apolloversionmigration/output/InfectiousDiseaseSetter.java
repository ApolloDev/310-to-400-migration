package edu.pitt.apollo.apolloversionmigration.output;

public class InfectiousDiseaseSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.InfectiousDisease,edu.pitt.apollo.types.v3_1_0.InfectiousDisease> {

	public InfectiousDiseaseSetter(Class<edu.pitt.apollo.types.v4_0.InfectiousDisease> newTypeClass, edu.pitt.apollo.types.v3_1_0.InfectiousDisease oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setDisease() throws MigrationException {
		newTypeInstance.setDisease(oldTypeInstance.getDisease());
	}

	private void setSpeciesWithDisease() throws MigrationException {
		newTypeInstance.setSpeciesWithDisease(oldTypeInstance.getSpeciesWithDisease());
	}

	private void setCausalPathogen() throws MigrationException {
		ApolloPathogenCodeSetter setter = new ApolloPathogenCodeSetter(edu.pitt.apollo.types.v4_0.ApolloPathogenCode.class,oldTypeInstance.getCausalPathogen());
		setter.set();
		newTypeInstance.setCausalPathogen(setter.getNewTypeInstance());
	}

	private void setIncubationPeriod() throws MigrationException {
		DurationSetter setter = DurationSetterFactory.getSetter(oldTypeInstance.getIncubationPeriod());
		setter.set();
		newTypeInstance.setIncubationPeriod(setter.getNewTypeInstance());
	}

	private void setProdromalPeriod() throws MigrationException {
		DurationSetter setter = DurationSetterFactory.getSetter(oldTypeInstance.getProdromalPeriod());
		setter.set();
		newTypeInstance.setProdromalPeriod(setter.getNewTypeInstance());
	}

	private void setFulminantPeriod() throws MigrationException {
		DurationSetter setter = DurationSetterFactory.getSetter(oldTypeInstance.getFulminantPeriod());
		setter.set();
		newTypeInstance.setFulminantPeriod(setter.getNewTypeInstance());
	}

	private void setOtherIntervals() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.Interval oldObj : oldTypeInstance.getOtherIntervals()) {
			IntervalSetter setter = new IntervalSetter(edu.pitt.apollo.types.v4_0.Interval.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.Interval newObj = setter.getNewTypeInstance();
			newTypeInstance.getOtherIntervals().add(newObj);
		}

	}

	private void setDiseaseOutcomesWithProbabilities() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.DiseaseOutcomeWithProbability oldObj : oldTypeInstance.getDiseaseOutcomesWithProbabilities()) {
			DiseaseOutcomeWithProbabilitySetter setter = new DiseaseOutcomeWithProbabilitySetter(edu.pitt.apollo.types.v4_0.DiseaseOutcomeWithProbability.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.DiseaseOutcomeWithProbability newObj = setter.getNewTypeInstance();
			newTypeInstance.getDiseaseOutcomesWithProbabilities().add(newObj);
		}

	}

	@Override
	public void set() throws MigrationException {
		setDisease();
		setSpeciesWithDisease();
		setCausalPathogen();
		setIncubationPeriod();
		setProdromalPeriod();
		setFulminantPeriod();
		setOtherIntervals();
		setDiseaseOutcomesWithProbabilities();
	}

}