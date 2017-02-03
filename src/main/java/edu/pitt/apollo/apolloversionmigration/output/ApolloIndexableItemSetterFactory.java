package edu.pitt.apollo.apolloversionmigration.output;

public class ApolloIndexableItemSetterFactory {

	public static ApolloIndexableItemSetter getSetter(Object oldTypeInstance) throws MigrationException {

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v3_1_0.Treatment) {

			return TreatmentSetterFactory.getSetter(oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v3_1_0.EpidemicCaseCounts) {

			return new EpidemicCaseCountsSetter(edu.pitt.apollo.types.v4_0_1.EpidemicCaseCounts.class, oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v3_1_0.SensitivityAnalysisSpecificationAndResult) {

			return new SensitivityAnalysisSpecificationAndResultSetter(edu.pitt.apollo.types.v4_0_1.SensitivityAnalysisSpecificationAndResult.class, oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v3_1_0.Census) {

			return CensusSetterFactory.getSetter(oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v3_1_0.InfectiousDiseaseControlDecisionModel) {

			return new InfectiousDiseaseControlDecisionModelSetter(edu.pitt.apollo.types.v4_0_1.InfectiousDiseaseControlDecisionModel.class, oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v3_1_0.Infection) {

			return InfectionSetterFactory.getSetter(oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v3_1_0.Epidemic) {

			return new EpidemicSetter(edu.pitt.apollo.types.v4_0_1.Epidemic.class, oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v3_1_0.InfectiousDiseaseScenario) {

			return new InfectiousDiseaseScenarioSetter(edu.pitt.apollo.types.v4_0_1.InfectiousDiseaseScenario.class, oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v3_1_0.InfectiousDiseaseControlMeasure) {

			return InfectiousDiseaseControlMeasureSetterFactory.getSetter(oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v3_1_0.InfectiousDiseaseDecisionAnalysisSpecificationAndResults) {

			return new InfectiousDiseaseDecisionAnalysisSpecificationAndResultsSetter(edu.pitt.apollo.types.v4_0_1.InfectiousDiseaseDecisionAnalysisSpecificationAndResults.class, oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v3_1_0.InfectiousDisease) {

			return InfectiousDiseaseSetterFactory.getSetter(oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v3_1_0.CaseSeries) {

			return new CaseSeriesSetter(edu.pitt.apollo.types.v4_0_1.CaseSeries.class, oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v3_1_0.InfectiousDiseaseTransmissionExperimentSpecification) {

			return new InfectiousDiseaseTransmissionExperimentSpecificationSetter(edu.pitt.apollo.types.v4_0_1.InfectiousDiseaseTransmissionExperimentSpecification.class, oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v3_1_0.Contamination) {

			return ContaminationSetterFactory.getSetter(oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v3_1_0.CensusData) {

			return CensusDataSetterFactory.getSetter(oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v3_1_0.Colonization) {

			return new ColonizationSetter(edu.pitt.apollo.types.v4_0_1.Colonization.class, oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v3_1_0.ApolloIndexableItem) {

			return new ApolloIndexableItemSetter(edu.pitt.apollo.types.v4_0_1.ApolloIndexableItem.class, oldTypeInstance);
		}

		throw new UnsupportedTypeException("Type " + oldTypeInstance.getClass().getCanonicalName() + " is not supported");

	}


}

