package edu.pitt.apollo.apolloversionmigration.output;

public abstract class HouseholdSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.Household> {

	public HouseholdSetter(Class<edu.pitt.apollo.types.v4_0.Household> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setHouseholdId() throws MigrationException {
		newTypeInstance.setHouseholdId(((edu.pitt.apollo.types.v3_1_0.Household) oldTypeInstance).getHouseholdId());
	}

	protected void setGroupQuarters() throws MigrationException {
		newTypeInstance.setGroupQuarters(((edu.pitt.apollo.types.v3_1_0.Household) oldTypeInstance).getGroupQuarters());
	}

	protected abstract void setUnRelated() throws MigrationException;
	protected abstract void setIndividualIds() throws MigrationException;
	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			setHouseholdId();
			setGroupQuarters();
			setUnRelated();
			setIndividualIds();
		}
	}

}