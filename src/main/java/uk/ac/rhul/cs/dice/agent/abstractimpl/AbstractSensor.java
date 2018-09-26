package uk.ac.rhul.cs.dice.agent.abstractimpl;

import java.util.UUID;

import uk.ac.rhul.cs.dice.agent.enums.SensorPurposeEnum;
import uk.ac.rhul.cs.dice.agent.interfaces.Sensor;

/**
 * 
 * An abstract implementation of {@link Sensor}. It has a {@link SensorPurposeEnum} and a {@link String} ID.
 * 
 * @author cloudstrife9999
 *
 */
public class AbstractSensor implements Sensor {
    private static final long serialVersionUID = -1892548294873707892L;
    private final SensorPurposeEnum purpose;
    private String id;
    
    /**
     * 
     * Constructs an {@link AbstractSensor} from a {@link SensorPurposeEnum}. It auto-generates a {@link String} ID.
     * 
     * @param purpose a {@link SensorPurposeEnum}.
     * 
     */
    public AbstractSensor(SensorPurposeEnum purpose) {
	this.id = "Sensor-" + UUID.randomUUID().toString();
	this.purpose = purpose;
    }
    
    /**
     * 
     * Constructs an {@link AbstractSensor} from a {@link SensorPurposeEnum} and a {@link String} ID.
     * 
     * @param id a {@link String} ID.
     * @param purpose a {@link SensorPurposeEnum}.
     * 
     */
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