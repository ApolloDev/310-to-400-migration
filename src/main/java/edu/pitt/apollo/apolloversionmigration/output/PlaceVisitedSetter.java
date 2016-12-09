package edu.pitt.apollo.apolloversionmigration.output;

public class PlaceVisitedSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0_1.PlaceVisited> {

	public PlaceVisitedSetter(Class<edu.pitt.apollo.types.v4_0_1.PlaceVisited> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setPlace() throws MigrationException {
		if (((edu.pitt.apollo.types.v3_1_0.PlaceVisited) oldTypeInstance).getPlace() != null) {
			newTypeInstance.setPlace(edu.pitt.apollo.types.v4_0_1.PlaceEnum.valueOf(((edu.pitt.apollo.types.v3_1_0.PlaceVisited) oldTypeInstance).getPlace().toString()));
		}
	}

	protected void setNamedMultiGeometry() throws MigrationException {
		NamedMultiGeometrySetter setter = new NamedMultiGeometrySetter(edu.pitt.apollo.types.v4_0_1.NamedMultiGeometry.class,((edu.pitt.apollo.types.v3_1_0.PlaceVisited) oldTypeInstance).getNamedMultiGeometry());
		setter.set();
		newTypeInstance.setNamedMultiGeometry(setter.getNewTypeInstance());
	}

	protected void setFrequencyOfVisits() throws MigrationException {
		RateSetter setter = new RateSetter(edu.pitt.apollo.types.v4_0_1.Rate.class,((edu.pitt.apollo.types.v3_1_0.PlaceVisited) oldTypeInstance).getFrequencyOfVisits());
		setter.set();
		newTypeInstance.setFrequencyOfVisits(setter.getNewTypeInstance());
	}

	protected void setDatesOfVisits() throws MigrationException {
		for (javax.xml.datatype.XMLGregorianCalendar oldObj : ((edu.pitt.apollo.types.v3_1_0.PlaceVisited) oldTypeInstance).getDatesOfVisits()) {
			newTypeInstance.getDatesOfVisits().add(oldObj);
		}

	}

	protected void setRealDateSpansOfVisits() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.RealDateSpanCategoryDefinition oldObj : ((edu.pitt.apollo.types.v3_1_0.PlaceVisited) oldTypeInstance).getRealDateSpansOfVisits()) {
			RealDateSpanCategoryDefinitionSetter setter = new RealDateSpanCategoryDefinitionSetter(edu.pitt.apollo.types.v4_0_1.RealDateSpanCategoryDefinition.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0_1.RealDateSpanCategoryDefinition newObj = setter.getNewTypeInstance();
			newTypeInstance.getRealDateSpansOfVisits().add(newObj);
		}

	}

	protected void setRealTimeSpansOfVisits() throws MigrationException {
		for (edu.pitt.apollo.types.v3_1_0.RealTimeSpanCategoryDefinition oldObj : ((edu.pitt.apollo.types.v3_1_0.PlaceVisited) oldTypeInstance).getRealTimeSpansOfVisits()) {
			RealTimeSpanCategoryDefinitionSetter setter = new RealTimeSpanCategoryDefinitionSetter(edu.pitt.apollo.types.v4_0_1.RealTimeSpanCategoryDefinition.class,oldObj);
			setter.set();
			edu.pitt.apollo.types.v4_0_1.RealTimeSpanCategoryDefinition newObj = setter.getNewTypeInstance();
			newTypeInstance.getRealTimeSpansOfVisits().add(newObj);
		}

	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			setPlace();
			setNamedMultiGeometry();
			setFrequencyOfVisits();
			setDatesOfVisits();
			setRealDateSpansOfVisits();
			setRealTimeSpansOfVisits();
		}
	}

}