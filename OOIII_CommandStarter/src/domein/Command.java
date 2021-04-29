package domein;

// execute geeft mogelijkheid om voor verschillende commands dezelfde methode te gebruiken 
// Command cmd = new xxx() (command)
// cmd.execute() 
// undo kan worden toegevoegd dat het tegenovergestelde van execute doet 
public interface Command {

    void execute();

}
