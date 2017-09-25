package uk.ac.rhul.dice.agent.interfaces;

import uk.ac.rhul.dice.agent.enums.SensorPurposeEnum;

@FunctionalInterface
public interface Sensor {
    public abstract SensorPurposeEnum getPurpose();
}