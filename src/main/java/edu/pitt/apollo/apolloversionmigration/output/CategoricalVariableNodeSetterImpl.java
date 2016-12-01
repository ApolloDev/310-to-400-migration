package edu.pitt.apollo.apolloversionmigration.output;

import edu.pitt.apollo.types.v3_1_0.ArrayAxis;
import edu.pitt.apollo.types.v3_1_0.ConditioningVariable;

public class CategoricalVariableNodeSetterImpl extends CategoricalVariableNodeSetter {

    public CategoricalVariableNodeSetterImpl(Class<edu.pitt.apollo.types.v4_0.CategoricalVariableNode> newTypeClass, Object oldTypeInstance) throws MigrationException {
        super(newTypeClass, oldTypeInstance);

    }

    @Override
    protected void setName() throws MigrationException {
        if (oldTypeInstance instanceof edu.pitt.apollo.types.v3_1_0.ArrayAxis) {
            newTypeInstance.setName(edu.pitt.apollo.types.v4_0.CategoricalVariableEnum.valueOf(((ArrayAxis) oldTypeInstance).getName().toString()));
        } else if (oldTypeInstance instanceof edu.pitt.apollo.types.v3_1_0.ConditioningVariable) {
            newTypeInstance.setName(edu.pitt.apollo.types.v4_0.CategoricalVariableEnum.valueOf(((ConditioningVariable) oldTypeInstance).getName().toString()));
        } else {
            throw new MigrationException("Requires type edu.pitt.apollo.types.v3_1_0.ArrayAxis or edu.pitt.apollo.types.v3_1_0.ConditioningVariable.");
        }
    }

    @Override
    protected void setCategories() throws MigrationException {
        if (oldTypeInstance instanceof edu.pitt.apollo.types.v3_1_0.ArrayAxis) {
            for (edu.pitt.apollo.types.v3_1_0.CaseCountCategory oldObj : ((ArrayAxis) oldTypeInstance).getCategories()) {
                CategoryValueNodeSetter setter = new CategoryValueNodeSetterImpl(edu.pitt.apollo.types.v4_0.CategoryValueNode.class, oldObj);
                setter.set();
                edu.pitt.apollo.types.v4_0.CategoryValueNode newObj = setter.getNewTypeInstance();
                newTypeInstance.getCategories().add(newObj);
            }

        } else if (oldTypeInstance instanceof edu.pitt.apollo.types.v3_1_0.ConditioningVariable) {
            for (edu.pitt.apollo.types.v3_1_0.Category oldObj : ((ConditioningVariable) oldTypeInstance).getCategories()) {
                CategoryValueNodeSetter setter = new CategoryValueNodeSetterImpl(edu.pitt.apollo.types.v4_0.CategoryValueNode.class, oldObj);
                setter.set();
                edu.pitt.apollo.types.v4_0.CategoryValueNode newObj = setter.getNewTypeInstance();
                newTypeInstance.getCategories().add(newObj);
            }
        } else {
            throw new MigrationException("Requires type edu.pitt.apollo.types.v3_1_0.ArrayAxis or edu.pitt.apollo.types.v3_1_0.ConditioningVariable.");
        }
    }
}