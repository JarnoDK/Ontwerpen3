package domein;

import java.rmi.*;

// extends remote van java.rmi
public interface GumballMachineRemote extends Remote {

    int getCount() throws RemoteException;

    String getLocation() throws RemoteException;

    String getState() throws RemoteException;
}
