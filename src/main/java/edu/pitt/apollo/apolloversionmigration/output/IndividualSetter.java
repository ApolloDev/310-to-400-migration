package edu.pitt.apollo.apolloversionmigration.output;

public class IndividualSetter<T extends edu.pitt.apollo.types.v4_0.Individual> extends AbstractSetter<T> {

	public IndividualSetter(Class<T> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setIndividualId() throws MigrationException {
		newTypeInstance.setIndividualId(((edu.pitt.apollo.types.v3_1_0.Individual) oldTypeInstance).getIndividualId());
	}

	protected void setAge() throws MigrationException {
		FixedDurationSetter setter = new FixedDurationSetter(edu.pitt.apollo.types.v4_0.FixedDuration.class,((edu.pitt.apollo.types.v3_1_0.Individual) oldTypeInstance).getAge());
		setter.set();
		newTypeInstance.setAge(setter.getNewTypeInstance());
	}

	protected void setCharacteristics() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.Characteristic oldObj : ((edu.pitt.apollo.types.v3_1_0.Individual) oldTypeInstance).getCharacteristics()) {
			CharacteristicSetter setter = new CharacteristicSetter(edu.pitt.apollo.types.v4_0.Characteristic.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.Characteristic newObj = setter.getNewTypeInstance();
			newTypeInstance.getCharacteristics().add(newObj);
		}

	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			setIndividualId();
			setAge();
			setCharacteristics();
		}
	}

	@Override
	public T getNewTypeInstance() {
		return newTypeInstance;
	}

}