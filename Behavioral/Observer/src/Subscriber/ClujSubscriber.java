package Subscriber;
public class ClujSubscriber implements Subscriber {
    private String name;
    public ClujSubscriber(String name) {
        this.name=name;
    }

    @Override
    public void update() {
        System.out.println(this.name + ": OMG! A new book is out in Cluj! :O");
    }
}
