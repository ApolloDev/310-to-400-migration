package edu.pitt.apollo.apolloversionmigration.output;

public class IndividualDecolonizationSetter extends TreatmentSetter<edu.pitt.apollo.types.v4_0_1.IndividualDecolonization> {

	public IndividualDecolonizationSetter(Class<edu.pitt.apollo.types.v4_0_1.IndividualDecolonization> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setName() throws MigrationException {
		if (((edu.pitt.apollo.types.v3_1_0.IndividualDecolonization) oldTypeInstance).getName() != null) {
			newTypeInstance.setName(edu.pitt.apollo.types.v4_0_1.IndividualDecolonizationEnum.valueOf(((edu.pitt.apollo.types.v3_1_0.IndividualDecolonization) oldTypeInstance).getName().toString()));
		}
	}

	protected void setEfficacies() throws MigrationException {
		for (java.lang.String oldObj : ((edu.pitt.apollo.types.v3_1_0.IndividualDecolonization) oldTypeInstance).getEfficacies()) {
			newTypeInstance.getEfficacies().add(oldObj);
		}

	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
			setName();
			setEfficacies();
		}
	}

}