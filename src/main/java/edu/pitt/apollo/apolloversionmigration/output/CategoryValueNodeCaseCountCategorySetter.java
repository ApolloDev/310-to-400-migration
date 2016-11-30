package edu.pitt.apollo.apolloversionmigration.output;

import edu.pitt.apollo.types.v3_1_0.UnconditionalProbabilityDistribution;

public class CategoryValueNodeCaseCountCategorySetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.CategoryValueNode,edu.pitt.apollo.types.v3_1_0.CaseCountCategory> {

    public CategoryValueNodeCaseCountCategorySetter(Class<edu.pitt.apollo.types.v4_0.CategoryValueNode> newTypeClass, edu.pitt.apollo.types.v3_1_0.CaseCountCategory oldTypeInstance) throws MigrationException {
        super(newTypeClass, oldTypeInstance);

    }

    private void setCategoryDefinition() throws MigrationException {
        CategoryDefinitionSetter setter = CategoryDefinitionSetterFactory.getSetter(oldTypeInstance.getCategoryDefinition());
        setter.set();
        newTypeInstance.setCategoryDefinition(setter.getNewTypeInstance());
    }

    private void setValue() throws MigrationException {
        newTypeInstance.setValue(oldTypeInstance.getCount());
    }

    private void setUnconditionalProbabilityDistribution() throws MigrationException {
//        UnconditionalProbabilityDistributionSetter setter = UnconditionalProbabilityDistributionSetterFactory.getSetter(new UnconditionalProbabilityDistribution());
//        setter.set();
//        newTypeInstance.setUnconditionalProbabilityDistribution(setter.getNewTypeInstance());
    }

    private void setNextCategoricalVariable() throws MigrationException {
        CategoricalVariableNodeArrayAxisSetter setter = new CategoricalVariableNodeArrayAxisSetter(edu.pitt.apollo.types.v4_0.CategoricalVariableNode.class,oldTypeInstance.getArrayAxis());
        setter.set();
        newTypeInstance.setNextCategoricalVariable(setter.getNewTypeInstance());
    }

    @Override
    public void set() throws MigrationException {
        setCategoryDefinition();
        setValue();
        setUnconditionalProbabilityDistribution();
        setNextCategoricalVariable();
    }

}