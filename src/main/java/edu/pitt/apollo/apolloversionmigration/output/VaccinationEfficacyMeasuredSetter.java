package edu.pitt.apollo.apolloversionmigration.output;

public class VaccinationEfficacyMeasuredSetter extends TreatmentEfficacySetter<edu.pitt.apollo.types.v4_0.VaccinationEfficacyMeasured,edu.pitt.apollo.types.v3_1_0.VaccinationEfficacyMeasured> {

	public VaccinationEfficacyMeasuredSetter(Class<edu.pitt.apollo.types.v4_0.VaccinationEfficacyMeasured> newTypeClass, edu.pitt.apollo.types.v3_1_0.VaccinationEfficacyMeasured oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setMeasuredEfficacyValue() throws MigrationException {
		ConditionalProbabilityTableSetter setter = new ConditionalProbabilityTableSetter(edu.pitt.apollo.types.v4_0.ConditionalProbabilityTable.class,oldTypeInstance.getMeasuredEfficacyValue());
		setter.set();
		newTypeInstance.setMeasuredEfficacyValue(setter.getNewTypeInstance());
	}

	@Override
	public void set() throws MigrationException {
		super.set();
		setMeasuredEfficacyValue();
	}

}