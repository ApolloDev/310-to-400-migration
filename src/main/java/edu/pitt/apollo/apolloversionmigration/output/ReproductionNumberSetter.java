package edu.pitt.apollo.apolloversionmigration.output;

public class ReproductionNumberSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.ReproductionNumber,edu.pitt.apollo.types.v3_1_0.ReproductionNumber> {

	public ReproductionNumberSetter(Class<edu.pitt.apollo.types.v4_0.ReproductionNumber> newTypeClass, edu.pitt.apollo.types.v3_1_0.ReproductionNumber oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setExactValue() throws MigrationException {
		newTypeInstance.setExactValue(oldTypeInstance.getExactValue());
	}

	private void setUncertainValue() throws MigrationException {
		UncertainValueSetter setter = UncertainValueSetterFactory.getSetter(oldTypeInstance.getUncertainValue());
		setter.set();
		newTypeInstance.setUncertainValue(setter.getNewTypeInstance());
	}

	private void setReferenceId() throws MigrationException {
		newTypeInstance.setReferenceId(oldTypeInstance.getReferenceId());
	}

	@Override
	public void set() throws MigrationException {
		setExactValue();
		setUncertainValue();
		setReferenceId();
	}

}