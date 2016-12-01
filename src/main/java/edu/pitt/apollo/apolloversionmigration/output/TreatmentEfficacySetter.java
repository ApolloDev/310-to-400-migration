package edu.pitt.apollo.apolloversionmigration.output;

public class TreatmentEfficacySetter<T extends edu.pitt.apollo.types.v4_0.TreatmentEfficacy> extends AbstractSetter<T> {

	public TreatmentEfficacySetter(Class<T> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setHostIdentifier() throws MigrationException {
		newTypeInstance.setHostIdentifier(((edu.pitt.apollo.types.v3_1_0.TreatmentEfficacy) oldTypeInstance).getHostIdentifier());
	}

	protected void setStrainIdentifier() throws MigrationException {
		ApolloPathogenCodeSetter setter = new ApolloPathogenCodeSetter(edu.pitt.apollo.types.v4_0.ApolloPathogenCode.class,((edu.pitt.apollo.types.v3_1_0.TreatmentEfficacy) oldTypeInstance).getStrainIdentifier());
		setter.set();
		newTypeInstance.setStrainIdentifier(setter.getNewTypeInstance());
	}

	protected void setForTreatmentPreventableOutcome() throws MigrationException {
		newTypeInstance.setForTreatmentPreventableOutcome(edu.pitt.apollo.types.v4_0.TreatmentPreventableOutcomeEnum.valueOf(((edu.pitt.apollo.types.v3_1_0.TreatmentEfficacy) oldTypeInstance).getForTreatmentPreventableOutcome().toString()));
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			setHostIdentifier();
			setStrainIdentifier();
			setForTreatmentPreventableOutcome();
		}
	}

	@Override
	public T getNewTypeInstance() {
		return newTypeInstance;
	}

}