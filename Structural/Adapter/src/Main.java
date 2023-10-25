public class Main {
    public static void main(String[] args) {

        //System.out.println("Hello world!");
        Store s = new Store();
        Romanian r = new Romanian();
        French f = new French();

        s.receivePay(r);
        //s.receivePay(f); //nu merge, francezul nu poate plati in lei

        PayAdapter p = new PayAdapter(f);
        s.receivePay(p);
    }
}