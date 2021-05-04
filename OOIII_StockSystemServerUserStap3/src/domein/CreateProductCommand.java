package domein;

public class CreateProductCommand implements Command {
	private final IStockService stockService;
	private final String productName;
	private final int quantity;

	public CreateProductCommand(String productName, int quantity, IStockService stockService) {
		this.productName = productName;
		this.quantity = quantity;
		this.stockService = stockService;
	}

	@Override
	public String execute() {
		return stockService.insert(productName, quantity);
	}

}
