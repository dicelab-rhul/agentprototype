package uk.ac.rhul.cs.dice.agent.interfaces;

import java.io.Serializable;

import uk.ac.rhul.cs.dice.agent.abstractimpl.AbstractSensor;
import uk.ac.rhul.cs.dice.agent.enums.SensorPurposeEnum;

/**
 * 
 * An interface for sensors. It extends {@link Serializable}.<br /><br />
 * 
 * Known implementations: {@link AbstractSensor}.
 * 
 * @author cloudstrife9999
 *
 */
public interface Sensor extends Serializable {
    
    /**
     * 
     * Returns the {@link String} ID of this {@link Sensor}.
     * 
     * @return the {@link String} ID of this {@link Sensor}.
     * 
     */
    public abstract String getID();
    
    /**
     * 
     * Returns the {@link SensorPurposeEnum} of this {@link Sensor}.
     * 
     * @return the {@link SensorPurposeEnum} of this {@link Sensor}.
     * 
     */
    public abstract SensorPurposeEnum getPurpose();
}