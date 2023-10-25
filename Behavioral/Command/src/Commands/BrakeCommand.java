package Commands;
public class BrakeCommand implements Command {
    @Override
    public void execute() {
        System.out.println("I am braking!");
    }
}
