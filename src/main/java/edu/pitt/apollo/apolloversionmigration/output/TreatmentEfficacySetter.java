package edu.pitt.apollo.apolloversionmigration.output;

public class TreatmentEfficacySetter<T extends edu.pitt.apollo.types.v4_0.TreatmentEfficacy, O extends edu.pitt.apollo.types.v3_1_0.TreatmentEfficacy> extends AbstractSetter<T,O> {

	public TreatmentEfficacySetter(Class<T> newTypeClass, O oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setHostIdentifier() throws MigrationException {
		newTypeInstance.setHostIdentifier(oldTypeInstance.getHostIdentifier());
	}

	private void setStrainIdentifier() throws MigrationException {
		ApolloPathogenCodeSetter setter = new ApolloPathogenCodeSetter(edu.pitt.apollo.types.v4_0.ApolloPathogenCode.class,oldTypeInstance.getStrainIdentifier());
		setter.set();
		newTypeInstance.setStrainIdentifier(setter.getNewTypeInstance());
	}

	private void setForTreatmentPreventableOutcome() throws MigrationException {
		newTypeInstance.setForTreatmentPreventableOutcome(edu.pitt.apollo.types.v4_0.TreatmentPreventableOutcomeEnum.fromValue(oldTypeInstance.getForTreatmentPreventableOutcome().toString()));
	}

	@Override
	public void set() throws MigrationException {
		setHostIdentifier();
		setStrainIdentifier();
		setForTreatmentPreventableOutcome();
	}

	@Override
	public T getNewTypeInstance() {
		return newTypeInstance;
	}

}