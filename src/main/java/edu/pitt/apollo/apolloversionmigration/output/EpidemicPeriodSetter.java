package edu.pitt.apollo.apolloversionmigration.output;

public class EpidemicPeriodSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.EpidemicPeriod> {

	public EpidemicPeriodSetter(Class<edu.pitt.apollo.types.v4_0.EpidemicPeriod> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setStartDate() throws MigrationException {
		newTypeInstance.setStartDate(((edu.pitt.apollo.types.v3_1_0.EpidemicPeriod) oldTypeInstance).getStartDate());
	}

	protected void setStartDateDefinition() throws MigrationException {
		newTypeInstance.setStartDateDefinition(edu.pitt.apollo.types.v4_0.EpidemicPeriodStartDefinitionEnum.valueOf(((edu.pitt.apollo.types.v3_1_0.EpidemicPeriod) oldTypeInstance).getStartDateDefinition().toString()));
	}

	protected void setEndDate() throws MigrationException {
		newTypeInstance.setEndDate(((edu.pitt.apollo.types.v3_1_0.EpidemicPeriod) oldTypeInstance).getEndDate());
	}

	protected void setEndDateDefinition() throws MigrationException {
		newTypeInstance.setEndDateDefinition(edu.pitt.apollo.types.v4_0.EpidemicPeriodEndDefinitionEnum.valueOf(((edu.pitt.apollo.types.v3_1_0.EpidemicPeriod) oldTypeInstance).getEndDateDefinition().toString()));
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			setStartDate();
			setStartDateDefinition();
			setEndDate();
			setEndDateDefinition();
		}
	}

}