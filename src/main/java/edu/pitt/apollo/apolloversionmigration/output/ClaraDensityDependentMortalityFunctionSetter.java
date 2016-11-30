package edu.pitt.apollo.apolloversionmigration.output;

public class ClaraDensityDependentMortalityFunctionSetter extends MortalityFunctionSetter<edu.pitt.apollo.types.v4_0.ClaraDensityDependentMortalityFunction,edu.pitt.apollo.types.v3_1_0.ClaraDensityDependentMortalityFunction> {

	public ClaraDensityDependentMortalityFunctionSetter(Class<edu.pitt.apollo.types.v4_0.ClaraDensityDependentMortalityFunction> newTypeClass, edu.pitt.apollo.types.v3_1_0.ClaraDensityDependentMortalityFunction oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setDescription() throws MigrationException {
		newTypeInstance.setDescription(oldTypeInstance.getDescription());
	}

	private void setOmega() throws MigrationException {
		newTypeInstance.setOmega(oldTypeInstance.getOmega());
	}

	private void setSigma() throws MigrationException {
		newTypeInstance.setSigma(oldTypeInstance.getSigma());
	}

	@Override
	public void set() throws MigrationException {
		super.set();
		setDescription();
		setOmega();
		setSigma();
	}

}