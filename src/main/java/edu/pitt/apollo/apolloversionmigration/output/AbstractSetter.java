package edu.pitt.apollo.apolloversionmigration.output;

public abstract class AbstractSetter<N> {

    protected final N newTypeInstance;
    protected final Object oldTypeInstance;

    public AbstractSetter(Class<N> newTypeClass, Object oldTypeInstance) throws SetterInitializationException {
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