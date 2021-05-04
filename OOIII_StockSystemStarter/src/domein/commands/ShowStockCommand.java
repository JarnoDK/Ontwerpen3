package domein.commands;

import domein.StockService;
import domein.StockServiceController;

public class ShowStockCommand implements Command{
    private StockService service;

    public ShowStockCommand(StockService service){
    	this.service = service;
    }
	@Override
	public String execute() {
		// TODO Auto-generated method stub
		return service.productenView();
		
	}

}
