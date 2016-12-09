package edu.pitt.apollo.apolloversionmigration.output;

public class ContaminatedThingCensusDataSetter extends CensusDataSetter<edu.pitt.apollo.types.v4_0_1.ContaminatedThingCensusData> {

	public ContaminatedThingCensusDataSetter(Class<edu.pitt.apollo.types.v4_0_1.ContaminatedThingCensusData> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setFractionContaminated() throws MigrationException {
		newTypeInstance.setFractionContaminated(((edu.pitt.apollo.types.v3_1_0.ContaminatedThingCensusData) oldTypeInstance).getFractionContaminated());
	}

	protected void setExceptionSublocations() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.ContaminatedThingCensusData oldObj : ((edu.pitt.apollo.types.v3_1_0.ContaminatedThingCensusData) oldTypeInstance).getExceptionSublocations()) {
			ContaminatedThingCensusDataSetter setter = new ContaminatedThingCensusDataSetter(edu.pitt.apollo.types.v4_0_1.ContaminatedThingCensusData.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0_1.ContaminatedThingCensusData newObj = setter.getNewTypeInstance();
			newTypeInstance.getExceptionSublocations().add(newObj);
		}

	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
			setFractionContaminated();
			setExceptionSublocations();
		}
	}

}