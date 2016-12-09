package edu.pitt.apollo.apolloversionmigration.output;

public class InfectionSetter<T extends edu.pitt.apollo.types.v4_0_1.Infection> extends ApolloIndexableItemSetter<T> {

	public InfectionSetter(Class<T> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setPathogen() throws MigrationException {
		ApolloPathogenCodeSetter setter = new ApolloPathogenCodeSetter(edu.pitt.apollo.types.v4_0_1.ApolloPathogenCode.class,((edu.pitt.apollo.types.v3_1_0.Infection) oldTypeInstance).getPathogen());
		setter.set();
		newTypeInstance.setPathogen(setter.getNewTypeInstance());
	}

	protected void setHost() throws MigrationException {
		newTypeInstance.setHost(((edu.pitt.apollo.types.v3_1_0.Infection) oldTypeInstance).getHost());
	}

	protected void setInfectiousDiseases() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.InfectiousDisease oldObj : ((edu.pitt.apollo.types.v3_1_0.Infection) oldTypeInstance).getInfectiousDiseases()) {
			InfectiousDiseaseSetter setter = new InfectiousDiseaseSetter(edu.pitt.apollo.types.v4_0_1.InfectiousDisease.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0_1.InfectiousDisease newObj = setter.getNewTypeInstance();
			newTypeInstance.getInfectiousDiseases().add(newObj);
		}

	}

	protected void setInfectionAcquisitionsFromInfectedHosts() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.InfectionAcquisitionFromInfectedHost oldObj : ((edu.pitt.apollo.types.v3_1_0.Infection) oldTypeInstance).getInfectionAcquisitionsFromInfectedHosts()) {
			InfectionAcquisitionFromInfectedHostSetter setter = new InfectionAcquisitionFromInfectedHostSetter(edu.pitt.apollo.types.v4_0_1.InfectionAcquisitionFromInfectedHost.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0_1.InfectionAcquisitionFromInfectedHost newObj = setter.getNewTypeInstance();
			newTypeInstance.getInfectionAcquisitionsFromInfectedHosts().add(newObj);
		}

	}

	protected void setInfectionAcquisitionsFromContaminatedThings() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.InfectionAcquisitionFromContaminatedAbioticThing oldObj : ((edu.pitt.apollo.types.v3_1_0.Infection) oldTypeInstance).getInfectionAcquisitionsFromContaminatedThings()) {
			InfectionAcquisitionFromContaminatedAbioticThingSetter setter = new InfectionAcquisitionFromContaminatedAbioticThingSetter(edu.pitt.apollo.types.v4_0_1.InfectionAcquisitionFromContaminatedAbioticThing.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0_1.InfectionAcquisitionFromContaminatedAbioticThing newObj = setter.getNewTypeInstance();
			newTypeInstance.getInfectionAcquisitionsFromContaminatedThings().add(newObj);
		}

	}

	protected void setInfectionAcquisitionsFromColonizedHosts() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.InfectionAcquisitionFromColonizedHost oldObj : ((edu.pitt.apollo.types.v3_1_0.Infection) oldTypeInstance).getInfectionAcquisitionsFromColonizedHosts()) {
			InfectionAcquisitionFromColonizedHostSetter setter = new InfectionAcquisitionFromColonizedHostSetter(edu.pitt.apollo.types.v4_0_1.InfectionAcquisitionFromColonizedHost.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0_1.InfectionAcquisitionFromColonizedHost newObj = setter.getNewTypeInstance();
			newTypeInstance.getInfectionAcquisitionsFromColonizedHosts().add(newObj);
		}

	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
			setPathogen();
			setHost();
			setInfectiousDiseases();
			setInfectionAcquisitionsFromInfectedHosts();
			setInfectionAcquisitionsFromContaminatedThings();
			setInfectionAcquisitionsFromColonizedHosts();
		}
	}

	@Override
	public T getNewTypeInstance() {
		return newTypeInstance;
	}

}