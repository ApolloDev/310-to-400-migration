package edu.pitt.apollo.apolloversionmigration.output;

public class ContaminationSetter extends LContaminationSetter<edu.pitt.apollo.types.v4_0.Contamination,edu.pitt.apollo.types.v3_1_0.Contamination> {

	public ContaminationSetter(Class<edu.pitt.apollo.types.v4_0.Contamination> newTypeClass, edu.pitt.apollo.types.v3_1_0.Contamination oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setPathogen() throws MigrationException {
		ApolloPathogenCodeSetter setter = new ApolloPathogenCodeSetter(edu.pitt.apollo.types.v4_0.ApolloPathogenCode.class,oldTypeInstance.getPathogen());
		setter.set();
		newTypeInstance.setPathogen(setter.getNewTypeInstance());
	}

	private void setAbioticThing() throws MigrationException {
		newTypeInstance.setAbioticThing(edu.pitt.apollo.types.v4_0.AbioticThingEnum.fromValue(oldTypeInstance.getAbioticThing().toString()));
	}

	private void setContaminationDuration() throws MigrationException {
		DurationSetter setter = DurationSetterFactory.getSetter(oldTypeInstance.getContaminationDuration());
		setter.set();
		newTypeInstance.setContaminationDuration(setter.getNewTypeInstance());
	}

	private void setContaminationAcquisition() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.ContaminationAcquisition oldObj : oldTypeInstance.getContaminationAcquisition()) {
			ContaminationAcquisitionSetter setter = new ContaminationAcquisitionSetter(edu.pitt.apollo.types.v4_0.ContaminationAcquisition.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.ContaminationAcquisition newObj = setter.getNewTypeInstance();
			newTypeInstance.getContaminationAcquisition().add(newObj);
		}

	}

	@Override
	public void set() throws MigrationException {
		super.set();
		setPathogen();
		setAbioticThing();
		setContaminationDuration();
		setContaminationAcquisition();
	}

}