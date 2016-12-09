package edu.pitt.apollo.apolloversionmigration.output;

public class VaccinationEfficacyMeasuredSetter extends TreatmentEfficacySetter<edu.pitt.apollo.types.v4_0_1.VaccinationEfficacyMeasured> {

	public VaccinationEfficacyMeasuredSetter(Class<edu.pitt.apollo.types.v4_0_1.VaccinationEfficacyMeasured> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setMeasuredEfficacyValue() throws MigrationException {
		ConditionalProbabilityTableSetter setter = new ConditionalProbabilityTableSetter(edu.pitt.apollo.types.v4_0_1.ConditionalProbabilityTable.class,((edu.pitt.apollo.types.v3_1_0.VaccinationEfficacyMeasured) oldTypeInstance).getMeasuredEfficacyValue());
		setter.set();
		newTypeInstance.setMeasuredEfficacyValue(setter.getNewTypeInstance());
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
			setMeasuredEfficacyValue();
		}
	}

}