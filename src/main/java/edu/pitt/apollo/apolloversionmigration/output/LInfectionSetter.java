//package edu.pitt.apollo.apolloversionmigration.output;
//
//public class LInfectionSetter extends InfectionSetter<edu.pitt.apollo.types.v4_0.LInfection,edu.pitt.apollo.types.v3_1_0.Infection> {
//
//	public LInfectionSetter(Class<edu.pitt.apollo.types.v4_0.LInfection> newTypeClass, edu.pitt.apollo.types.v3_1_0.Infection oldTypeInstance) throws MigrationException {
//		super(newTypeClass, oldTypeInstance);
//
//	}
//
//	private void setLocation() throws MigrationException {
//		newTypeInstance.setLocation(oldTypeInstance.getLocation());
//	}
//
//	private void setTimePeriod() throws MigrationException {
//		IntervalSetter setter = new IntervalSetter(edu.pitt.apollo.types.v4_0.Interval.class,oldTypeInstance.getTimePeriod());
//		setter.set();
//		newTypeInstance.setTimePeriod(setter.getNewTypeInstance());
//	}
//
//	@Override
//	public void set() throws MigrationException {
//		super.set();
//		setLocation();
//		setTimePeriod();
//	}
//
//}