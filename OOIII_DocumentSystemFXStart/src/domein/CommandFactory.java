package domein;

public class CommandFactory {

	
	private Document document;
	
	// creërt een document op basis van tekst en actie 
	// to lowercase om case sensitivity uit te sluiten en trim voor spaties langs beide kanten uit te sluiten
	// retourneert nocommand bij een ongeldige actie
	public Command createCommand(String tekst, String actie) {
		
		return switch (actie.toLowerCase().trim()) {
		case "concat" -> new ConcatCommand(document, tekst);
		case "delete" -> new DeleteCommand(document, tekst);
		default -> new NoCommand();
		};
	}
		
	// maakt de command factory met behulp van een document
	public CommandFactory(Document doc) {
		this.document = doc;
		}
}
