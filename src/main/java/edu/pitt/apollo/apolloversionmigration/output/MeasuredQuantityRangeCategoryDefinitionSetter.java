//package edu.pitt.apollo.apolloversionmigration.output;
//
//public class MeasuredQuantityRangeCategoryDefinitionSetter extends CategoryDefinitionSetter<edu.pitt.apollo.types.v4_0.MeasuredQuantityRangeCategoryDefinition,edu.pitt.apollo.types.v3_1_0.MeasuredQuantityRangeCategoryDefinition> {
//
//	public MeasuredQuantityRangeCategoryDefinitionSetter(Class<edu.pitt.apollo.types.v4_0.MeasuredQuantityRangeCategoryDefinition> newTypeClass, edu.pitt.apollo.types.v3_1_0.MeasuredQuantityRangeCategoryDefinition oldTypeInstance) throws MigrationException {
//		super(newTypeClass, oldTypeInstance);
//
//	}
//
//	private void setUnitOfMeasure() throws MigrationException {
//		newTypeInstance.setUnitOfMeasure(edu.pitt.apollo.types.v4_0.UnitOfMeasureEnum.fromValue(oldTypeInstance.getUnitOfMeasure().toString()));
//	}
//
//	private void setLowerBound() throws MigrationException {
//		BoundSetter setter = new BoundSetter(edu.pitt.apollo.types.v4_0.Bound.class,oldTypeInstance.getLowerBound());
//		setter.set();
//		newTypeInstance.setLowerBound(setter.getNewTypeInstance());
//	}
//
//	private void setUpperBound() throws MigrationException {
//		BoundSetter setter = new BoundSetter(edu.pitt.apollo.types.v4_0.Bound.class,oldTypeInstance.getUpperBound());
//		setter.set();
//		newTypeInstance.setUpperBound(setter.getNewTypeInstance());
//	}
//
//	@Override
//	public void set() throws MigrationException {
//		super.set();
//		setUnitOfMeasure();
//		setLowerBound();
//		setUpperBound();
//	}
//
//}