package edu.pitt.apollo.apolloversionmigration.output;

public abstract class InfectiousDiseaseSetter extends LInfectiousDiseaseSetter<edu.pitt.apollo.types.v4_0.InfectiousDisease> {

	public InfectiousDiseaseSetter(Class<edu.pitt.apollo.types.v4_0.InfectiousDisease> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setDisease() throws MigrationException {
		newTypeInstance.setDisease(((edu.pitt.apollo.types.v3_1_0.InfectiousDisease) oldTypeInstance).getDisease());
	}

	protected void setSpeciesWithDisease() throws MigrationException {
		newTypeInstance.setSpeciesWithDisease(((edu.pitt.apollo.types.v3_1_0.InfectiousDisease) oldTypeInstance).getSpeciesWithDisease());
	}

	protected void setCausalPathogen() throws MigrationException {
		ApolloPathogenCodeSetter setter = new ApolloPathogenCodeSetter(edu.pitt.apollo.types.v4_0.ApolloPathogenCode.class,((edu.pitt.apollo.types.v3_1_0.InfectiousDisease) oldTypeInstance).getCausalPathogen());
		setter.set();
		newTypeInstance.setCausalPathogen(setter.getNewTypeInstance());
	}

	protected void setIncubationPeriod() throws MigrationException {
		if (((edu.pitt.apollo.types.v3_1_0.InfectiousDisease) oldTypeInstance).getIncubationPeriod() != null) {
			DurationSetter setter = DurationSetterFactory.getSetter(((edu.pitt.apollo.types.v3_1_0.InfectiousDisease) oldTypeInstance).getIncubationPeriod());
			setter.set();
			newTypeInstance.setIncubationPeriod(setter.getNewTypeInstance());
		}

	}

	protected void setProdromalPeriod() throws MigrationException {
		if (((edu.pitt.apollo.types.v3_1_0.InfectiousDisease) oldTypeInstance).getProdromalPeriod() != null) {
			DurationSetter setter = DurationSetterFactory.getSetter(((edu.pitt.apollo.types.v3_1_0.InfectiousDisease) oldTypeInstance).getProdromalPeriod());
			setter.set();
			newTypeInstance.setProdromalPeriod(setter.getNewTypeInstance());
		}

	}

	protected void setFulminantPeriod() throws MigrationException {
		if (((edu.pitt.apollo.types.v3_1_0.InfectiousDisease) oldTypeInstance).getFulminantPeriod() != null) {
			DurationSetter setter = DurationSetterFactory.getSetter(((edu.pitt.apollo.types.v3_1_0.InfectiousDisease) oldTypeInstance).getFulminantPeriod());
			setter.set();
			newTypeInstance.setFulminantPeriod(setter.getNewTypeInstance());
		}

	}

	protected void setOtherIntervals() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.Interval oldObj : ((edu.pitt.apollo.types.v3_1_0.InfectiousDisease) oldTypeInstance).getOtherIntervals()) {
			IntervalSetter setter = new IntervalSetter(edu.pitt.apollo.types.v4_0.Interval.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.Interval newObj = setter.getNewTypeInstance();
			newTypeInstance.getOtherIntervals().add(newObj);
		}

	}

	protected void setDiseaseOutcomesWithProbabilities() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.DiseaseOutcomeWithProbability oldObj : ((edu.pitt.apollo.types.v3_1_0.InfectiousDisease) oldTypeInstance).getDiseaseOutcomesWithProbabilities()) {
			DiseaseOutcomeWithProbabilitySetter setter = new DiseaseOutcomeWithProbabilitySetter(edu.pitt.apollo.types.v4_0.DiseaseOutcomeWithProbability.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.DiseaseOutcomeWithProbability newObj = setter.getNewTypeInstance();
			newTypeInstance.getDiseaseOutcomesWithProbabilities().add(newObj);
		}

	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
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

}