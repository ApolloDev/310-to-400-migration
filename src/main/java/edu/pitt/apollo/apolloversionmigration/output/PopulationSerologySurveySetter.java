package edu.pitt.apollo.apolloversionmigration.output;

public class PopulationSerologySurveySetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.PopulationSerologySurvey,edu.pitt.apollo.types.v3_1_0.PopulationSerologySurvey> {

	public PopulationSerologySurveySetter(Class<edu.pitt.apollo.types.v4_0.PopulationSerologySurvey> newTypeClass, edu.pitt.apollo.types.v3_1_0.PopulationSerologySurvey oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setSpeciesSampled() throws MigrationException {
		newTypeInstance.setSpeciesSampled(oldTypeInstance.getSpeciesSampled());
	}

	private void setSpeciesSampledNcbiTaxonId() throws MigrationException {
		newTypeInstance.setSpeciesSampledNcbiTaxonId(oldTypeInstance.getSpeciesSampledNcbiTaxonId());
	}

	private void setNumberSampled() throws MigrationException {
		newTypeInstance.setNumberSampled(oldTypeInstance.getNumberSampled());
	}

	private void setWhereSampled() throws MigrationException {
		newTypeInstance.setWhereSampled(oldTypeInstance.getWhereSampled());
	}

	private void setTestName() throws MigrationException {
		newTypeInstance.setTestName(oldTypeInstance.getTestName());
	}

	private void setTestLoincId() throws MigrationException {
		newTypeInstance.setTestLoincId(oldTypeInstance.getTestLoincId());
	}

	private void setNumberOfSamplesPositive() throws MigrationException {
		newTypeInstance.setNumberOfSamplesPositive(oldTypeInstance.getNumberOfSamplesPositive());
	}

	private void setReferenceId() throws MigrationException {
		newTypeInstance.setReferenceId(oldTypeInstance.getReferenceId());
	}

	@Override
	public void set() throws MigrationException {
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