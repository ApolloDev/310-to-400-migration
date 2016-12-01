package edu.pitt.apollo.apolloversionmigration.output;

public class IndividualDiseaseSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.IndividualDisease> {

	public IndividualDiseaseSetter(Class<edu.pitt.apollo.types.v4_0.IndividualDisease> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setSnomedId() throws MigrationException {
		newTypeInstance.setSnomedId(((edu.pitt.apollo.types.v3_1_0.IndividualDisease) oldTypeInstance).getSnomedId());
	}

	protected void setDiseaseOutcomesWithDates() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.DiseaseOutcomeWithDate oldObj : ((edu.pitt.apollo.types.v3_1_0.IndividualDisease) oldTypeInstance).getDiseaseOutcomesWithDates()) {
			DiseaseOutcomeWithDateSetter setter = new DiseaseOutcomeWithDateSetter(edu.pitt.apollo.types.v4_0.DiseaseOutcomeWithDate.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.DiseaseOutcomeWithDate newObj = setter.getNewTypeInstance();
			newTypeInstance.getDiseaseOutcomesWithDates().add(newObj);
		}

	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			setSnomedId();
			setDiseaseOutcomesWithDates();
		}
	}

}