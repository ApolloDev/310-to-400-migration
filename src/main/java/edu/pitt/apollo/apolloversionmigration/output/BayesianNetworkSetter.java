package edu.pitt.apollo.apolloversionmigration.output;

public class BayesianNetworkSetter extends ProbabilityDistributionSetter<edu.pitt.apollo.types.v4_0.BayesianNetwork,edu.pitt.apollo.types.v3_1_0.BayesianNetwork> {

	public BayesianNetworkSetter(Class<edu.pitt.apollo.types.v4_0.BayesianNetwork> newTypeClass, edu.pitt.apollo.types.v3_1_0.BayesianNetwork oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setNetworkStructure() throws MigrationException {
		BayesianNetworkStructureTypeSetter setter = new BayesianNetworkStructureTypeSetter(edu.pitt.apollo.types.v4_0.BayesianNetworkStructureType.class,oldTypeInstance.getNetworkStructure());
		setter.set();
		newTypeInstance.setNetworkStructure(setter.getNewTypeInstance());
	}

	private void setCpTs() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.ConditionalProbabilityTable oldObj : oldTypeInstance.getCPTs()) {
			ConditionalProbabilityTableSetter setter = new ConditionalProbabilityTableSetter(edu.pitt.apollo.types.v4_0.ConditionalProbabilityTable.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.ConditionalProbabilityTable newObj = setter.getNewTypeInstance();
			newTypeInstance.getCPTs().add(newObj);
		}

	}

	private void setPpFs() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.PrototypicalProbabilityFunction oldObj : oldTypeInstance.getPPFs()) {
			PrototypicalProbabilityFunctionSetter setter = new PrototypicalProbabilityFunctionSetter(edu.pitt.apollo.types.v4_0.PrototypicalProbabilityFunction.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.PrototypicalProbabilityFunction newObj = setter.getNewTypeInstance();
			newTypeInstance.getPPFs().add(newObj);
		}

	}

	private void setGeNIEXML() throws MigrationException {
		GeNIEXMLTypeSetter setter = new GeNIEXMLTypeSetter(edu.pitt.apollo.types.v4_0.GeNIEXMLType.class,oldTypeInstance.getGeNIEXML());
		setter.set();
		newTypeInstance.setGeNIEXML(setter.getNewTypeInstance());
	}

	@Override
	public void set() throws MigrationException {
		super.set();
		setNetworkStructure();
		setCpTs();
		setPpFs();
		setGeNIEXML();
	}

}