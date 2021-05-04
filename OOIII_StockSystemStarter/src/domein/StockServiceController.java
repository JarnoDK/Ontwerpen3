package domein;

public class StockServiceController {

    private StockService service;
    private CommandFactory factory;
    
    public StockServiceController() {
    	service = new StockService();
    	factory = new CommandFactory(service);
    }
    
    public String performActions(String[] args) {
        return factory.createCommand(args).execute();
    }

//    public String updateQuantity(String productName, int newQuantity) {
//        return service.update(productName, newQuantity);
//    }
//
//    public String createProduct(String productName, int quantity) {
//        return service.insert(productName, quantity);
//    }
//
//    public String shipProduct(String productName) {
//        return service.ship(productName);
//    }
//
//    public String showStock() {
//        return String.format("DATABASE : stockstatus%n%s%n", service.productenView());
//    }
}
