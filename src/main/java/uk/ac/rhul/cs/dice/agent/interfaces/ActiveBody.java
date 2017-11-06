package uk.ac.rhul.cs.dice.agent.interfaces;

import java.util.List;
import java.util.Map;

import uk.ac.rhul.cs.dice.agent.enums.ActuatorPurposeEnum;
import uk.ac.rhul.cs.dice.agent.enums.SensorPurposeEnum;
import uk.ac.rhul.cs.dice.agentcommon.interfaces.Action;
import uk.ac.rhul.cs.dice.agentcommon.interfaces.network.SingleNetworkRunnable;

public interface ActiveBody extends Body, SingleNetworkRunnable {
    public abstract Map<SensorPurposeEnum, List<Sensor>> getSensors();
    public abstract List<Sensor> getSpecificSensors(SensorPurposeEnum purpose);
    public abstract Map<ActuatorPurposeEnum, List<Actuator>> getActuators();
    public abstract List<Actuator> getSpecificActuators(ActuatorPurposeEnum purpose);
    public abstract void sendToActuator(Action<?> action);
}