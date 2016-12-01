package edu.pitt.apollo.apolloversionmigration.output;

public class ReproductionNumberSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.ReproductionNumber> {

	public ReproductionNumberSetter(Class<edu.pitt.apollo.types.v4_0.ReproductionNumber> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setExactValue() throws MigrationException {
		newTypeInstance.setExactValue(((edu.pitt.apollo.types.v3_1_0.ReproductionNumber) oldTypeInstance).getExactValue());
	}

	protected void setUncertainValue() throws MigrationException {
		if (((edu.pitt.apollo.types.v3_1_0.ReproductionNumber) oldTypeInstance).getUncertainValue() != null) {
			UncertainValueSetter setter = UncertainValueSetterFactory.getSetter(((edu.pitt.apollo.types.v3_1_0.ReproductionNumber) oldTypeInstance).getUncertainValue());
			setter.set();
			newTypeInstance.setUncertainValue(setter.getNewTypeInstance());
		}

	}

	protected void setReferenceId() throws MigrationException {
		newTypeInstance.setReferenceId(((edu.pitt.apollo.types.v3_1_0.ReproductionNumber) oldTypeInstance).getReferenceId());
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			setExactValue();
			setUncertainValue();
			setReferenceId();
		}
	}

}