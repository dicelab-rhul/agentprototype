package uk.ac.rhul.cs.dice.agent.interfaces;

import uk.ac.rhul.cs.dice.agent.enums.ActuatorPurposeEnum;

@FunctionalInterface
public interface Actuator {
    public abstract ActuatorPurposeEnum getPurpose();
}