package frontOffice;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author Daniela Fontes
 * @author Ivo Correia
 * @author Jo�o Penetra
 * @author Jo�o Barbosa
 * @author Ricardo Bernardino
 * 
 * 
 */

public interface FrontOfficeRemoteInterface extends Remote {
	
	abstract void sendMessage(String message) throws RemoteException;
}
