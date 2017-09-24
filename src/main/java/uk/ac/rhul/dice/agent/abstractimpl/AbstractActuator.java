package uk.ac.rhul.dice.agent.abstractimpl;

import uk.ac.rhul.dice.agent.enums.ActuatorPurposeEnum;
import uk.ac.rhul.dice.agent.interfaces.Actuator;

public class AbstractActuator implements Actuator {
    private final ActuatorPurposeEnum purpose;
    
    public AbstractActuator(ActuatorPurposeEnum purpose) {
	this.purpose = purpose;
    }

    @Override
    public ActuatorPurposeEnum getPurpose() {
	return this.purpose;
    }
}