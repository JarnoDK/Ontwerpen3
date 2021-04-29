package domein;

import java.rmi.Remote;
import java.rmi.RemoteException;

// extends remote van java.rmi
public interface GumballMachineRemote extends Remote 
{
	int getCount() throws RemoteException;

	String getLocation() throws RemoteException;

	String getState() throws RemoteException;

}
