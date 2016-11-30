package edu.pitt.apollo.apolloversionmigration.output;

public class LifeStageWithDurationAndMortalitySetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.LifeStageWithDurationAndMortality,edu.pitt.apollo.types.v3_1_0.LifeStageWithDurationAndMortality> {

	public LifeStageWithDurationAndMortalitySetter(Class<edu.pitt.apollo.types.v4_0.LifeStageWithDurationAndMortality> newTypeClass, edu.pitt.apollo.types.v3_1_0.LifeStageWithDurationAndMortality oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setStage() throws MigrationException {
		newTypeInstance.setStage(edu.pitt.apollo.types.v4_0.DevelopmentalStageEnum.fromValue(oldTypeInstance.getStage().toString()));
	}

	private void setDuration() throws MigrationException {
		DurationSetter setter = DurationSetterFactory.getSetter(oldTypeInstance.getDuration());
		setter.set();
		newTypeInstance.setDuration(setter.getNewTypeInstance());
	}

	private void setMortalityRate() throws MigrationException {
		RateSetter setter = new RateSetter(edu.pitt.apollo.types.v4_0.Rate.class,oldTypeInstance.getMortalityRate());
		setter.set();
		newTypeInstance.setMortalityRate(setter.getNewTypeInstance());
	}

	private void setMortalityFunction() throws MigrationException {
		MortalityFunctionSetter setter = MortalityFunctionSetterFactory.getSetter(oldTypeInstance.getMortalityFunction());
		setter.set();
		newTypeInstance.setMortalityFunction(setter.getNewTypeInstance());
	}

	@Override
	public void set() throws MigrationException {
		setStage();
		setDuration();
		setMortalityRate();
		setMortalityFunction();
	}

}