package uk.ac.rhul.cs.dice.agent.interfaces;

import java.io.Serializable;

import uk.ac.rhul.cs.dice.agent.enums.ActuatorPurposeEnum;

public interface Actuator extends Serializable {
    public abstract String getID();
    public abstract ActuatorPurposeEnum getPurpose();
}