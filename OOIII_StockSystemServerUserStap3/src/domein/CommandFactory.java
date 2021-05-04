package domein;

import java.lang.reflect.Proxy;

public class CommandFactory {

    private IStockService stockService;
	
	public CommandFactory(IStockService stockService)
	{
		this.stockService = stockService;
	}
	
	public Command createCommand(boolean isAdmin, String[] arguments) {
		IStockService proxyStockService = getUserStockservice(isAdmin, stockService);
		try {
			return switch (arguments[1].toLowerCase()) {
			case "updatequantity" -> new UpdateQuantityCommand(arguments[2], Integer.parseInt(arguments[3]),
					proxyStockService);
			case "shipproduct" -> new ShipProductCommand(arguments[2], proxyStockService);
			case "createproduct" -> new CreateProductCommand(arguments[2], Integer.parseInt(arguments[3]),
					proxyStockService);
			case "showstock" -> new ShowStockCommand(proxyStockService);
			default -> new NoCommand(arguments[1]);
			};
		} catch (IndexOutOfBoundsException | NumberFormatException e) {
			return new NoCommand(arguments.length > 0 ? String.format("%s called with invalid arguments ", arguments[0])
					: "No command arguments provided");
		}
	}

	private IStockService getUserStockservice(boolean isAdmin, IStockService stockService) {
		if (isAdmin) {
			return stockService;
		}
		return (IStockService) Proxy.newProxyInstance(stockService.getClass().getClassLoader(),
				stockService.getClass().getInterfaces(), new SimpleUserInvocationHandler(stockService));
	}

}
