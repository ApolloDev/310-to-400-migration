package edu.pitt.apollo.apolloversionmigration.output;

public class ReferenceSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.Reference,edu.pitt.apollo.types.v3_1_0.Reference> {

	public ReferenceSetter(Class<edu.pitt.apollo.types.v4_0.Reference> newTypeClass, edu.pitt.apollo.types.v3_1_0.Reference oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setId() throws MigrationException {
		newTypeInstance.setId(oldTypeInstance.getId());
	}

	private void setTitle() throws MigrationException {
		newTypeInstance.setTitle(oldTypeInstance.getTitle());
	}

	private void setAuthors() throws MigrationException {
		newTypeInstance.setAuthors(oldTypeInstance.getAuthors());
	}

	private void setPublication() throws MigrationException {
		newTypeInstance.setPublication(oldTypeInstance.getPublication());
	}

	private void setUrl() throws MigrationException {
		newTypeInstance.setUrl(oldTypeInstance.getUrl());
	}

	private void setPubMedId() throws MigrationException {
		newTypeInstance.setPubMedId(oldTypeInstance.getPubMedId());
	}

	private void setOrcId() throws MigrationException {
		newTypeInstance.setOrcId(oldTypeInstance.getOrcId());
	}

	private void setObcIdeId() throws MigrationException {
		newTypeInstance.setObcIdeId(oldTypeInstance.getObcIdeId());
	}

	@Override
	public void set() throws MigrationException {
		setId();
		setTitle();
		setAuthors();
		setPublication();
		setUrl();
		setPubMedId();
		setOrcId();
		setObcIdeId();
	}

}