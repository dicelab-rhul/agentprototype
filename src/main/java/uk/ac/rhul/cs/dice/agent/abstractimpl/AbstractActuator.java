package uk.ac.rhul.cs.dice.agent.abstractimpl;

import java.util.UUID;

import uk.ac.rhul.cs.dice.agent.enums.ActuatorPurposeEnum;
import uk.ac.rhul.cs.dice.agent.interfaces.Actuator;

/**
 * 
 * Abstract implementation of {@link Actuator}. It has an {@link ActuatorPurposeEnum} and a {@link String} ID.
 * 
 * @author cloudstrife9999
 *
 */
public class AbstractActuator implements Actuator {
    private static final long serialVersionUID = 5939622718259323460L;
    private final ActuatorPurposeEnum purpose;
    private String id;
    
    /**
     * 
     * Constructs an {@link AbstractActuator} from an {@link ActuatorPurposeEnum}.It auto-generates a {@link String} ID.
     * 
     * @param id a {@link String} ID.
     * @param purpose an {@link ActuatorPurposeEnum}.
     * 
     */
    public AbstractActuator(ActuatorPurposeEnum purpose) {
	this.purpose = purpose;
	this.id = "Actuator-" + UUID.randomUUID().toString();
    }
    
    /**
     * 
     * Constructs an {@link AbstractActuator} from an {@link ActuatorPurposeEnum} and a {@link String} ID.
     * 
     * @param id a {@link String} ID.
     * @param purpose an {@link ActuatorPurposeEnum}.
     * 
     */
    public AbstractActuator(String id, ActuatorPurposeEnum purpose) {
	this.purpose = purpose;
	this.id = id;
    }

    @Override
    public ActuatorPurposeEnum getPurpose() {
	return this.purpose;
    }
    
    @Override
    public String getID() {
        return this.id;
    }
}