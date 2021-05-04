package domein;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IRemoteStockService extends Remote {

	String performActions(String[] args) throws RemoteException;

}