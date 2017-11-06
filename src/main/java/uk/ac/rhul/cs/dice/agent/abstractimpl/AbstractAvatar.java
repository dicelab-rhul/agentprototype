package uk.ac.rhul.cs.dice.agent.abstractimpl;

import java.util.List;

import uk.ac.rhul.cs.dice.agent.interfaces.Actuator;
import uk.ac.rhul.cs.dice.agent.interfaces.Avatar;
import uk.ac.rhul.cs.dice.agent.interfaces.AvatarAppearance;
import uk.ac.rhul.cs.dice.agent.interfaces.PrincipalListener;
import uk.ac.rhul.cs.dice.agent.interfaces.Sensor;
import uk.ac.rhul.cs.dice.agentcommon.interfaces.Actor;

public abstract class AbstractAvatar extends AbstractActiveBody implements Avatar, Actor {
    private static final long serialVersionUID = -3209731325209092245L;
    private PrincipalListener principalListener;
    private AvatarAppearance appearance;
    
    public AbstractAvatar(String id, AvatarAppearance appearance, List<Sensor> sensors, List<Actuator> actuators, PrincipalListener principalListener) {
	super(id, sensors, actuators);
	
	this.appearance = appearance;
	this.principalListener = principalListener;
    }
    
    @Override
    public PrincipalListener getPrincipalListener() {
        return this.principalListener;
    }
    
    @Override
    public AvatarAppearance getAppearance() {
        return this.appearance;
    }
}