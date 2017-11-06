package uk.ac.rhul.cs.dice.agent.abstractimpl;

import uk.ac.rhul.cs.dice.agent.enums.SensorPurposeEnum;
import uk.ac.rhul.cs.dice.agent.interfaces.Sensor;

public class AbstractSensor implements Sensor {
    private static final long serialVersionUID = -1892548294873707892L;
    private final SensorPurposeEnum purpose;
    
    public AbstractSensor(SensorPurposeEnum purpose) {
	this.purpose = purpose;
    }

    @Override
    public SensorPurposeEnum getPurpose() {
	return this.purpose;
    }
}