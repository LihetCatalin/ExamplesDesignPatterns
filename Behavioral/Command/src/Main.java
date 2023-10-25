import Commands.AccelerateCommand;
import Commands.BrakeCommand;
import Commands.Command;
import Commands.StartCommand;
import CarApp.CarApp;

public class Main {
    public static void main(String[] args) {

        //System.out.println("Hello world!");
        CarApp c = new CarApp();  //asta ar fi invokerul
        //nu prea inteleg partea cu receiver, nu m-o lamurit exemplul de pe site

        Command command = new StartCommand();
        c.setCommand(command);
        c.executeCommand();

        command = new AccelerateCommand();
        c.setCommand(command);
        c.executeCommand();

        command = new BrakeCommand();
        c.setCommand(command);
        c.executeCommand();
    }
}