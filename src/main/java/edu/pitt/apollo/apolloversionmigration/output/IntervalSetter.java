package edu.pitt.apollo.apolloversionmigration.output;

public class IntervalSetter extends AbstractSetter<edu.pitt.apollo.types.v4_0_1.Interval> {

	public IntervalSetter(Class<edu.pitt.apollo.types.v4_0_1.Interval> newTypeClass, Object oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}

	protected void setStartBoundaryDefinition() throws MigrationException {
		if (((edu.pitt.apollo.types.v3_1_0.Interval) oldTypeInstance).getStartBoundaryDefinition() != null) {
			newTypeInstance.setStartBoundaryDefinition(edu.pitt.apollo.types.v4_0_1.IntervalBoundaryDefinitionEnum.valueOf(((edu.pitt.apollo.types.v3_1_0.Interval) oldTypeInstance).getStartBoundaryDefinition().toString()));
		}
	}

	protected void setEndBoundaryDefinition() throws MigrationException {
		if (((edu.pitt.apollo.types.v3_1_0.Interval) oldTypeInstance).getEndBoundaryDefinition() != null) {
			newTypeInstance.setEndBoundaryDefinition(edu.pitt.apollo.types.v4_0_1.IntervalBoundaryDefinitionEnum.valueOf(((edu.pitt.apollo.types.v3_1_0.Interval) oldTypeInstance).getEndBoundaryDefinition().toString()));
		}
	}

	protected void setDuration() throws MigrationException {
		if (((edu.pitt.apollo.types.v3_1_0.Interval) oldTypeInstance).getDuration() != null) {
			DurationSetter setter = DurationSetterFactory.getSetter(((edu.pitt.apollo.types.v3_1_0.Interval) oldTypeInstance).getDuration());
			setter.set();
			newTypeInstance.setDuration(setter.getNewTypeInstance());
		}

	}

	protected void setReadableTitle() throws MigrationException {
		newTypeInstance.setReadableTitle(((edu.pitt.apollo.types.v3_1_0.Interval) oldTypeInstance).getReadableTitle());
	}

	protected void setReferenceId() throws MigrationException {
		newTypeInstance.setReferenceId(((edu.pitt.apollo.types.v3_1_0.Interval) oldTypeInstance).getReferenceId());
	}

	@Override
	public void set() throws MigrationException {
		if (oldTypeInstance != null) {
			setStartBoundaryDefinition();
			setEndBoundaryDefinition();
			setDuration();
			setReadableTitle();
			setReferenceId();
		}
	}

}