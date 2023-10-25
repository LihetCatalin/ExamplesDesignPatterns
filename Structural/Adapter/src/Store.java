public class Store {
    public void receivePay(InLeiTransaction t){
        t.payInLei();
        System.out.println("Store: I received my pay! :)");
    }
}
