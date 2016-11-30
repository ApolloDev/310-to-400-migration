package edu.pitt.apollo.apolloversionmigration.output;

public class ContaminatedThingCensusDataSetter extends CensusDataSetter<edu.pitt.apollo.types.v4_0.ContaminatedThingCensusData,edu.pitt.apollo.types.v3_1_0.ContaminatedThingCensusData> {

	public ContaminatedThingCensusDataSetter(Class<edu.pitt.apollo.types.v4_0.ContaminatedThingCensusData> newTypeClass, edu.pitt.apollo.types.v3_1_0.ContaminatedThingCensusData oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setFractionContaminated() throws MigrationException {
		newTypeInstance.setFractionContaminated(oldTypeInstance.getFractionContaminated());
	}

	private void setExceptionSublocations() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.ContaminatedThingCensusData oldObj : oldTypeInstance.getExceptionSublocations()) {
			ContaminatedThingCensusDataSetter setter = new ContaminatedThingCensusDataSetter(edu.pitt.apollo.types.v4_0.ContaminatedThingCensusData.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.ContaminatedThingCensusData newObj = setter.getNewTypeInstance();
			newTypeInstance.getExceptionSublocations().add(newObj);
		}

	}

	@Override
	public void set() throws MigrationException {
		super.set();
		setFractionContaminated();
		setExceptionSublocations();
	}

}