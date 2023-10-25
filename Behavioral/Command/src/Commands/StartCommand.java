package Commands;
public class StartCommand implements Command {
    @Override
    public void execute() {
        System.out.println("I am starting this car!");
    }
}
