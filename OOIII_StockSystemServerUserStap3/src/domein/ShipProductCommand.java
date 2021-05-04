package domein;

public class ShipProductCommand implements Command {
	private final IStockService stockService;
	private final String productName;

	public ShipProductCommand(String productName, IStockService stockService) {
		this.productName = productName;
		this.stockService = stockService;
	}

	@Override
	public String execute() {
		return stockService.ship(productName);
	}
}
