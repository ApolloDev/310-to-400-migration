package edu.pitt.apollo.apolloversionmigration.output;

public class ApolloPathogenCodeSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.ApolloPathogenCode> {

	public ApolloPathogenCodeSetter(Class<edu.pitt.apollo.types.v4_0.ApolloPathogenCode> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setNcbiTaxonId() throws MigrationException {
		newTypeInstance.setNcbiTaxonId(((edu.pitt.apollo.types.v3_1_0.ApolloPathogenCode) oldTypeInstance).getNcbiTaxonId());
	}

	protected void setCladeName() throws MigrationException {
		newTypeInstance.setCladeName(((edu.pitt.apollo.types.v3_1_0.ApolloPathogenCode) oldTypeInstance).getCladeName());
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			setNcbiTaxonId();
			setCladeName();
		}
	}

}