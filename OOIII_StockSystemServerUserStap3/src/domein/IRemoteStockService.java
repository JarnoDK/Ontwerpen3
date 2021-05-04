package domein;

import java.rmi.*;

public interface IRemoteStockService extends Remote {

	String performActions(String[] args) throws RemoteException;

}