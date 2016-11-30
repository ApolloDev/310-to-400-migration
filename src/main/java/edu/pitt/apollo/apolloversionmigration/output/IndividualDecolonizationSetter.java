package edu.pitt.apollo.apolloversionmigration.output;

public class IndividualDecolonizationSetter extends TreatmentSetter<edu.pitt.apollo.types.v4_0.IndividualDecolonization,edu.pitt.apollo.types.v3_1_0.IndividualDecolonization> {

	public IndividualDecolonizationSetter(Class<edu.pitt.apollo.types.v4_0.IndividualDecolonization> newTypeClass, edu.pitt.apollo.types.v3_1_0.IndividualDecolonization oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setName() throws MigrationException {
		newTypeInstance.setName(edu.pitt.apollo.types.v4_0.IndividualDecolonizationEnum.fromValue(oldTypeInstance.getName().toString()));
	}

	private void setEfficacies() throws MigrationException {
		for (java.lang.String oldObj : oldTypeInstance.getEfficacies()) {
			newTypeInstance.getEfficacies().add(oldObj);
		}

	}

	@Override
	public void set() throws MigrationException {
		super.set();
		setName();
		setEfficacies();
	}

}