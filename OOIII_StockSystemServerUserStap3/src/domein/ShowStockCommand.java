package domein;

public class ShowStockCommand implements Command {

    private final IStockService stockService;

    public ShowStockCommand(IStockService stockService) {
        this.stockService = stockService;
    }

    @Override
    public String execute() {
        return String.format("DATABASE : stockstatus%s%s%s",
                System.lineSeparator(), stockService.productenView(), System.lineSeparator());
    }
}
