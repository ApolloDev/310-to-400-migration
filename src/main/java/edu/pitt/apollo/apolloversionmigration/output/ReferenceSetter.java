package edu.pitt.apollo.apolloversionmigration.output;

public class ReferenceSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0_1.Reference> {

	public ReferenceSetter(Class<edu.pitt.apollo.types.v4_0_1.Reference> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setId() throws MigrationException {
		newTypeInstance.setId(((edu.pitt.apollo.types.v3_1_0.Reference) oldTypeInstance).getId());
	}

	protected void setTitle() throws MigrationException {
		newTypeInstance.setTitle(((edu.pitt.apollo.types.v3_1_0.Reference) oldTypeInstance).getTitle());
	}

	protected void setAuthors() throws MigrationException {
		newTypeInstance.setAuthors(((edu.pitt.apollo.types.v3_1_0.Reference) oldTypeInstance).getAuthors());
	}

	protected void setPublication() throws MigrationException {
		newTypeInstance.setPublication(((edu.pitt.apollo.types.v3_1_0.Reference) oldTypeInstance).getPublication());
	}

	protected void setUrl() throws MigrationException {
		newTypeInstance.setUrl(((edu.pitt.apollo.types.v3_1_0.Reference) oldTypeInstance).getUrl());
	}

	protected void setPubMedId() throws MigrationException {
		newTypeInstance.setPubMedId(((edu.pitt.apollo.types.v3_1_0.Reference) oldTypeInstance).getPubMedId());
	}

	protected void setOrcId() throws MigrationException {
		newTypeInstance.setOrcId(((edu.pitt.apollo.types.v3_1_0.Reference) oldTypeInstance).getOrcId());
	}

	protected void setObcIdeId() throws MigrationException {
		newTypeInstance.setObcIdeId(((edu.pitt.apollo.types.v3_1_0.Reference) oldTypeInstance).getObcIdeId());
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
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

}