package edu.pitt.apollo.apolloversionmigration.output;

public abstract class LContaminationSetter extends ContaminationSetter<edu.pitt.apollo.types.v4_0_1.LContamination> {

	public LContaminationSetter(Class<edu.pitt.apollo.types.v4_0_1.LContamination> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected abstract void setXxx() throws MigrationException;
	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
			setXxx();
		}
	}

}