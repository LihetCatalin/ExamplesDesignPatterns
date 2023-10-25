package Decorators;
import Notifiers.Notifier;

public class DiscordDecorator extends NotifierDecorator {
    public DiscordDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send() {
        super.send();
        System.out.println("Also sending via Discord!");
    }
}
