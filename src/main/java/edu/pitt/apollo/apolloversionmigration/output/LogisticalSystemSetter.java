package edu.pitt.apollo.apolloversionmigration.output;

public class LogisticalSystemSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.LogisticalSystem> {

	public LogisticalSystemSetter(Class<edu.pitt.apollo.types.v4_0.LogisticalSystem> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setProduct() throws MigrationException {
		newTypeInstance.setProduct(((edu.pitt.apollo.types.v3_1_0.LogisticalSystem) oldTypeInstance).getProduct());
	}

	protected void setLogisticalSystemNodes() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.LogisticalSystemNode oldObj : ((edu.pitt.apollo.types.v3_1_0.LogisticalSystem) oldTypeInstance).getLogisticalSystemNodes()) {
			LogisticalSystemNodeSetter setter = new LogisticalSystemNodeSetter(edu.pitt.apollo.types.v4_0.LogisticalSystemNode.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.LogisticalSystemNode newObj = setter.getNewTypeInstance();
			newTypeInstance.getLogisticalSystemNodes().add(newObj);
		}

	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			setProduct();
			setLogisticalSystemNodes();
		}
	}

}