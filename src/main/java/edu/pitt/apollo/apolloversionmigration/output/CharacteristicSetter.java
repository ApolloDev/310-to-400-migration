package edu.pitt.apollo.apolloversionmigration.output;

public class CharacteristicSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.Characteristic,edu.pitt.apollo.types.v3_1_0.Characteristic> {

	public CharacteristicSetter(Class<edu.pitt.apollo.types.v4_0.Characteristic> newTypeClass, edu.pitt.apollo.types.v3_1_0.Characteristic oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setEnumeratedName() throws MigrationException {
		newTypeInstance.setEnumeratedName(edu.pitt.apollo.types.v4_0.CharacteristicEnum.fromValue(oldTypeInstance.getEnumeratedName().toString()));
	}

	private void setUserInventedName() throws MigrationException {
		newTypeInstance.setUserInventedName(oldTypeInstance.getUserInventedName());
	}

	private void setValue() throws MigrationException {
		CategoryDefinitionSetter setter = CategoryDefinitionSetterFactory.getSetter(oldTypeInstance.getValue());
		setter.set();
		newTypeInstance.setValue(setter.getNewTypeInstance());
	}

	@Override
	public void set() throws MigrationException {
		setEnumeratedName();
		setUserInventedName();
		setValue();
	}

}