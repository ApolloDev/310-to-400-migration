package edu.pitt.apollo.apolloversionmigration.output;

public class CategoricalVariableNodeArrayAxisSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.CategoricalVariableNode,edu.pitt.apollo.types.v3_1_0.ArrayAxis> {

    public CategoricalVariableNodeArrayAxisSetter(Class<edu.pitt.apollo.types.v4_0.CategoricalVariableNode> newTypeClass, edu.pitt.apollo.types.v3_1_0.ArrayAxis oldTypeInstance) throws MigrationException {
        super(newTypeClass, oldTypeInstance);

    }

    private void setName() throws MigrationException {
        newTypeInstance.setName(edu.pitt.apollo.types.v4_0.CategoricalVariableEnum.fromValue(oldTypeInstance.getName().toString()));
    }

    private void setCategories() throws MigrationException {
        for (edu.pitt.apollo.types.v3_1_0.CaseCountCategory oldObj : oldTypeInstance.getCategories()) {
            CategoryValueNodeCaseCountCategorySetter setter = new CategoryValueNodeCaseCountCategorySetter(edu.pitt.apollo.types.v4_0.CategoryValueNode.class,oldObj);
            setter.set();
            edu.pitt.apollo.types.v4_0.CategoryValueNode newObj = setter.getNewTypeInstance();
            newTypeInstance.getCategories().add(newObj);
        }

    }

    @Override
    public void set() throws MigrationException {
        setName();
        setCategories();
    }

}