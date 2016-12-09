package edu.pitt.apollo.apolloversionmigration.output;

import edu.pitt.apollo.types.v3_1_0.Household;

public class HouseholdSetterImpl extends HouseholdSetter {

    public HouseholdSetterImpl(Class<edu.pitt.apollo.types.v4_0_1.Household> newTypeClass, Object oldTypeInstance) throws MigrationException {
        super(newTypeClass, oldTypeInstance);

    }

    @Override
    protected void setUnRelated() throws MigrationException {
        newTypeInstance.setUnRelated(((edu.pitt.apollo.types.v3_1_0.Household) oldTypeInstance).getUnrelated());

    }

    @Override
    protected void setIndividualIds() throws MigrationException {
        for (java.math.BigInteger oldObj : ((edu.pitt.apollo.types.v3_1_0.Household) oldTypeInstance).getIndividualIds()) {
            newTypeInstance.getIndividualIds().add(oldObj);
        }
    }


}