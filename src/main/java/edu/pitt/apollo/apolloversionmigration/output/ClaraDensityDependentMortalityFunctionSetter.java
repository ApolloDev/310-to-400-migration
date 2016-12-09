package edu.pitt.apollo.apolloversionmigration.output;

public class ClaraDensityDependentMortalityFunctionSetter extends MortalityFunctionSetter<edu.pitt.apollo.types.v4_0_1.ClaraDensityDependentMortalityFunction> {

	public ClaraDensityDependentMortalityFunctionSetter(Class<edu.pitt.apollo.types.v4_0_1.ClaraDensityDependentMortalityFunction> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setDescription() throws MigrationException {
		newTypeInstance.setDescription(((edu.pitt.apollo.types.v3_1_0.ClaraDensityDependentMortalityFunction) oldTypeInstance).getDescription());
	}

	protected void setOmega() throws MigrationException {
		newTypeInstance.setOmega(((edu.pitt.apollo.types.v3_1_0.ClaraDensityDependentMortalityFunction) oldTypeInstance).getOmega());
	}

	protected void setSigma() throws MigrationException {
		newTypeInstance.setSigma(((edu.pitt.apollo.types.v3_1_0.ClaraDensityDependentMortalityFunction) oldTypeInstance).getSigma());
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
			setDescription();
			setOmega();
			setSigma();
		}
	}

}