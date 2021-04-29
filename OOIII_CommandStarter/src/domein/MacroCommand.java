package domein;

import java.util.Arrays;

// implement command om de execute functie te kunnen gebruiken
public class MacroCommand implements Command {
    private Command[] commands;
    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }
    @Override
    public void execute() {
        Arrays.stream(commands).forEach(Command::execute);
    }
    /* NOTE:  these commands have to be done backwards to 
     ensure proper undo functionality */


}
