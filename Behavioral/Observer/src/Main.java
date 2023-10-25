import Subscriber.*;
import Library.Library;

public class Main {
    public static void main(String[] args) {

        //System.out.println("Hello world!");
        Library lib = new Library();

        Subscriber s1 = new CaliforniaSubscriber("Bob");
        Subscriber s2 = new CaliforniaSubscriber("Melisa");
        Subscriber s3 = new ClujSubscriber("Andrei");
        Subscriber s4 = new ClujSubscriber("Irina");

        lib.subscribe(s1);
        //s2 is not subscribed, won't be notified
        lib.subscribe(s3);
        lib.subscribe(s4);

        lib.notifySubs();


    }
}