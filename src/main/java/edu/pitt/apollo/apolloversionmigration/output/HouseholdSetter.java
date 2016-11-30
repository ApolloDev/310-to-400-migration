package edu.pitt.apollo.apolloversionmigration.output;

public class HouseholdSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.Household,edu.pitt.apollo.types.v3_1_0.Household> {

	public HouseholdSetter(Class<edu.pitt.apollo.types.v4_0.Household> newTypeClass, edu.pitt.apollo.types.v3_1_0.Household oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setHouseholdId() throws MigrationException {
		newTypeInstance.setHouseholdId(oldTypeInstance.getHouseholdId());
	}

	private void setGroupQuarters() throws MigrationException {
		newTypeInstance.setGroupQuarters(oldTypeInstance.getGroupQuarters());
	}

	private void setUnRelated() throws MigrationException {
		newTypeInstance.setUnRelated(oldTypeInstance.getUnrelated());
	}

	private void setIndividualIds() throws MigrationException {
		for (java.math.BigInteger oldObj : oldTypeInstance.getIndividualIds()) {
			newTypeInstance.getIndividualIds().add(oldObj);
		}

	}

	@Override
	public void set() throws MigrationException {
		setHouseholdId();
		setGroupQuarters();
		setUnRelated();
		setIndividualIds();
	}

}