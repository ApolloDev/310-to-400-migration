package edu.pitt.apollo.apolloversionmigration.output;

public class ContaminationSetterImpl extends ContaminationSetter {

    public ContaminationSetterImpl(Class<edu.pitt.apollo.types.v4_0.Contamination> newTypeClass, Object oldTypeInstance) throws MigrationException {
        super(newTypeClass, oldTypeInstance);

    }

    @Override
    protected void setXxx() throws MigrationException {
        ApolloPathogenCodeSetter setter = new ApolloPathogenCodeSetter(edu.pitt.apollo.types.v4_0.ApolloPathogenCode.class, ((edu.pitt.apollo.types.v3_1_0.Contamination) oldTypeInstance).getPathogen());
        setter.set();
        newTypeInstance.setXXX(setter.getNewTypeInstance());
    }


}