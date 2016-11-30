package edu.pitt.apollo.apolloversionmigration.output;

public class VaccinationEfficacyInferredSetter extends TreatmentEfficacySetter<edu.pitt.apollo.types.v4_0.VaccinationEfficacyInferred,edu.pitt.apollo.types.v3_1_0.VaccinationEfficacyInferred> {

	public VaccinationEfficacyInferredSetter(Class<edu.pitt.apollo.types.v4_0.VaccinationEfficacyInferred> newTypeClass, edu.pitt.apollo.types.v3_1_0.VaccinationEfficacyInferred oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setInferredFromTheseStudies() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.VaccinationEfficacyStudy oldObj : oldTypeInstance.getInferredFromTheseStudies()) {
			VaccinationEfficacyStudySetter setter = new VaccinationEfficacyStudySetter(edu.pitt.apollo.types.v4_0.VaccinationEfficacyStudy.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.VaccinationEfficacyStudy newObj = setter.getNewTypeInstance();
			newTypeInstance.getInferredFromTheseStudies().add(newObj);
		}

	}

	private void setVaccinationEfficacyModel() throws MigrationException {
		BayesianNetworkSetter setter = new BayesianNetworkSetter(edu.pitt.apollo.types.v4_0.BayesianNetwork.class,oldTypeInstance.getVaccinationEfficacyModel());
		setter.set();
		newTypeInstance.setVaccinationEfficacyModel(setter.getNewTypeInstance());
	}

	@Override
	public void set() throws MigrationException {
		super.set();
		setInferredFromTheseStudies();
		setVaccinationEfficacyModel();
	}

}