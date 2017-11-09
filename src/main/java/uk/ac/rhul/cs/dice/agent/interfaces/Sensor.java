package uk.ac.rhul.cs.dice.agent.interfaces;

import java.io.Serializable;

import uk.ac.rhul.cs.dice.agent.enums.SensorPurposeEnum;

public interface Sensor extends Serializable {
    public abstract String getID();
    public abstract SensorPurposeEnum getPurpose();
}