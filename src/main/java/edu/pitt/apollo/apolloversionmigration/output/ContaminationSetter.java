package edu.pitt.apollo.apolloversionmigration.output;

public class ContaminationSetter<T extends edu.pitt.apollo.types.v4_0_1.Contamination> extends ApolloIndexableItemSetter<T> {

	public ContaminationSetter(Class<T> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setPathogen() throws MigrationException {
		ApolloPathogenCodeSetter setter = new ApolloPathogenCodeSetter(edu.pitt.apollo.types.v4_0_1.ApolloPathogenCode.class,((edu.pitt.apollo.types.v3_1_0.Contamination) oldTypeInstance).getPathogen());
		setter.set();
		newTypeInstance.setPathogen(setter.getNewTypeInstance());
	}

	protected void setAbioticThing() throws MigrationException {
		if (((edu.pitt.apollo.types.v3_1_0.Contamination) oldTypeInstance).getAbioticThing() != null) {
			newTypeInstance.setAbioticThing(edu.pitt.apollo.types.v4_0_1.AbioticThingEnum.valueOf(((edu.pitt.apollo.types.v3_1_0.Contamination) oldTypeInstance).getAbioticThing().toString()));
		}
	}

	protected void setContaminationDuration() throws MigrationException {
		if (((edu.pitt.apollo.types.v3_1_0.Contamination) oldTypeInstance).getContaminationDuration() != null) {
			DurationSetter setter = DurationSetterFactory.getSetter(((edu.pitt.apollo.types.v3_1_0.Contamination) oldTypeInstance).getContaminationDuration());
			setter.set();
			newTypeInstance.setContaminationDuration(setter.getNewTypeInstance());
		}

	}

	protected void setContaminationAcquisition() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.ContaminationAcquisition oldObj : ((edu.pitt.apollo.types.v3_1_0.Contamination) oldTypeInstance).getContaminationAcquisition()) {
			ContaminationAcquisitionSetter setter = new ContaminationAcquisitionSetter(edu.pitt.apollo.types.v4_0_1.ContaminationAcquisition.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0_1.ContaminationAcquisition newObj = setter.getNewTypeInstance();
			newTypeInstance.getContaminationAcquisition().add(newObj);
		}

	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
			setPathogen();
			setAbioticThing();
			setContaminationDuration();
			setContaminationAcquisition();
		}
	}

	@Override
	public T getNewTypeInstance() {
		return newTypeInstance;
	}

}