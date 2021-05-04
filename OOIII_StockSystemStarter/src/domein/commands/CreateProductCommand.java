package domein.commands;

import domein.StockService;
import domein.StockServiceController;

public class CreateProductCommand implements Command {
    private StockService service;
    
    private String name;
    private int amount;
    
	public CreateProductCommand(String name, int amount,StockService service) {
		this.name = name;
		this.amount = amount;
		this.service = service;
	}
	@Override
	public String execute() {
		return service.insert(name, amount);
		
	}

}
