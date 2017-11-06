package uk.ac.rhul.cs.dice.agent.abstractimpl;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

import uk.ac.rhul.cs.dice.agent.exceptions.AvatarCommunicationException;
import uk.ac.rhul.cs.dice.agent.interfaces.PrincipalListener;

public abstract class AbstractPrincipalListener implements PrincipalListener {
    private static final long serialVersionUID = 1407257982440754273L;
    private boolean active;
    private transient ServerSocket server;
    private transient ObjectInputStream listeningChannel;
    
    public AbstractPrincipalListener(ServerSocket server) {
	super();
	
	this.server = server;
    }
    
    @Override
    public boolean isActive() {
	return this.active;
    }
    
    @Override
    public void activate() {
	try {
	    Socket withPrincipal = this.server.accept();
	    this.listeningChannel = new ObjectInputStream(withPrincipal.getInputStream());
	    this.active = true;
	}
	catch(IOException e) {
	    throw new AvatarCommunicationException(e);
	}
    }
    
    @Override
    public void deactivate() {
	this.active = false;
    }
    
    @Override
    public Object decide() {
	try {
	    String actionClassName = this.listeningChannel.readUTF();
	    
	    return Class.forName(actionClassName).newInstance();
	}
	catch(ClassNotFoundException | IllegalAccessException | InstantiationException e) {
	    throw new IllegalArgumentException(e);
	}
        catch(IOException e) {
            throw new AvatarCommunicationException(e);
        }
    }
}