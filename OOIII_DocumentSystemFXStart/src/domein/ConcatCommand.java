package domein;

public class ConcatCommand implements Command {

	private Document document;
	private String tekst;
	
	// execute om actie toe te voegen
	public void execute() {
		document.concat(tekst);
	}

	public ConcatCommand(Document doc, String tekst) {
		this.document = doc;
		this.tekst = tekst;
	}
	
	// actie ongedaan maken
	public void undo() {
		document.removeAtEnd(tekst);
	}
}
