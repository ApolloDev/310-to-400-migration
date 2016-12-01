package edu.pitt.apollo.apolloversionmigration.output;

public class LifeStageWithDurationAndMortalitySetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.LifeStageWithDurationAndMortality> {

	public LifeStageWithDurationAndMortalitySetter(Class<edu.pitt.apollo.types.v4_0.LifeStageWithDurationAndMortality> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setStage() throws MigrationException {
		newTypeInstance.setStage(edu.pitt.apollo.types.v4_0.DevelopmentalStageEnum.valueOf(((edu.pitt.apollo.types.v3_1_0.LifeStageWithDurationAndMortality) oldTypeInstance).getStage().toString()));
	}

	protected void setDuration() throws MigrationException {
		if (((edu.pitt.apollo.types.v3_1_0.LifeStageWithDurationAndMortality) oldTypeInstance).getDuration() != null) {
			DurationSetter setter = DurationSetterFactory.getSetter(((edu.pitt.apollo.types.v3_1_0.LifeStageWithDurationAndMortality) oldTypeInstance).getDuration());
			setter.set();
			newTypeInstance.setDuration(setter.getNewTypeInstance());
		}

	}

	protected void setMortalityRate() throws MigrationException {
		RateSetter setter = new RateSetter(edu.pitt.apollo.types.v4_0.Rate.class,((edu.pitt.apollo.types.v3_1_0.LifeStageWithDurationAndMortality) oldTypeInstance).getMortalityRate());
		setter.set();
		newTypeInstance.setMortalityRate(setter.getNewTypeInstance());
	}

	protected void setMortalityFunction() throws MigrationException {
		if (((edu.pitt.apollo.types.v3_1_0.LifeStageWithDurationAndMortality) oldTypeInstance).getMortalityFunction() != null) {
			MortalityFunctionSetter setter = MortalityFunctionSetterFactory.getSetter(((edu.pitt.apollo.types.v3_1_0.LifeStageWithDurationAndMortality) oldTypeInstance).getMortalityFunction());
			setter.set();
			newTypeInstance.setMortalityFunction(setter.getNewTypeInstance());
		}

	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			setStage();
			setDuration();
			setMortalityRate();
			setMortalityFunction();
		}
	}

}