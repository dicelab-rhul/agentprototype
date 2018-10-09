package uk.ac.rhul.cs.dice.agent.abstractimpl;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

import uk.ac.rhul.cs.dice.agent.exceptions.AvatarCommunicationException;
import uk.ac.rhul.cs.dice.agent.interfaces.Avatar;
import uk.ac.rhul.cs.dice.agent.interfaces.PrincipalListener;

/**
 * 
 * An abstract implementation of {@link PrincipalListener}. It has a {@link Boolean} flag to check whether it's active, a {@link ServerSocket} and an {@link ObjectInputStream}.
 * 
 * @author cloudstrife9999
 *
 */
public abstract class AbstractPrincipalListener implements PrincipalListener {
    private static final long serialVersionUID = 1407257982440754273L;
    private boolean active;
    private transient ServerSocket server;
    private transient ObjectInputStream listeningChannel;
    
    /**
     * 
     * Constructs an {@link AbstractPrincipalListener} with a {@link ServerSocket}.
     * 
     * @param server a {@link ServerSocket}.
     * 
     */
    public AbstractPrincipalListener(ServerSocket server) {
	super();
	
	this.server = server;
    }
    
    @Override
    public boolean isActive() {
	return this.active;
    }
    
    /**
     * 
     * Activates the {@link Avatar} which owns this {@link PrincipalListener} by accepting an incoming connection and initializing the input stream.
     * 
     */
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
    
    /**
     * 
     * Waits for the principal to decide something to execute.
     * 
     * @return The {@link Object} decided by the principal.
     * 
     */
    @Override
    public Object decide() {
	try {
	    String actionClassName = this.listeningChannel.readUTF();
	    
	    return Class.forName(actionClassName).getConstructor().newInstance();
	}
        catch(IOException e) {
            throw new AvatarCommunicationException(e);
        }
	catch(Exception e) {
	    throw new IllegalArgumentException(e);
	}
    }
}