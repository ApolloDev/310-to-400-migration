package edu.pitt.apollo.apolloversionmigration.output;

import edu.pitt.apollo.types.v4_0.Duration;
import edu.pitt.apollo.types.v4_0.Interval;

public class IntervalSetter extends AbstractSetter<Interval,edu.pitt.apollo.types.v3_1_0.Interval> {

	public IntervalSetter(Class<Interval> newTypeClass, edu.pitt.apollo.types.v3_1_0.Interval oldTypeInstance) throws MigrationException {
		super(newTypeClass, oldTypeInstance);

	}


	private void setStartBoundaryDefinition() throws MigrationException {
		Interval startBoundaryInterval = new Interval();
		startBoundaryInterval.setStartBoundaryDefinition(null);
		startBoundaryInterval.setEndBoundaryDefinition(null);
		startBoundaryInterval.setDuration(new Duration());
		newTypeInstance.setStartBoundaryDefinition(startBoundaryInterval);

//		IntervalSetter setter = new IntervalSetter(edu.pitt.apollo.types.v4_0.Interval.class,oldTypeInstance.getStartBoundaryDefinition());
//		setter.set();
//		newTypeInstance.setStartBoundaryDefinition(setter.getNewTypeInstance());
	}

	private void setEndBoundaryDefinition() throws MigrationException {
		newTypeInstance.setEndBoundaryDefinition(edu.pitt.apollo.types.v4_0.IntervalBoundaryDefinitionEnum.fromValue(oldTypeInstance.getEndBoundaryDefinition().toString()));
	}

	private void setDuration() throws MigrationException {
		DurationSetter setter = DurationSetterFactory.getSetter(oldTypeInstance.getDuration());
		setter.set();
		newTypeInstance.setDuration(setter.getNewTypeInstance());
	}

	private void setReadableTitle() throws MigrationException {
		newTypeInstance.setReadableTitle(oldTypeInstance.getReadableTitle());
	}

	private void setReferenceId() throws MigrationException {
		newTypeInstance.setReferenceId(oldTypeInstance.getReferenceId());
	}

	@Override
	public void set() throws MigrationException {
		setStartBoundaryDefinition();
		setEndBoundaryDefinition();
		setDuration();
		setReadableTitle();
		setReferenceId();
	}

}