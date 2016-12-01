package edu.pitt.apollo.apolloversionmigration.output;

import edu.pitt.apollo.types.v4_0.Bound;
import edu.pitt.apollo.types.v4_0.FiniteBoundaryTypeEnum;

public class AgeRangeCategoryDefinitionSetterImpl extends AgeRangeCategoryDefinitionSetter {

	public AgeRangeCategoryDefinitionSetterImpl(Class<edu.pitt.apollo.types.v4_0.AgeRangeCategoryDefinition> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	@Override
	protected void setLabel() throws MigrationException {

	}

	@Override
	protected void setUnitOfTimeForLowerBound() throws MigrationException {
		newTypeInstance.setUnitOfTimeForLowerBound(edu.pitt.apollo.types.v4_0.UnitOfTimeEnum.fromValue(((edu.pitt.apollo.types.v3_1_0.AgeRangeCategoryDefinition)oldTypeInstance).getUnitOfTimeForLowerBound().toString()));

	}

	@Override
	protected void setLowerBound() throws MigrationException {
		Bound bound = new Bound();
		bound.setFiniteBoundary(((edu.pitt.apollo.types.v3_1_0.AgeRangeCategoryDefinition)oldTypeInstance).getLowerBound().doubleValue());
		bound.setFiniteBoundaryType(FiniteBoundaryTypeEnum.INCLUSIVE);
		bound.setInfiniteBoundary(null);
		newTypeInstance.setLowerBound(bound);
	}

	@Override
	protected void setUnitOfTimeForUpperBound() throws MigrationException {
		newTypeInstance.setUnitOfTimeForUpperBound(edu.pitt.apollo.types.v4_0.UnitOfTimeEnum.fromValue(((edu.pitt.apollo.types.v3_1_0.AgeRangeCategoryDefinition)oldTypeInstance).getUnitOfTimeForUpperBound().toString()));

	}

	@Override
	protected void setUpperBound() throws MigrationException {
		Bound bound = new Bound();
		bound.setFiniteBoundary(((edu.pitt.apollo.types.v3_1_0.AgeRangeCategoryDefinition)oldTypeInstance).getUpperBound().doubleValue());
		bound.setFiniteBoundaryType(FiniteBoundaryTypeEnum.INCLUSIVE);
		bound.setInfiniteBoundary(null);
		newTypeInstance.setUpperBound(bound);
	}


}