package domein;

public class StockService implements IStockService {

	private Stock stock = new Stock();

	@Override
	public String insert(String productName, int quantity) {
		stock.insert(productName, quantity);
		System.out.println(String.format("DATABASE : product in stock created%s" + // simulate inserting in the database
				"LOG: stock created for product %s and quantity %d%s", // simulate logging
				System.lineSeparator(), productName, quantity, System.lineSeparator()));
		return String.format("DATABASE : product in stock created%s" + // simulate inserting in the database
				"LOG: stock created for product %s and quantity %d%s", // simulate logging
				System.lineSeparator(), productName, quantity, System.lineSeparator());
	}

	@Override
	public String update(String productName, int quantity) {
		int oldQuantity = stock.getQuantity(productName);
		stock.update(productName, quantity);

		return String.format("DATABASE: Updated quantity for product %s%s" + // simulate updating a database
				"LOG: Updated stock quantity from %d to %d%s", // simulate logging
				productName, System.lineSeparator(), oldQuantity, quantity, System.lineSeparator());
	}

	@Override
	public String ship(String productName) {
		stock.ship(productName);
		return String.format("DATABASE : Product %s is now shipped%s" + // simulate inserting in the database
				"LOG: Product %s has been shipped%s", // simulate logging
				productName, System.lineSeparator(), productName, System.lineSeparator());
	}

	@Override
	public String productenView() {
		return stock.productenView();
	}
}
