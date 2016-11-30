package edu.pitt.apollo.apolloversionmigration.output;

public class TreatmentSetter<T extends edu.pitt.apollo.types.v4_0.Treatment, O extends edu.pitt.apollo.types.v3_1_0.Treatment> extends ApolloIndexableItemSetter<T,O> {

	public TreatmentSetter(Class<T> newTypeClass, O oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setDescription() throws MigrationException {
		newTypeInstance.setDescription(oldTypeInstance.getDescription());
	}

	private void setSpeciesOfTreatedOrganism() throws MigrationException {
		newTypeInstance.setSpeciesOfTreatedOrganism(oldTypeInstance.getSpeciesOfTreatedOrganism());
	}

	private void setPathogen() throws MigrationException {
		ApolloPathogenCodeSetter setter = new ApolloPathogenCodeSetter(edu.pitt.apollo.types.v4_0.ApolloPathogenCode.class,oldTypeInstance.getPathogen());
		setter.set();
		newTypeInstance.setPathogen(setter.getNewTypeInstance());
	}

	private void setNumDosesInTreatmentCourse() throws MigrationException {
		newTypeInstance.setNumDosesInTreatmentCourse(oldTypeInstance.getNumDosesInTreatmentCourse());
	}

	private void setDurationOfTreatmentCourse() throws MigrationException {
		DurationSetter setter = DurationSetterFactory.getSetter(oldTypeInstance.getDurationOfTreatmentCourse());
		setter.set();
		newTypeInstance.setDurationOfTreatmentCourse(setter.getNewTypeInstance());
	}

	private void setTreatmentContraindications() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.TreatmentContraindication oldObj : oldTypeInstance.getTreatmentContraindications()) {
			TreatmentContraindicationSetter setter = new TreatmentContraindicationSetter(edu.pitt.apollo.types.v4_0.TreatmentContraindication.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.TreatmentContraindication newObj = setter.getNewTypeInstance();
			newTypeInstance.getTreatmentContraindications().add(newObj);
		}

	}

	@Override
	public void set() throws MigrationException {
		super.set();
		setDescription();
		setSpeciesOfTreatedOrganism();
		setPathogen();
		setNumDosesInTreatmentCourse();
		setDurationOfTreatmentCourse();
		setTreatmentContraindications();
	}

	@Override
	public T getNewTypeInstance() {
		return newTypeInstance;
	}

}