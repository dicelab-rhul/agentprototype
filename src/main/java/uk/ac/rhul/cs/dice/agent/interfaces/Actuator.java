package uk.ac.rhul.cs.dice.agent.interfaces;

import java.io.Serializable;

import uk.ac.rhul.cs.dice.agent.abstractimpl.AbstractActuator;
import uk.ac.rhul.cs.dice.agent.enums.ActuatorPurposeEnum;

/**
 * 
 * An interface of actuators. It extends {@link Serializable}.<br /><br/>
 * 
 * Known implementations: {@link AbstractActuator}.
 * 
 * @author cloudstrife9999
 *
 */
public interface Actuator extends Serializable {
    
    /**
     * 
     * Returns the {@link String} ID of this {@link Actuator}.
     * 
     * @return the {@link String} ID of this {@link Actuator}.
     * 
     */
    public abstract String getID();
    
    /**
     * 
     * Returns the {@link ActuatorPurposeEnum} of this {@link Actuator}.
     * 
     * @return the {@link ActuatorPurposeEnum} of this {@link Actuator}.
     * 
     */
    public abstract ActuatorPurposeEnum getPurpose();
}