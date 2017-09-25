package uk.ac.rhul.dice.agent.interfaces;

import uk.ac.rhul.dice.agent.enums.ActuatorPurposeEnum;

@FunctionalInterface
public interface Actuator {
    public abstract ActuatorPurposeEnum getPurpose();
}