package edu.pitt.apollo.apolloversionmigration.output;

public abstract class LInfectionSetter extends InfectionSetter<edu.pitt.apollo.types.v4_0.LInfection> {

	public LInfectionSetter(Class<edu.pitt.apollo.types.v4_0.LInfection> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected abstract void setLocation() throws MigrationException;
	protected abstract void setTimePeriod() throws MigrationException;
	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
			setLocation();
			setTimePeriod();
		}
	}

}