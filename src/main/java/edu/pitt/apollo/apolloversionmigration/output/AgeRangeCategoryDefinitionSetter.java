package edu.pitt.apollo.apolloversionmigration.output;

import edu.pitt.apollo.types.v4_0.Bound;

public class AgeRangeCategoryDefinitionSetter extends CategoryDefinitionSetter<edu.pitt.apollo.types.v4_0.AgeRangeCategoryDefinition,edu.pitt.apollo.types.v3_1_0.AgeRangeCategoryDefinition> {

	public AgeRangeCategoryDefinitionSetter(Class<edu.pitt.apollo.types.v4_0.AgeRangeCategoryDefinition> newTypeClass, edu.pitt.apollo.types.v3_1_0.AgeRangeCategoryDefinition oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

//	private void setLabel() throws MigrationException {
//		newTypeInstance.setLabel(oldTypeInstance.getLabel());
//	}

	private void setUnitOfTimeForLowerBound() throws MigrationException {
		newTypeInstance.setUnitOfTimeForLowerBound(edu.pitt.apollo.types.v4_0.UnitOfTimeEnum.fromValue(oldTypeInstance.getUnitOfTimeForLowerBound().toString()));
	}

	private void setLowerBound() throws MigrationException {
		BoundSetter setter = new BoundSetter(Bound.class,oldTypeInstance.getLowerBound());
		setter.set();
		newTypeInstance.setLowerBound(setter.getNewTypeInstance());
	}

	private void setUnitOfTimeForUpperBound() throws MigrationException {
		newTypeInstance.setUnitOfTimeForUpperBound(edu.pitt.apollo.types.v4_0.UnitOfTimeEnum.fromValue(oldTypeInstance.getUnitOfTimeForUpperBound().toString()));
	}

	private void setUpperBound() throws MigrationException {
		BoundSetter setter = new BoundSetter(Bound.class,oldTypeInstance.getUpperBound());
		setter.set();
		newTypeInstance.setUpperBound(setter.getNewTypeInstance());
	}

	@Override
	public void set() throws MigrationException {
		super.set();
//		setLabel();
		setUnitOfTimeForLowerBound();
		setLowerBound();
		setUnitOfTimeForUpperBound();
		setUpperBound();
	}

}