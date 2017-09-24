package uk.ac.rhul.dice.agent.abstractimpl;

import java.util.List;

import uk.ac.rhul.dice.agent.interfaces.Actuator;
import uk.ac.rhul.dice.agent.interfaces.Avatar;
import uk.ac.rhul.dice.agent.interfaces.PrincipalListener;
import uk.ac.rhul.dice.agent.interfaces.Sensor;

public abstract class AbstractAvatar extends AbstractActiveBody implements Avatar {
    private PrincipalListener principalListener;
    
    public AbstractAvatar(String id, List<Sensor> sensors, List<Actuator> actuators, PrincipalListener principalListener) {
	super(id, sensors, actuators);
	
	this.principalListener = principalListener;
    }
    
    @Override
    public PrincipalListener getPrincipalListener() {
        return this.principalListener;
    }
}