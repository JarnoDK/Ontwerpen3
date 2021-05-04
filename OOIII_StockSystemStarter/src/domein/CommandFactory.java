package domein;

import domein.commands.Command;
import domein.commands.CreateProductCommand;
import domein.commands.NoCommand;
import domein.commands.ShipProductCommand;
import domein.commands.ShowStockCommand;
import domein.commands.UpdateQuantityCommand;

public class CommandFactory {
	private StockService service;
	
	public CommandFactory(StockService service) {
		this.service = service;
	}
	public Command createCommand(String[] args) {
		
		
	        return switch (args[0].toLowerCase().trim()) {
	            case "updatequantity" -> new UpdateQuantityCommand(args[1],Integer.parseInt(args[2]),service);//updateQuantity(args[1], Integer.parseInt(args[2]));
	            case "createproduct"-> new CreateProductCommand(args[1],Integer.parseInt(args[2]),service);//createProduct(args[1], Integer.parseInt(args[2]));
	            case "shipproduct" -> new ShipProductCommand(args[1],service);// shipProduct(args[1]);
	            case "showstock" -> new ShowStockCommand(service);//showStock();
	            default -> new NoCommand("invalid option");
	        
	    };
	}

}
