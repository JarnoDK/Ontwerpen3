package domein;

public class DeleteCommand implements Command {

	private Document document;
	private String tekst;

	private int eersteVoorkomen;

	// actie toevoegen
	public void execute() {
		eersteVoorkomen = document.getFirstIndexOf(tekst);
		document.erase(tekst);
	}

	public DeleteCommand(Document doc, String tekst) {
		document = doc;
		this.tekst = tekst;
	}
	// actie ongedaan maken
	public void undo() {
		if (eersteVoorkomen >= 0)
			document.insert(tekst, eersteVoorkomen);
	}
}
