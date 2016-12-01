package edu.pitt.apollo.apolloversionmigration.output;

public class BayesianNetworkSetter extends ProbabilityDistributionSetter<edu.pitt.apollo.types.v4_0.BayesianNetwork> {

	public BayesianNetworkSetter(Class<edu.pitt.apollo.types.v4_0.BayesianNetwork> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setNetworkStructure() throws MigrationException {
		BayesianNetworkStructureTypeSetter setter = new BayesianNetworkStructureTypeSetter(edu.pitt.apollo.types.v4_0.BayesianNetworkStructureType.class,((edu.pitt.apollo.types.v3_1_0.BayesianNetwork) oldTypeInstance).getNetworkStructure());
		setter.set();
		newTypeInstance.setNetworkStructure(setter.getNewTypeInstance());
	}

	protected void setCpTs() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.ConditionalProbabilityTable oldObj : ((edu.pitt.apollo.types.v3_1_0.BayesianNetwork) oldTypeInstance).getCPTs()) {
			ConditionalProbabilityTableSetter setter = new ConditionalProbabilityTableSetter(edu.pitt.apollo.types.v4_0.ConditionalProbabilityTable.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.ConditionalProbabilityTable newObj = setter.getNewTypeInstance();
			newTypeInstance.getCPTs().add(newObj);
		}

	}

	protected void setPpFs() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.PrototypicalProbabilityFunction oldObj : ((edu.pitt.apollo.types.v3_1_0.BayesianNetwork) oldTypeInstance).getPPFs()) {
			PrototypicalProbabilityFunctionSetter setter = new PrototypicalProbabilityFunctionSetter(edu.pitt.apollo.types.v4_0.PrototypicalProbabilityFunction.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.PrototypicalProbabilityFunction newObj = setter.getNewTypeInstance();
			newTypeInstance.getPPFs().add(newObj);
		}

	}

	protected void setGeNIEXML() throws MigrationException {
		GeNIEXMLTypeSetter setter = new GeNIEXMLTypeSetter(edu.pitt.apollo.types.v4_0.GeNIEXMLType.class,((edu.pitt.apollo.types.v3_1_0.BayesianNetwork) oldTypeInstance).getGeNIEXML());
		setter.set();
		newTypeInstance.setGeNIEXML(setter.getNewTypeInstance());
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			super.set();
			setNetworkStructure();
			setCpTs();
			setPpFs();
			setGeNIEXML();
		}
	}

}