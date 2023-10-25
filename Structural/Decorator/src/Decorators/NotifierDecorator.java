package Decorators;
import Notifiers.Notifier;

public class NotifierDecorator implements Notifier{
    private Notifier wrapper;
    public NotifierDecorator(Notifier notifier){
        this.wrapper=notifier;
    }

    @Override
    public void send() {
        wrapper.send();
    }
}
