package edu.pitt.apollo.apolloversionmigration.output;

public class CategoryDefinitionSetterFactory {

	public static CategoryDefinitionSetter getSetter(Object oldTypeInstance) throws MigrationException {

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v3_1_0.SourceOfInfectionCategoryDefinition) {

			return new SourceOfInfectionCategoryDefinitionSetter(edu.pitt.apollo.types.v4_0_1.SourceOfInfectionCategoryDefinition.class, oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v3_1_0.RealTimePointCategoryDefinition) {

			return new RealTimePointCategoryDefinitionSetter(edu.pitt.apollo.types.v4_0_1.RealTimePointCategoryDefinition.class, oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v3_1_0.PlaceCategoryDefinition) {

			return new PlaceCategoryDefinitionSetter(edu.pitt.apollo.types.v4_0_1.PlaceCategoryDefinition.class, oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v3_1_0.CaseDefinition) {

			return new CaseDefinitionSetter(edu.pitt.apollo.types.v4_0_1.CaseDefinition.class, oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v3_1_0.MaritalStatusCategoryDefinition) {

			return new MaritalStatusCategoryDefinitionSetter(edu.pitt.apollo.types.v4_0_1.MaritalStatusCategoryDefinition.class, oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v3_1_0.DiseaseOutcomeCategoryDefinition) {

			return new DiseaseOutcomeCategoryDefinitionSetter(edu.pitt.apollo.types.v4_0_1.DiseaseOutcomeCategoryDefinition.class, oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v3_1_0.RealDateSpanCategoryDefinition) {

			return new RealDateSpanCategoryDefinitionSetter(edu.pitt.apollo.types.v4_0_1.RealDateSpanCategoryDefinition.class, oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v3_1_0.RealTimeSpanCategoryDefinition) {

			return new RealTimeSpanCategoryDefinitionSetter(edu.pitt.apollo.types.v4_0_1.RealTimeSpanCategoryDefinition.class, oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v3_1_0.DisabilityStatusCategoryDefinition) {

			return new DisabilityStatusCategoryDefinitionSetter(edu.pitt.apollo.types.v4_0_1.DisabilityStatusCategoryDefinition.class, oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v3_1_0.SchoolingStatusCategoryDefinition) {

			return new SchoolingStatusCategoryDefinitionSetter(edu.pitt.apollo.types.v4_0_1.SchoolingStatusCategoryDefinition.class, oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v3_1_0.LocationCategoryDefinition) {

			return new LocationCategoryDefinitionSetter(edu.pitt.apollo.types.v4_0_1.LocationCategoryDefinition.class, oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v3_1_0.EmploymentStatusCategoryDefinition) {

			return new EmploymentStatusCategoryDefinitionSetter(edu.pitt.apollo.types.v4_0_1.EmploymentStatusCategoryDefinition.class, oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v3_1_0.TimeSpanCategoryDefinition) {

			return new TimeSpanCategoryDefinitionSetter(edu.pitt.apollo.types.v4_0_1.TimeSpanCategoryDefinition.class, oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v3_1_0.AgeRangeCategoryDefinition) {

			return new AgeRangeCategoryDefinitionSetterImpl(edu.pitt.apollo.types.v4_0_1.AgeRangeCategoryDefinition.class, oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v3_1_0.GenderCategoryDefinition) {

			return new GenderCategoryDefinitionSetter(edu.pitt.apollo.types.v4_0_1.GenderCategoryDefinition.class, oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v3_1_0.HealthcareFacilityCategoryDefinition) {

			return new HealthcareFacilityCategoryDefinitionSetter(edu.pitt.apollo.types.v4_0_1.HealthcareFacilityCategoryDefinition.class, oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v3_1_0.CategoryDefinition) {

			return new CategoryDefinitionSetter(edu.pitt.apollo.types.v4_0_1.CategoryDefinition.class, oldTypeInstance);
		}

		throw new UnsupportedTypeException("Type " + oldTypeInstance.getClass().getCanonicalName() + " is not supported");

	}


}

