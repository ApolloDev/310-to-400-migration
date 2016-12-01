package edu.pitt.apollo.apolloversionmigration.output;

public class MosquitoReproductionSetter extends ReproductionSetter<edu.pitt.apollo.types.v4_0.MosquitoReproduction> {

	public MosquitoReproductionSetter(Class<edu.pitt.apollo.types.v4_0.MosquitoReproduction> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setGonotrophicPeriodDuration() throws MigrationException {
		if (((edu.pitt.apollo.types.v3_1_0.MosquitoReproduction) oldTypeInstance).getGonotrophicPeriodDuration() != null) {
			DurationSetter setter = DurationSetterFactory.getSetter(((edu.pitt.apollo.types.v3_1_0.MosquitoReproduction) oldTypeInstance).getGonotrophicPeriodDuration());
			setter.set();
			newTypeInstance.setGonotrophicPeriodDuration(setter.getNewTypeInstance());
		}

	}

	protected void setEggsPerBrood() throws MigrationException {
		newTypeInstance.setEggsPerBrood(((edu.pitt.apollo.types.v3_1_0.MosquitoReproduction) oldTypeInstance).getEggsPerBrood());
	}

	protected void setMinimumEggsPerOviposition() throws MigrationException {
		newTypeInstance.setMinimumEggsPerOviposition(((edu.pitt.apollo.types.v3_1_0.MosquitoReproduction) oldTypeInstance).getMinimumEggsPerOviposition());
	}

	protected void setAgeDependentFecundityReduction() throws MigrationException {
		RateSetter setter = new RateSetter(edu.pitt.apollo.types.v4_0.Rate.class,((edu.pitt.apollo.types.v3_1_0.MosquitoReproduction) oldTypeInstance).getAgeDependentFecundityReduction());
		setter.set();
		newTypeInstance.setAgeDependentFecundityReduction(setter.getNewTypeInstance());
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
			setGonotrophicPeriodDuration();
			setEggsPerBrood();
			setMinimumEggsPerOviposition();
			setAgeDependentFecundityReduction();
		}
	}

}