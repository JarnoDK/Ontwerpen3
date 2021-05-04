package domein.commands;

import domein.StockService;
import domein.StockServiceController;

public class ShipProductCommand implements Command{
    private StockService service;

    private String productname;
	public ShipProductCommand(String productName,StockService service) {
		this.productname = productName;
		this.service = service;
	}
	@Override
	public String execute() {
		return service.ship(productname);
		
	}

}
