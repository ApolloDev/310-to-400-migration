package edu.pitt.apollo.apolloversionmigration.output;

public class LContaminationSetter<T extends edu.pitt.apollo.types.v4_0.LContamination, O extends edu.pitt.apollo.types.v3_1_0.Contamination> extends ApolloIndexableItemSetter<T,O> {

	public LContaminationSetter(Class<T> newTypeClass, O oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setXxx() throws MigrationException {
//		ApolloPathogenCodeSetter setter = new ApolloPathogenCodeSetter(edu.pitt.apollo.types.v4_0.ApolloPathogenCode.class,oldTypeInstance.getXXX());
//		setter.set();
//		newTypeInstance.setXxx(setter.getNewTypeInstance());
	}

	@Override
	public void set() throws MigrationException {
		super.set();
		setXxx();
	}

	@Override
	public T getNewTypeInstance() {
		return newTypeInstance;
	}

}