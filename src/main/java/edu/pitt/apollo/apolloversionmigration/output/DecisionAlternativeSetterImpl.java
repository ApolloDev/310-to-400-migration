package edu.pitt.apollo.apolloversionmigration.output;

public class DecisionAlternativeSetterImpl extends DecisionAlternativeSetter {

    public DecisionAlternativeSetterImpl(Class<edu.pitt.apollo.types.v4_0.DecisionAlternative> newTypeClass, Object oldTypeInstance) throws MigrationException {
        super(newTypeClass, oldTypeInstance);

    }

    @Override
    protected void setSingleMeasure() throws MigrationException {
        newTypeInstance.setSingleMeasure(((edu.pitt.apollo.types.v3_1_0.DecisionAlternative) oldTypeInstance).getSingleStrategy());

    }

    @Override
    protected void setCombinationMeasure() throws MigrationException {
        newTypeInstance.setCombinationMeasure(((edu.pitt.apollo.types.v3_1_0.DecisionAlternative) oldTypeInstance).getCombinationStrategy());

    }

    @Override
    protected void setSequentialCombinationMeasure() throws MigrationException {
        newTypeInstance.setSequentialCombinationMeasure(((edu.pitt.apollo.types.v3_1_0.DecisionAlternative) oldTypeInstance).getSequentialCombinationStrategy());

    }


}