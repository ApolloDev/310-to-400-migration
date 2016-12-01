package edu.pitt.apollo.apolloversionmigration.output;

import edu.pitt.apollo.types.v3_1_0.CaseCountArray;

public class VariableCategoryValueTreeSetterImpl extends VariableCategoryValueTreeSetter {

    public VariableCategoryValueTreeSetterImpl(Class<edu.pitt.apollo.types.v4_0.VariableCategoryValueTree> newTypeClass, Object oldTypeInstance) throws MigrationException {
        super(newTypeClass, oldTypeInstance);

    }

    @Override
    protected void setNVariables() throws MigrationException {
        newTypeInstance.setNVariables(((CaseCountArray) oldTypeInstance).getNDimensions());
    }

    @Override
    protected void setRootVariableNode() throws MigrationException {
        CategoricalVariableNodeSetter setter = new CategoricalVariableNodeSetterImpl(edu.pitt.apollo.types.v4_0.CategoricalVariableNode.class, ((CaseCountArray) oldTypeInstance).getFirstArrayAxis());
        setter.set();
        newTypeInstance.setRootVariableNode(setter.getNewTypeInstance());
    }


}