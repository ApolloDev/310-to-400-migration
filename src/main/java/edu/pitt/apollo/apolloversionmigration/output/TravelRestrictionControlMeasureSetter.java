package edu.pitt.apollo.apolloversionmigration.output;

public class TravelRestrictionControlMeasureSetter extends InfectiousDiseaseControlMeasureSetter<edu.pitt.apollo.types.v4_0.TravelRestrictionControlMeasure> {

	public TravelRestrictionControlMeasureSetter(Class<edu.pitt.apollo.types.v4_0.TravelRestrictionControlMeasure> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setMaximumTravelDistanceInKm() throws MigrationException {
		newTypeInstance.setMaximumTravelDistanceInKm(((edu.pitt.apollo.types.v3_1_0.TravelRestrictionControlMeasure) oldTypeInstance).getMaximumTravelDistanceInKm());
	}

	protected void setCompliance() throws MigrationException {
		ProbabilisticParameterSetter setter = new ProbabilisticParameterSetter(edu.pitt.apollo.types.v4_0.ProbabilisticParameter.class,((edu.pitt.apollo.types.v3_1_0.TravelRestrictionControlMeasure) oldTypeInstance).getCompliance());
		setter.set();
		newTypeInstance.setCompliance(setter.getNewTypeInstance());
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
			setMaximumTravelDistanceInKm();
			setCompliance();
		}
	}

}