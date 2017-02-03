package edu.pitt.apollo.apolloversionmigration.output;

public class EpidemicPeriodSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0_1.EpidemicPeriod> {

	public EpidemicPeriodSetter(Class<edu.pitt.apollo.types.v4_0_1.EpidemicPeriod> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setStartDate() throws MigrationException {
		newTypeInstance.setStartDate(((edu.pitt.apollo.types.v3_1_0.EpidemicPeriod) oldTypeInstance).getStartDate());
	}

	protected void setStartDateDefinition() throws MigrationException {
		if (((edu.pitt.apollo.types.v3_1_0.EpidemicPeriod) oldTypeInstance).getStartDateDefinition() != null) {
			newTypeInstance.setStartDateDefinition(edu.pitt.apollo.types.v4_0_1.EpidemicPeriodStartDefinitionEnum.valueOf(((edu.pitt.apollo.types.v3_1_0.EpidemicPeriod) oldTypeInstance).getStartDateDefinition().toString()));
		}
	}

	protected void setStartDateReferenceId() throws MigrationException {
		newTypeInstance.setStartDateReferenceId(((edu.pitt.apollo.types.v3_1_0.EpidemicPeriod) oldTypeInstance).getStartDateReferenceId());
	}

	protected void setEndDate() throws MigrationException {
		newTypeInstance.setEndDate(((edu.pitt.apollo.types.v3_1_0.EpidemicPeriod) oldTypeInstance).getEndDate());
	}

	protected void setEndDateDefinition() throws MigrationException {
		if (((edu.pitt.apollo.types.v3_1_0.EpidemicPeriod) oldTypeInstance).getEndDateDefinition() != null) {
			newTypeInstance.setEndDateDefinition(edu.pitt.apollo.types.v4_0_1.EpidemicPeriodEndDefinitionEnum.valueOf(((edu.pitt.apollo.types.v3_1_0.EpidemicPeriod) oldTypeInstance).getEndDateDefinition().toString()));
		}
	}

	protected void setEndDateReferenceId() throws MigrationException {
		newTypeInstance.setEndDateReferenceId(((edu.pitt.apollo.types.v3_1_0.EpidemicPeriod) oldTypeInstance).getEndDateReferenceId());
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			setStartDate();
			setStartDateDefinition();
			setStartDateReferenceId();
			setEndDate();
			setEndDateDefinition();
			setEndDateReferenceId();
		}
	}

}