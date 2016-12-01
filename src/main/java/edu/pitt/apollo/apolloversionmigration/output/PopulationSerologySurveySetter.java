package edu.pitt.apollo.apolloversionmigration.output;

public class PopulationSerologySurveySetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.PopulationSerologySurvey> {

	public PopulationSerologySurveySetter(Class<edu.pitt.apollo.types.v4_0.PopulationSerologySurvey> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setSpeciesSampled() throws MigrationException {
		newTypeInstance.setSpeciesSampled(((edu.pitt.apollo.types.v3_1_0.PopulationSerologySurvey) oldTypeInstance).getSpeciesSampled());
	}

	protected void setSpeciesSampledNcbiTaxonId() throws MigrationException {
		newTypeInstance.setSpeciesSampledNcbiTaxonId(((edu.pitt.apollo.types.v3_1_0.PopulationSerologySurvey) oldTypeInstance).getSpeciesSampledNcbiTaxonId());
	}

	protected void setNumberSampled() throws MigrationException {
		newTypeInstance.setNumberSampled(((edu.pitt.apollo.types.v3_1_0.PopulationSerologySurvey) oldTypeInstance).getNumberSampled());
	}

	protected void setWhereSampled() throws MigrationException {
		newTypeInstance.setWhereSampled(((edu.pitt.apollo.types.v3_1_0.PopulationSerologySurvey) oldTypeInstance).getWhereSampled());
	}

	protected void setTestName() throws MigrationException {
		newTypeInstance.setTestName(((edu.pitt.apollo.types.v3_1_0.PopulationSerologySurvey) oldTypeInstance).getTestName());
	}

	protected void setTestLoincId() throws MigrationException {
		newTypeInstance.setTestLoincId(((edu.pitt.apollo.types.v3_1_0.PopulationSerologySurvey) oldTypeInstance).getTestLoincId());
	}

	protected void setNumberOfSamplesPositive() throws MigrationException {
		newTypeInstance.setNumberOfSamplesPositive(((edu.pitt.apollo.types.v3_1_0.PopulationSerologySurvey) oldTypeInstance).getNumberOfSamplesPositive());
	}

	protected void setReferenceId() throws MigrationException {
		newTypeInstance.setReferenceId(((edu.pitt.apollo.types.v3_1_0.PopulationSerologySurvey) oldTypeInstance).getReferenceId());
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			setSpeciesSampled();
			setSpeciesSampledNcbiTaxonId();
			setNumberSampled();
			setWhereSampled();
			setTestName();
			setTestLoincId();
			setNumberOfSamplesPositive();
			setReferenceId();
		}
	}

}