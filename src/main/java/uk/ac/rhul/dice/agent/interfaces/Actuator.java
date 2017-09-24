package uk.ac.rhul.dice.agent.interfaces;

import uk.ac.rhul.dice.agent.enums.ActuatorPurposeEnum;

public interface Actuator {
    public abstract ActuatorPurposeEnum getPurpose();
}