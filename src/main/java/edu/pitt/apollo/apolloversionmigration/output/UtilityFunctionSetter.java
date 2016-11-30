package edu.pitt.apollo.apolloversionmigration.output;

public class UtilityFunctionSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.UtilityFunction,edu.pitt.apollo.types.v3_1_0.UtilityFunction> {

	public UtilityFunctionSetter(Class<edu.pitt.apollo.types.v4_0.UtilityFunction> newTypeClass, edu.pitt.apollo.types.v3_1_0.UtilityFunction oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setLambdaFunction() throws MigrationException {
		newTypeInstance.setLambdaFunction(oldTypeInstance.getLambdaFunction());
	}

	private void setTextDescription() throws MigrationException {
		newTypeInstance.setTextDescription(oldTypeInstance.getTextDescription());
	}

	@Override
	public void set() throws MigrationException {
		setLambdaFunction();
		setTextDescription();
	}

}