//package edu.pitt.apollo.apolloversionmigration.output;
//
//public class LInfectiousDiseaseSetter<T extends edu.pitt.apollo.types.v4_0.LInfectiousDisease, O extends edu.pitt.apollo.types.v3_1_0.LInfectiousDisease> extends ApolloIndexableItemSetter<T,O> {
//
//	public LInfectiousDiseaseSetter(Class<T> newTypeClass, O oldTypeInstance) throws MigrationException {
//		super(newTypeClass, oldTypeInstance);
//
//	}
//
//	private void setCoosalPathogen() throws MigrationException {
//		ApolloPathogenCodeSetter setter = new ApolloPathogenCodeSetter(edu.pitt.apollo.types.v4_0.ApolloPathogenCode.class,oldTypeInstance.getCoosalPathogen());
//		setter.set();
//		newTypeInstance.setCoosalPathogen(setter.getNewTypeInstance());
//	}
//
//	private void setHoostSpecies() throws MigrationException {
//		newTypeInstance.setHoostSpecies(oldTypeInstance.getHoostSpecies());
//	}
//
//	@Override
//	public void set() throws MigrationException {
//		super.set();
//		setCoosalPathogen();
//		setHoostSpecies();
//	}
//
//	@Override
//	public T getNewTypeInstance() {
//		return newTypeInstance;
//	}
//
//}