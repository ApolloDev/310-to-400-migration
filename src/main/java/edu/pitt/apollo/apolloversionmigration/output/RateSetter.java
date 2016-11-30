package edu.pitt.apollo.apolloversionmigration.output;

public class RateSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.Rate,edu.pitt.apollo.types.v3_1_0.Rate> {

	public RateSetter(Class<edu.pitt.apollo.types.v4_0.Rate> newTypeClass, edu.pitt.apollo.types.v3_1_0.Rate oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setNumeratorUnitOfMeasure() throws MigrationException {
		newTypeInstance.setNumeratorUnitOfMeasure(edu.pitt.apollo.types.v4_0.UnitOfMeasureEnum.fromValue(oldTypeInstance.getNumeratorUnitOfMeasure().toString()));
	}

	private void setDenominatorUnitOfMeasure() throws MigrationException {
		newTypeInstance.setDenominatorUnitOfMeasure(edu.pitt.apollo.types.v4_0.UnitOfMeasureEnum.fromValue(oldTypeInstance.getDenominatorUnitOfMeasure().toString()));
	}

	private void setValue() throws MigrationException {
		newTypeInstance.setValue(oldTypeInstance.getValue());
	}

	private void setProbabilityDistribution() throws MigrationException {
		ProbabilityDistributionSetter setter = ProbabilityDistributionSetterFactory.getSetter(oldTypeInstance.getProbabilityDistribution());
		setter.set();
		newTypeInstance.setProbabilityDistribution(setter.getNewTypeInstance());
	}

	@Override
	public void set() throws MigrationException {
		setNumeratorUnitOfMeasure();
		setDenominatorUnitOfMeasure();
		setValue();
		setProbabilityDistribution();
	}

}