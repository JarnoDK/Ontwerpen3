package domein;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class StockServiceController extends UnicastRemoteObject
        implements IRemoteStockService {

    private CommandFactory commandFactory;
    
//-----
    //private StockService service;
    private IStockService service;
    private UserRepository userRep;
//-----
    
    public StockServiceController() throws RemoteException 
    {
    	service = new StockService();
    	commandFactory = new CommandFactory(service);
    //-------
    	userRep = new UserRepository();
    //-------
    }

    @Override
    public String performActions(String[] args) {
        User user = userRep.getUser(args[0]);    
        try {
            if (user == null) {
                return "Undefined user";
            } 
            return commandFactory.createCommand(user.getIsAdmin(), args).execute();
        } catch (AccessDeniedException ex) {
            return "Permission denied for this operation";
        }
    
    }
}
