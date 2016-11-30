package edu.pitt.apollo.apolloversionmigration.output;

import edu.pitt.apollo.types.v4_0.FiniteBoundaryTypeEnum;

public class BoundSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.Bound,java.math.BigInteger> {

	public BoundSetter(Class<edu.pitt.apollo.types.v4_0.Bound> newTypeClass, java.math.BigInteger oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setFiniteBoundary() throws MigrationException {
		newTypeInstance.setFiniteBoundary(oldTypeInstance.doubleValue());
	}

	private void setFiniteBoundaryType() throws MigrationException {
		newTypeInstance.setFiniteBoundaryType(FiniteBoundaryTypeEnum.INCLUSIVE);
	}

	private void setInfiniteBoundary() throws MigrationException {
		newTypeInstance.setInfiniteBoundary(null);
	}

	@Override
	public void set() throws MigrationException {
		setFiniteBoundary();
		setFiniteBoundaryType();
		setInfiniteBoundary();
	}

}