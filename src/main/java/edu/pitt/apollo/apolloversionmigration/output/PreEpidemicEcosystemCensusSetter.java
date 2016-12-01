package edu.pitt.apollo.apolloversionmigration.output;

public class PreEpidemicEcosystemCensusSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.PreEpidemicEcosystemCensus> {

	public PreEpidemicEcosystemCensusSetter(Class<edu.pitt.apollo.types.v4_0.PreEpidemicEcosystemCensus> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setNameOfAdministrativeUnit() throws MigrationException {
		newTypeInstance.setNameOfAdministrativeUnit(((edu.pitt.apollo.types.v3_1_0.PreEpidemicEcosystemCensus) oldTypeInstance).getNameOfAdministrativeUnit());
	}

	protected void setNumberOfPeople() throws MigrationException {
		newTypeInstance.setNumberOfPeople(((edu.pitt.apollo.types.v3_1_0.PreEpidemicEcosystemCensus) oldTypeInstance).getNumberOfPeople());
	}

	protected void setNumberOfHouseholds() throws MigrationException {
		newTypeInstance.setNumberOfHouseholds(((edu.pitt.apollo.types.v3_1_0.PreEpidemicEcosystemCensus) oldTypeInstance).getNumberOfHouseholds());
	}

	protected void setNumberOfSchools() throws MigrationException {
		newTypeInstance.setNumberOfSchools(((edu.pitt.apollo.types.v3_1_0.PreEpidemicEcosystemCensus) oldTypeInstance).getNumberOfSchools());
	}

	protected void setNumberOfWorkplaces() throws MigrationException {
		newTypeInstance.setNumberOfWorkplaces(((edu.pitt.apollo.types.v3_1_0.PreEpidemicEcosystemCensus) oldTypeInstance).getNumberOfWorkplaces());
	}

	protected void setAdditionalDescription() throws MigrationException {
		newTypeInstance.setAdditionalDescription(((edu.pitt.apollo.types.v3_1_0.PreEpidemicEcosystemCensus) oldTypeInstance).getAdditionalDescription());
	}

	protected void setSubLocationCensuses() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.PreEpidemicEcosystemCensus oldObj : ((edu.pitt.apollo.types.v3_1_0.PreEpidemicEcosystemCensus) oldTypeInstance).getSubLocationCensuses()) {
			PreEpidemicEcosystemCensusSetter setter = new PreEpidemicEcosystemCensusSetter(edu.pitt.apollo.types.v4_0.PreEpidemicEcosystemCensus.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.PreEpidemicEcosystemCensus newObj = setter.getNewTypeInstance();
			newTypeInstance.getSubLocationCensuses().add(newObj);
		}

	}

	protected void setReferenceId() throws MigrationException {
		newTypeInstance.setReferenceId(((edu.pitt.apollo.types.v3_1_0.PreEpidemicEcosystemCensus) oldTypeInstance).getReferenceId());
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
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

}