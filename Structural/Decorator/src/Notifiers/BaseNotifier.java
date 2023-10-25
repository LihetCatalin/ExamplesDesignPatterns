package Notifiers;

public class BaseNotifier implements Notifier {
    private String msg;
    public BaseNotifier(String s) {
        this.msg=s;
    }

    @Override
    public void send() {
        System.out.println("Sending via email: " + this.msg);
    }
}
