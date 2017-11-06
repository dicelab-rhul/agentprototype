package uk.ac.rhul.cs.dice.agent.abstractimpl;

import uk.ac.rhul.cs.dice.agent.enums.ActuatorPurposeEnum;
import uk.ac.rhul.cs.dice.agent.interfaces.Actuator;

public class AbstractActuator implements Actuator {
    private static final long serialVersionUID = 5939622718259323460L;
    private final ActuatorPurposeEnum purpose;
    
    public AbstractActuator(ActuatorPurposeEnum purpose) {
	this.purpose = purpose;
    }

    @Override
    public ActuatorPurposeEnum getPurpose() {
	return this.purpose;
    }
}