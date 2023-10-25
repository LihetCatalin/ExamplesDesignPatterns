package Library;
import Subscriber.*;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Subscriber> subs;

    public Library() {
        subs = new ArrayList<>();
    }

    public void subscribe(Subscriber s) {
        subs.add(s);
    }

    public void unsubscribe(Subscriber s){
        subs.remove(s);
    }

    public void notifySubs(){
        System.out.println("Look out! We have a new book in our library!"
                + "\n" + "------------------------------------------------------");
        for(Subscriber s: subs){
            s.update();
        }
    }
}
