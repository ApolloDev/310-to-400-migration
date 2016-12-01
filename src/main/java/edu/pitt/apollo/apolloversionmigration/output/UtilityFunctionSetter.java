package edu.pitt.apollo.apolloversionmigration.output;

public class UtilityFunctionSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.UtilityFunction> {

	public UtilityFunctionSetter(Class<edu.pitt.apollo.types.v4_0.UtilityFunction> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setLambdaFunction() throws MigrationException {
		newTypeInstance.setLambdaFunction(((edu.pitt.apollo.types.v3_1_0.UtilityFunction) oldTypeInstance).getLambdaFunction());
	}

	protected void setTextDescription() throws MigrationException {
		newTypeInstance.setTextDescription(((edu.pitt.apollo.types.v3_1_0.UtilityFunction) oldTypeInstance).getTextDescription());
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			setLambdaFunction();
			setTextDescription();
		}
	}

}