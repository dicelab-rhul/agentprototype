package uk.ac.rhul.cs.dice.agent.interfaces;

import java.util.List;
import java.util.Map;

import uk.ac.rhul.cs.dice.agent.abstractimpl.AbstractActiveBody;
import uk.ac.rhul.cs.dice.agent.enums.ActuatorPurposeEnum;
import uk.ac.rhul.cs.dice.agent.enums.SensorPurposeEnum;
import uk.ac.rhul.cs.dice.agentcommon.interfaces.Action;
import uk.ac.rhul.cs.dice.agentcommon.interfaces.network.SingleNetworkRunnable;

/**
 * 
 * An interface for active bodies. It extends {@link Body} and {@link SingleNetworkRunnable}.<br /><br />
 * 
 * Known implementations: {@link AbstractActiveBody}.
 * 
 * @author cloudstrife9999
 *
 */
public interface ActiveBody extends Body, SingleNetworkRunnable {
    
    /**
     * 
     * Returns this {@link ActiveBody} {@link Sensor}s.
     * 
     * @return a {@link Map} from {@link SensorPurposeEnum} to {@link Sensor}s consisting in this {@link ActiveBody} {@link Sensor}s.
     * 
     */
    public abstract Map<SensorPurposeEnum, List<Sensor>> getSensors();
    
    /**
     * 
     * Returns this {@link ActiveBody} {@link Sensor}s whose {@link SensorPurposeEnum} matches <code>purpose</code> as a {@link List}.
     * 
     * @param purpose the {@link SensorPurposeEnum} to match the {@link Sensor}s against.
     * 
     * @return a {@link List} consisting in this {@link ActiveBody} {@link Sensor}s whose {@link SensorPurposeEnum} matches <code>purpose</code>.
     * 
     */
    public abstract List<Sensor> getSpecificSensors(SensorPurposeEnum purpose);
    
    /**
     * 
     * Returns this {@link ActiveBody} {@link Actuator}s.
     * 
     * @return a {@link Map} from {@link ActuatorPurposeEnum} to {@link Actuator}s consisting in this {@link ActiveBody} {@link Actuator}s.
     * 
     */
    public abstract Map<ActuatorPurposeEnum, List<Actuator>> getActuators();
    
    /**
     * 
     * Returns this {@link ActiveBody} {@link Actuator}s whose {@link ActuatorPurposeEnum} matches <code>purpose</code> as a {@link List}.
     * 
     * @param purpose the {@link ActuatorPurposeEnum} to match the {@link Actuator}s against.
     * 
     * @return a {@link List} consisting in this {@link ActiveBody} {@link Actuator}s whose {@link ActuatorPurposeEnum} matches <code>purpose</code>.
     * 
     */
    public abstract List<Actuator> getSpecificActuators(ActuatorPurposeEnum purpose);
    
    /**
     * 
     * Returns this {@link ActiveBody} {@link Sensor}s as a {@link List}.
     * 
     * @return this {@link ActiveBody} {@link Sensor}s as a {@link List}.
     * 
     */
    public abstract List<Sensor> getAllSensors();
    
    /**
     * 
     * Returns this {@link ActiveBody} {@link Actuator}s as a {@link List}.
     * 
     * @return this {@link ActiveBody} {@link Actuator}s as a {@link List}.
     * 
     */
    public abstract List<Actuator> getAllActuators();
    
    /**
     * 
     * Sends <code>action</code> to an appropriate {@link Actuator}.
     * 
     * @param action
     */
    public abstract void sendToActuator(Action<?> action);
}