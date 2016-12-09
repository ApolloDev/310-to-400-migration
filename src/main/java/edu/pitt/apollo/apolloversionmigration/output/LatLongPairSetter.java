package edu.pitt.apollo.apolloversionmigration.output;

public class LatLongPairSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0_1.LatLongPair> {

	public LatLongPairSetter(Class<edu.pitt.apollo.types.v4_0_1.LatLongPair> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setLatitutde() throws MigrationException {
		newTypeInstance.setLatitutde(((edu.pitt.apollo.types.v3_1_0.LatLongPair) oldTypeInstance).getLatitutde());
	}

	protected void setLongitude() throws MigrationException {
		newTypeInstance.setLongitude(((edu.pitt.apollo.types.v3_1_0.LatLongPair) oldTypeInstance).getLongitude());
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			setLatitutde();
			setLongitude();
		}
	}

}