package edu.pitt.apollo.apolloversionmigration.output;

public class LogisticalSystemSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.LogisticalSystem,edu.pitt.apollo.types.v3_1_0.LogisticalSystem> {

	public LogisticalSystemSetter(Class<edu.pitt.apollo.types.v4_0.LogisticalSystem> newTypeClass, edu.pitt.apollo.types.v3_1_0.LogisticalSystem oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setProduct() throws MigrationException {
		newTypeInstance.setProduct(oldTypeInstance.getProduct());
	}

	private void setLogisticalSystemNodes() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.LogisticalSystemNode oldObj : oldTypeInstance.getLogisticalSystemNodes()) {
			LogisticalSystemNodeSetter setter = new LogisticalSystemNodeSetter(edu.pitt.apollo.types.v4_0.LogisticalSystemNode.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.LogisticalSystemNode newObj = setter.getNewTypeInstance();
			newTypeInstance.getLogisticalSystemNodes().add(newObj);
		}

	}

	@Override
	public void set() throws MigrationException {
		setProduct();
		setLogisticalSystemNodes();
	}

}