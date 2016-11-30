package edu.pitt.apollo.apolloversionmigration.output;

public class CategoryDefinitionSetterFactory {

	public static CategoryDefinitionSetter getSetter(Object oldTypeInstance) throws MigrationException {

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.SourceOfInfectionCategoryDefinition) {

			return new SourceOfInfectionCategoryDefinitionSetter(edu.pitt.apollo.types.v4_0.SourceOfInfectionCategoryDefinition.class, (edu.pitt.apollo.types.v3_1_0.SourceOfInfectionCategoryDefinition) oldTypeInstance);
		}

//		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.MeasuredQuantityRangeCategoryDefinition) {
//
//			return new MeasuredQuantityRangeCategoryDefinitionSetter(edu.pitt.apollo.types.v4_0.MeasuredQuantityRangeCategoryDefinition.class, (edu.pitt.apollo.types.v3_1_0.MeasuredQuantityRangeCategoryDefinition) oldTypeInstance);
//		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.HealthcareFacilityCategoryDefinition) {

			return new HealthcareFacilityCategoryDefinitionSetter(edu.pitt.apollo.types.v4_0.HealthcareFacilityCategoryDefinition.class, (edu.pitt.apollo.types.v3_1_0.HealthcareFacilityCategoryDefinition) oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.LocationCategoryDefinition) {

			return new LocationCategoryDefinitionSetter(edu.pitt.apollo.types.v4_0.LocationCategoryDefinition.class, (edu.pitt.apollo.types.v3_1_0.LocationCategoryDefinition) oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.SchoolingStatusCategoryDefinition) {

			return new SchoolingStatusCategoryDefinitionSetter(edu.pitt.apollo.types.v4_0.SchoolingStatusCategoryDefinition.class, (edu.pitt.apollo.types.v3_1_0.SchoolingStatusCategoryDefinition) oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.GenderCategoryDefinition) {

			return new GenderCategoryDefinitionSetter(edu.pitt.apollo.types.v4_0.GenderCategoryDefinition.class, (edu.pitt.apollo.types.v3_1_0.GenderCategoryDefinition) oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.RealTimePointCategoryDefinition) {

			return new RealTimePointCategoryDefinitionSetter(edu.pitt.apollo.types.v4_0.RealTimePointCategoryDefinition.class, (edu.pitt.apollo.types.v3_1_0.RealTimePointCategoryDefinition) oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.EmploymentStatusCategoryDefinition) {

			return new EmploymentStatusCategoryDefinitionSetter(edu.pitt.apollo.types.v4_0.EmploymentStatusCategoryDefinition.class, (edu.pitt.apollo.types.v3_1_0.EmploymentStatusCategoryDefinition) oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.RealTimeSpanCategoryDefinition) {

			return new RealTimeSpanCategoryDefinitionSetter(edu.pitt.apollo.types.v4_0.RealTimeSpanCategoryDefinition.class, (edu.pitt.apollo.types.v3_1_0.RealTimeSpanCategoryDefinition) oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.DisabilityStatusCategoryDefinition) {

			return new DisabilityStatusCategoryDefinitionSetter(edu.pitt.apollo.types.v4_0.DisabilityStatusCategoryDefinition.class, (edu.pitt.apollo.types.v3_1_0.DisabilityStatusCategoryDefinition) oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.TimeSpanCategoryDefinition) {

			return new TimeSpanCategoryDefinitionSetter(edu.pitt.apollo.types.v4_0.TimeSpanCategoryDefinition.class, (edu.pitt.apollo.types.v3_1_0.TimeSpanCategoryDefinition) oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.RealDateSpanCategoryDefinition) {

			return new RealDateSpanCategoryDefinitionSetter(edu.pitt.apollo.types.v4_0.RealDateSpanCategoryDefinition.class, (edu.pitt.apollo.types.v3_1_0.RealDateSpanCategoryDefinition) oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.DiseaseOutcomeCategoryDefinition) {

			return new DiseaseOutcomeCategoryDefinitionSetter(edu.pitt.apollo.types.v4_0.DiseaseOutcomeCategoryDefinition.class, (edu.pitt.apollo.types.v3_1_0.DiseaseOutcomeCategoryDefinition) oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.MaritalStatusCategoryDefinition) {

			return new MaritalStatusCategoryDefinitionSetter(edu.pitt.apollo.types.v4_0.MaritalStatusCategoryDefinition.class, (edu.pitt.apollo.types.v3_1_0.MaritalStatusCategoryDefinition) oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.PlaceCategoryDefinition) {

			return new PlaceCategoryDefinitionSetter(edu.pitt.apollo.types.v4_0.PlaceCategoryDefinition.class, (edu.pitt.apollo.types.v3_1_0.PlaceCategoryDefinition) oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.AgeRangeCategoryDefinition) {

			return new AgeRangeCategoryDefinitionSetter(edu.pitt.apollo.types.v4_0.AgeRangeCategoryDefinition.class, (edu.pitt.apollo.types.v3_1_0.AgeRangeCategoryDefinition) oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.CaseDefinition) {

			return new CaseDefinitionSetter(edu.pitt.apollo.types.v4_0.CaseDefinition.class, (edu.pitt.apollo.types.v3_1_0.CaseDefinition) oldTypeInstance);
		}

		throw new UnsupportedTypeException("Type " + oldTypeInstance.getClass().getCanonicalName() + " is not supported");

	}


}

