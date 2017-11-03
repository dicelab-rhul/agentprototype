package uk.ac.rhul.cs.dice.agent.abstractimpl;

import java.util.List;

import uk.ac.rhul.cs.dice.agent.interfaces.Actuator;
import uk.ac.rhul.cs.dice.agent.interfaces.Agent;
import uk.ac.rhul.cs.dice.agent.interfaces.AgentAppearance;
import uk.ac.rhul.cs.dice.agent.interfaces.AgentMind;
import uk.ac.rhul.cs.dice.agent.interfaces.Sensor;
import uk.ac.rhul.cs.dice.agentcommon.interfaces.Actor;

public abstract class AbstractAgent extends AbstractActiveBody implements Agent, Actor, Runnable {
    private AgentMind mind;
    private AgentAppearance appearance;
    
    public AbstractAgent(String id, AgentAppearance appearance, List<Sensor> sensors, List<Actuator> actuators, AgentMind mind) {
	super(id, sensors, actuators);
	
	this.appearance = appearance;
	this.mind = mind;
    }

    @Override
    public AgentMind getMind() {
        return this.mind;
    }
    
    @Override
    public AgentAppearance getAppearance() {
        return this.appearance;
    }
}