package uk.ac.rhul.cs.dice.agent.abstractimpl;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import uk.ac.rhul.cs.dice.agent.interfaces.Actuator;
import uk.ac.rhul.cs.dice.agent.interfaces.Agent;
import uk.ac.rhul.cs.dice.agent.interfaces.ActorAppearance;
import uk.ac.rhul.cs.dice.agent.interfaces.AgentMind;
import uk.ac.rhul.cs.dice.agent.interfaces.Analyzable;
import uk.ac.rhul.cs.dice.agent.interfaces.Sensor;
import uk.ac.rhul.cs.dice.agentcommon.interfaces.Actor;

public abstract class AbstractAgent extends AbstractActiveBody implements Agent, Actor {
    private static final long serialVersionUID = 3934619712169517594L;
    private AgentMind mind;
    private ActorAppearance appearance;
    private Set<Analyzable> forMind;
    
    public AbstractAgent() {
	//for serialization
    }
    
    public AbstractAgent(String id, ActorAppearance appearance, List<Sensor> sensors, List<Actuator> actuators, AgentMind mind) {
	super(id, sensors, actuators);
	
	this.appearance = appearance;
	this.mind = mind;
	this.forMind = new HashSet<>();
    }

    @Override
    public AgentMind getMind() {
        return this.mind;
    }
    
    @Override
    public ActorAppearance getAppearance() {
        return this.appearance;
    }
    
    @Override
    public Set<Analyzable> getForMind() {
        return this.forMind;
    }
    
    @Override
    public void setForMind(Set<Analyzable> forMind) {
        this.forMind = forMind;
    }
    
    @Override
    public void appendForMind(Set<Analyzable> forMind) {
        if(getForMind() == null) {
            setForMind(forMind);
        }
        else {
            getForMind().addAll(forMind);
        }
    }
    
    @Override
    public void appendForMind(Analyzable forMind) {
        if(getForMind() == null) {
            setForMind(new HashSet<>(Arrays.asList(forMind)));
        }
        else {
            getForMind().add(forMind);
        }
    }
    
    @Override
    public void sendToMind() {
	getMind().perceive(getForMind());
    }
}