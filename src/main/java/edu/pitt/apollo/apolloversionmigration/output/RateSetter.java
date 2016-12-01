package edu.pitt.apollo.apolloversionmigration.output;

public class RateSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.Rate> {

	public RateSetter(Class<edu.pitt.apollo.types.v4_0.Rate> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setNumeratorUnitOfMeasure() throws MigrationException {
		newTypeInstance.setNumeratorUnitOfMeasure(edu.pitt.apollo.types.v4_0.UnitOfMeasureEnum.valueOf(((edu.pitt.apollo.types.v3_1_0.Rate) oldTypeInstance).getNumeratorUnitOfMeasure().toString()));
	}

	protected void setDenominatorUnitOfMeasure() throws MigrationException {
		newTypeInstance.setDenominatorUnitOfMeasure(edu.pitt.apollo.types.v4_0.UnitOfMeasureEnum.valueOf(((edu.pitt.apollo.types.v3_1_0.Rate) oldTypeInstance).getDenominatorUnitOfMeasure().toString()));
	}

	protected void setValue() throws MigrationException {
		newTypeInstance.setValue(((edu.pitt.apollo.types.v3_1_0.Rate) oldTypeInstance).getValue());
	}

	protected void setProbabilityDistribution() throws MigrationException {
		if (((edu.pitt.apollo.types.v3_1_0.Rate) oldTypeInstance).getProbabilityDistribution() != null) {
			ProbabilityDistributionSetter setter = ProbabilityDistributionSetterFactory.getSetter(((edu.pitt.apollo.types.v3_1_0.Rate) oldTypeInstance).getProbabilityDistribution());
			setter.set();
			newTypeInstance.setProbabilityDistribution(setter.getNewTypeInstance());
		}

	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			setNumeratorUnitOfMeasure();
			setDenominatorUnitOfMeasure();
			setValue();
			setProbabilityDistribution();
		}
	}

}