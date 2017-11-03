package uk.ac.rhul.cs.dice.agent.abstractimpl;

import java.io.IOException;
import java.io.ObjectInputStream;

import uk.ac.rhul.cs.dice.agent.exceptions.AvatarCommunicationException;
import uk.ac.rhul.cs.dice.agent.interfaces.Action;
import uk.ac.rhul.cs.dice.agent.interfaces.PrincipalListener;

public abstract class AbstractPrincipalListener implements PrincipalListener {
    private boolean active;
    private ObjectInputStream listeningChannel;
    
    public AbstractPrincipalListener(ObjectInputStream listeningChannel) {
	super();
	
	this.listeningChannel = listeningChannel;
    }
    
    @Override
    public boolean isActive() {
	return this.active;
    }
    
    @Override
    public void activate() {
	this.active = true;
    }
    
    @Override
    public void deactivate() {
	this.active = false;
    }
    
    @Override
    public Action decide() {
	try {
	    String actionClassName = this.listeningChannel.readUTF();
	    
	    return (Action) Class.forName(actionClassName).newInstance();
	}
	catch(ClassNotFoundException | IllegalAccessException | InstantiationException e) {
	    throw new IllegalArgumentException(e);
	}
        catch(IOException e) {
            throw new AvatarCommunicationException(e);
        }
    }
}