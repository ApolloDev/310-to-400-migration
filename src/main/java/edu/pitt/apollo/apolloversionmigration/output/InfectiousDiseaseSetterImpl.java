package edu.pitt.apollo.apolloversionmigration.output;

public class InfectiousDiseaseSetterImpl extends InfectiousDiseaseSetter {

	public InfectiousDiseaseSetterImpl(Class<edu.pitt.apollo.types.v4_0.InfectiousDisease> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	@Override
	protected void setCoosalPathogen() throws MigrationException {
		ApolloPathogenCodeSetter setter = new ApolloPathogenCodeSetter(edu.pitt.apollo.types.v4_0.ApolloPathogenCode.class,((edu.pitt.apollo.types.v3_1_0.InfectiousDisease)oldTypeInstance).getCausalPathogen());
		setter.set();
		newTypeInstance.setCausalPathogen(setter.getNewTypeInstance());
	}

	@Override
	protected void setHoostSpecies() throws MigrationException {
		newTypeInstance.setHoostSpecies(((edu.pitt.apollo.types.v3_1_0.InfectiousDisease) oldTypeInstance).getSpeciesWithDisease());
	}


}