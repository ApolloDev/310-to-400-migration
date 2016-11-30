package edu.pitt.apollo.apolloversionmigration.output;

public class EpidemicPeriodSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.EpidemicPeriod,edu.pitt.apollo.types.v3_1_0.EpidemicPeriod> {

	public EpidemicPeriodSetter(Class<edu.pitt.apollo.types.v4_0.EpidemicPeriod> newTypeClass, edu.pitt.apollo.types.v3_1_0.EpidemicPeriod oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setStartDate() throws MigrationException {
		newTypeInstance.setStartDate(oldTypeInstance.getStartDate());
	}

	private void setStartDateDefinition() throws MigrationException {
		newTypeInstance.setStartDateDefinition(edu.pitt.apollo.types.v4_0.EpidemicPeriodStartDefinitionEnum.fromValue(oldTypeInstance.getStartDateDefinition().toString()));
	}

	private void setEndDate() throws MigrationException {
		newTypeInstance.setEndDate(oldTypeInstance.getEndDate());
	}

	private void setEndDateDefinition() throws MigrationException {
		newTypeInstance.setEndDateDefinition(edu.pitt.apollo.types.v4_0.EpidemicPeriodEndDefinitionEnum.fromValue(oldTypeInstance.getEndDateDefinition().toString()));
	}

	@Override
	public void set() throws MigrationException {
		setStartDate();
		setStartDateDefinition();
		setEndDate();
		setEndDateDefinition();
	}

}