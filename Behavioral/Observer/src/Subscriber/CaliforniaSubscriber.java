package Subscriber;
public class CaliforniaSubscriber implements Subscriber {
    private String name;
    public CaliforniaSubscriber(String name) {
        this.name=name;
    }

    @Override
    public void update() {
        System.out.println(this.name + ": OMG! A new book is out in California! :O");
    }
}
