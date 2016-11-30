package edu.pitt.apollo.apolloversionmigration.output;

public class InfectionSetter<T extends edu.pitt.apollo.types.v4_0.Infection, O extends edu.pitt.apollo.types.v3_1_0.Infection> extends ApolloIndexableItemSetter<T,O> {

	public InfectionSetter(Class<T> newTypeClass, O oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setPathogen() throws MigrationException {
		ApolloPathogenCodeSetter setter = new ApolloPathogenCodeSetter(edu.pitt.apollo.types.v4_0.ApolloPathogenCode.class,oldTypeInstance.getPathogen());
		setter.set();
		newTypeInstance.setPathogen(setter.getNewTypeInstance());
	}

	private void setHost() throws MigrationException {
		newTypeInstance.setHost(oldTypeInstance.getHost());
	}

	private void setInfectiousDiseases() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.InfectiousDisease oldObj : oldTypeInstance.getInfectiousDiseases()) {
			InfectiousDiseaseSetter setter = new InfectiousDiseaseSetter(edu.pitt.apollo.types.v4_0.InfectiousDisease.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.InfectiousDisease newObj = setter.getNewTypeInstance();
			newTypeInstance.getInfectiousDiseases().add(newObj);
		}

	}

	private void setInfectionAcquisitionsFromInfectedHosts() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.InfectionAcquisitionFromInfectedHost oldObj : oldTypeInstance.getInfectionAcquisitionsFromInfectedHosts()) {
			InfectionAcquisitionFromInfectedHostSetter setter = new InfectionAcquisitionFromInfectedHostSetter(edu.pitt.apollo.types.v4_0.InfectionAcquisitionFromInfectedHost.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.InfectionAcquisitionFromInfectedHost newObj = setter.getNewTypeInstance();
			newTypeInstance.getInfectionAcquisitionsFromInfectedHosts().add(newObj);
		}

	}

	private void setInfectionAcquisitionsFromContaminatedThings() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.InfectionAcquisitionFromContaminatedAbioticThing oldObj : oldTypeInstance.getInfectionAcquisitionsFromContaminatedThings()) {
			InfectionAcquisitionFromContaminatedAbioticThingSetter setter = new InfectionAcquisitionFromContaminatedAbioticThingSetter(edu.pitt.apollo.types.v4_0.InfectionAcquisitionFromContaminatedAbioticThing.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.InfectionAcquisitionFromContaminatedAbioticThing newObj = setter.getNewTypeInstance();
			newTypeInstance.getInfectionAcquisitionsFromContaminatedThings().add(newObj);
		}

	}

	private void setInfectionAcquisitionsFromColonizedHosts() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.InfectionAcquisitionFromColonizedHost oldObj : oldTypeInstance.getInfectionAcquisitionsFromColonizedHosts()) {
			InfectionAcquisitionFromColonizedHostSetter setter = new InfectionAcquisitionFromColonizedHostSetter(edu.pitt.apollo.types.v4_0.InfectionAcquisitionFromColonizedHost.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.InfectionAcquisitionFromColonizedHost newObj = setter.getNewTypeInstance();
			newTypeInstance.getInfectionAcquisitionsFromColonizedHosts().add(newObj);
		}

	}

	@Override
	public void set() throws MigrationException {
		super.set();
		setPathogen();
		setHost();
		setInfectiousDiseases();
		setInfectionAcquisitionsFromInfectedHosts();
		setInfectionAcquisitionsFromContaminatedThings();
		setInfectionAcquisitionsFromColonizedHosts();
	}

	@Override
	public T getNewTypeInstance() {
		return newTypeInstance;
	}

}