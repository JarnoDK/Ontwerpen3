package domein.commands;

import domein.StockService;
import domein.StockServiceController;

public class UpdateQuantityCommand implements Command{
    private StockService service;
    private String name;
    private int quantity;
	public UpdateQuantityCommand(String name, int quantity,StockService service) {
		this.quantity = quantity;
		this.name = name;
		this.service = service;
	}
	@Override
	public String execute() {
		return service.update(name, quantity);
		
	}

}
