package uk.ac.rhul.cs.dice.agent.abstractimpl;

import java.util.UUID;

import uk.ac.rhul.cs.dice.agent.enums.SensorPurposeEnum;
import uk.ac.rhul.cs.dice.agent.interfaces.Sensor;

public class AbstractSensor implements Sensor {
    private static final long serialVersionUID = -1892548294873707892L;
    private final SensorPurposeEnum purpose;
    private String id;
    
    public AbstractSensor(SensorPurposeEnum purpose) {
	this.id = "Sensor-" + UUID.randomUUID().toString();
	this.purpose = purpose;
    }
    
    public AbstractSensor(String id, SensorPurposeEnum purpose) {
	this.id = id;
	this.purpose = purpose;
    }

    @Override
    public SensorPurposeEnum getPurpose() {
	return this.purpose;
    }
    
    @Override
    public String getID() {
        return this.id;
    }
}