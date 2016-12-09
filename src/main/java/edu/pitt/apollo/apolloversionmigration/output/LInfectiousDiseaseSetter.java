package edu.pitt.apollo.apolloversionmigration.output;

public abstract class LInfectiousDiseaseSetter extends InfectiousDiseaseSetter<edu.pitt.apollo.types.v4_0_1.LInfectiousDisease> {

	public LInfectiousDiseaseSetter(Class<edu.pitt.apollo.types.v4_0_1.LInfectiousDisease> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected abstract void setCoosalPathogen() throws MigrationException;
	protected abstract void setHoostSpecies() throws MigrationException;
	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
			setCoosalPathogen();
			setHoostSpecies();
		}
	}

}