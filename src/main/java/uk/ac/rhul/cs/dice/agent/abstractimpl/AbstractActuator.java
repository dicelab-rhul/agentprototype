package uk.ac.rhul.cs.dice.agent.abstractimpl;

import java.util.UUID;

import uk.ac.rhul.cs.dice.agent.enums.ActuatorPurposeEnum;
import uk.ac.rhul.cs.dice.agent.interfaces.Actuator;

public class AbstractActuator implements Actuator {
    private static final long serialVersionUID = 5939622718259323460L;
    private final ActuatorPurposeEnum purpose;
    private String id;
    
    public AbstractActuator(ActuatorPurposeEnum purpose) {
	this.purpose = purpose;
	this.id = "Actuator-" + UUID.randomUUID().toString();
    }
    
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