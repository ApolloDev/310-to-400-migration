package edu.pitt.apollo.apolloversionmigration.output;

import edu.pitt.apollo.apolloversionmigration.ClassList;
import edu.pitt.apollo.types.v3_1_0.CaseRecord;
import edu.pitt.apollo.types.v3_1_0.Duration;
import edu.pitt.apollo.types.v3_1_0.Epidemic;
import edu.pitt.apollo.types.v4_0_1.InfectiousDisease;
import edu.pitt.isg.objectserializer.JsonDeserializer;
import junit.framework.TestCase;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by mas400 on 12/5/16.
 */
public class EpidemicTest extends TestCase {
    edu.pitt.apollo.types.v3_1_0.Epidemic oldEpidemic;
    edu.pitt.apollo.types.v4_0_1.Epidemic newEpidemic;


    public void testCausalPathogens() throws Exception {
        assertEquals(oldEpidemic.getCausalPathogens().size(), newEpidemic.getCausalPathogens().size());

        for (int i = 0; i < oldEpidemic.getCausalPathogens().size(); i++) {
            edu.pitt.apollo.types.v3_1_0.ApolloPathogenCode oldCausalPathogen = oldEpidemic.getCausalPathogens().get(i);
            edu.pitt.apollo.types.v4_0_1.ApolloPathogenCode newCausalPathogen = newEpidemic.getCausalPathogens().get(i);
            testPathogenCode(oldCausalPathogen, newCausalPathogen);
        }

    }

    public void testPathogenCode(edu.pitt.apollo.types.v3_1_0.ApolloPathogenCode oldPathogenCode, edu.pitt.apollo.types.v4_0_1.ApolloPathogenCode newPathogenCode) {
        assertEquals(oldPathogenCode.getNcbiTaxonId(), newPathogenCode.getNcbiTaxonId());
        assertEquals(oldPathogenCode.getCladeName(), newPathogenCode.getCladeName());
    }

    public void testEpidemicPeriod() throws Exception {
        edu.pitt.apollo.types.v3_1_0.EpidemicPeriod oldPeriod = oldEpidemic.getEpidemicPeriod();
        edu.pitt.apollo.types.v4_0_1.EpidemicPeriod newPeriod = newEpidemic.getEpidemicPeriod();

        assertEquals(oldPeriod.getStartDate(), newPeriod.getStartDate());
        assertEquals(oldPeriod.getEndDate(), newPeriod.getEndDate());
        assertEquals(oldPeriod.getStartDateDefinition().toString(), newPeriod.getStartDateDefinition().toString());
        assertEquals(oldPeriod.getEndDateDefinition().toString(), newPeriod.getEndDateDefinition().toString());

    }

    public void testAdministrativeLocations() throws Exception {
        assertEquals(oldEpidemic.getAdministrativeLocations(), newEpidemic.getAdministrativeLocations());
    }

    public void testEpidemicZones() throws Exception {
        assertEquals(oldEpidemic.getEpidemicZones(), newEpidemic.getEpidemicZones());
    }

    public void testInfections() throws Exception {
        assertEquals(oldEpidemic.getInfections().size(), newEpidemic.getInfections().size());

        for (int i = 0; i < oldEpidemic.getInfections().size(); i++) {
            edu.pitt.apollo.types.v3_1_0.Infection oldInfection = oldEpidemic.getInfections().get(i);
            edu.pitt.apollo.types.v4_0_1.Infection newInfection = newEpidemic.getInfections().get(i);
            if (oldInfection.getPathogen() != null) {
                testPathogenCode(oldInfection.getPathogen(), newInfection.getPathogen());
            }
            assertEquals(oldInfection.getHost(), newInfection.getHost());

            if (oldInfection.getInfectiousDiseases() != null)
                testInfectiousDiseases(oldInfection.getInfectiousDiseases(), newInfection.getInfectiousDiseases());
            if (oldInfection.getInfectionAcquisitionsFromInfectedHosts() != null)
                testInfectionAcquisitionFromInfectedHosts(oldInfection.getInfectionAcquisitionsFromInfectedHosts(), newInfection.getInfectionAcquisitionsFromInfectedHosts());
            if (oldInfection.getInfectionAcquisitionsFromContaminatedThings() != null)
                testInfectionAcquisitionsFromContaminatedThings(oldInfection.getInfectionAcquisitionsFromContaminatedThings(), newInfection.getInfectionAcquisitionsFromContaminatedThings());
            if (oldInfection.getInfectionAcquisitionsFromColonizedHosts() != null)
                testInfectionAcquisitionsFromColonizedHosts(oldInfection.getInfectionAcquisitionsFromColonizedHosts(), newInfection.getInfectionAcquisitionsFromColonizedHosts());
        }

    }

    public void testInfectiousDiseases(List<edu.pitt.apollo.types.v3_1_0.InfectiousDisease> oldInfectiousDiseases, List<edu.pitt.apollo.types.v4_0_1.InfectiousDisease> newInfectiousDiseases) {
        assertEquals(oldInfectiousDiseases.size(), newInfectiousDiseases.size());

        for (int i = 0; i < oldInfectiousDiseases.size(); i++) {
            edu.pitt.apollo.types.v3_1_0.InfectiousDisease oldInfectiousDisease = oldInfectiousDiseases.get(i);
            edu.pitt.apollo.types.v4_0_1.InfectiousDisease newInfectiousDisease = newInfectiousDiseases.get(i);

            assertEquals(oldInfectiousDisease.getDisease(), newInfectiousDisease.getDisease());
            assertEquals(oldInfectiousDisease.getSpeciesWithDisease(), newInfectiousDisease.getSpeciesWithDisease());
            testPathogenCode(oldInfectiousDisease.getCausalPathogen(), newInfectiousDisease.getCausalPathogen());

            if (oldInfectiousDisease.getIncubationPeriod() != null)
                testDuration(oldInfectiousDisease.getIncubationPeriod(), newInfectiousDisease.getIncubationPeriod());
            if (oldInfectiousDisease.getProdromalPeriod() != null)
                testDuration(oldInfectiousDisease.getProdromalPeriod(), newInfectiousDisease.getProdromalPeriod());
            if (oldInfectiousDisease.getFulminantPeriod() != null)
                testDuration(oldInfectiousDisease.getFulminantPeriod(), newInfectiousDisease.getFulminantPeriod());

            testIntervals(oldInfectiousDisease.getOtherIntervals(), newInfectiousDisease.getOtherIntervals());
            testDiseaseOutcomesWithProbabilities(oldInfectiousDisease.getDiseaseOutcomesWithProbabilities(), newInfectiousDisease.getDiseaseOutcomesWithProbabilities());
        }

    }

    public void testDuration(edu.pitt.apollo.types.v3_1_0.Duration oldDuration, edu.pitt.apollo.types.v4_0_1.Duration newDuration) {
        assertEquals(oldDuration.getUnitOfTime().toString(), newDuration.getUnitOfTime().toString());
        assertEquals(oldDuration.getReferenceId(), newDuration.getReferenceId());
    }

    public void testIntervals(List<edu.pitt.apollo.types.v3_1_0.Interval> oldIntervals, List<edu.pitt.apollo.types.v4_0_1.Interval> newIntervals) {
        assertEquals(oldIntervals.size(), newIntervals.size());

        for (int i = 0; i < oldIntervals.size(); i++) {
            edu.pitt.apollo.types.v3_1_0.Interval oldInterval = oldIntervals.get(i);
            edu.pitt.apollo.types.v4_0_1.Interval newInterval = newIntervals.get(i);

            assertEquals(oldInterval.getStartBoundaryDefinition().toString(), newInterval.getStartBoundaryDefinition().toString());
            assertEquals(oldInterval.getEndBoundaryDefinition().toString(), newInterval.getEndBoundaryDefinition().toString());
            testDuration(oldInterval.getDuration(), newInterval.getDuration());
            assertEquals(oldInterval.getReadableTitle(), newInterval.getReadableTitle());
            assertEquals(oldInterval.getReferenceId(), newInterval.getReferenceId());
        }
    }

    public void testDiseaseOutcomesWithProbabilities(List<edu.pitt.apollo.types.v3_1_0.DiseaseOutcomeWithProbability> oldDiseaseOutcomeWithProbabilities, List<edu.pitt.apollo.types.v4_0_1.DiseaseOutcomeWithProbability> newDiseaseOutcomeWithProbabilities) {
        assertEquals(oldDiseaseOutcomeWithProbabilities.size(), newDiseaseOutcomeWithProbabilities.size());

        for (int i = 0; i < oldDiseaseOutcomeWithProbabilities.size(); i++) {
            edu.pitt.apollo.types.v3_1_0.DiseaseOutcomeWithProbability oldDiseaseOutcomeWithProbability = oldDiseaseOutcomeWithProbabilities.get(i);
            edu.pitt.apollo.types.v4_0_1.DiseaseOutcomeWithProbability newDiseaseOutcomeWithProbability = newDiseaseOutcomeWithProbabilities.get(i);

            assertEquals(oldDiseaseOutcomeWithProbability.getTitle(), newDiseaseOutcomeWithProbability.getTitle());
            assertEquals(oldDiseaseOutcomeWithProbability.getDiseaseOutcome().toString(), newDiseaseOutcomeWithProbability.getDiseaseOutcome().toString());
            testProbabilisticParameter(oldDiseaseOutcomeWithProbability.getProbability(), newDiseaseOutcomeWithProbability.getProbability());
        }
    }

    public void testProbabilisticParameter(edu.pitt.apollo.types.v3_1_0.ProbabilisticParameter oldProbabilisticParameter, edu.pitt.apollo.types.v4_0_1.ProbabilisticParameter newProbabilisticParameter) {
        assertEquals(oldProbabilisticParameter.getProbability(), newProbabilisticParameter.getProbability());
        edu.pitt.apollo.types.v3_1_0.ProbabilityDistribution oldProbabilityDistribution = oldProbabilisticParameter.getProbabilityDistribution();
        edu.pitt.apollo.types.v4_0_1.ProbabilityDistribution newProbabilityDistribution = newProbabilisticParameter.getProbabilityDistribution();
        assertEquals(oldProbabilityDistribution.getReferenceId(), newProbabilityDistribution.getReferenceId());
    }

    public void testInfectionAcquisitionFromInfectedHosts(List<edu.pitt.apollo.types.v3_1_0.InfectionAcquisitionFromInfectedHost> oldInfectionAcquisitionFromInfectedHosts, List<edu.pitt.apollo.types.v4_0_1.InfectionAcquisitionFromInfectedHost> newInfectionAcquisitionFromInfectedHosts) {
        assertEquals(oldInfectionAcquisitionFromInfectedHosts.size(), newInfectionAcquisitionFromInfectedHosts.size());

        for (int i = 0; i < oldInfectionAcquisitionFromInfectedHosts.size(); i++) {
            edu.pitt.apollo.types.v3_1_0.InfectionAcquisitionFromInfectedHost oldInfectionAcquisitionFromInfectedHost = oldInfectionAcquisitionFromInfectedHosts.get(i);
            edu.pitt.apollo.types.v4_0_1.InfectionAcquisitionFromInfectedHost newInfectionAcquisitionFromInfectedHost = newInfectionAcquisitionFromInfectedHosts.get(i);

            assertEquals(oldInfectionAcquisitionFromInfectedHost.getInfectedHost(), newInfectionAcquisitionFromInfectedHost.getInfectedHost());
            testDuration(oldInfectionAcquisitionFromInfectedHost.getLatentPeriodDuration(), newInfectionAcquisitionFromInfectedHost.getLatentPeriodDuration());
            testDuration(oldInfectionAcquisitionFromInfectedHost.getInfectiousPeriodDuration(), newInfectionAcquisitionFromInfectedHost.getInfectiousPeriodDuration());
            testReproductionNumbers(oldInfectionAcquisitionFromInfectedHost.getBasicReproductionNumbers(), newInfectionAcquisitionFromInfectedHost.getBasicReproductionNumbers());

        }
    }

    public void testReproductionNumbers(List<edu.pitt.apollo.types.v3_1_0.ReproductionNumber> oldReproductionNumbers, List<edu.pitt.apollo.types.v4_0_1.ReproductionNumber> newReproductionNumbers) {
        assertEquals(oldReproductionNumbers.size(), newReproductionNumbers.size());

        for (int i = 0; i < oldReproductionNumbers.size(); i++) {
            edu.pitt.apollo.types.v3_1_0.ReproductionNumber oldReproductionNumber = oldReproductionNumbers.get(i);
            edu.pitt.apollo.types.v4_0_1.ReproductionNumber newReproductionNumber = newReproductionNumbers.get(i);

            assertEquals(oldReproductionNumber.getExactValue(), newReproductionNumber.getExactValue());
            assertEquals(oldReproductionNumber.getUncertainValue().getReferenceId(), newReproductionNumber.getUncertainValue());
            assertEquals(oldReproductionNumber.getReferenceId(), newReproductionNumber.getReferenceId());
        }
    }

    public void testInfectionAcquisitionsFromContaminatedThings(List<edu.pitt.apollo.types.v3_1_0.InfectionAcquisitionFromContaminatedAbioticThing> oldInfectionAcquisitionsFromContaminatedThings, List<edu.pitt.apollo.types.v4_0_1.InfectionAcquisitionFromContaminatedAbioticThing> newInfectionAcquisitionsFromContaminatedThings) {
        assertEquals(oldInfectionAcquisitionsFromContaminatedThings.size(), newInfectionAcquisitionsFromContaminatedThings.size());

        for (int i = 0; i < oldInfectionAcquisitionsFromContaminatedThings.size(); i++) {
            edu.pitt.apollo.types.v3_1_0.InfectionAcquisitionFromContaminatedAbioticThing oldInfectionAcquisitionsFromContaminatedThing = oldInfectionAcquisitionsFromContaminatedThings.get(i);
            edu.pitt.apollo.types.v4_0_1.InfectionAcquisitionFromContaminatedAbioticThing newInfectionAcquisitionsFromContaminatedThing = newInfectionAcquisitionsFromContaminatedThings.get(i);

            assertEquals(oldInfectionAcquisitionsFromContaminatedThing.getContaminatedAbioticThing().toString(), newInfectionAcquisitionsFromContaminatedThing.getContaminatedAbioticThing().toString());
            testProbabilisticParameter(oldInfectionAcquisitionsFromContaminatedThing.getTransmissionProbability(), newInfectionAcquisitionsFromContaminatedThing.getTransmissionProbability());
        }
    }

    public void testInfectionAcquisitionsFromColonizedHosts(List<edu.pitt.apollo.types.v3_1_0.InfectionAcquisitionFromColonizedHost> oldInfectionAcquisitionFromContaminatedAbioticThings, List<edu.pitt.apollo.types.v4_0_1.InfectionAcquisitionFromColonizedHost> newInfectionAcquisitionFromContaminatedAbioticThings) {
        assertEquals(oldInfectionAcquisitionFromContaminatedAbioticThings.size(), newInfectionAcquisitionFromContaminatedAbioticThings.size());

        for (int i = 0; i < oldInfectionAcquisitionFromContaminatedAbioticThings.size(); i++) {
            edu.pitt.apollo.types.v3_1_0.InfectionAcquisitionFromColonizedHost oldInfectionAcquisitionFromContaminatedAbioticThing = oldInfectionAcquisitionFromContaminatedAbioticThings.get(i);
            edu.pitt.apollo.types.v4_0_1.InfectionAcquisitionFromColonizedHost newInfectionAcquisitionFromContaminatedAbioticThing = newInfectionAcquisitionFromContaminatedAbioticThings.get(i);

            assertEquals(oldInfectionAcquisitionFromContaminatedAbioticThing.getColonizedHost(), newInfectionAcquisitionFromContaminatedAbioticThing.getColonizedHost());
            testProbabilisticParameter(oldInfectionAcquisitionFromContaminatedAbioticThing.getTransmissionProbability(), newInfectionAcquisitionFromContaminatedAbioticThing.getTransmissionProbability());
            assertEquals(oldInfectionAcquisitionFromContaminatedAbioticThing.getBeta(), newInfectionAcquisitionFromContaminatedAbioticThing.getBeta());
        }
    }

    public void testPreEpidemicCensus() throws Exception {
        edu.pitt.apollo.types.v3_1_0.PreEpidemicEcosystemCensus oldPreEpidemicEcosystemCensus = oldEpidemic.getPreEpidemicCensus();
        edu.pitt.apollo.types.v4_0_1.PreEpidemicEcosystemCensus newPreEpidemicEcosystemCensus = newEpidemic.getPreEpidemicCensus();

        assertEquals(oldPreEpidemicEcosystemCensus.getNameOfAdministrativeUnit(), newPreEpidemicEcosystemCensus.getNameOfAdministrativeUnit());
        assertEquals(oldPreEpidemicEcosystemCensus.getNumberOfPeople(), newPreEpidemicEcosystemCensus.getNumberOfPeople());
        assertEquals(oldPreEpidemicEcosystemCensus.getNumberOfHouseholds(), newPreEpidemicEcosystemCensus.getNumberOfHouseholds());
        assertEquals(oldPreEpidemicEcosystemCensus.getNumberOfSchools(), newPreEpidemicEcosystemCensus.getNumberOfSchools());
        assertEquals(oldPreEpidemicEcosystemCensus.getNumberOfWorkplaces(), newPreEpidemicEcosystemCensus.getNumberOfWorkplaces());
        assertEquals(oldPreEpidemicEcosystemCensus.getAdditionalDescription(), newPreEpidemicEcosystemCensus.getAdditionalDescription());
        assertEquals(oldPreEpidemicEcosystemCensus.getReferenceId(), newPreEpidemicEcosystemCensus.getReferenceId());

    }

    public void testPopulationSerologySurveys() throws Exception {
        assertEquals(oldEpidemic.getPopulationSerologySurveys().size(), newEpidemic.getPopulationSerologySurveys().size());

        for (int i = 0; i < oldEpidemic.getPopulationSerologySurveys().size(); i++) {
            edu.pitt.apollo.types.v3_1_0.PopulationSerologySurvey oldPopulationSerologySurvey = oldEpidemic.getPopulationSerologySurveys().get(i);
            edu.pitt.apollo.types.v4_0_1.PopulationSerologySurvey newPopulationSerologySurvey = newEpidemic.getPopulationSerologySurveys().get(i);

            assertEquals(oldPopulationSerologySurvey.getSpeciesSampled(), newPopulationSerologySurvey.getSpeciesSampled());
            assertEquals(oldPopulationSerologySurvey.getSpeciesSampledNcbiTaxonId(), newPopulationSerologySurvey.getSpeciesSampledNcbiTaxonId());
            assertEquals(oldPopulationSerologySurvey.getNumberSampled(), newPopulationSerologySurvey.getNumberSampled());
            assertEquals(oldPopulationSerologySurvey.getWhereSampled(), newPopulationSerologySurvey.getWhereSampled());
            assertEquals(oldPopulationSerologySurvey.getTestName(), newPopulationSerologySurvey.getTestName());
            assertEquals(oldPopulationSerologySurvey.getTestLoincId(), newPopulationSerologySurvey.getTestLoincId());
            assertEquals(oldPopulationSerologySurvey.getNumberOfSamplesPositive(), newPopulationSerologySurvey.getNumberOfSamplesPositive());
            assertEquals(oldPopulationSerologySurvey.getReferenceId(), newPopulationSerologySurvey.getReferenceId());

        }


    }

    public void testPopulationInfectionSurveys() throws Exception {
        assertEquals(oldEpidemic.getPopulationInfectionSurveys().size(), newEpidemic.getPopulationInfectionSurveys().size());

        for (int i = 0; i < oldEpidemic.getPopulationInfectionSurveys().size(); i++) {
            edu.pitt.apollo.types.v3_1_0.PopulationInfectionSurvey oldPopulationInfectionSurvey = oldEpidemic.getPopulationInfectionSurveys().get(i);
            edu.pitt.apollo.types.v4_0_1.PopulationInfectionSurvey newPopulationInfectionSurvey = newEpidemic.getPopulationInfectionSurveys().get(i);

            assertEquals(oldPopulationInfectionSurvey.getSpeciesSampled(), newPopulationInfectionSurvey.getSpeciesSampled());
            assertEquals(oldPopulationInfectionSurvey.getSpeciesSampledNcbiTaxonId(), newPopulationInfectionSurvey.getSpeciesSampledNcbiTaxonId());
            assertEquals(oldPopulationInfectionSurvey.getNumberSampled(), newPopulationInfectionSurvey.getNumberSampled());
            assertEquals(oldPopulationInfectionSurvey.getWhereSampled(), newPopulationInfectionSurvey.getWhereSampled());
            assertEquals(oldPopulationInfectionSurvey.getTestName(), newPopulationInfectionSurvey.getTestName());
            assertEquals(oldPopulationInfectionSurvey.getTestLoincId(), newPopulationInfectionSurvey.getTestLoincId());
            assertEquals(oldPopulationInfectionSurvey.getNumberOfSamplesPositive(), newPopulationInfectionSurvey.getNumberOfSamplesPositive());
            assertEquals(oldPopulationInfectionSurvey.getReferenceId(), newPopulationInfectionSurvey.getReferenceId());

        }
    }

    public void testInfectiousDiseaseControlStrategies() throws Exception {
        assertEquals(oldEpidemic.getInfectiousDiseaseControlStrategies().size(), newEpidemic.getInfectiousDiseaseControlStrategies().size());

        for (int i = 0; i < oldEpidemic.getInfectiousDiseaseControlStrategies().size(); i++) {
            edu.pitt.apollo.types.v3_1_0.InfectiousDiseaseControlMeasure oldInfectiousDiseaseControlMeasure = oldEpidemic.getInfectiousDiseaseControlStrategies().get(i);
            edu.pitt.apollo.types.v4_0_1.InfectiousDiseaseControlMeasure newInfectiousDiseaseControlMeasure = newEpidemic.getInfectiousDiseaseControlStrategies().get(i);

            assertEquals(oldInfectiousDiseaseControlMeasure.getDescription(), newInfectiousDiseaseControlMeasure.getDescription());
            testLocation(oldInfectiousDiseaseControlMeasure.getLocation(), newInfectiousDiseaseControlMeasure.getLocation());
            testTriggerDefinition(oldInfectiousDiseaseControlMeasure.getControlMeasureStartTime(), newInfectiousDiseaseControlMeasure.getControlMeasureStartTime());
            testTriggerDefinition(oldInfectiousDiseaseControlMeasure.getControlMeasureStopTime(), newInfectiousDiseaseControlMeasure.getControlMeasureStopTime());
            testDuration(oldInfectiousDiseaseControlMeasure.getControlMeasureResponseDelay(), newInfectiousDiseaseControlMeasure.getControlMeasureResponseDelay());
            testDuration(oldInfectiousDiseaseControlMeasure.getControlMeasureStandDownDelay(), newInfectiousDiseaseControlMeasure.getControlMeasureStandDownDelay());
            testLogisticalSystem(oldInfectiousDiseaseControlMeasure.getLogisticalSystems(), newInfectiousDiseaseControlMeasure.getLogisticalSystems());
            assertEquals(oldInfectiousDiseaseControlMeasure.getLogisticalSystems(), newInfectiousDiseaseControlMeasure.getLogisticalSystems());
            assertEquals(oldInfectiousDiseaseControlMeasure.getReferenceId(), newInfectiousDiseaseControlMeasure.getReferenceId());

            assertEquals(oldInfectiousDiseaseControlMeasure.getTemplatedInfectiousDiseaseControlMeasureUrlsForSoftware(), newInfectiousDiseaseControlMeasure.getTemplatedInfectiousDiseaseControlMeasureUrlsForSoftware());


        }
    }

    public void testLocation(edu.pitt.apollo.types.v3_1_0.Location oldLocation, edu.pitt.apollo.types.v4_0_1.Location newLocation) {
        assertEquals(oldLocation.getApolloLocationCode(), newLocation.getApolloLocationCode());
        testLocationDefinition(oldLocation.getLocationDefinition(), newLocation.getLocationDefinition());
        testCartesianCircleLocationDefinition(oldLocation.getCartesianCircleLocationDefinition(), newLocation.getCartesianCircleLocationDefinition());
        assertEquals(oldLocation.getTextualDescription(), newLocation.getTextualDescription());
    }

    public void testTriggerDefinition(List<edu.pitt.apollo.types.v3_1_0.TriggerDefinition> oldTriggerDefinitions, List<edu.pitt.apollo.types.v4_0_1.TriggerDefinition> newTriggerDefinitions) {
        assertEquals(oldTriggerDefinitions.size(), newTriggerDefinitions.size());

        for (int i = 0; i < oldEpidemic.getInfectiousDiseaseControlStrategies().size(); i++) {
            edu.pitt.apollo.types.v3_1_0.TriggerDefinition oldTriggerDefinition = oldTriggerDefinitions.get(i);
            edu.pitt.apollo.types.v4_0_1.TriggerDefinition newTriggerDefinition = newTriggerDefinitions.get(i);

            assertEquals(oldTriggerDefinition.toString(), newTriggerDefinition.toString());
        }
    }

    public void testLogisticalSystem(List<edu.pitt.apollo.types.v3_1_0.LogisticalSystem> oldLogisticalSystems, List<edu.pitt.apollo.types.v4_0_1.LogisticalSystem> newLogisticalSystems) {
        assertEquals(oldLogisticalSystems.size(), newLogisticalSystems.size());

        for (int i = 0; i < oldEpidemic.getInfectiousDiseaseControlStrategies().size(); i++) {
            edu.pitt.apollo.types.v3_1_0.LogisticalSystem oldLogisticalSystem = oldLogisticalSystems.get(i);
            edu.pitt.apollo.types.v4_0_1.LogisticalSystem newLogisticalSystem = newLogisticalSystems.get(i);
            assertEquals(oldLogisticalSystem.getProduct(), newLogisticalSystem.getProduct());
            testLogisticalSystemNode(oldLogisticalSystem.getLogisticalSystemNodes(), newLogisticalSystem.getLogisticalSystemNodes());
        }
    }

    public void testSchedule(edu.pitt.apollo.types.v3_1_0.Schedule oldSchedule, edu.pitt.apollo.types.v4_0_1.Schedule newSchedule) {
        assertEquals(oldSchedule.getUnitOfMeasure().toString(), newSchedule.getUnitOfMeasure().toString());

        assertEquals(oldSchedule.getScheduleElements().size(), newSchedule.getScheduleElements().size());
        for (int i = 0; i < oldSchedule.getScheduleElements().size(); i++) {
            edu.pitt.apollo.types.v3_1_0.ScheduleElement oldScheduleElement = oldSchedule.getScheduleElements().get(i);
            edu.pitt.apollo.types.v4_0_1.ScheduleElement newScheduleElement = newSchedule.getScheduleElements().get(i);

            assertEquals(oldScheduleElement.getQuantity(), newScheduleElement.getQuantity());
            assertEquals(oldScheduleElement.getDateTime(), newScheduleElement.getDateTime());
        }
    }

    public void testLogisticalSystemNode(List<edu.pitt.apollo.types.v3_1_0.LogisticalSystemNode> oldLogisticalSystemNodes, List<edu.pitt.apollo.types.v4_0_1.LogisticalSystemNode> newLogisticalSystemNodes) {

        assertEquals(oldLogisticalSystemNodes.size(), newLogisticalSystemNodes.size());
        for (int j = 0; j < oldLogisticalSystemNodes.size(); j++) {
            edu.pitt.apollo.types.v3_1_0.LogisticalSystemNode oldLogisticalSystemNode = oldLogisticalSystemNodes.get(j);
            edu.pitt.apollo.types.v4_0_1.LogisticalSystemNode newLogisticalSystemNode = newLogisticalSystemNodes.get(j);

            assertEquals(oldLogisticalSystemNode.getDescription(), newLogisticalSystemNode.getDescription());
            testSchedule(oldLogisticalSystemNode.getCapacitySchedule(), newLogisticalSystemNode.getCapacitySchedule());
            testSchedule(oldLogisticalSystemNode.getOutputSchedule(), newLogisticalSystemNode.getOutputSchedule());
            testLogisticalSystemNode(oldLogisticalSystemNode.getChildren(), newLogisticalSystemNode.getChildren());
        }
    }


    public void testLocationDefinition(edu.pitt.apollo.types.v3_1_0.LocationDefinition oldLocationDefinition, edu.pitt.apollo.types.v4_0_1.LocationDefinition newLocationDefinition) {
        assertEquals(oldLocationDefinition.getLocationsIncluded().size(), newLocationDefinition.getLocationsIncluded().size());
        for (int i = 0; i < oldLocationDefinition.getLocationsIncluded().size(); i++) {
            assertEquals(oldLocationDefinition.getLocationsIncluded().get(i), newLocationDefinition.getLocationsIncluded().get(i));
        }

        assertEquals(oldLocationDefinition.getLocationsExcluded().size(), newLocationDefinition.getLocationsExcluded().size());
        for (int i = 0; i < oldLocationDefinition.getLocationsExcluded().size(); i++) {
            assertEquals(oldLocationDefinition.getLocationsExcluded().get(i), newLocationDefinition.getLocationsExcluded().get(i));
        }

        assertEquals(oldLocationDefinition.getMultiGeometries().size(), newLocationDefinition.getMultiGeometries().size());
        for (int i = 0; i < oldLocationDefinition.getMultiGeometries().size(); i++) {
            edu.pitt.apollo.types.v3_1_0.MultiGeometry oldMultiGeometry = oldLocationDefinition.getMultiGeometries().get(i);
            edu.pitt.apollo.types.v4_0_1.MultiGeometry newMultiGeometry = newLocationDefinition.getMultiGeometries().get(i);

            for (int j = 0; j < oldMultiGeometry.getPolygons().size(); j++) {
                assertEquals(oldMultiGeometry.getPolygons().get(j).getLinearRing(), newMultiGeometry.getPolygons().get(j).getLinearRing());
            }
        }
    }

    public void testCartesianCircleLocationDefinition(edu.pitt.apollo.types.v3_1_0.CartesianCircleLocationDefinition oldCartesianCircleLocationDefinition, edu.pitt.apollo.types.v4_0_1.CartesianCircleLocationDefinition newCartesianCircleLocationDefinition) {
        testDistance(oldCartesianCircleLocationDefinition.getEastWestOffsetFromCartesianCenter(), newCartesianCircleLocationDefinition.getEastWestOffsetFromCartesianCenter());
        testDistance(oldCartesianCircleLocationDefinition.getNorthSouthOffsetFromCartesianCenter(), newCartesianCircleLocationDefinition.getNorthSouthOffsetFromCartesianCenter());
        testDistance(oldCartesianCircleLocationDefinition.getAltitudeRelativeToCartesianCenter(), newCartesianCircleLocationDefinition.getAltitudeRelativeToCartesianCenter());
        testDistance(oldCartesianCircleLocationDefinition.getRadius(), newCartesianCircleLocationDefinition.getRadius());

    }

    public void testDistance(edu.pitt.apollo.types.v3_1_0.Distance oldDistance, edu.pitt.apollo.types.v4_0_1.Distance newDistance) {
        assertEquals(oldDistance.getUnitOfDistance().toString(), newDistance.getUnitOfDistance().toString());
        assertEquals(oldDistance.getValue(), newDistance.getValue());
    }

    public void testCaseDefinitions() throws Exception {
        assertEquals(oldEpidemic.getCaseDefinitions().size(), newEpidemic.getCaseDefinitions().size());

        for (int i = 0; i < oldEpidemic.getCaseDefinitions().size(); i++) {
            edu.pitt.apollo.types.v3_1_0.CaseDefinition oldCaseDefinition = oldEpidemic.getCaseDefinitions().get(i);
            edu.pitt.apollo.types.v4_0_1.CaseDefinition newCaseDefinition = newEpidemic.getCaseDefinitions().get(i);
            assertEquals(oldCaseDefinition.getApolloLabel().toString(), newCaseDefinition.getApolloLabel().toString());
            assertEquals(oldCaseDefinition.getInvestigationDefinition(), newCaseDefinition.getInvestigationDefinition());
            assertEquals(oldCaseDefinition.getInvestigationLabel(), newCaseDefinition.getInvestigationLabel());
            assertEquals(oldCaseDefinition.getReferenceId(), newCaseDefinition.getReferenceId());

        }
    }

    public void testContactDefinitions() throws Exception {
        assertEquals(oldEpidemic.getContactDefinitions().size(), newEpidemic.getContactDefinitions().size());

        for (int i = 0; i < oldEpidemic.getContactDefinitions().size(); i++) {
            edu.pitt.apollo.types.v3_1_0.ContactDefinition oldContactDefinition = oldEpidemic.getContactDefinitions().get(i);
            edu.pitt.apollo.types.v4_0_1.ContactDefinition newContactDefinition = newEpidemic.getContactDefinitions().get(i);
            assertEquals(oldContactDefinition.getApolloLabel().toString(), newContactDefinition.getApolloLabel().toString());
            assertEquals(oldContactDefinition.getInvestigationDefinition(), newContactDefinition.getInvestigationDefinition());
            assertEquals(oldContactDefinition.getInvestigationLabel(), newContactDefinition.getInvestigationLabel());
            assertEquals(oldContactDefinition.getReferenceId(), newContactDefinition.getReferenceId());

        }
    }

    public void testCaseLists() throws Exception {
        assertEquals(oldEpidemic.getCaseLists().size(), newEpidemic.getCaseLists().size());

        for (int i = 0; i < oldEpidemic.getCaseLists().size(); i++) {
            edu.pitt.apollo.types.v3_1_0.CaseList oldCaseList = oldEpidemic.getCaseLists().get(i);
            edu.pitt.apollo.types.v4_0_1.CaseList newCaseList = newEpidemic.getCaseLists().get(i);
            assertEquals(oldCaseList.getSpeciesOfCases(), newCaseList.getSpeciesOfCases());
            testCaseRecords(oldCaseList.getCaseRecords(), newCaseList.getCaseRecords());
        }
    }

    public void testCaseRecords(List<edu.pitt.apollo.types.v3_1_0.CaseRecord> oldCaseRecords, List<edu.pitt.apollo.types.v4_0_1.CaseRecord> newCaseRecords) {
        assertEquals(oldCaseRecords.size(), newCaseRecords.size());

        for (int i = 0; i < oldCaseRecords.size(); i++) {
            edu.pitt.apollo.types.v3_1_0.CaseRecord oldCaseRecord = oldCaseRecords.get(i);
            edu.pitt.apollo.types.v4_0_1.CaseRecord newCaseRecord = newCaseRecords.get(i);

            assertEquals(oldCaseRecord.getCaseId(), newCaseRecord.getCaseId());
            assertEquals(oldCaseRecord.getAgeInYears(), newCaseRecord.getAgeInYears());
            testOccupations(oldCaseRecord.getOccupations(), newCaseRecord.getOccupations());
            testPlacesVisited(oldCaseRecord.getPlacesVisitedWhileSusceptibleOrInfectious(), newCaseRecord.getPlacesVisitedWhileSusceptibleOrInfectious());
            assertEquals(oldCaseRecord.getInfectionAcquiredFromCaseId(), newCaseRecord.getInfectionAcquiredFromCaseId());
            testDiseaseOutcomeWithLocationDateTime(oldCaseRecord.getDiseaseOutcomesWithLocationDateTime(), newCaseRecord.getDiseaseOutcomesWithLocationDateTime());
            testLabTestsAndResults(oldCaseRecord.getLabTestsAndResults(), newCaseRecord.getLabTestsAndResults());
            assertEquals(oldCaseRecord.getPathogenGeneSequence(), newCaseRecord.getPathogenGeneSequence());
        }
    }

    public void testOccupations(List<edu.pitt.apollo.types.v3_1_0.OccupationEnum> oldOccupationEnums, List<edu.pitt.apollo.types.v4_0_1.OccupationEnum> newOccupationEnums) {
        assertEquals(oldOccupationEnums.size(), newOccupationEnums.size());

        for (int i = 0; i < oldOccupationEnums.size(); i++) {
            edu.pitt.apollo.types.v3_1_0.OccupationEnum oldOccupationEnum = oldOccupationEnums.get(i);
            edu.pitt.apollo.types.v4_0_1.OccupationEnum newOccupationEnum = newOccupationEnums.get(i);

            assertEquals(oldOccupationEnum.toString(), newOccupationEnum.toString());
        }
    }

    public void testPlacesVisited(List<edu.pitt.apollo.types.v3_1_0.PlaceVisited> oldPlaceVisited, List<edu.pitt.apollo.types.v4_0_1.PlaceVisited> newPlaceVisited) {
        assertEquals(oldPlaceVisited.size(), newPlaceVisited.size());

        for (int i = 0; i < oldPlaceVisited.size(); i++) {
            edu.pitt.apollo.types.v3_1_0.PlaceVisited oldPlace = oldPlaceVisited.get(i);
            edu.pitt.apollo.types.v4_0_1.PlaceVisited newPlace = newPlaceVisited.get(i);

            assertEquals(oldPlace.getPlace().toString(), newPlace.getPlace().toString());
            testNamedMultiGeometry(oldPlace.getNamedMultiGeometry(), newPlace.getNamedMultiGeometry());
            testRate(oldPlace.getFrequencyOfVisits(), newPlace.getFrequencyOfVisits());

            assertEquals(oldPlace.getDatesOfVisits().size(), newPlace.getDatesOfVisits().size());
            for (int j = 0; j < oldPlace.getDatesOfVisits().size(); j++) {
                assertEquals(oldPlace.getDatesOfVisits().get(j), newPlace.getDatesOfVisits().get(j));
            }
            testRealDateSpanCategories(oldPlace.getRealDateSpansOfVisits(), newPlace.getRealDateSpansOfVisits());
            testRealTimeSpanCategories(oldPlace.getRealTimeSpansOfVisits(), newPlace.getRealTimeSpansOfVisits());
        }
    }

    public void testNamedMultiGeometry(edu.pitt.apollo.types.v3_1_0.NamedMultiGeometry oldNamedMultiGeometry, edu.pitt.apollo.types.v4_0_1.NamedMultiGeometry newNamedMultiGeometry) {
        assertEquals(oldNamedMultiGeometry.getPolygons().size(), newNamedMultiGeometry.getPolygons().size());
        for (int i = 0; i < oldNamedMultiGeometry.getPolygons().size(); i++) {
            assertEquals(oldNamedMultiGeometry.getPolygons().get(i).getLinearRing(), newNamedMultiGeometry.getPolygons().get(i).getLinearRing());
        }

        assertEquals(oldNamedMultiGeometry.getApolloLocationCode(), newNamedMultiGeometry.getApolloLocationCode());
        assertEquals(oldNamedMultiGeometry.getTextualDescription(), newNamedMultiGeometry.getTextualDescription());
    }

    public void testRate(edu.pitt.apollo.types.v3_1_0.Rate oldRate, edu.pitt.apollo.types.v4_0_1.Rate newRate) {
        assertEquals(oldRate.getNumeratorUnitOfMeasure().toString(), newRate.getNumeratorUnitOfMeasure().toString());
        assertEquals(oldRate.getDenominatorUnitOfMeasure().toString(), newRate.getDenominatorUnitOfMeasure().toString());
        assertEquals(oldRate.getValue(), newRate.getValue());
        assertEquals(oldRate.getProbabilityDistribution().getReferenceId(), newRate.getProbabilityDistribution().getReferenceId());
    }

    public void testRealDateSpanCategories(List<edu.pitt.apollo.types.v3_1_0.RealDateSpanCategoryDefinition> oldRealDateSpanCategoryDefinitions, List<edu.pitt.apollo.types.v4_0_1.RealDateSpanCategoryDefinition> newRealDateSpanCategoryDefinitions) {
        assertEquals(oldRealDateSpanCategoryDefinitions.size(), newRealDateSpanCategoryDefinitions.size());
        for (int i = 0; i < oldRealDateSpanCategoryDefinitions.size(); i++) {
            edu.pitt.apollo.types.v3_1_0.RealDateSpanCategoryDefinition oldRealDateSpanCategoryDefinition = oldRealDateSpanCategoryDefinitions.get(i);
            edu.pitt.apollo.types.v4_0_1.RealDateSpanCategoryDefinition newRealDateSpanCategoryDefinition = newRealDateSpanCategoryDefinitions.get(i);

            assertEquals(oldRealDateSpanCategoryDefinition.getOffsetFromUtcInHours(), newRealDateSpanCategoryDefinition.getOffsetFromUtcInHours());
            assertEquals(oldRealDateSpanCategoryDefinition.getFirstDay(), newRealDateSpanCategoryDefinition.getFirstDay());
            assertEquals(oldRealDateSpanCategoryDefinition.getLastDay(), newRealDateSpanCategoryDefinition.getLastDay());
        }
    }

    public void testRealTimeSpanCategories(List<edu.pitt.apollo.types.v3_1_0.RealTimeSpanCategoryDefinition> oldRealTimeSpanCategoryDefinitions, List<edu.pitt.apollo.types.v4_0_1.RealTimeSpanCategoryDefinition> newRealTimeSpanCategoryDefinitions) {
        assertEquals(oldRealTimeSpanCategoryDefinitions.size(), newRealTimeSpanCategoryDefinitions.size());
        for (int i = 0; i < oldRealTimeSpanCategoryDefinitions.size(); i++) {
            edu.pitt.apollo.types.v3_1_0.RealTimeSpanCategoryDefinition oldRealTimeSpanCategoryDefinition = oldRealTimeSpanCategoryDefinitions.get(i);
            edu.pitt.apollo.types.v4_0_1.RealTimeSpanCategoryDefinition newRealTimeSpanCategoryDefinition = newRealTimeSpanCategoryDefinitions.get(i);

            assertEquals(oldRealTimeSpanCategoryDefinition.getOffsetFromUtcInHours(), newRealTimeSpanCategoryDefinition.getOffsetFromUtcInHours());
            assertEquals(oldRealTimeSpanCategoryDefinition.getBeginningTime(), newRealTimeSpanCategoryDefinition.getBeginningTime());
            assertEquals(oldRealTimeSpanCategoryDefinition.getEndingTime(), newRealTimeSpanCategoryDefinition.getEndingTime());
        }
    }

    public void testDiseaseOutcomeWithLocationDateTime(List<edu.pitt.apollo.types.v3_1_0.DiseaseOutcomeWithLocationDateTime> oldDiseaseOutcomesWithLocationDateTimes, List<edu.pitt.apollo.types.v4_0_1.DiseaseOutcomeWithLocationDateTime> newDiseaseOutcomesWithLocationDateTimes) {
        assertEquals(oldDiseaseOutcomesWithLocationDateTimes.size(), newDiseaseOutcomesWithLocationDateTimes.size());
        for (int i = 0; i < oldDiseaseOutcomesWithLocationDateTimes.size(); i++) {
            edu.pitt.apollo.types.v3_1_0.DiseaseOutcomeWithLocationDateTime oldDiseaseOutcomesWithLocationDateTime = oldDiseaseOutcomesWithLocationDateTimes.get(i);
            edu.pitt.apollo.types.v4_0_1.DiseaseOutcomeWithLocationDateTime newDiseaseOutcomesWithLocationDateTime = newDiseaseOutcomesWithLocationDateTimes.get(i);

            assertEquals(oldDiseaseOutcomesWithLocationDateTime.getDiseaseOutcome().toString(), newDiseaseOutcomesWithLocationDateTime.getDiseaseOutcome().toString());
            assertEquals(oldDiseaseOutcomesWithLocationDateTime.getDateTime(), newDiseaseOutcomesWithLocationDateTime.getDateTime());
            assertEquals(oldDiseaseOutcomesWithLocationDateTime.getPlace().toString(), newDiseaseOutcomesWithLocationDateTime.getPlace().toString());
            assertEquals(oldDiseaseOutcomesWithLocationDateTime.getLocationCode(), newDiseaseOutcomesWithLocationDateTime.getLocationCode());
            assertEquals(oldDiseaseOutcomesWithLocationDateTime.getLatLongPair().getLatitutde(), newDiseaseOutcomesWithLocationDateTime.getLatLongPair().getLatitutde());
            assertEquals(oldDiseaseOutcomesWithLocationDateTime.getLatLongPair().getLongitude(), newDiseaseOutcomesWithLocationDateTime.getLatLongPair().getLongitude());
        }
    }

    public void testLabTestsAndResults(List<edu.pitt.apollo.types.v3_1_0.LabTestAndResult> oldLabTestAndResults, List<edu.pitt.apollo.types.v4_0_1.LabTestAndResult> newLabTestAndResults) {
        assertEquals(oldLabTestAndResults.size(), newLabTestAndResults.size());

        for (int i = 0; i < oldLabTestAndResults.size(); i++) {
            edu.pitt.apollo.types.v3_1_0.LabTestAndResult oldLabTestAndResult = oldLabTestAndResults.get(i);
            edu.pitt.apollo.types.v4_0_1.LabTestAndResult newLabTestAndResult = newLabTestAndResults.get(i);

            assertEquals(oldLabTestAndResult.getTextualName(), newLabTestAndResult.getTextualName());
            assertEquals(oldLabTestAndResult.getLoincCode(), newLabTestAndResult.getLoincCode());
            assertEquals(oldLabTestAndResult.getSampleDate(), newLabTestAndResult.getSampleDate());
            assertEquals(oldLabTestAndResult.getResult(), newLabTestAndResult.getResult());
        }
    }

    public void testEpidemicCaseCounts() throws Exception {
        edu.pitt.apollo.types.v3_1_0.EpidemicCaseCounts oldEpidemicCaseCounts = oldEpidemic.getEpidemicCaseCounts();
        edu.pitt.apollo.types.v4_0_1.EpidemicCaseCounts newEpidemicCaseCounts = newEpidemic.getEpidemicCaseCounts().get(0);
        testCaseCount(oldEpidemicCaseCounts.getTotalCaseCount(), newEpidemicCaseCounts.getTotalCaseCount());
        testCaseCount(oldEpidemicCaseCounts.getTotalFatalCaseCount(), newEpidemicCaseCounts.getTotalFatalCaseCount());

        assertEquals(oldEpidemicCaseCounts.getOtherCaseCounts(), newEpidemicCaseCounts.getOtherCaseCounts());
        for (int i = 0; i < oldEpidemicCaseCounts.getOtherCaseCounts().size(); i++) {
            testCaseCount(oldEpidemicCaseCounts.getOtherCaseCounts().get(i), newEpidemicCaseCounts.getOtherCaseCounts().get(i));
        }
    }

    public void testCaseCount(edu.pitt.apollo.types.v3_1_0.CaseCount oldCaseCount, edu.pitt.apollo.types.v4_0_1.CaseCount newCaseCount) {
        assertEquals(oldCaseCount.getCountTitle(), newCaseCount.getCountTitle());
        testCaseDefinitionsIncluded(oldCaseCount.getCaseDefinitionsIncluded(), newCaseCount.getCaseDefinitionsIncluded());
        assertEquals(oldCaseCount.getCaseCountArrayDescription().getCaseCountArrayType().toString(), newCaseCount.getCaseCountArrayDescription().getCaseCountArrayType().toString());
        assertEquals(oldCaseCount.getTotalCount(), newCaseCount.getTotalCount());
        testCaseCountArray(oldCaseCount.getCaseCountArray(), newCaseCount.getCaseCountArray());
        testTemporalCountArrayWithUniformIntervals(oldCaseCount.getTemporalCountArrayWithUniformIntervals(), newCaseCount.getTemporalCountArrayWithUniformIntervals());
        assertEquals(oldCaseCount.getReferenceId(), newCaseCount.getReferenceId());
    }

    public void testCaseDefinitionsIncluded(List<edu.pitt.apollo.types.v3_1_0.CaseDefinitionEnum> oldCaseDefinitionEnums, List<edu.pitt.apollo.types.v4_0_1.CaseDefinitionEnum> newCaseDefinitionEnums) {
        assertEquals(oldCaseDefinitionEnums.size(), newCaseDefinitionEnums.size());

        for (int i = 0; i < oldCaseDefinitionEnums.size(); i++) {
            edu.pitt.apollo.types.v3_1_0.CaseDefinitionEnum oldCaseDefinitionEnum = oldCaseDefinitionEnums.get(i);
            edu.pitt.apollo.types.v4_0_1.CaseDefinitionEnum newCaseDefinitionEnum = newCaseDefinitionEnums.get(i);
            assertEquals(oldCaseDefinitionEnum.toString(), newCaseDefinitionEnum.toString());
        }
    }

    public void testCaseCountArray(edu.pitt.apollo.types.v3_1_0.CaseCountArray oldCaseCountArray, edu.pitt.apollo.types.v4_0_1.VariableCategoryValueTree newCaseCountArray) {
        assertEquals(oldCaseCountArray.getNDimensions(), newCaseCountArray.getNVariables());
        testArrayAxis(oldCaseCountArray.getFirstArrayAxis(), newCaseCountArray.getRootVariableNode());
    }

    public void testArrayAxis(edu.pitt.apollo.types.v3_1_0.ArrayAxis oldArrayAxis, edu.pitt.apollo.types.v4_0_1.CategoricalVariableNode newArrayAxis) {
        assertEquals(oldArrayAxis.getName().toString(), newArrayAxis.getName().toString());
        testCaseCountCategories(oldArrayAxis.getCategories(), newArrayAxis.getCategories());
    }

    public void testCaseCountCategories(List<edu.pitt.apollo.types.v3_1_0.CaseCountCategory> oldCaseCountCategories, List<edu.pitt.apollo.types.v4_0_1.CategoryValueNode> newCaseCountCategories) {
        assertEquals(oldCaseCountCategories.size(), newCaseCountCategories.size());

        for (int i = 0; i < oldCaseCountCategories.size(); i++) {
            edu.pitt.apollo.types.v3_1_0.CaseCountCategory oldCaseCountCategory = oldCaseCountCategories.get(i);
            edu.pitt.apollo.types.v4_0_1.CategoryValueNode newCaseCountCategory = newCaseCountCategories.get(i);
            assertEquals(oldCaseCountCategory.getCategoryDefinition().toString(), newCaseCountCategory.getCategoryDefinition().toString());
            assertEquals(oldCaseCountCategory.getCount(), newCaseCountCategory.getValue());
            testArrayAxis(oldCaseCountCategory.getArrayAxis(), newCaseCountCategory.getNextCategoricalVariable());
        }
    }

    public void testTemporalCountArrayWithUniformIntervals(edu.pitt.apollo.types.v3_1_0.TemporalCountArrayWithUniformIntervals oldTemporalCountArrayWithUniformIntervals, edu.pitt.apollo.types.v4_0_1.TemporalCountArrayWithUniformIntervals newTemporalCountArrayWithUniformIntervals) {
        assertEquals(oldTemporalCountArrayWithUniformIntervals.getNDimensions(), newTemporalCountArrayWithUniformIntervals.getNDimensions());
        assertEquals(oldTemporalCountArrayWithUniformIntervals.getNTemporalIntervals(), newTemporalCountArrayWithUniformIntervals.getNTemporalIntervals());
        testArrayAxis(oldTemporalCountArrayWithUniformIntervals.getFirstArrayAxis(), newTemporalCountArrayWithUniformIntervals.getFirstArrayAxis());
    }

    public void testTransmissionTrees() throws Exception {
        testTransmissionTree(oldEpidemic.getTransmissionTrees(), newEpidemic.getTransmissionTrees());

    }

    public void testTransmissionTree(List<edu.pitt.apollo.types.v3_1_0.TransmissionTree> oldTransmissionTrees, List<edu.pitt.apollo.types.v4_0_1.TransmissionTree> newTransmissionTrees) {
        assertEquals(oldTransmissionTrees.size(), newTransmissionTrees.size());

        for (int i = 0; i < oldTransmissionTrees.size(); i++) {
            edu.pitt.apollo.types.v3_1_0.TransmissionTree oldTransmissionTree = oldTransmissionTrees.get(i);
            edu.pitt.apollo.types.v4_0_1.TransmissionTree newTransmissionTree = newTransmissionTrees.get(i);

            List<edu.pitt.apollo.types.v3_1_0.CaseRecord> oldCaseRecord = new ArrayList<>();
            oldCaseRecord.add(oldTransmissionTree.getThisCase());
            List<edu.pitt.apollo.types.v4_0_1.CaseRecord> newCaseRecord = new ArrayList<>();
            newCaseRecord.add(newTransmissionTree.getThisCase());
            testCaseRecords(oldCaseRecord, newCaseRecord);
            testTransmissionTree(oldTransmissionTree.getCasesThisCaseInfected(), newTransmissionTree.getCasesThisCaseInfected());
        }
    }

    public void testRelativeRiskDatas() throws Exception {
        assertEquals(oldEpidemic.getRelativeRiskDataSets().size(), newEpidemic.getRelativeRiskDataSets().size());

        for (int i = 0; i < oldEpidemic.getRelativeRiskDataSets().size(); i++) {
            edu.pitt.apollo.types.v3_1_0.RelativeRiskDataSet oldRelativeRiskDataSet = oldEpidemic.getRelativeRiskDataSets().get(i);
            edu.pitt.apollo.types.v4_0_1.RelativeRiskDataSet newRelativeRiskDataSet = newEpidemic.getRelativeRiskDataSets().get(i);
            assertEquals(oldRelativeRiskDataSet.getTextualDescription(), newRelativeRiskDataSet.getTextualDescription());
            testCaseCountArray(oldRelativeRiskDataSet.getCaseCountArray(), newRelativeRiskDataSet.getCaseCountArray());
            testCaseCountArray(oldRelativeRiskDataSet.getControlCountArray(), newRelativeRiskDataSet.getControlCountArray());
            testReference(oldRelativeRiskDataSet.getReferenceId(), newRelativeRiskDataSet.getReferenceId());
        }
    }

    public void testCausalPathogenIsolates() throws Exception {
        assertEquals(oldEpidemic.getCausalPathogenIsolates().size(), newEpidemic.getCausalPathogenIsolates().size());
        for (int i = 0; i < oldEpidemic.getCausalPathogenIsolates().size(); i++) {
            assertEquals(oldEpidemic.getCausalPathogenIsolates().get(i), newEpidemic.getCausalPathogenIsolates().get(i));
        }
    }

    public void testReferences() throws Exception {
        assertEquals(oldEpidemic.getReferences().size(), newEpidemic.getReferences().size());

        for (int i = 0; i < oldEpidemic.getReferences().size(); i++) {
            edu.pitt.apollo.types.v3_1_0.Reference oldReference = oldEpidemic.getReferences().get(i);
            edu.pitt.apollo.types.v4_0_1.Reference newReference = newEpidemic.getReferences().get(i);
            testReference(oldReference, newReference);
        }
    }

    public void testReference(edu.pitt.apollo.types.v3_1_0.Reference oldReference, edu.pitt.apollo.types.v4_0_1.Reference newReference) {
        assertEquals(oldReference.getId(), newReference.getId());
        assertEquals(oldReference.getTitle(), newReference.getTitle());
        assertEquals(oldReference.getAuthors(), newReference.getAuthors());
        assertEquals(oldReference.getPublication(), newReference.getPublication());
        assertEquals(oldReference.getUrl(), newReference.getUrl());
        assertEquals(oldReference.getPubMedId(), newReference.getPubMedId());
        assertEquals(oldReference.getOrcId(), newReference.getOrcId());
        assertEquals(oldReference.getObcIdeId(), newReference.getObcIdeId());
    }

    public void testCurator() throws Exception {
        assertEquals(oldEpidemic.getCurator(), newEpidemic.getCurator());
    }

    public void testEditHistory() throws Exception {
        assertEquals(oldEpidemic.getEditHistory().size(), newEpidemic.getEditHistory().size());

        for (int i = 0; i < oldEpidemic.getEditHistory().size(); i++) {
            assertEquals(oldEpidemic.getEditHistory().get(i), newEpidemic.getEditHistory().get(i));
        }
    }

    public void testReviewedBy() throws Exception {
        assertEquals(oldEpidemic.getReviewedBy().size(), newEpidemic.getReviewedBy().size());

        for (int i = 0; i < oldEpidemic.getReviewedBy().size(); i++) {
            assertEquals(oldEpidemic.getReviewedBy().get(i), newEpidemic.getReviewedBy().get(i));
        }   
    }

    public void testAcknowledgements() throws Exception {
        assertEquals(oldEpidemic.getAcknowledgements().size(), newEpidemic.getAcknowledgements().size());

        for (int i = 0; i < oldEpidemic.getAcknowledgements().size(); i++) {
            assertEquals(oldEpidemic.getAcknowledgements().get(i), newEpidemic.getAcknowledgements().get(i));
        }   
    }

    public void setUp() throws Exception {
        byte[] encoded = Files.readAllBytes(Paths.get("/Users/mas400/Downloads/testEpidemic.json"));
        String jsonEpidemic = new String(encoded, StandardCharsets.UTF_8);

        oldEpidemic = new JsonDeserializer(Arrays.asList(ClassList.classList)).getObjectFromMessage(jsonEpidemic, edu.pitt.apollo.types.v3_1_0.Epidemic.class);
        EpidemicSetter setter = new EpidemicSetter(edu.pitt.apollo.types.v4_0_1.Epidemic.class, oldEpidemic);
        setter.set();
        newEpidemic = setter.getNewTypeInstance();
        super.setUp();

    }

    public void tearDown() throws Exception {

    }

}