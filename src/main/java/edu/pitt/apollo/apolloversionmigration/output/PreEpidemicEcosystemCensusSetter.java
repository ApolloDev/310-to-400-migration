package edu.pitt.apollo.apolloversionmigration.output;

public class PreEpidemicEcosystemCensusSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.PreEpidemicEcosystemCensus,edu.pitt.apollo.types.v3_1_0.PreEpidemicEcosystemCensus> {

	public PreEpidemicEcosystemCensusSetter(Class<edu.pitt.apollo.types.v4_0.PreEpidemicEcosystemCensus> newTypeClass, edu.pitt.apollo.types.v3_1_0.PreEpidemicEcosystemCensus oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setNameOfAdministrativeUnit() throws MigrationException {
		newTypeInstance.setNameOfAdministrativeUnit(oldTypeInstance.getNameOfAdministrativeUnit());
	}

	private void setNumberOfPeople() throws MigrationException {
		newTypeInstance.setNumberOfPeople(oldTypeInstance.getNumberOfPeople());
	}

	private void setNumberOfHouseholds() throws MigrationException {
		newTypeInstance.setNumberOfHouseholds(oldTypeInstance.getNumberOfHouseholds());
	}

	private void setNumberOfSchools() throws MigrationException {
		newTypeInstance.setNumberOfSchools(oldTypeInstance.getNumberOfSchools());
	}

	private void setNumberOfWorkplaces() throws MigrationException {
		newTypeInstance.setNumberOfWorkplaces(oldTypeInstance.getNumberOfWorkplaces());
	}

	private void setAdditionalDescription() throws MigrationException {
		newTypeInstance.setAdditionalDescription(oldTypeInstance.getAdditionalDescription());
	}

	private void setSubLocationCensuses() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.PreEpidemicEcosystemCensus oldObj : oldTypeInstance.getSubLocationCensuses()) {
			PreEpidemicEcosystemCensusSetter setter = new PreEpidemicEcosystemCensusSetter(edu.pitt.apollo.types.v4_0.PreEpidemicEcosystemCensus.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.PreEpidemicEcosystemCensus newObj = setter.getNewTypeInstance();
			newTypeInstance.getSubLocationCensuses().add(newObj);
		}

	}

	private void setReferenceId() throws MigrationException {
		newTypeInstance.setReferenceId(oldTypeInstance.getReferenceId());
	}

	@Override
	public void set() throws MigrationException {
		setNameOfAdministrativeUnit();
		setNumberOfPeople();
		setNumberOfHouseholds();
		setNumberOfSchools();
		setNumberOfWorkplaces();
		setAdditionalDescription();
		setSubLocationCensuses();
		setReferenceId();
	}

}