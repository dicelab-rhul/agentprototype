package uk.ac.rhul.dice.agent.abstractimpl;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import uk.ac.rhul.dice.agent.enums.ActuatorPurposeEnum;
import uk.ac.rhul.dice.agent.enums.SensorPurposeEnum;
import uk.ac.rhul.dice.agent.interfaces.ActiveBody;
import uk.ac.rhul.dice.agent.interfaces.Actuator;
import uk.ac.rhul.dice.agent.interfaces.Sensor;

/**
 * This class represents an abstract active body, which is an implementation of an {@link ActiveBody}.
 * It also inherits from {@link AbstractBody}. The main added value is the presence of {@link Sensor}s
 * and {@link Actuator}s.
 * 
 * @author cloudstrife9999
 *
 */
public abstract class AbstractActiveBody extends AbstractBody implements ActiveBody {
    private Map<SensorPurposeEnum, List<Sensor>> sensors;
    private Map<ActuatorPurposeEnum, List<Actuator>> actuators;
    
    public AbstractActiveBody(String id, List<Sensor> sensors, List<Actuator> actuators) {
	super(id);
	
	this.sensors = new EnumMap<>(SensorPurposeEnum.class);
	this.actuators = new EnumMap<>(ActuatorPurposeEnum.class);
	
	initSensors(sensors);
	initActuators(actuators);
    }

    private void initSensors(List<Sensor> sensors) {	
	this.sensors.put(SensorPurposeEnum.SEE, sensors.stream().filter(sensor -> SensorPurposeEnum.SEE.equals(sensor.getPurpose())).collect(Collectors.toList()));
	this.sensors.put(SensorPurposeEnum.LISTEN, sensors.stream().filter(sensor -> SensorPurposeEnum.LISTEN.equals(sensor.getPurpose())).collect(Collectors.toList()));
	this.sensors.put(SensorPurposeEnum.OTHER, sensors.stream().filter(sensor -> SensorPurposeEnum.OTHER.equals(sensor.getPurpose())).collect(Collectors.toList()));
	this.sensors.put(SensorPurposeEnum.UNKNOWN, sensors.stream().filter(sensor -> SensorPurposeEnum.UNKNOWN.equals(sensor.getPurpose())).collect(Collectors.toList()));
    }

    private void initActuators(List<Actuator> actuators) {
	this.actuators.put(ActuatorPurposeEnum.ACT_PHYSICALLY, actuators.stream().filter(actuator -> ActuatorPurposeEnum.ACT_PHYSICALLY.equals(actuator.getPurpose())).collect(Collectors.toList()));
	this.actuators.put(ActuatorPurposeEnum.SPEAK, actuators.stream().filter(actuator -> ActuatorPurposeEnum.SPEAK.equals(actuator.getPurpose())).collect(Collectors.toList()));
	this.actuators.put(ActuatorPurposeEnum.OTHER, actuators.stream().filter(actuator -> ActuatorPurposeEnum.OTHER.equals(actuator.getPurpose())).collect(Collectors.toList()));
	this.actuators.put(ActuatorPurposeEnum.UNKNOWN, actuators.stream().filter(actuator -> ActuatorPurposeEnum.UNKNOWN.equals(actuator.getPurpose())).collect(Collectors.toList()));
    }

    public Map<SensorPurposeEnum, List<Sensor>> getSensors() {
	return this.sensors;
    }

    public List<Sensor> getSpecificSensors(SensorPurposeEnum purpose) {
	return this.sensors.get(purpose);
    }

    public Map<ActuatorPurposeEnum, List<Actuator>> getActuators() {
	return this.actuators;
    }

    public List<Actuator> getSpecificActuators(ActuatorPurposeEnum purpose) {
	return this.actuators.get(purpose);
    }
}