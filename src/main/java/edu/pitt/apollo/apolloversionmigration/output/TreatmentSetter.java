package edu.pitt.apollo.apolloversionmigration.output;

public class TreatmentSetter<T extends edu.pitt.apollo.types.v4_0.Treatment> extends ApolloIndexableItemSetter<T> {

	public TreatmentSetter(Class<T> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setDescription() throws MigrationException {
		newTypeInstance.setDescription(((edu.pitt.apollo.types.v3_1_0.Treatment) oldTypeInstance).getDescription());
	}

	protected void setSpeciesOfTreatedOrganism() throws MigrationException {
		newTypeInstance.setSpeciesOfTreatedOrganism(((edu.pitt.apollo.types.v3_1_0.Treatment) oldTypeInstance).getSpeciesOfTreatedOrganism());
	}

	protected void setPathogen() throws MigrationException {
		ApolloPathogenCodeSetter setter = new ApolloPathogenCodeSetter(edu.pitt.apollo.types.v4_0.ApolloPathogenCode.class,((edu.pitt.apollo.types.v3_1_0.Treatment) oldTypeInstance).getPathogen());
		setter.set();
		newTypeInstance.setPathogen(setter.getNewTypeInstance());
	}

	protected void setNumDosesInTreatmentCourse() throws MigrationException {
		newTypeInstance.setNumDosesInTreatmentCourse(((edu.pitt.apollo.types.v3_1_0.Treatment) oldTypeInstance).getNumDosesInTreatmentCourse());
	}

	protected void setDurationOfTreatmentCourse() throws MigrationException {
		if (((edu.pitt.apollo.types.v3_1_0.Treatment) oldTypeInstance).getDurationOfTreatmentCourse() != null) {
			DurationSetter setter = DurationSetterFactory.getSetter(((edu.pitt.apollo.types.v3_1_0.Treatment) oldTypeInstance).getDurationOfTreatmentCourse());
			setter.set();
			newTypeInstance.setDurationOfTreatmentCourse(setter.getNewTypeInstance());
		}

	}

	protected void setTreatmentContraindications() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.TreatmentContraindication oldObj : ((edu.pitt.apollo.types.v3_1_0.Treatment) oldTypeInstance).getTreatmentContraindications()) {
			TreatmentContraindicationSetter setter = new TreatmentContraindicationSetter(edu.pitt.apollo.types.v4_0.TreatmentContraindication.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.TreatmentContraindication newObj = setter.getNewTypeInstance();
			newTypeInstance.getTreatmentContraindications().add(newObj);
		}

	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
			setDescription();
			setSpeciesOfTreatedOrganism();
			setPathogen();
			setNumDosesInTreatmentCourse();
			setDurationOfTreatmentCourse();
			setTreatmentContraindications();
		}
	}

	@Override
	public T getNewTypeInstance() {
		return newTypeInstance;
	}

}