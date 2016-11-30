package edu.pitt.apollo.apolloversionmigration.output;

public class ApolloPathogenCodeSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.ApolloPathogenCode,edu.pitt.apollo.types.v3_1_0.ApolloPathogenCode> {

	public ApolloPathogenCodeSetter(Class<edu.pitt.apollo.types.v4_0.ApolloPathogenCode> newTypeClass, edu.pitt.apollo.types.v3_1_0.ApolloPathogenCode oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setNcbiTaxonId() throws MigrationException {
		newTypeInstance.setNcbiTaxonId(oldTypeInstance.getNcbiTaxonId());
	}

	private void setCladeName() throws MigrationException {
		newTypeInstance.setCladeName(oldTypeInstance.getCladeName());
	}

	@Override
	public void set() throws MigrationException {
		setNcbiTaxonId();
		setCladeName();
	}

}