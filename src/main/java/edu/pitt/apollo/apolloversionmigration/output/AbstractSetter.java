package edu.pitt.apollo.apolloversionmigration.output;

public abstract class AbstractSetter<N, O> {

    protected final N newTypeInstance;
    protected final O oldTypeInstance;

    public AbstractSetter(Class<N> newTypeClass, O oldTypeInstance) throws SetterInitializationException {
        try {
            this.newTypeInstance = newTypeClass.newInstance();
            this.oldTypeInstance = oldTypeInstance;
        } catch (IllegalAccessException | InstantiationException ex) {
            throw new SetterInitializationException(ex.getClass().getSimpleName() + ": " + ex.getMessage());
        }
    }

    public abstract void set() throws MigrationException;

    public N getNewTypeInstance() {
        return newTypeInstance;
    }
}