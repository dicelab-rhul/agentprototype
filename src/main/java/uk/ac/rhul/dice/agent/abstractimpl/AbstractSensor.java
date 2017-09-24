package uk.ac.rhul.dice.agent.abstractimpl;

import uk.ac.rhul.dice.agent.enums.SensorPurposeEnum;
import uk.ac.rhul.dice.agent.interfaces.Sensor;

public class AbstractSensor implements Sensor {
    private final SensorPurposeEnum purpose;
    
    public AbstractSensor(SensorPurposeEnum purpose) {
	this.purpose = purpose;
    }

    @Override
    public SensorPurposeEnum getPurpose() {
	return this.purpose;
    }
}