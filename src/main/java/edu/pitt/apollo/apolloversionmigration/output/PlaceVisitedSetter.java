package edu.pitt.apollo.apolloversionmigration.output;

public class PlaceVisitedSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0.PlaceVisited,edu.pitt.apollo.types.v3_1_0.PlaceVisited> {

	public PlaceVisitedSetter(Class<edu.pitt.apollo.types.v4_0.PlaceVisited> newTypeClass, edu.pitt.apollo.types.v3_1_0.PlaceVisited oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	private void setPlace() throws MigrationException {
		newTypeInstance.setPlace(edu.pitt.apollo.types.v4_0.PlaceEnum.fromValue(oldTypeInstance.getPlace().toString()));
	}

	private void setNamedMultiGeometry() throws MigrationException {
		NamedMultiGeometrySetter setter = new NamedMultiGeometrySetter(edu.pitt.apollo.types.v4_0.NamedMultiGeometry.class,oldTypeInstance.getNamedMultiGeometry());
		setter.set();
		newTypeInstance.setNamedMultiGeometry(setter.getNewTypeInstance());
	}

	private void setFrequencyOfVisits() throws MigrationException {
		RateSetter setter = new RateSetter(edu.pitt.apollo.types.v4_0.Rate.class,oldTypeInstance.getFrequencyOfVisits());
		setter.set();
		newTypeInstance.setFrequencyOfVisits(setter.getNewTypeInstance());
	}

	private void setDatesOfVisits() throws MigrationException {
		for (javax.xml.datatype.XMLGregorianCalendar oldObj : oldTypeInstance.getDatesOfVisits()) {
			newTypeInstance.getDatesOfVisits().add(oldObj);
		}

	}

	private void setRealDateSpansOfVisits() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.RealDateSpanCategoryDefinition oldObj : oldTypeInstance.getRealDateSpansOfVisits()) {
			RealDateSpanCategoryDefinitionSetter setter = new RealDateSpanCategoryDefinitionSetter(edu.pitt.apollo.types.v4_0.RealDateSpanCategoryDefinition.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.RealDateSpanCategoryDefinition newObj = setter.getNewTypeInstance();
			newTypeInstance.getRealDateSpansOfVisits().add(newObj);
		}

	}

	private void setRealTimeSpansOfVisits() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.RealTimeSpanCategoryDefinition oldObj : oldTypeInstance.getRealTimeSpansOfVisits()) {
			RealTimeSpanCategoryDefinitionSetter setter = new RealTimeSpanCategoryDefinitionSetter(edu.pitt.apollo.types.v4_0.RealTimeSpanCategoryDefinition.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0.RealTimeSpanCategoryDefinition newObj = setter.getNewTypeInstance();
			newTypeInstance.getRealTimeSpansOfVisits().add(newObj);
		}

	}

	@Override
	public void set() throws MigrationException {
		setPlace();
		setNamedMultiGeometry();
		setFrequencyOfVisits();
		setDatesOfVisits();
		setRealDateSpansOfVisits();
		setRealTimeSpansOfVisits();
	}

}