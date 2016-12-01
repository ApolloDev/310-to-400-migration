package edu.pitt.apollo.apolloversionmigration.output;

public class CharacteristicSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.Characteristic> {

	public CharacteristicSetter(Class<edu.pitt.apollo.types.v4_0.Characteristic> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setEnumeratedName() throws MigrationException {
		newTypeInstance.setEnumeratedName(edu.pitt.apollo.types.v4_0.CharacteristicEnum.valueOf(((edu.pitt.apollo.types.v3_1_0.Characteristic) oldTypeInstance).getEnumeratedName().toString()));
	}

	protected void setUserInventedName() throws MigrationException {
		newTypeInstance.setUserInventedName(((edu.pitt.apollo.types.v3_1_0.Characteristic) oldTypeInstance).getUserInventedName());
	}

	protected void setValue() throws MigrationException {
		if (((edu.pitt.apollo.types.v3_1_0.Characteristic) oldTypeInstance).getValue() != null) {
			CategoryDefinitionSetter setter = CategoryDefinitionSetterFactory.getSetter(((edu.pitt.apollo.types.v3_1_0.Characteristic) oldTypeInstance).getValue());
			setter.set();
			newTypeInstance.setValue(setter.getNewTypeInstance());
		}

	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			setEnumeratedName();
			setUserInventedName();
			setValue();
		}
	}

}