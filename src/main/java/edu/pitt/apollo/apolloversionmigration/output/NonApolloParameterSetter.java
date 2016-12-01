package edu.pitt.apollo.apolloversionmigration.output;

public class NonApolloParameterSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.NonApolloParameter> {

	public NonApolloParameterSetter(Class<edu.pitt.apollo.types.v4_0.NonApolloParameter> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setDescription() throws MigrationException {
		newTypeInstance.setDescription(((edu.pitt.apollo.types.v3_1_0.NonApolloParameter) oldTypeInstance).getDescription());
	}

	protected void setParameterName() throws MigrationException {
		newTypeInstance.setParameterName(((edu.pitt.apollo.types.v3_1_0.NonApolloParameter) oldTypeInstance).getParameterName());
	}

	protected void setParameterIntValue() throws MigrationException {
		newTypeInstance.setParameterIntValue(((edu.pitt.apollo.types.v3_1_0.NonApolloParameter) oldTypeInstance).getParameterIntValue());
	}

	protected void setParameterFloatValue() throws MigrationException {
		newTypeInstance.setParameterFloatValue(((edu.pitt.apollo.types.v3_1_0.NonApolloParameter) oldTypeInstance).getParameterFloatValue());
	}

	protected void setParameterTokenValue() throws MigrationException {
		newTypeInstance.setParameterTokenValue(((edu.pitt.apollo.types.v3_1_0.NonApolloParameter) oldTypeInstance).getParameterTokenValue());
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			setDescription();
			setParameterName();
			setParameterIntValue();
			setParameterFloatValue();
			setParameterTokenValue();
		}
	}

}