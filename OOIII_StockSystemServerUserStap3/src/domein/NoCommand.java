package domein;

public class NoCommand implements Command {

    private final String name;

    public NoCommand(String name) {
        this.name = name;
    }

    @Override
    public String execute() {
        return String.format("Couldn't find command: %s%s", name, System.lineSeparator());
    }

}
