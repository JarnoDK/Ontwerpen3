package stocksystemServer;

import domein.IRemoteStockService;
import domein.StockServiceController;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class StockSystemServer {

    public static void main(String[] args) {
        new StockSystemServer().run();
    }

    private void run() {
        registerStockService();
    }

    private void registerStockService() {
        try {
            Registry registry = LocateRegistry.createRegistry(1099);
            IRemoteStockService service = new StockServiceController();
            registry.rebind("stockservice", service);
            System.out.println("RemoteStockSystemUser service running ...");
        } catch (RemoteException ex) {
            ex.printStackTrace();
        }
    }
}
