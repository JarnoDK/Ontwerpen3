package domein;

// command interface voor execute en undo 
public interface Command {

	void execute();

	void undo();
}
