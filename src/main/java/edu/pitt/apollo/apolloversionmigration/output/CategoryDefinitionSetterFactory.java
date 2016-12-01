package edu.pitt.apollo.apolloversionmigration.output;

public class CategoryDefinitionSetterFactory {

	public static CategoryDefinitionSetter getSetter(Object oldTypeInstance) throws MigrationException {

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.MeasuredQuantityRangeCategoryDefinition) {

			return new MeasuredQuantityRangeCategoryDefinitionSetterImpl(edu.pitt.apollo.types.v4_0.MeasuredQuantityRangeCategoryDefinition.class, oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.SourceOfInfectionCategoryDefinition) {

			return new SourceOfInfectionCategoryDefinitionSetter(edu.pitt.apollo.types.v4_0.SourceOfInfectionCategoryDefinition.class, oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.PlaceCategoryDefinition) {

			return new PlaceCategoryDefinitionSetter(edu.pitt.apollo.types.v4_0.PlaceCategoryDefinition.class, oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.SchoolingStatusCategoryDefinition) {

			return new SchoolingStatusCategoryDefinitionSetter(edu.pitt.apollo.types.v4_0.SchoolingStatusCategoryDefinition.class, oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.AgeRangeCategoryDefinition) {

			return new AgeRangeCategoryDefinitionSetterImpl(edu.pitt.apollo.types.v4_0.AgeRangeCategoryDefinition.class, oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.TimeSpanCategoryDefinition) {

			return new TimeSpanCategoryDefinitionSetter(edu.pitt.apollo.types.v4_0.TimeSpanCategoryDefinition.class, oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.GenderCategoryDefinition) {

			return new GenderCategoryDefinitionSetter(edu.pitt.apollo.types.v4_0.GenderCategoryDefinition.class, oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.EmploymentStatusCategoryDefinition) {

			return new EmploymentStatusCategoryDefinitionSetter(edu.pitt.apollo.types.v4_0.EmploymentStatusCategoryDefinition.class, oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.RealTimePointCategoryDefinition) {

			return new RealTimePointCategoryDefinitionSetter(edu.pitt.apollo.types.v4_0.RealTimePointCategoryDefinition.class, oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.HealthcareFacilityCategoryDefinition) {

			return new HealthcareFacilityCategoryDefinitionSetter(edu.pitt.apollo.types.v4_0.HealthcareFacilityCategoryDefinition.class, oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.DiseaseOutcomeCategoryDefinition) {

			return new DiseaseOutcomeCategoryDefinitionSetter(edu.pitt.apollo.types.v4_0.DiseaseOutcomeCategoryDefinition.class, oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.RealTimeSpanCategoryDefinition) {

			return new RealTimeSpanCategoryDefinitionSetter(edu.pitt.apollo.types.v4_0.RealTimeSpanCategoryDefinition.class, oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.RealDateSpanCategoryDefinition) {

			return new RealDateSpanCategoryDefinitionSetter(edu.pitt.apollo.types.v4_0.RealDateSpanCategoryDefinition.class, oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.CaseDefinition) {

			return new CaseDefinitionSetter(edu.pitt.apollo.types.v4_0.CaseDefinition.class, oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.DisabilityStatusCategoryDefinition) {

			return new DisabilityStatusCategoryDefinitionSetter(edu.pitt.apollo.types.v4_0.DisabilityStatusCategoryDefinition.class, oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.MaritalStatusCategoryDefinition) {

			return new MaritalStatusCategoryDefinitionSetter(edu.pitt.apollo.types.v4_0.MaritalStatusCategoryDefinition.class, oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.LocationCategoryDefinition) {

			return new LocationCategoryDefinitionSetter(edu.pitt.apollo.types.v4_0.LocationCategoryDefinition.class, oldTypeInstance);
		}

		throw new UnsupportedTypeException("Type " + oldTypeInstance.getClass().getCanonicalName() + " is not supported");

	}


}

