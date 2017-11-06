package uk.ac.rhul.cs.dice.agent.interfaces;

import java.io.Serializable;

import uk.ac.rhul.cs.dice.agent.enums.SensorPurposeEnum;

@FunctionalInterface
public interface Sensor extends Serializable {
    public abstract SensorPurposeEnum getPurpose();
}