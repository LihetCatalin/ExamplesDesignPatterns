package CarApp;
import Commands.Command;

public class CarApp {
    private Command command;

    public void setCommand(Command command) {
        this.command=command;
    }

    public void executeCommand() {
        command.execute();
    }
}
