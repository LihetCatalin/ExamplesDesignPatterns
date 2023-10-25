import Decorators.DiscordDecorator;
import Decorators.NotifierDecorator;
import Decorators.SMSDecorator;
import Notifiers.BaseNotifier;
import Notifiers.Notifier;

public class Main {
    public static void main(String[] args) {

        //System.out.println("Hello world!");
        Notifier plain = new BaseNotifier("This is a random message!");
        plain.send();
        System.out.println("-------------------------------------------------------");
        NotifierDecorator complex = new DiscordDecorator(
                                                new SMSDecorator(
                                                        new BaseNotifier("This is another random message!")));
        complex.send();
    }
}