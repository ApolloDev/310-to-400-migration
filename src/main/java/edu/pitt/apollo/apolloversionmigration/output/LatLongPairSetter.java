package edu.pitt.apollo.apolloversionmigration.output;

public class LatLongPairSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.LatLongPair,edu.pitt.apollo.types.v3_1_0.LatLongPair> {

	public LatLongPairSetter(Class<edu.pitt.apollo.types.v4_0.LatLongPair> newTypeClass, edu.pitt.apollo.types.v3_1_0.LatLongPair oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setLatitutde() throws MigrationException {
		newTypeInstance.setLatitutde(oldTypeInstance.getLatitutde());
	}

	private void setLongitude() throws MigrationException {
		newTypeInstance.setLongitude(oldTypeInstance.getLongitude());
	}

	@Override
	public void set() throws MigrationException {
		setLatitutde();
		setLongitude();
	}

}