package edu.pitt.apollo.apolloversionmigration.output;

import edu.pitt.apollo.types.v3_1_0.CaseCountCategory;
import edu.pitt.apollo.types.v3_1_0.Category;

public class CategoryValueNodeSetterImpl extends CategoryValueNodeSetter {

    public CategoryValueNodeSetterImpl(Class<edu.pitt.apollo.types.v4_0.CategoryValueNode> newTypeClass, Object oldTypeInstance) throws MigrationException {
        super(newTypeClass, oldTypeInstance);

    }

    @Override
    protected void setCategoryDefinition() throws MigrationException {
        if (oldTypeInstance instanceof edu.pitt.apollo.types.v3_1_0.CaseCountCategory) {
            if (((edu.pitt.apollo.types.v3_1_0.CaseCountCategory) oldTypeInstance).getCategoryDefinition() != null) {
                CategoryDefinitionSetter setter = CategoryDefinitionSetterFactory.getSetter(((edu.pitt.apollo.types.v3_1_0.CaseCountCategory) oldTypeInstance).getCategoryDefinition());
                setter.set();
                newTypeInstance.setCategoryDefinition(setter.getNewTypeInstance());
            }
        } else if (oldTypeInstance instanceof edu.pitt.apollo.types.v3_1_0.Category) {
            if (((edu.pitt.apollo.types.v3_1_0.Category) oldTypeInstance).getCategoryDefinition() != null) {
                CategoryDefinitionSetter setter = CategoryDefinitionSetterFactory.getSetter(((edu.pitt.apollo.types.v3_1_0.Category) oldTypeInstance).getCategoryDefinition());
                setter.set();
                newTypeInstance.setCategoryDefinition(setter.getNewTypeInstance());
            }
        } else {
            throw new MigrationException("Requires type edu.pitt.apollo.types.v3_1_0.CaseCountCategory or edu.pitt.apollo.types.v3_1_0.Category.");
        }

    }

        @Override
    protected void setValue() throws MigrationException {
        if (oldTypeInstance instanceof edu.pitt.apollo.types.v3_1_0.CaseCountCategory) {
            newTypeInstance.setValue(((CaseCountCategory) oldTypeInstance).getCount());
        } else if (oldTypeInstance instanceof edu.pitt.apollo.types.v3_1_0.Category) {
            newTypeInstance.setValue(null);
        } else {
            throw new MigrationException("Requires type edu.pitt.apollo.types.v3_1_0.CaseCountCategory or edu.pitt.apollo.types.v3_1_0.Category.");
        }
    }

    @Override
    protected void setUnconditionalProbabilityDistribution() throws MigrationException {
        if (oldTypeInstance instanceof edu.pitt.apollo.types.v3_1_0.CaseCountCategory) {

        } else if (oldTypeInstance instanceof edu.pitt.apollo.types.v3_1_0.Category) {
            UnconditionalProbabilityDistributionSetter setter = UnconditionalProbabilityDistributionSetterFactory.getSetter(((Category)oldTypeInstance).getUnconditionalProbabilityDistribution());
            setter.set();
            newTypeInstance.setUnconditionalProbabilityDistribution(setter.getNewTypeInstance());
        } else {
            throw new MigrationException("Requires type edu.pitt.apollo.types.v3_1_0.CaseCountCategory or edu.pitt.apollo.types.v3_1_0.Category.");
        }
    }

    @Override
    protected void setNextCategoricalVariable() throws MigrationException {
        if (oldTypeInstance instanceof edu.pitt.apollo.types.v3_1_0.CaseCountCategory) {
            CategoricalVariableNodeSetter setter = new CategoricalVariableNodeSetterImpl(edu.pitt.apollo.types.v4_0.CategoricalVariableNode.class, ((CaseCountCategory) oldTypeInstance).getArrayAxis());
            setter.set();
            newTypeInstance.setNextCategoricalVariable(setter.getNewTypeInstance());
        } else if (oldTypeInstance instanceof edu.pitt.apollo.types.v3_1_0.Category) {
            CategoricalVariableNodeSetter setter = new CategoricalVariableNodeSetterImpl(edu.pitt.apollo.types.v4_0.CategoricalVariableNode.class,((Category)oldTypeInstance).getConditioningVariable());
            setter.set();
            newTypeInstance.setNextCategoricalVariable(setter.getNewTypeInstance());
        } else {
            throw new MigrationException("Requires type edu.pitt.apollo.types.v3_1_0.CaseCountCategory or edu.pitt.apollo.types.v3_1_0.Category.");
        }
    }


}