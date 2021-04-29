package domein;

//SIMPLE FACTORY
public class ApplicationFactory {
    
	/**
	 * return een "Application" op basis van het type dat je weergeeft. 
	 * Deze wordt naar kleine letter omgezet om hoofdletter gevoeligheid te voorkomen
	 * @param type
	 * @return
	 */
    public static Application createApplication(String type) {
        return switch (type.toLowerCase()) {
        //Uncomment
           case "drawing" ->
                new DrawingApplication();
            case "statistics" ->
                new StatisticsApplication();
            default ->
                null;
        };
    }
}
