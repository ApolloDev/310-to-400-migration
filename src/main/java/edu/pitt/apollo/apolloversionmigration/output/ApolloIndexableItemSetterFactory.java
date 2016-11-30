package edu.pitt.apollo.apolloversionmigration.output;

public class ApolloIndexableItemSetterFactory {

	public static ApolloIndexableItemSetter getSetter(Object oldTypeInstance) throws MigrationException {

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.Infection) {

			return InfectionSetterFactory.getSetter(oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.InfectiousDiseaseScenario) {

			return new InfectiousDiseaseScenarioSetter(edu.pitt.apollo.types.v4_0.InfectiousDiseaseScenario.class, (edu.pitt.apollo.types.v3_1_0.InfectiousDiseaseScenario) oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.InfectiousDiseaseDecisionAnalysisSpecificationAndResults) {

			return new InfectiousDiseaseDecisionAnalysisSpecificationAndResultsSetter(edu.pitt.apollo.types.v4_0.InfectiousDiseaseDecisionAnalysisSpecificationAndResults.class, (edu.pitt.apollo.types.v3_1_0.InfectiousDiseaseDecisionAnalysisSpecificationAndResults) oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.Epidemic) {

			return new EpidemicSetter(edu.pitt.apollo.types.v4_0.Epidemic.class, (edu.pitt.apollo.types.v3_1_0.Epidemic) oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.InfectiousDiseaseControlDecisionModel) {

			return new InfectiousDiseaseControlDecisionModelSetter(edu.pitt.apollo.types.v4_0.InfectiousDiseaseControlDecisionModel.class, (edu.pitt.apollo.types.v3_1_0.InfectiousDiseaseControlDecisionModel) oldTypeInstance);
		}

//		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.LInfectiousDisease) {
//
//			return LInfectiousDiseaseSetterFactory.getSetter(oldTypeInstance);
//		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.InfectiousDiseaseControlMeasure) {

			return InfectiousDiseaseControlMeasureSetterFactory.getSetter(oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.CensusData) {

			return CensusDataSetterFactory.getSetter(oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.LContamination) {

			return LContaminationSetterFactory.getSetter(oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.Census) {

			return CensusSetterFactory.getSetter(oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.Colonization) {

			return new ColonizationSetter(edu.pitt.apollo.types.v4_0.Colonization.class, (edu.pitt.apollo.types.v3_1_0.Colonization) oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.EpidemicCaseCounts) {

			return new EpidemicCaseCountsSetter(edu.pitt.apollo.types.v4_0.EpidemicCaseCounts.class, (edu.pitt.apollo.types.v3_1_0.EpidemicCaseCounts) oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.SensitivityAnalysisSpecificationAndResult) {

			return new SensitivityAnalysisSpecificationAndResultSetter(edu.pitt.apollo.types.v4_0.SensitivityAnalysisSpecificationAndResult.class, (edu.pitt.apollo.types.v3_1_0.SensitivityAnalysisSpecificationAndResult) oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.Treatment) {

			return TreatmentSetterFactory.getSetter(oldTypeInstance);
		}

		if (oldTypeInstance instanceof edu.pitt.apollo.types.v4_0.InfectiousDiseaseTransmissionExperimentSpecification) {

			return new InfectiousDiseaseTransmissionExperimentSpecificationSetter(edu.pitt.apollo.types.v4_0.InfectiousDiseaseTransmissionExperimentSpecification.class, (edu.pitt.apollo.types.v3_1_0.InfectiousDiseaseTransmissionExperimentSpecification) oldTypeInstance);
		}

		throw new UnsupportedTypeException("Type " + oldTypeInstance.getClass().getCanonicalName() + " is not supported");

	}


}

