package stocksystem3;

import domein.IRemoteStockService;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class StockSystem {

    private IRemoteStockService stockService;
    private String username;
    private Scanner choose = new Scanner(System.in);

    public static void main(String[] args) {
        new StockSystem().run();
    }

    private void run() {
        stockService = getRemoteService();
        System.out.println("RemoteStockSystem client running ...");
     //------------------   
        System.out.println("Username :");
        username = choose.nextLine();
     //------------------   
        String action = askAction();
        String mes;
        while (!action.equalsIgnoreCase("end")) {
            try {
            	//------------------
            	mes = stockService.performActions((username + " " + action).split(" "));
            	//------------------
                System.out.println("nieuwe actie " + action);
                System.out.print(mes);
                action = askAction();
            } catch (RemoteException ex) {
                ex.printStackTrace();
            }
        }
        choose.close();
    }
    
    private IRemoteStockService getRemoteService() {
        try {
            Registry registry = LocateRegistry.getRegistry("127.0.0.1", 1099);
            return (IRemoteStockService) registry.lookup("stockservice");
        } catch (RemoteException | NotBoundException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    private String askAction() {
      //------------------
        System.out.println("User : << "+ username + ">>");
      //------------------
        System.out.println("-------------Usage: LoggingDemo CommandName Arguments. Enter end to quit------------");
        System.out.println("Commands:");
        System.out.println("   createProduct productname quantity");
        System.out.println("   updateQuantity productname quantity");
        System.out.println("   shipProduct productname");
        System.out.println("   showStock");       
        System.out.println("Enter command :");
        return choose.nextLine();
    }

}
