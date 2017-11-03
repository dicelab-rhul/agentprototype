package uk.ac.rhul.cs.dice.agent.interfaces;

import uk.ac.rhul.cs.dice.agent.enums.SensorPurposeEnum;

@FunctionalInterface
public interface Sensor {
    public abstract SensorPurposeEnum getPurpose();
}