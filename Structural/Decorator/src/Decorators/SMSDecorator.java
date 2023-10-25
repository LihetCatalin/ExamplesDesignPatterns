package Decorators;
import Notifiers.Notifier;

public class SMSDecorator extends NotifierDecorator {
    public SMSDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send() {
        super.send();
        System.out.println("Also sending via SMS!");
    }
}
