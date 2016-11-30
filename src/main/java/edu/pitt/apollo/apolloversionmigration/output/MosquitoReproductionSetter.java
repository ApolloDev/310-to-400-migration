package edu.pitt.apollo.apolloversionmigration.output;

public class MosquitoReproductionSetter extends ReproductionSetter<edu.pitt.apollo.types.v4_0.MosquitoReproduction,edu.pitt.apollo.types.v3_1_0.MosquitoReproduction> {

	public MosquitoReproductionSetter(Class<edu.pitt.apollo.types.v4_0.MosquitoReproduction> newTypeClass, edu.pitt.apollo.types.v3_1_0.MosquitoReproduction oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setGonotrophicPeriodDuration() throws MigrationException {
		DurationSetter setter = DurationSetterFactory.getSetter(oldTypeInstance.getGonotrophicPeriodDuration());
		setter.set();
		newTypeInstance.setGonotrophicPeriodDuration(setter.getNewTypeInstance());
	}

	private void setEggsPerBrood() throws MigrationException {
		newTypeInstance.setEggsPerBrood(oldTypeInstance.getEggsPerBrood());
	}

	private void setMinimumEggsPerOviposition() throws MigrationException {
		newTypeInstance.setMinimumEggsPerOviposition(oldTypeInstance.getMinimumEggsPerOviposition());
	}

	private void setAgeDependentFecundityReduction() throws MigrationException {
		RateSetter setter = new RateSetter(edu.pitt.apollo.types.v4_0.Rate.class,oldTypeInstance.getAgeDependentFecundityReduction());
		setter.set();
		newTypeInstance.setAgeDependentFecundityReduction(setter.getNewTypeInstance());
	}

	@Override
	public void set() throws MigrationException {
		super.set();
		setGonotrophicPeriodDuration();
		setEggsPerBrood();
		setMinimumEggsPerOviposition();
		setAgeDependentFecundityReduction();
	}

}