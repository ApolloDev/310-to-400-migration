package edu.pitt.apollo.apolloversionmigration.output;

public class InfectionSourceSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0_1.InfectionSource> {

	public InfectionSourceSetter(Class<edu.pitt.apollo.types.v4_0_1.InfectionSource> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setInfectionSourceCode() throws MigrationException {
		newTypeInstance.setInfectionSourceCode(((edu.pitt.apollo.types.v3_1_0.InfectionSource) oldTypeInstance).getInfectionSourceCode());
	}

	protected void setInfectionSourceAdditionalDescription() throws MigrationException {
		for (java.lang.String oldObj : ((edu.pitt.apollo.types.v3_1_0.InfectionSource) oldTypeInstance).getInfectionSourceAdditionalDescription()) {
			newTypeInstance.getInfectionSourceAdditionalDescription().add(oldObj);
		}

	}

	protected void setInfectionSourceDate() throws MigrationException {
		for (javax.xml.datatype.XMLGregorianCalendar oldObj : ((edu.pitt.apollo.types.v3_1_0.InfectionSource) oldTypeInstance).getInfectionSourceDate()) {
			newTypeInstance.getInfectionSourceDate().add(oldObj);
		}

	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			setInfectionSourceCode();
			setInfectionSourceAdditionalDescription();
			setInfectionSourceDate();
		}
	}

}