package edu.pitt.apollo.apolloversionmigration.output;

public class VaccinationEfficacyInferredSetter extends TreatmentEfficacySetter<edu.pitt.apollo.types.v4_0_1.VaccinationEfficacyInferred> {

	public VaccinationEfficacyInferredSetter(Class<edu.pitt.apollo.types.v4_0_1.VaccinationEfficacyInferred> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setInferredFromTheseStudies() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.VaccinationEfficacyStudy oldObj : ((edu.pitt.apollo.types.v3_1_0.VaccinationEfficacyInferred) oldTypeInstance).getInferredFromTheseStudies()) {
			VaccinationEfficacyStudySetter setter = new VaccinationEfficacyStudySetter(edu.pitt.apollo.types.v4_0_1.VaccinationEfficacyStudy.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0_1.VaccinationEfficacyStudy newObj = setter.getNewTypeInstance();
			newTypeInstance.getInferredFromTheseStudies().add(newObj);
		}

	}

	protected void setVaccinationEfficacyModel() throws MigrationException {
		BayesianNetworkSetter setter = new BayesianNetworkSetter(edu.pitt.apollo.types.v4_0_1.BayesianNetwork.class,((edu.pitt.apollo.types.v3_1_0.VaccinationEfficacyInferred) oldTypeInstance).getVaccinationEfficacyModel());
		setter.set();
		newTypeInstance.setVaccinationEfficacyModel(setter.getNewTypeInstance());
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
			setInferredFromTheseStudies();
			setVaccinationEfficacyModel();
		}
	}

}