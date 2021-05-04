package domein;

public class UpdateQuantityCommand implements Command {
	
    private final IStockService stockService;
    private final String productName;
    private final int newQuantity;
    
    public UpdateQuantityCommand(String productName, int quantity, IStockService stockService) {
        this.productName = productName; newQuantity = quantity; this.stockService = stockService;
    }
    
    @Override
    public String execute() {
        return stockService.update(productName, newQuantity);
    }

}
