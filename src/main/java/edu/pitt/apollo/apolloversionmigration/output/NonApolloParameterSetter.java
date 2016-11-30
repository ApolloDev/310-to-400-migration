package edu.pitt.apollo.apolloversionmigration.output;

public class NonApolloParameterSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.NonApolloParameter,edu.pitt.apollo.types.v3_1_0.NonApolloParameter> {

	public NonApolloParameterSetter(Class<edu.pitt.apollo.types.v4_0.NonApolloParameter> newTypeClass, edu.pitt.apollo.types.v3_1_0.NonApolloParameter oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setDescription() throws MigrationException {
		newTypeInstance.setDescription(oldTypeInstance.getDescription());
	}

	private void setParameterName() throws MigrationException {
		newTypeInstance.setParameterName(oldTypeInstance.getParameterName());
	}

	private void setParameterIntValue() throws MigrationException {
		newTypeInstance.setParameterIntValue(oldTypeInstance.getParameterIntValue());
	}

	private void setParameterFloatValue() throws MigrationException {
		newTypeInstance.setParameterFloatValue(oldTypeInstance.getParameterFloatValue());
	}

	private void setParameterTokenValue() throws MigrationException {
		newTypeInstance.setParameterTokenValue(oldTypeInstance.getParameterTokenValue());
	}

	@Override
	public void set() throws MigrationException {
		setDescription();
		setParameterName();
		setParameterIntValue();
		setParameterFloatValue();
		setParameterTokenValue();
	}

}