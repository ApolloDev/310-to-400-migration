package edu.pitt.apollo.apolloversionmigration.output;

public class IndividualSetter<T extends edu.pitt.apollo.types.v4_0.Individual, O extends edu.pitt.apollo.types.v3_1_0.Individual> extends AbstractSetter<T,O> {

	public IndividualSetter(Class<T> newTypeClass, O oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setIndividualId() throws MigrationException {
		newTypeInstance.setIndividualId(oldTypeInstance.getIndividualId());
	}

	private void setAge() throws MigrationException {
		FixedDurationSetter setter = new FixedDurationSetter(edu.pitt.apollo.types.v4_0.FixedDuration.class,oldTypeInstance.getAge());
		setter.set();
		newTypeInstance.setAge(setter.getNewTypeInstance());
	}

	private void setCharacteristics() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.Characteristic oldObj : oldTypeInstance.getCharacteristics()) {
			CharacteristicSetter setter = new CharacteristicSetter(edu.pitt.apollo.types.v4_0.Characteristic.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.Characteristic newObj = setter.getNewTypeInstance();
			newTypeInstance.getCharacteristics().add(newObj);
		}

	}

	@Override
	public void set() throws MigrationException {
		setIndividualId();
		setAge();
		setCharacteristics();
	}

	@Override
	public T getNewTypeInstance() {
		return newTypeInstance;
	}

}