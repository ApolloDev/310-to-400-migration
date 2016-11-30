package edu.pitt.apollo.apolloversionmigration.output;

public class TravelRestrictionControlMeasureSetter extends InfectiousDiseaseControlMeasureSetter<edu.pitt.apollo.types.v4_0.TravelRestrictionControlMeasure,edu.pitt.apollo.types.v3_1_0.TravelRestrictionControlMeasure> {

	public TravelRestrictionControlMeasureSetter(Class<edu.pitt.apollo.types.v4_0.TravelRestrictionControlMeasure> newTypeClass, edu.pitt.apollo.types.v3_1_0.TravelRestrictionControlMeasure oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setMaximumTravelDistanceInKm() throws MigrationException {
		newTypeInstance.setMaximumTravelDistanceInKm(oldTypeInstance.getMaximumTravelDistanceInKm());
	}

	private void setCompliance() throws MigrationException {
		ProbabilisticParameterSetter setter = new ProbabilisticParameterSetter(edu.pitt.apollo.types.v4_0.ProbabilisticParameter.class,oldTypeInstance.getCompliance());
		setter.set();
		newTypeInstance.setCompliance(setter.getNewTypeInstance());
	}

	@Override
	public void set() throws MigrationException {
		super.set();
		setMaximumTravelDistanceInKm();
		setCompliance();
	}

}