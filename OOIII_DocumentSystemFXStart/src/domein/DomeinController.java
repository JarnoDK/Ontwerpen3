package domein;

import java.util.ArrayDeque;
import java.util.Deque;

public class DomeinController {
	private Document document = new Document();

	private CommandFactory commandFactory;
	// wachtrij met uitgevoerde commandos om undo toe te passen
	private Deque<Command> commands;

	// initialisatie variabelen 
	public DomeinController() {
		document = new Document();
		commandFactory = new CommandFactory(document);
		commands = new ArrayDeque<Command>();
	}

	// document lezen
	public String readDocument() {
		return document.readDocument();
	}

	// uitvoeren actie
	public void execute(String tekst, String actie) {
		if (actie.equalsIgnoreCase("Undo")) {
			undo();
		} else {
			Command command = commandFactory.createCommand(tekst, actie);
//			commandFactory.createCommand(tekst, actie).execute();
			commands.push(command);
			command.execute();
		}
	}

	// controleert of er nog een actie aanwezig is
	// indien ja, verwijderd laatste actie
	private void undo() {
		// TODO Auto-generated method stub
		if (!commands.isEmpty())
			commands.pop().undo();
	}
}
